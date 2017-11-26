package com.grocery.dao;

import com.grocery.domain.InstationSenderMapping;
import org.springframework.stereotype.Repository;

@Repository
public interface InstationSenderMappingMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table INSTATION_SENDER_MAPPING
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table INSTATION_SENDER_MAPPING
     *
     * @mbg.generated
     */
    int insert(InstationSenderMapping record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table INSTATION_SENDER_MAPPING
     *
     * @mbg.generated
     */
    int insertSelective(InstationSenderMapping record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table INSTATION_SENDER_MAPPING
     *
     * @mbg.generated
     */
    InstationSenderMapping selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table INSTATION_SENDER_MAPPING
     *
     * @mbg.generated
     */
    int updateByPrimaryKeySelective(InstationSenderMapping record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table INSTATION_SENDER_MAPPING
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(InstationSenderMapping record);
}