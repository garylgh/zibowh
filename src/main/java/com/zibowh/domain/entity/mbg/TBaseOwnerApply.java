package com.zibowh.domain.entity.mbg;

import java.util.Date;
import javax.persistence.*;

@Table(name = "`t_base_owner_apply`")
public class TBaseOwnerApply {
    @Id
    @Column(name = "`EMP_APPLY_ID`")
    private String empApplyId;

    @Column(name = "`EMP_NAME`")
    private Date empName;

    @Column(name = "`CONTENT`")
    private String content;

    @Column(name = "`APPLY_DEPT`")
    private String applyDept;

    @Column(name = "`APPLY_NAME`")
    private String applyName;

    @Column(name = "`OPERATION`")
    private String operation;

    @Column(name = "`APPLY_TIME`")
    private Date applyTime;

    @Column(name = "`TOWNSHIPRS`")
    private Integer townshiprs;

    @Column(name = "`COUNTYRS`")
    private Integer countyrs;

    @Column(name = "`CITYRS`")
    private Integer cityrs;

    @Column(name = "`RESUT`")
    private String resut;

    /**
     * @return EMP_APPLY_ID
     */
    public String getEmpApplyId() {
        return empApplyId;
    }

    /**
     * @param empApplyId
     */
    public void setEmpApplyId(String empApplyId) {
        this.empApplyId = empApplyId == null ? null : empApplyId.trim();
    }

    /**
     * @return EMP_NAME
     */
    public Date getEmpName() {
        return empName;
    }

    /**
     * @param empName
     */
    public void setEmpName(Date empName) {
        this.empName = empName;
    }

    /**
     * @return CONTENT
     */
    public String getContent() {
        return content;
    }

    /**
     * @param content
     */
    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
    }

    /**
     * @return APPLY_DEPT
     */
    public String getApplyDept() {
        return applyDept;
    }

    /**
     * @param applyDept
     */
    public void setApplyDept(String applyDept) {
        this.applyDept = applyDept == null ? null : applyDept.trim();
    }

    /**
     * @return APPLY_NAME
     */
    public String getApplyName() {
        return applyName;
    }

    /**
     * @param applyName
     */
    public void setApplyName(String applyName) {
        this.applyName = applyName == null ? null : applyName.trim();
    }

    /**
     * @return OPERATION
     */
    public String getOperation() {
        return operation;
    }

    /**
     * @param operation
     */
    public void setOperation(String operation) {
        this.operation = operation == null ? null : operation.trim();
    }

    /**
     * @return APPLY_TIME
     */
    public Date getApplyTime() {
        return applyTime;
    }

    /**
     * @param applyTime
     */
    public void setApplyTime(Date applyTime) {
        this.applyTime = applyTime;
    }

    /**
     * @return TOWNSHIPRS
     */
    public Integer getTownshiprs() {
        return townshiprs;
    }

    /**
     * @param townshiprs
     */
    public void setTownshiprs(Integer townshiprs) {
        this.townshiprs = townshiprs;
    }

    /**
     * @return COUNTYRS
     */
    public Integer getCountyrs() {
        return countyrs;
    }

    /**
     * @param countyrs
     */
    public void setCountyrs(Integer countyrs) {
        this.countyrs = countyrs;
    }

    /**
     * @return CITYRS
     */
    public Integer getCityrs() {
        return cityrs;
    }

    /**
     * @param cityrs
     */
    public void setCityrs(Integer cityrs) {
        this.cityrs = cityrs;
    }

    /**
     * @return RESUT
     */
    public String getResut() {
        return resut;
    }

    /**
     * @param resut
     */
    public void setResut(String resut) {
        this.resut = resut == null ? null : resut.trim();
    }
}