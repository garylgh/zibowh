package com.zibowh.domain.entity.mbg;

import java.util.Date;
import javax.persistence.*;

@Table(name = "`czzd_list`")
public class CzzdList {
    @Id
    @Column(name = "`ID`")
    private String id;

    @Column(name = "`OWNER_ID`")
    private String ownerId;

    @Column(name = "`INOUTLOADINGER_REGION_NO`")
    private String inoutloadingerRegionNo;

    @Column(name = "`CWBH`")
    private String cwbh;

    @Column(name = "`VEHICLE_CODE`")
    private String vehicleCode;

    @Column(name = "`EQUIPMEN_NO`")
    private String equipmenNo;

    @Column(name = "`IPUT_TIME`")
    private Date iputTime;

    /**
     * @return ID
     */
    public String getId() {
        return id;
    }

    /**
     * @param id
     */
    public void setId(String id) {
        this.id = id == null ? null : id.trim();
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
     * @return VEHICLE_CODE
     */
    public String getVehicleCode() {
        return vehicleCode;
    }

    /**
     * @param vehicleCode
     */
    public void setVehicleCode(String vehicleCode) {
        this.vehicleCode = vehicleCode == null ? null : vehicleCode.trim();
    }

    /**
     * @return EQUIPMEN_NO
     */
    public String getEquipmenNo() {
        return equipmenNo;
    }

    /**
     * @param equipmenNo
     */
    public void setEquipmenNo(String equipmenNo) {
        this.equipmenNo = equipmenNo == null ? null : equipmenNo.trim();
    }

    /**
     * @return IPUT_TIME
     */
    public Date getIputTime() {
        return iputTime;
    }

    /**
     * @param iputTime
     */
    public void setIputTime(Date iputTime) {
        this.iputTime = iputTime;
    }
}