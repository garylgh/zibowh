package com.zibowh.domain.entity.mbg;

import java.util.Date;
import javax.persistence.*;

@Table(name = "`unLoading_weightinfo_tab`")
public class UnloadingWeightinfoTab {
    @Id
    @Column(name = "`id`")
    private Integer id;

    @Column(name = "`bill_num`")
    private String billNum;

    @Column(name = "`loading_after_weight`")
    private Double loadingAfterWeight;

    @Column(name = "`loading_first_weight`")
    private Double loadingFirstWeight;

    @Column(name = "`unloading_first_weight`")
    private Double unloadingFirstWeight;

    @Column(name = "`unloading_after_weight`")
    private Double unloadingAfterWeight;

    @Column(name = "`loading_weight`")
    private Double loadingWeight;

    @Column(name = "`unloading_weight`")
    private Double unloadingWeight;

    @Column(name = "`zhrcgbsj`")
    private Date zhrcgbsj;

    @Column(name = "`zhccgbsj`")
    private Date zhccgbsj;

    @Column(name = "`xhrcgbsj`")
    private Date xhrcgbsj;

    @Column(name = "`xhccgbsj`")
    private Date xhccgbsj;

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
     * @return bill_num
     */
    public String getBillNum() {
        return billNum;
    }

    /**
     * @param billNum
     */
    public void setBillNum(String billNum) {
        this.billNum = billNum == null ? null : billNum.trim();
    }

    /**
     * @return loading_after_weight
     */
    public Double getLoadingAfterWeight() {
        return loadingAfterWeight;
    }

    /**
     * @param loadingAfterWeight
     */
    public void setLoadingAfterWeight(Double loadingAfterWeight) {
        this.loadingAfterWeight = loadingAfterWeight;
    }

    /**
     * @return loading_first_weight
     */
    public Double getLoadingFirstWeight() {
        return loadingFirstWeight;
    }

    /**
     * @param loadingFirstWeight
     */
    public void setLoadingFirstWeight(Double loadingFirstWeight) {
        this.loadingFirstWeight = loadingFirstWeight;
    }

    /**
     * @return unloading_first_weight
     */
    public Double getUnloadingFirstWeight() {
        return unloadingFirstWeight;
    }

    /**
     * @param unloadingFirstWeight
     */
    public void setUnloadingFirstWeight(Double unloadingFirstWeight) {
        this.unloadingFirstWeight = unloadingFirstWeight;
    }

    /**
     * @return unloading_after_weight
     */
    public Double getUnloadingAfterWeight() {
        return unloadingAfterWeight;
    }

    /**
     * @param unloadingAfterWeight
     */
    public void setUnloadingAfterWeight(Double unloadingAfterWeight) {
        this.unloadingAfterWeight = unloadingAfterWeight;
    }

    /**
     * @return loading_weight
     */
    public Double getLoadingWeight() {
        return loadingWeight;
    }

    /**
     * @param loadingWeight
     */
    public void setLoadingWeight(Double loadingWeight) {
        this.loadingWeight = loadingWeight;
    }

    /**
     * @return unloading_weight
     */
    public Double getUnloadingWeight() {
        return unloadingWeight;
    }

    /**
     * @param unloadingWeight
     */
    public void setUnloadingWeight(Double unloadingWeight) {
        this.unloadingWeight = unloadingWeight;
    }

    /**
     * @return zhrcgbsj
     */
    public Date getZhrcgbsj() {
        return zhrcgbsj;
    }

    /**
     * @param zhrcgbsj
     */
    public void setZhrcgbsj(Date zhrcgbsj) {
        this.zhrcgbsj = zhrcgbsj;
    }

    /**
     * @return zhccgbsj
     */
    public Date getZhccgbsj() {
        return zhccgbsj;
    }

    /**
     * @param zhccgbsj
     */
    public void setZhccgbsj(Date zhccgbsj) {
        this.zhccgbsj = zhccgbsj;
    }

    /**
     * @return xhrcgbsj
     */
    public Date getXhrcgbsj() {
        return xhrcgbsj;
    }

    /**
     * @param xhrcgbsj
     */
    public void setXhrcgbsj(Date xhrcgbsj) {
        this.xhrcgbsj = xhrcgbsj;
    }

    /**
     * @return xhccgbsj
     */
    public Date getXhccgbsj() {
        return xhccgbsj;
    }

    /**
     * @param xhccgbsj
     */
    public void setXhccgbsj(Date xhccgbsj) {
        this.xhccgbsj = xhccgbsj;
    }
}