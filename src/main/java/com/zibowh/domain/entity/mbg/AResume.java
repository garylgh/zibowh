package com.zibowh.domain.entity.mbg;

import java.util.Date;
import javax.persistence.*;

@Table(name = "`a_resume`")
public class AResume {
    @Column(name = "`RESUME_ID`")
    private String resumeId;

    @Column(name = "`EMP_ID`")
    private String empId;

    @Column(name = "`ENTRY_TIME`")
    private Date entryTime;

    @Column(name = "`DAPARTURE_TIME`")
    private Date dapartureTime;

    @Column(name = "`OWNER_ID`")
    private String ownerId;

    @Column(name = "`LEAVE_EVALUTION`")
    private String leaveEvalution;

    @Column(name = "`LEAVE_DESCRIPTION`")
    private String leaveDescription;

    @Column(name = "`RESUME_DEPT`")
    private String resumeDept;

    @Column(name = "`RESUME_DUTY`")
    private String resumeDuty;

    @Column(name = "`INS_USER`")
    private String insUser;

    @Column(name = "`INS_TIME`")
    private Date insTime;

    @Column(name = "`UPD_USER`")
    private String updUser;

    @Column(name = "`UPD_TIME`")
    private Date updTime;

    @Column(name = "`HT_FJ`")
    private String htFj;

    /**
     * @return RESUME_ID
     */
    public String getResumeId() {
        return resumeId;
    }

    /**
     * @param resumeId
     */
    public void setResumeId(String resumeId) {
        this.resumeId = resumeId == null ? null : resumeId.trim();
    }

    /**
     * @return EMP_ID
     */
    public String getEmpId() {
        return empId;
    }

    /**
     * @param empId
     */
    public void setEmpId(String empId) {
        this.empId = empId == null ? null : empId.trim();
    }

    /**
     * @return ENTRY_TIME
     */
    public Date getEntryTime() {
        return entryTime;
    }

    /**
     * @param entryTime
     */
    public void setEntryTime(Date entryTime) {
        this.entryTime = entryTime;
    }

    /**
     * @return DAPARTURE_TIME
     */
    public Date getDapartureTime() {
        return dapartureTime;
    }

    /**
     * @param dapartureTime
     */
    public void setDapartureTime(Date dapartureTime) {
        this.dapartureTime = dapartureTime;
    }

    /**
     * @return OWNER_ID
     */
    public String getOwnerId() {
        return ownerId;
    }

    /**
     * @param ownerId
     */
    public void setOwnerId(String ownerId) {
        this.ownerId = ownerId == null ? null : ownerId.trim();
    }

    /**
     * @return LEAVE_EVALUTION
     */
    public String getLeaveEvalution() {
        return leaveEvalution;
    }

    /**
     * @param leaveEvalution
     */
    public void setLeaveEvalution(String leaveEvalution) {
        this.leaveEvalution = leaveEvalution == null ? null : leaveEvalution.trim();
    }

    /**
     * @return LEAVE_DESCRIPTION
     */
    public String getLeaveDescription() {
        return leaveDescription;
    }

    /**
     * @param leaveDescription
     */
    public void setLeaveDescription(String leaveDescription) {
        this.leaveDescription = leaveDescription == null ? null : leaveDescription.trim();
    }

    /**
     * @return RESUME_DEPT
     */
    public String getResumeDept() {
        return resumeDept;
    }

    /**
     * @param resumeDept
     */
    public void setResumeDept(String resumeDept) {
        this.resumeDept = resumeDept == null ? null : resumeDept.trim();
    }

    /**
     * @return RESUME_DUTY
     */
    public String getResumeDuty() {
        return resumeDuty;
    }

    /**
     * @param resumeDuty
     */
    public void setResumeDuty(String resumeDuty) {
        this.resumeDuty = resumeDuty == null ? null : resumeDuty.trim();
    }

    /**
     * @return INS_USER
     */
    public String getInsUser() {
        return insUser;
    }

    /**
     * @param insUser
     */
    public void setInsUser(String insUser) {
        this.insUser = insUser == null ? null : insUser.trim();
    }

    /**
     * @return INS_TIME
     */
    public Date getInsTime() {
        return insTime;
    }

    /**
     * @param insTime
     */
    public void setInsTime(Date insTime) {
        this.insTime = insTime;
    }

    /**
     * @return UPD_USER
     */
    public String getUpdUser() {
        return updUser;
    }

    /**
     * @param updUser
     */
    public void setUpdUser(String updUser) {
        this.updUser = updUser == null ? null : updUser.trim();
    }

    /**
     * @return UPD_TIME
     */
    public Date getUpdTime() {
        return updTime;
    }

    /**
     * @param updTime
     */
    public void setUpdTime(Date updTime) {
        this.updTime = updTime;
    }

    /**
     * @return HT_FJ
     */
    public String getHtFj() {
        return htFj;
    }

    /**
     * @param htFj
     */
    public void setHtFj(String htFj) {
        this.htFj = htFj == null ? null : htFj.trim();
    }
}