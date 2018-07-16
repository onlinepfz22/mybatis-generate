package com.bsoft.root.entity;

public class PoDept {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column po_dept.ID
     *
     * @mbg.generated Tue Jun 26 15:10:58 CST 2018
     */
    private Integer id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column po_dept.UPPER_ID
     *
     * @mbg.generated Tue Jun 26 15:10:58 CST 2018
     */
    private Integer upperId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column po_dept.DEPT_NAME
     *
     * @mbg.generated Tue Jun 26 15:10:58 CST 2018
     */
    private String deptName;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column po_dept.DEPT_ADDRESS
     *
     * @mbg.generated Tue Jun 26 15:10:58 CST 2018
     */
    private String deptAddress;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column po_dept.DEPT_LINKMAN
     *
     * @mbg.generated Tue Jun 26 15:10:58 CST 2018
     */
    private String deptLinkman;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column po_dept.DEPT_CREATE_TIME
     *
     * @mbg.generated Tue Jun 26 15:10:58 CST 2018
     */
    private String deptCreateTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column po_dept.REMARK
     *
     * @mbg.generated Tue Jun 26 15:10:58 CST 2018
     */
    private String remark;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column po_dept.STATUS
     *
     * @mbg.generated Tue Jun 26 15:10:58 CST 2018
     */
    private Integer status;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column po_dept.ID
     *
     * @return the value of po_dept.ID
     *
     * @mbg.generated Tue Jun 26 15:10:58 CST 2018
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column po_dept.ID
     *
     * @param id the value for po_dept.ID
     *
     * @mbg.generated Tue Jun 26 15:10:58 CST 2018
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column po_dept.UPPER_ID
     *
     * @return the value of po_dept.UPPER_ID
     *
     * @mbg.generated Tue Jun 26 15:10:58 CST 2018
     */
    public Integer getUpperId() {
        return upperId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column po_dept.UPPER_ID
     *
     * @param upperId the value for po_dept.UPPER_ID
     *
     * @mbg.generated Tue Jun 26 15:10:58 CST 2018
     */
    public void setUpperId(Integer upperId) {
        this.upperId = upperId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column po_dept.DEPT_NAME
     *
     * @return the value of po_dept.DEPT_NAME
     *
     * @mbg.generated Tue Jun 26 15:10:58 CST 2018
     */
    public String getDeptName() {
        return deptName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column po_dept.DEPT_NAME
     *
     * @param deptName the value for po_dept.DEPT_NAME
     *
     * @mbg.generated Tue Jun 26 15:10:58 CST 2018
     */
    public void setDeptName(String deptName) {
        this.deptName = deptName == null ? null : deptName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column po_dept.DEPT_ADDRESS
     *
     * @return the value of po_dept.DEPT_ADDRESS
     *
     * @mbg.generated Tue Jun 26 15:10:58 CST 2018
     */
    public String getDeptAddress() {
        return deptAddress;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column po_dept.DEPT_ADDRESS
     *
     * @param deptAddress the value for po_dept.DEPT_ADDRESS
     *
     * @mbg.generated Tue Jun 26 15:10:58 CST 2018
     */
    public void setDeptAddress(String deptAddress) {
        this.deptAddress = deptAddress == null ? null : deptAddress.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column po_dept.DEPT_LINKMAN
     *
     * @return the value of po_dept.DEPT_LINKMAN
     *
     * @mbg.generated Tue Jun 26 15:10:58 CST 2018
     */
    public String getDeptLinkman() {
        return deptLinkman;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column po_dept.DEPT_LINKMAN
     *
     * @param deptLinkman the value for po_dept.DEPT_LINKMAN
     *
     * @mbg.generated Tue Jun 26 15:10:58 CST 2018
     */
    public void setDeptLinkman(String deptLinkman) {
        this.deptLinkman = deptLinkman == null ? null : deptLinkman.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column po_dept.DEPT_CREATE_TIME
     *
     * @return the value of po_dept.DEPT_CREATE_TIME
     *
     * @mbg.generated Tue Jun 26 15:10:58 CST 2018
     */
    public String getDeptCreateTime() {
        return deptCreateTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column po_dept.DEPT_CREATE_TIME
     *
     * @param deptCreateTime the value for po_dept.DEPT_CREATE_TIME
     *
     * @mbg.generated Tue Jun 26 15:10:58 CST 2018
     */
    public void setDeptCreateTime(String deptCreateTime) {
        this.deptCreateTime = deptCreateTime == null ? null : deptCreateTime.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column po_dept.REMARK
     *
     * @return the value of po_dept.REMARK
     *
     * @mbg.generated Tue Jun 26 15:10:58 CST 2018
     */
    public String getRemark() {
        return remark;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column po_dept.REMARK
     *
     * @param remark the value for po_dept.REMARK
     *
     * @mbg.generated Tue Jun 26 15:10:58 CST 2018
     */
    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column po_dept.STATUS
     *
     * @return the value of po_dept.STATUS
     *
     * @mbg.generated Tue Jun 26 15:10:58 CST 2018
     */
    public Integer getStatus() {
        return status;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column po_dept.STATUS
     *
     * @param status the value for po_dept.STATUS
     *
     * @mbg.generated Tue Jun 26 15:10:58 CST 2018
     */
    public void setStatus(Integer status) {
        this.status = status;
    }
}