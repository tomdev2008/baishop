package com.baixc.ucenter.model.employee;

import java.io.Serializable;

public class Depts implements Serializable {
	
	private static final long serialVersionUID = 6731691895296423996L;

	/**
     * This field was generated by Apache iBATIS ibator.
     * This field corresponds to the database column bai_dept.dept_id
     *
     * @ibatorgenerated Thu May 10 13:45:40 CST 2012
     */
    private Integer deptId;

    /**
     * This field was generated by Apache iBATIS ibator.
     * This field corresponds to the database column bai_dept.dept_pid
     *
     * @ibatorgenerated Thu May 10 13:45:40 CST 2012
     */
    private Integer deptPid;

    /**
     * This field was generated by Apache iBATIS ibator.
     * This field corresponds to the database column bai_dept.dept_code
     *
     * @ibatorgenerated Thu May 10 13:45:40 CST 2012
     */
    private String deptCode;

    /**
     * This field was generated by Apache iBATIS ibator.
     * This field corresponds to the database column bai_dept.dept_name
     *
     * @ibatorgenerated Thu May 10 13:45:40 CST 2012
     */
    private String deptName;

    /**
     * This field was generated by Apache iBATIS ibator.
     * This field corresponds to the database column bai_dept.dept_pinyin
     *
     * @ibatorgenerated Thu May 10 13:45:40 CST 2012
     */
    private String deptPinyin;

    /**
     * This field was generated by Apache iBATIS ibator.
     * This field corresponds to the database column bai_dept.dept_remark
     *
     * @ibatorgenerated Thu May 10 13:45:40 CST 2012
     */
    private String deptRemark;

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method returns the value of the database column bai_dept.dept_id
     *
     * @return the value of bai_dept.dept_id
     *
     * @ibatorgenerated Thu May 10 13:45:40 CST 2012
     */
    public Integer getDeptId() {
        return deptId;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method sets the value of the database column bai_dept.dept_id
     *
     * @param deptId the value for bai_dept.dept_id
     *
     * @ibatorgenerated Thu May 10 13:45:40 CST 2012
     */
    public void setDeptId(Integer deptId) {
        this.deptId = deptId;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method returns the value of the database column bai_dept.dept_pid
     *
     * @return the value of bai_dept.dept_pid
     *
     * @ibatorgenerated Thu May 10 13:45:40 CST 2012
     */
    public Integer getDeptPid() {
        return deptPid;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method sets the value of the database column bai_dept.dept_pid
     *
     * @param deptPid the value for bai_dept.dept_pid
     *
     * @ibatorgenerated Thu May 10 13:45:40 CST 2012
     */
    public void setDeptPid(Integer deptPid) {
        this.deptPid = deptPid;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method returns the value of the database column bai_dept.dept_code
     *
     * @return the value of bai_dept.dept_code
     *
     * @ibatorgenerated Thu May 10 13:45:40 CST 2012
     */
    public String getDeptCode() {
        return deptCode;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method sets the value of the database column bai_dept.dept_code
     *
     * @param deptCode the value for bai_dept.dept_code
     *
     * @ibatorgenerated Thu May 10 13:45:40 CST 2012
     */
    public void setDeptCode(String deptCode) {
        this.deptCode = deptCode;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method returns the value of the database column bai_dept.dept_name
     *
     * @return the value of bai_dept.dept_name
     *
     * @ibatorgenerated Thu May 10 13:45:40 CST 2012
     */
    public String getDeptName() {
        return deptName;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method sets the value of the database column bai_dept.dept_name
     *
     * @param deptName the value for bai_dept.dept_name
     *
     * @ibatorgenerated Thu May 10 13:45:40 CST 2012
     */
    public void setDeptName(String deptName) {
        this.deptName = deptName;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method returns the value of the database column bai_dept.dept_pinyin
     *
     * @return the value of bai_dept.dept_pinyin
     *
     * @ibatorgenerated Thu May 10 13:45:40 CST 2012
     */
    public String getDeptPinyin() {
        return deptPinyin;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method sets the value of the database column bai_dept.dept_pinyin
     *
     * @param deptPinyin the value for bai_dept.dept_pinyin
     *
     * @ibatorgenerated Thu May 10 13:45:40 CST 2012
     */
    public void setDeptPinyin(String deptPinyin) {
        this.deptPinyin = deptPinyin;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method returns the value of the database column bai_dept.dept_remark
     *
     * @return the value of bai_dept.dept_remark
     *
     * @ibatorgenerated Thu May 10 13:45:40 CST 2012
     */
    public String getDeptRemark() {
        return deptRemark;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method sets the value of the database column bai_dept.dept_remark
     *
     * @param deptRemark the value for bai_dept.dept_remark
     *
     * @ibatorgenerated Thu May 10 13:45:40 CST 2012
     */
    public void setDeptRemark(String deptRemark) {
        this.deptRemark = deptRemark;
    }
}