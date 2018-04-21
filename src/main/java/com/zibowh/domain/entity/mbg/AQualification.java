package com.zibowh.domain.entity.mbg;

import java.util.Date;
import javax.persistence.*;

@Table(name = "`a_qualification`")
public class AQualification {
    @Id
    @Column(name = "`QU_ID`")
    private String quId;

    @Column(name = "`STAFF_ID`")
    private String staffId;

    @Column(name = "`QU_TYPE`")
    private Integer quType;

    @Column(name = "`QU_NAME`")
    private String quName;

    @Column(name = "`ISSUING_AUTHORITY`")
    private String issuingAuthority;

    @Column(name = "`ISSUING_TIME`")
    private Date issuingTime;

    @Column(name = "`PERIOD_VALIDITY`")
    private Date periodValidity;

    @Column(name = "`CERTIFICATE_ACCESOR`")
    private String certificateAccesor;

    @Column(name = "`QU_NUM`")
    private String quNum;

    @Column(name = "`QU_URL`")
    private String quUrl;

    @Column(name = "`INS_USER`")
    private String insUser;

    @Column(name = "`INS_TIME`")
    private Date insTime;

    @Column(name = "`UPD_USER`")
    private String updUser;

    @Column(name = "`UPD_TIME`")
    private Date updTime;

    /**
     * @return QU_ID
     */
    public String getQuId() {
        return quId;
    }

    /**
     * @param quId
     */
    public void setQuId(String quId) {
        this.quId = quId == null ? null : quId.trim();
    }

    /**
     * @return STAFF_ID
     */
    public String getStaffId() {
        return staffId;
    }

    /**
     * @param staffId
     */
    public void setStaffId(String staffId) {
        this.staffId = staffId == null ? null : staffId.trim();
    }

    /**
     * @return QU_TYPE
     */
    public Integer getQuType() {
        return quType;
    }

    /**
     * @param quType
     */
    public void setQuType(Integer quType) {
        this.quType = quType;
    }

    /**
     * @return QU_NAME
     */
    public String getQuName() {
        return quName;
    }

    /**
     * @param quName
     */
    public void setQuName(String quName) {
        this.quName = quName == null ? null : quName.trim();
    }

    /**
     * @return ISSUING_AUTHORITY
     */
    public String getIssuingAuthority() {
        return issuingAuthority;
    }

    /**
     * @param issuingAuthority
     */
    public void setIssuingAuthority(String issuingAuthority) {
        this.issuingAuthority = issuingAuthority == null ? null : issuingAuthority.trim();
    }

    /**
     * @return ISSUING_TIME
     */
    public Date getIssuingTime() {
        return issuingTime;
    }

    /**
     * @param issuingTime
     */
    public void setIssuingTime(Date issuingTime) {
        this.issuingTime = issuingTime;
    }

    /**
     * @return PERIOD_VALIDITY
     */
    public Date getPeriodValidity() {
        return periodValidity;
    }

    /**
     * @param periodValidity
     */
    public void setPeriodValidity(Date periodValidity) {
        this.periodValidity = periodValidity;
    }

    /**
     * @return CERTIFICATE_ACCESOR
     */
    public String getCertificateAccesor() {
        return certificateAccesor;
    }

    /**
     * @param certificateAccesor
     */
    public void setCertificateAccesor(String certificateAccesor) {
        this.certificateAccesor = certificateAccesor == null ? null : certificateAccesor.trim();
    }

    /**
     * @return QU_NUM
     */
    public String getQuNum() {
        return quNum;
    }

    /**
     * @param quNum
     */
    public void setQuNum(String quNum) {
        this.quNum = quNum == null ? null : quNum.trim();
    }

    /**
     * @return QU_URL
     */
    public String getQuUrl() {
        return quUrl;
    }

    /**
     * @param quUrl
     */
    public void setQuUrl(String quUrl) {
        this.quUrl = quUrl == null ? null : quUrl.trim();
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
}