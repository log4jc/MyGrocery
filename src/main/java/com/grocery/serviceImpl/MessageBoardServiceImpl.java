package com.grocery.serviceImpl;

import com.grocery.dao.MessageBoardMapper;
import com.grocery.dao.MessageBoardSubreplyMapper;
import com.grocery.dao.PersonalInfoMapper;
import com.grocery.dao.SystemUserMapper;
import com.grocery.domain.MessageBoard;
import com.grocery.domain.MessageBoardSubreply;
import com.grocery.domain.SystemUser;
import com.grocery.properties.CustomProperty;
import com.grocery.services.MessageBoardService;
import com.grocery.utilities.DateUtility;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.servlet.http.HttpSession;
import java.util.List;

/**
 * Created by Jason on 15/10/2017.
 */

@Service
public class MessageBoardServiceImpl implements MessageBoardService{

    @Autowired
    private MessageBoardMapper messageBoardMapper;

    @Autowired
    private MessageBoardSubreplyMapper messageBoardSubreplyMapper;

    @Autowired
    private PersonalInfoMapper personalInfoMapper;

    @Autowired
    private CustomProperty customProperty;

    @Autowired
    private SystemUserMapper systemUserMapper;

    @Override
    public List<MessageBoard> getMessageBoardByPaging(Integer pageNum, Integer pageSize) {
        return messageBoardMapper.selectPaging((pageNum - 1) * pageSize,pageSize);
    }

    @Override
    public Integer getMessageBoardCount() {
        return messageBoardMapper.getCount();
    }

    /**
     * 给留言板留言
     * @param replyMessage 回复内容
     */
    @Override
    public void sendMessage(HttpSession session, String replyMessage) {
        MessageBoard messageBoard = new MessageBoard();
        SystemUser systemUser = (SystemUser) session.getAttribute("User");

        messageBoard.setVersion(1);
        messageBoard.setAvator(personalInfoMapper.selectByPrimaryKey(systemUser.getId()).getAvator());
        messageBoard.setContent(replyMessage);
        messageBoard.setCreateDatetime(DateUtility.getCurrentDate());
        messageBoard.setEmail(systemUser.getEmail());
        messageBoard.setUserid(systemUser.getId());
        messageBoard.setUserName(systemUser.getUserName());

        messageBoardMapper.insertSelective(messageBoard);
    }

    @Override
    public MessageBoard firstLoadDetailReply(String messageBoardId, String messageBoardUserId, HttpSession session) {
        MessageBoard messageBoard = messageBoardMapper.selectByPrimaryKey(Integer.valueOf(messageBoardId));

        List<MessageBoardSubreply> messageBoardSubreplies = messageBoardSubreplyMapper.selectpaging(0,Integer.valueOf(customProperty.getSubReply()),messageBoardId);

        for (MessageBoardSubreply messageBoardSubreply : messageBoardSubreplies) {
            /**
             * 获取头像的ID
             */
            messageBoardSubreply.setCustom1(personalInfoMapper.selectByPrimaryKey(messageBoardSubreply.getUserid()).getAvator().toString());
        }

        messageBoard.setMessageBoardSubreply(messageBoardSubreplies);
        Integer subReplyCount = messageBoardSubreplyMapper.getCountByMessageBoardId(messageBoardId);
        if ( subReplyCount <= Integer.valueOf(customProperty.getSubReply())) {
            /**
             * 如果自回复的数量小于这个话题下的总数，则不需要显示下一页，则将custom1
             */
            messageBoard.setCustom1("N");
        } else {
            messageBoard.setCustom1("Y");
        }


        return messageBoard;
    }

    @Override
    public MessageBoardSubreply saveMessageBoardSubreply(String messageBoardId4Reply, String replyTo, String messageText, HttpSession session) {
        MessageBoardSubreply messageBoardSubreply = new MessageBoardSubreply();

        messageBoardSubreply.setVersion(1);
        messageBoardSubreply.setUserid(((SystemUser)session.getAttribute("User")).getId());
        messageBoardSubreply.setUserName(((SystemUser)session.getAttribute("User")).getUserName());
        messageBoardSubreply.setEmail(((SystemUser)session.getAttribute("User")).getEmail());
        messageBoardSubreply.setContent(messageText);
        if (!"".equals(replyTo)) {
            messageBoardSubreply.setReplyUserId(Integer.valueOf(replyTo));
            messageBoardSubreply.setReplyUserName(systemUserMapper.selectByPrimaryKey(Integer.valueOf(replyTo)).getUserName());
        }
        messageBoardSubreply.setParentRefId(Integer.valueOf(messageBoardId4Reply));
        messageBoardSubreply.setCreateDatetime(DateUtility.getCurrentDate());

        messageBoardSubreplyMapper.insertSelective(messageBoardSubreply);

        messageBoardSubreply.setCustom1(personalInfoMapper.selectByPrimaryKey(messageBoardSubreply.getUserid()).getAvator().toString());

        return messageBoardSubreply;
    }
}
