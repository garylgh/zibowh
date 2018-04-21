package com.zibowh.domain.entity.mbg;

import java.util.Date;
import javax.persistence.*;

@Table(name = "`t_busi_bill_change_record`")
public class TBusiBillChangeRecord {
    @Column(name = "`id`")
    private String id;

    @Column(name = "`YD_BH`")
    private String ydBh;

    @Column(name = "`YD_ZT`")
    private Integer ydZt;

    @Column(name = "`UPD_TIME`")
    private Date updTime;

    @Column(name = "`UPD_ID`")
    private String updId;

    @Column(name = "`UPD_NAME`")
    private String updName;

    /**
     * 1:驾驶人员
            2：押运人员
            3：车辆信息
            4：货物重量
     */
    @Column(name = "`UPD_ZT`")
    private Integer updZt;

    /**
     * @return id
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
     * @return YD_BH
     */
    public String getYdBh() {
        return ydBh;
    }

    /**
     * @param ydBh
     */
    public void setYdBh(String ydBh) {
        this.ydBh = ydBh == null ? null : ydBh.trim();
    }

    /**
     * @return YD_ZT
     */
    public Integer getYdZt() {
        return ydZt;
    }

    /**
     * @param ydZt
     */
    public void setYdZt(Integer ydZt) {
        this.ydZt = ydZt;
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
     * @return UPD_ID
     */
    public String getUpdId() {
        return updId;
    }

    /**
     * @param updId
     */
    public void setUpdId(String updId) {
        this.updId = updId == null ? null : updId.trim();
    }

    /**
     * @return UPD_NAME
     */
    public String getUpdName() {
        return updName;
    }

    /**
     * @param updName
     */
    public void setUpdName(String updName) {
        this.updName = updName == null ? null : updName.trim();
    }

    /**
     * 获取1:驾驶人员
            2：押运人员
            3：车辆信息
            4：货物重量
     *
     * @return UPD_ZT - 1:驾驶人员
            2：押运人员
            3：车辆信息
            4：货物重量
     */
    public Integer getUpdZt() {
        return updZt;
    }

    /**
     * 设置1:驾驶人员
            2：押运人员
            3：车辆信息
            4：货物重量
     *
     * @param updZt 1:驾驶人员
            2：押运人员
            3：车辆信息
            4：货物重量
     */
    public void setUpdZt(Integer updZt) {
        this.updZt = updZt;
    }
}