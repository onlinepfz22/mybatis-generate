package com.bsoft.root.entity;

public class PoUser {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column po_user.ID
     *
     * @mbg.generated Tue Jun 26 15:10:57 CST 2018
     */
    private Integer id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column po_user.USERNAME
     *
     * @mbg.generated Tue Jun 26 15:10:57 CST 2018
     */
    private String userName;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column po_user.PASSWORD
     *
     * @mbg.generated Tue Jun 26 15:10:57 CST 2018
     */
    private String password;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column po_user.REALNAME
     *
     * @mbg.generated Tue Jun 26 15:10:57 CST 2018
     */
    private String realName;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column po_user.LASTTIME
     *
     * @mbg.generated Tue Jun 26 15:10:57 CST 2018
     */
    private String lastTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column po_user.DEPT_ID
     *
     * @mbg.generated Tue Jun 26 15:10:57 CST 2018
     */
    private Integer deptId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column po_user.ROLE_ID
     *
     * @mbg.generated Tue Jun 26 15:10:57 CST 2018
     */
    private Integer roleId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column po_user.STATUS
     *
     * @mbg.generated Tue Jun 26 15:10:57 CST 2018
     */
    private Integer status;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column po_user.ID
     *
     * @return the value of po_user.ID
     *
     * @mbg.generated Tue Jun 26 15:10:57 CST 2018
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column po_user.ID
     *
     * @param id the value for po_user.ID
     *
     * @mbg.generated Tue Jun 26 15:10:57 CST 2018
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column po_user.USERNAME
     *
     * @return the value of po_user.USERNAME
     *
     * @mbg.generated Tue Jun 26 15:10:57 CST 2018
     */
    public String getUserName() {
        return userName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column po_user.USERNAME
     *
     * @param userName the value for po_user.USERNAME
     *
     * @mbg.generated Tue Jun 26 15:10:57 CST 2018
     */
    public void setUserName(String userName) {
        this.userName = userName == null ? null : userName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column po_user.PASSWORD
     *
     * @return the value of po_user.PASSWORD
     *
     * @mbg.generated Tue Jun 26 15:10:57 CST 2018
     */
    public String getPassword() {
        return password;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column po_user.PASSWORD
     *
     * @param password the value for po_user.PASSWORD
     *
     * @mbg.generated Tue Jun 26 15:10:57 CST 2018
     */
    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column po_user.REALNAME
     *
     * @return the value of po_user.REALNAME
     *
     * @mbg.generated Tue Jun 26 15:10:57 CST 2018
     */
    public String getRealName() {
        return realName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column po_user.REALNAME
     *
     * @param realName the value for po_user.REALNAME
     *
     * @mbg.generated Tue Jun 26 15:10:57 CST 2018
     */
    public void setRealName(String realName) {
        this.realName = realName == null ? null : realName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column po_user.LASTTIME
     *
     * @return the value of po_user.LASTTIME
     *
     * @mbg.generated Tue Jun 26 15:10:57 CST 2018
     */
    public String getLastTime() {
        return lastTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column po_user.LASTTIME
     *
     * @param lastTime the value for po_user.LASTTIME
     *
     * @mbg.generated Tue Jun 26 15:10:57 CST 2018
     */
    public void setLastTime(String lastTime) {
        this.lastTime = lastTime == null ? null : lastTime.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column po_user.DEPT_ID
     *
     * @return the value of po_user.DEPT_ID
     *
     * @mbg.generated Tue Jun 26 15:10:57 CST 2018
     */
    public Integer getDeptId() {
        return deptId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column po_user.DEPT_ID
     *
     * @param deptId the value for po_user.DEPT_ID
     *
     * @mbg.generated Tue Jun 26 15:10:57 CST 2018
     */
    public void setDeptId(Integer deptId) {
        this.deptId = deptId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column po_user.ROLE_ID
     *
     * @return the value of po_user.ROLE_ID
     *
     * @mbg.generated Tue Jun 26 15:10:57 CST 2018
     */
    public Integer getRoleId() {
        return roleId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column po_user.ROLE_ID
     *
     * @param roleId the value for po_user.ROLE_ID
     *
     * @mbg.generated Tue Jun 26 15:10:57 CST 2018
     */
    public void setRoleId(Integer roleId) {
        this.roleId = roleId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column po_user.STATUS
     *
     * @return the value of po_user.STATUS
     *
     * @mbg.generated Tue Jun 26 15:10:57 CST 2018
     */
    public Integer getStatus() {
        return status;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column po_user.STATUS
     *
     * @param status the value for po_user.STATUS
     *
     * @mbg.generated Tue Jun 26 15:10:57 CST 2018
     */
    public void setStatus(Integer status) {
        this.status = status;
    }
}