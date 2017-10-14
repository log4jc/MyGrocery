package com.grocery.domain;

public class PhotographyDetail {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column PHOTOGRAPHY_DETAIL.ID
     *
     * @mbggenerated
     */
    private Integer id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column PHOTOGRAPHY_DETAIL.VERSION
     *
     * @mbggenerated
     */
    private Integer version;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column PHOTOGRAPHY_DETAIL.THEME
     *
     * @mbggenerated
     */
    private String theme;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column PHOTOGRAPHY_DETAIL.COMMENTS
     *
     * @mbggenerated
     */
    private String comments;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column PHOTOGRAPHY_DETAIL.PHOTO_REF_ID
     *
     * @mbggenerated
     */
    private Integer photoRefId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column PHOTOGRAPHY_DETAIL.CREATE_DATETIME
     *
     * @mbggenerated
     */
    private String createDatetime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column PHOTOGRAPHY_DETAIL.CUSTOM1
     *
     * @mbggenerated
     */
    private String custom1;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column PHOTOGRAPHY_DETAIL.CUSTOM2
     *
     * @mbggenerated
     */
    private String custom2;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column PHOTOGRAPHY_DETAIL.CUSTOM3
     *
     * @mbggenerated
     */
    private String custom3;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column PHOTOGRAPHY_DETAIL.CUSTOM4
     *
     * @mbggenerated
     */
    private String custom4;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column PHOTOGRAPHY_DETAIL.CUSTOM5
     *
     * @mbggenerated
     */
    private String custom5;

    /**
     * 获取总行数，也就是总摄影数
     */
    private Integer countRow;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column PHOTOGRAPHY_DETAIL.ID
     *
     * @return the value of PHOTOGRAPHY_DETAIL.ID
     *
     * @mbggenerated
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column PHOTOGRAPHY_DETAIL.ID
     *
     * @param id the value for PHOTOGRAPHY_DETAIL.ID
     *
     * @mbggenerated
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column PHOTOGRAPHY_DETAIL.VERSION
     *
     * @return the value of PHOTOGRAPHY_DETAIL.VERSION
     *
     * @mbggenerated
     */
    public Integer getVersion() {
        return version;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column PHOTOGRAPHY_DETAIL.VERSION
     *
     * @param version the value for PHOTOGRAPHY_DETAIL.VERSION
     *
     * @mbggenerated
     */
    public void setVersion(Integer version) {
        this.version = version;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column PHOTOGRAPHY_DETAIL.THEME
     *
     * @return the value of PHOTOGRAPHY_DETAIL.THEME
     *
     * @mbggenerated
     */
    public String getTheme() {
        return theme;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column PHOTOGRAPHY_DETAIL.THEME
     *
     * @param theme the value for PHOTOGRAPHY_DETAIL.THEME
     *
     * @mbggenerated
     */
    public void setTheme(String theme) {
        this.theme = theme == null ? null : theme.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column PHOTOGRAPHY_DETAIL.COMMENTS
     *
     * @return the value of PHOTOGRAPHY_DETAIL.COMMENTS
     *
     * @mbggenerated
     */
    public String getComments() {
        return comments;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column PHOTOGRAPHY_DETAIL.COMMENTS
     *
     * @param comments the value for PHOTOGRAPHY_DETAIL.COMMENTS
     *
     * @mbggenerated
     */
    public void setComments(String comments) {
        this.comments = comments == null ? null : comments.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column PHOTOGRAPHY_DETAIL.PHOTO_REF_ID
     *
     * @return the value of PHOTOGRAPHY_DETAIL.PHOTO_REF_ID
     *
     * @mbggenerated
     */
    public Integer getPhotoRefId() {
        return photoRefId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column PHOTOGRAPHY_DETAIL.PHOTO_REF_ID
     *
     * @param photoRefId the value for PHOTOGRAPHY_DETAIL.PHOTO_REF_ID
     *
     * @mbggenerated
     */
    public void setPhotoRefId(Integer photoRefId) {
        this.photoRefId = photoRefId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column PHOTOGRAPHY_DETAIL.CUSTOM1
     *
     * @return the value of PHOTOGRAPHY_DETAIL.CUSTOM1
     *
     * @mbggenerated
     */
    public String getCustom1() {
        return custom1;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column PHOTOGRAPHY_DETAIL.CUSTOM1
     *
     * @param custom1 the value for PHOTOGRAPHY_DETAIL.CUSTOM1
     *
     * @mbggenerated
     */
    public void setCustom1(String custom1) {
        this.custom1 = custom1 == null ? null : custom1.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column PHOTOGRAPHY_DETAIL.CUSTOM2
     *
     * @return the value of PHOTOGRAPHY_DETAIL.CUSTOM2
     *
     * @mbggenerated
     */
    public String getCustom2() {
        return custom2;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column PHOTOGRAPHY_DETAIL.CUSTOM2
     *
     * @param custom2 the value for PHOTOGRAPHY_DETAIL.CUSTOM2
     *
     * @mbggenerated
     */
    public void setCustom2(String custom2) {
        this.custom2 = custom2 == null ? null : custom2.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column PHOTOGRAPHY_DETAIL.CUSTOM3
     *
     * @return the value of PHOTOGRAPHY_DETAIL.CUSTOM3
     *
     * @mbggenerated
     */
    public String getCustom3() {
        return custom3;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column PHOTOGRAPHY_DETAIL.CUSTOM3
     *
     * @param custom3 the value for PHOTOGRAPHY_DETAIL.CUSTOM3
     *
     * @mbggenerated
     */
    public void setCustom3(String custom3) {
        this.custom3 = custom3 == null ? null : custom3.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column PHOTOGRAPHY_DETAIL.CUSTOM4
     *
     * @return the value of PHOTOGRAPHY_DETAIL.CUSTOM4
     *
     * @mbggenerated
     */
    public String getCustom4() {
        return custom4;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column PHOTOGRAPHY_DETAIL.CUSTOM4
     *
     * @param custom4 the value for PHOTOGRAPHY_DETAIL.CUSTOM4
     *
     * @mbggenerated
     */
    public void setCustom4(String custom4) {
        this.custom4 = custom4 == null ? null : custom4.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column PHOTOGRAPHY_DETAIL.CUSTOM5
     *
     * @return the value of PHOTOGRAPHY_DETAIL.CUSTOM5
     *
     * @mbggenerated
     */
    public String getCustom5() {
        return custom5;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column PHOTOGRAPHY_DETAIL.CUSTOM5
     *
     * @param custom5 the value for PHOTOGRAPHY_DETAIL.CUSTOM5
     *
     * @mbggenerated
     */
    public void setCustom5(String custom5) {
        this.custom5 = custom5 == null ? null : custom5.trim();
    }

    public String getCreateDatetime() {
        return createDatetime;
    }

    public void setCreateDatetime(String createDatetime) {
        this.createDatetime = createDatetime;
    }

    public Integer getCountRow() {
        return countRow;
    }

    public void setCountRow(Integer countRow) {
        this.countRow = countRow;
    }
}