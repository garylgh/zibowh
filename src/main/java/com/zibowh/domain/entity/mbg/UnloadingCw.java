package com.zibowh.domain.entity.mbg;

import java.util.Date;
import javax.persistence.*;

@Table(name = "`unloading_cw`")
public class UnloadingCw {
    @Id
    @Column(name = "`ID`")
    private Integer id;

    @Column(name = "`CWBH`")
    private String cwbh;

    @Column(name = "`INOUTLOADINGER_REGION_NO`")
    private String inoutloadingerRegionNo;

    @Column(name = "`STATUS`")
    private String status;

    @Column(name = "`CARGO_NUMBER`")
    private String cargoNumber;

    @Column(name = "`CARGO_NAME`")
    private String cargoName;

    @Column(name = "`INPUT_DATE`")
    private Date inputDate;

    @Column(name = "`INS_USER`")
    private String insUser;

    @Column(name = "`INS_TIME`")
    private Date insTime;

    @Column(name = "`UPD_USER`")
    private String updUser;

    @Column(name = "`UPD_TIME`")
    private Date updTime;

    /**
     * @return ID
     */
    public Integer getId() {
        return id;
    }

    /**
     * @param id
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * @return CWBH
     */
    public String getCwbh() {
        return cwbh;
    }

    /**
     * @param cwbh
     */
    public void setCwbh(String cwbh) {
        this.cwbh = cwbh == null ? null : cwbh.trim();
    }

    /**
     * @return INOUTLOADINGER_REGION_NO
     */
    public String getInoutloadingerRegionNo() {
        return inoutloadingerRegionNo;
    }

    /**
     * @param inoutloadingerRegionNo
     */
    public void setInoutloadingerRegionNo(String inoutloadingerRegionNo) {
        this.inoutloadingerRegionNo = inoutloadingerRegionNo == null ? null : inoutloadingerRegionNo.trim();
    }

    /**
     * @return STATUS
     */
    public String getStatus() {
        return status;
    }

    /**
     * @param status
     */
    public void setStatus(String status) {
        this.status = status == null ? null : status.trim();
    }

    /**
     * @return CARGO_NUMBER
     */
    public String getCargoNumber() {
        return cargoNumber;
    }

    /**
     * @param cargoNumber
     */
    public void setCargoNumber(String cargoNumber) {
        this.cargoNumber = cargoNumber == null ? null : cargoNumber.trim();
    }

    /**
     * @return CARGO_NAME
     */
    public String getCargoName() {
        return cargoName;
    }

    /**
     * @param cargoName
     */
    public void setCargoName(String cargoName) {
        this.cargoName = cargoName == null ? null : cargoName.trim();
    }

    /**
     * @return INPUT_DATE
     */
    public Date getInputDate() {
        return inputDate;
    }

    /**
     * @param inputDate
     */
    public void setInputDate(Date inputDate) {
        this.inputDate = inputDate;
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