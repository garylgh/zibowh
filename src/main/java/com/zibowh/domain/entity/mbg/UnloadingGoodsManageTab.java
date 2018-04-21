package com.zibowh.domain.entity.mbg;

import java.util.Date;
import javax.persistence.*;

@Table(name = "`unLoading_goods_manage_tab`")
public class UnloadingGoodsManageTab {
    @Column(name = "`id`")
    private Integer id;

    @Column(name = "`com_id`")
    private String comId;

    @Column(name = "`com_name`")
    private String comName;

    @Column(name = "`waybill_id`")
    private String waybillId;

    @Column(name = "`vehicle_pai`")
    private String vehiclePai;

    @Column(name = "`vehicle_status`")
    private String vehicleStatus;

    @Column(name = "`vehicle_jsy`")
    private String vehicleJsy;

    @Column(name = "`driver_status`")
    private String driverStatus;

    @Column(name = "`vehicle_yyy`")
    private String vehicleYyy;

    @Column(name = "`supercargo_status`")
    private String supercargoStatus;

    @Column(name = "`loadinger`")
    private String loadinger;

    @Column(name = "`loadinger_status`")
    private String loadingerStatus;

    @Column(name = "`loading_chkin_date`")
    private String loadingChkinDate;

    @Column(name = "`loading_chkout_date`")
    private String loadingChkoutDate;

    @Column(name = "`loading_region_no`")
    private String loadingRegionNo;

    @Column(name = "`loading_date`")
    private String loadingDate;

    @Column(name = "`loading_type1`")
    private String loadingType1;

    @Column(name = "`loading_over_date`")
    private String loadingOverDate;

    @Column(name = "`unloadinger`")
    private String unloadinger;

    @Column(name = "`unloadinger_status`")
    private String unloadingerStatus;

    @Column(name = "`unloading_region_no`")
    private String unloadingRegionNo;

    @Column(name = "`unloading_chkin_date`")
    private String unloadingChkinDate;

    @Column(name = "`unloading_date`")
    private String unloadingDate;

    @Column(name = "`unloading_chkout_date`")
    private String unloadingChkoutDate;

    @Column(name = "`unloading_name`")
    private String unloadingName;

    @Column(name = "`reserve_col_1`")
    private String reserveCol1;

    @Column(name = "`reserve_col_2`")
    private String reserveCol2;

    @Column(name = "`reserve_col_3`")
    private String reserveCol3;

    @Column(name = "`reserve_col_4`")
    private String reserveCol4;

    @Column(name = "`reserve_col_5`")
    private String reserveCol5;

    @Column(name = "`reserve_col_6`")
    private String reserveCol6;

    @Column(name = "`reserve_col_7`")
    private String reserveCol7;

    @Column(name = "`reserve_col_8`")
    private String reserveCol8;

    @Column(name = "`ins_user`")
    private String insUser;

    @Column(name = "`ins_time`")
    private Date insTime;

    @Column(name = "`upd_user`")
    private String updUser;

    @Column(name = "`upd_time`")
    private Date updTime;

    @Column(name = "`unloading_over_date`")
    private String unloadingOverDate;

    @Column(name = "`Column_39`")
    private String column39;

    @Column(name = "`Column_40`")
    private String column40;

    @Column(name = "`Column_41`")
    private String column41;

    @Column(name = "`Column_42`")
    private String column42;

    @Column(name = "`Column_43`")
    private String column43;

    /**
     * @return id
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
     * @return com_id
     */
    public String getComId() {
        return comId;
    }

    /**
     * @param comId
     */
    public void setComId(String comId) {
        this.comId = comId == null ? null : comId.trim();
    }

    /**
     * @return com_name
     */
    public String getComName() {
        return comName;
    }

    /**
     * @param comName
     */
    public void setComName(String comName) {
        this.comName = comName == null ? null : comName.trim();
    }

    /**
     * @return waybill_id
     */
    public String getWaybillId() {
        return waybillId;
    }

    /**
     * @param waybillId
     */
    public void setWaybillId(String waybillId) {
        this.waybillId = waybillId == null ? null : waybillId.trim();
    }

    /**
     * @return vehicle_pai
     */
    public String getVehiclePai() {
        return vehiclePai;
    }

    /**
     * @param vehiclePai
     */
    public void setVehiclePai(String vehiclePai) {
        this.vehiclePai = vehiclePai == null ? null : vehiclePai.trim();
    }

    /**
     * @return vehicle_status
     */
    public String getVehicleStatus() {
        return vehicleStatus;
    }

    /**
     * @param vehicleStatus
     */
    public void setVehicleStatus(String vehicleStatus) {
        this.vehicleStatus = vehicleStatus == null ? null : vehicleStatus.trim();
    }

    /**
     * @return vehicle_jsy
     */
    public String getVehicleJsy() {
        return vehicleJsy;
    }

    /**
     * @param vehicleJsy
     */
    public void setVehicleJsy(String vehicleJsy) {
        this.vehicleJsy = vehicleJsy == null ? null : vehicleJsy.trim();
    }

    /**
     * @return driver_status
     */
    public String getDriverStatus() {
        return driverStatus;
    }

    /**
     * @param driverStatus
     */
    public void setDriverStatus(String driverStatus) {
        this.driverStatus = driverStatus == null ? null : driverStatus.trim();
    }

    /**
     * @return vehicle_yyy
     */
    public String getVehicleYyy() {
        return vehicleYyy;
    }

    /**
     * @param vehicleYyy
     */
    public void setVehicleYyy(String vehicleYyy) {
        this.vehicleYyy = vehicleYyy == null ? null : vehicleYyy.trim();
    }

    /**
     * @return supercargo_status
     */
    public String getSupercargoStatus() {
        return supercargoStatus;
    }

    /**
     * @param supercargoStatus
     */
    public void setSupercargoStatus(String supercargoStatus) {
        this.supercargoStatus = supercargoStatus == null ? null : supercargoStatus.trim();
    }

    /**
     * @return loadinger
     */
    public String getLoadinger() {
        return loadinger;
    }

    /**
     * @param loadinger
     */
    public void setLoadinger(String loadinger) {
        this.loadinger = loadinger == null ? null : loadinger.trim();
    }

    /**
     * @return loadinger_status
     */
    public String getLoadingerStatus() {
        return loadingerStatus;
    }

    /**
     * @param loadingerStatus
     */
    public void setLoadingerStatus(String loadingerStatus) {
        this.loadingerStatus = loadingerStatus == null ? null : loadingerStatus.trim();
    }

    /**
     * @return loading_chkin_date
     */
    public String getLoadingChkinDate() {
        return loadingChkinDate;
    }

    /**
     * @param loadingChkinDate
     */
    public void setLoadingChkinDate(String loadingChkinDate) {
        this.loadingChkinDate = loadingChkinDate == null ? null : loadingChkinDate.trim();
    }

    /**
     * @return loading_chkout_date
     */
    public String getLoadingChkoutDate() {
        return loadingChkoutDate;
    }

    /**
     * @param loadingChkoutDate
     */
    public void setLoadingChkoutDate(String loadingChkoutDate) {
        this.loadingChkoutDate = loadingChkoutDate == null ? null : loadingChkoutDate.trim();
    }

    /**
     * @return loading_region_no
     */
    public String getLoadingRegionNo() {
        return loadingRegionNo;
    }

    /**
     * @param loadingRegionNo
     */
    public void setLoadingRegionNo(String loadingRegionNo) {
        this.loadingRegionNo = loadingRegionNo == null ? null : loadingRegionNo.trim();
    }

    /**
     * @return loading_date
     */
    public String getLoadingDate() {
        return loadingDate;
    }

    /**
     * @param loadingDate
     */
    public void setLoadingDate(String loadingDate) {
        this.loadingDate = loadingDate == null ? null : loadingDate.trim();
    }

    /**
     * @return loading_type1
     */
    public String getLoadingType1() {
        return loadingType1;
    }

    /**
     * @param loadingType1
     */
    public void setLoadingType1(String loadingType1) {
        this.loadingType1 = loadingType1 == null ? null : loadingType1.trim();
    }

    /**
     * @return loading_over_date
     */
    public String getLoadingOverDate() {
        return loadingOverDate;
    }

    /**
     * @param loadingOverDate
     */
    public void setLoadingOverDate(String loadingOverDate) {
        this.loadingOverDate = loadingOverDate == null ? null : loadingOverDate.trim();
    }

    /**
     * @return unloadinger
     */
    public String getUnloadinger() {
        return unloadinger;
    }

    /**
     * @param unloadinger
     */
    public void setUnloadinger(String unloadinger) {
        this.unloadinger = unloadinger == null ? null : unloadinger.trim();
    }

    /**
     * @return unloadinger_status
     */
    public String getUnloadingerStatus() {
        return unloadingerStatus;
    }

    /**
     * @param unloadingerStatus
     */
    public void setUnloadingerStatus(String unloadingerStatus) {
        this.unloadingerStatus = unloadingerStatus == null ? null : unloadingerStatus.trim();
    }

    /**
     * @return unloading_region_no
     */
    public String getUnloadingRegionNo() {
        return unloadingRegionNo;
    }

    /**
     * @param unloadingRegionNo
     */
    public void setUnloadingRegionNo(String unloadingRegionNo) {
        this.unloadingRegionNo = unloadingRegionNo == null ? null : unloadingRegionNo.trim();
    }

    /**
     * @return unloading_chkin_date
     */
    public String getUnloadingChkinDate() {
        return unloadingChkinDate;
    }

    /**
     * @param unloadingChkinDate
     */
    public void setUnloadingChkinDate(String unloadingChkinDate) {
        this.unloadingChkinDate = unloadingChkinDate == null ? null : unloadingChkinDate.trim();
    }

    /**
     * @return unloading_date
     */
    public String getUnloadingDate() {
        return unloadingDate;
    }

    /**
     * @param unloadingDate
     */
    public void setUnloadingDate(String unloadingDate) {
        this.unloadingDate = unloadingDate == null ? null : unloadingDate.trim();
    }

    /**
     * @return unloading_chkout_date
     */
    public String getUnloadingChkoutDate() {
        return unloadingChkoutDate;
    }

    /**
     * @param unloadingChkoutDate
     */
    public void setUnloadingChkoutDate(String unloadingChkoutDate) {
        this.unloadingChkoutDate = unloadingChkoutDate == null ? null : unloadingChkoutDate.trim();
    }

    /**
     * @return unloading_name
     */
    public String getUnloadingName() {
        return unloadingName;
    }

    /**
     * @param unloadingName
     */
    public void setUnloadingName(String unloadingName) {
        this.unloadingName = unloadingName == null ? null : unloadingName.trim();
    }

    /**
     * @return reserve_col_1
     */
    public String getReserveCol1() {
        return reserveCol1;
    }

    /**
     * @param reserveCol1
     */
    public void setReserveCol1(String reserveCol1) {
        this.reserveCol1 = reserveCol1 == null ? null : reserveCol1.trim();
    }

    /**
     * @return reserve_col_2
     */
    public String getReserveCol2() {
        return reserveCol2;
    }

    /**
     * @param reserveCol2
     */
    public void setReserveCol2(String reserveCol2) {
        this.reserveCol2 = reserveCol2 == null ? null : reserveCol2.trim();
    }

    /**
     * @return reserve_col_3
     */
    public String getReserveCol3() {
        return reserveCol3;
    }

    /**
     * @param reserveCol3
     */
    public void setReserveCol3(String reserveCol3) {
        this.reserveCol3 = reserveCol3 == null ? null : reserveCol3.trim();
    }

    /**
     * @return reserve_col_4
     */
    public String getReserveCol4() {
        return reserveCol4;
    }

    /**
     * @param reserveCol4
     */
    public void setReserveCol4(String reserveCol4) {
        this.reserveCol4 = reserveCol4 == null ? null : reserveCol4.trim();
    }

    /**
     * @return reserve_col_5
     */
    public String getReserveCol5() {
        return reserveCol5;
    }

    /**
     * @param reserveCol5
     */
    public void setReserveCol5(String reserveCol5) {
        this.reserveCol5 = reserveCol5 == null ? null : reserveCol5.trim();
    }

    /**
     * @return reserve_col_6
     */
    public String getReserveCol6() {
        return reserveCol6;
    }

    /**
     * @param reserveCol6
     */
    public void setReserveCol6(String reserveCol6) {
        this.reserveCol6 = reserveCol6 == null ? null : reserveCol6.trim();
    }

    /**
     * @return reserve_col_7
     */
    public String getReserveCol7() {
        return reserveCol7;
    }

    /**
     * @param reserveCol7
     */
    public void setReserveCol7(String reserveCol7) {
        this.reserveCol7 = reserveCol7 == null ? null : reserveCol7.trim();
    }

    /**
     * @return reserve_col_8
     */
    public String getReserveCol8() {
        return reserveCol8;
    }

    /**
     * @param reserveCol8
     */
    public void setReserveCol8(String reserveCol8) {
        this.reserveCol8 = reserveCol8 == null ? null : reserveCol8.trim();
    }

    /**
     * @return ins_user
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
     * @return ins_time
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
     * @return upd_user
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
     * @return upd_time
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
     * @return unloading_over_date
     */
    public String getUnloadingOverDate() {
        return unloadingOverDate;
    }

    /**
     * @param unloadingOverDate
     */
    public void setUnloadingOverDate(String unloadingOverDate) {
        this.unloadingOverDate = unloadingOverDate == null ? null : unloadingOverDate.trim();
    }

    /**
     * @return Column_39
     */
    public String getColumn39() {
        return column39;
    }

    /**
     * @param column39
     */
    public void setColumn39(String column39) {
        this.column39 = column39 == null ? null : column39.trim();
    }

    /**
     * @return Column_40
     */
    public String getColumn40() {
        return column40;
    }

    /**
     * @param column40
     */
    public void setColumn40(String column40) {
        this.column40 = column40 == null ? null : column40.trim();
    }

    /**
     * @return Column_41
     */
    public String getColumn41() {
        return column41;
    }

    /**
     * @param column41
     */
    public void setColumn41(String column41) {
        this.column41 = column41 == null ? null : column41.trim();
    }

    /**
     * @return Column_42
     */
    public String getColumn42() {
        return column42;
    }

    /**
     * @param column42
     */
    public void setColumn42(String column42) {
        this.column42 = column42 == null ? null : column42.trim();
    }

    /**
     * @return Column_43
     */
    public String getColumn43() {
        return column43;
    }

    /**
     * @param column43
     */
    public void setColumn43(String column43) {
        this.column43 = column43 == null ? null : column43.trim();
    }
}