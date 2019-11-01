package com.zibowh.domain.entity.mbg;

import java.math.BigDecimal;
import javax.persistence.*;

@Table(name = "`t_busi_goods`")
public class TBusiGoods {
    @Id
    @Column(name = "`ID`")
    private String id;

    @Column(name = "`BILL_ID`")
    private String billId;

    @Column(name = "`WXP_ID`")
    private String wxpId;

    @Column(name = "`PACKAGE_ID`")
    private String packageId;

    @Column(name = "`UNCODE`")
    private String uncode;

    @Column(name = "`GNAME`")
    private String gname;

    @Column(name = "`GBM`")
    private String gbm;

    @Column(name = "`LB`")
    private String lb;

    @Column(name = "`XB`")
    private String xb;

    @Column(name = "`PTYPE`")
    private String ptype;

    @Column(name = "`SPEC`")
    private String spec;

    @Column(name = "`GWEIGHT`")
    private BigDecimal gweight;

    @Column(name = "`GSIZE`")
    private BigDecimal gsize;

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
     * @return BILL_ID
     */
    public String getBillId() {
        return billId;
    }

    /**
     * @param billId
     */
    public void setBillId(String billId) {
        this.billId = billId == null ? null : billId.trim();
    }

    /**
     * @return WXP_ID
     */
    public String getWxpId() {
        return wxpId;
    }

    /**
     * @param wxpId
     */
    public void setWxpId(String wxpId) {
        this.wxpId = wxpId == null ? null : wxpId.trim();
    }

    /**
     * @return PACKAGE_ID
     */
    public String getPackageId() {
        return packageId;
    }

    /**
     * @param packageId
     */
    public void setPackageId(String packageId) {
        this.packageId = packageId == null ? null : packageId.trim();
    }

    /**
     * @return UNCODE
     */
    public String getUncode() {
        return uncode;
    }

    /**
     * @param uncode
     */
    public void setUncode(String uncode) {
        this.uncode = uncode == null ? null : uncode.trim();
    }

    /**
     * @return GNAME
     */
    public String getGname() {
        return gname;
    }

    /**
     * @param gname
     */
    public void setGname(String gname) {
        this.gname = gname == null ? null : gname.trim();
    }

    /**
     * @return GBM
     */
    public String getGbm() {
        return gbm;
    }

    /**
     * @param gbm
     */
    public void setGbm(String gbm) {
        this.gbm = gbm == null ? null : gbm.trim();
    }

    /**
     * @return LB
     */
    public String getLb() {
        return lb;
    }

    /**
     * @param lb
     */
    public void setLb(String lb) {
        this.lb = lb == null ? null : lb.trim();
    }

    /**
     * @return XB
     */
    public String getXb() {
        return xb;
    }

    /**
     * @param xb
     */
    public void setXb(String xb) {
        this.xb = xb == null ? null : xb.trim();
    }

    /**
     * @return PTYPE
     */
    public String getPtype() {
        return ptype;
    }

    /**
     * @param ptype
     */
    public void setPtype(String ptype) {
        this.ptype = ptype == null ? null : ptype.trim();
    }

    /**
     * @return SPEC
     */
    public String getSpec() {
        return spec;
    }

    /**
     * @param spec
     */
    public void setSpec(String spec) {
        this.spec = spec == null ? null : spec.trim();
    }

    /**
     * @return GWEIGHT
     */
    public BigDecimal getGweight() {
        return gweight;
    }

    /**
     * @param gweight
     */
    public void setGweight(BigDecimal gweight) {
        this.gweight = gweight;
    }

    /**
     * @return GSIZE
     */
    public BigDecimal getGsize() {
        return gsize;
    }

    /**
     * @param gsize
     */
    public void setGsize(BigDecimal gsize) {
        this.gsize = gsize;
    }
}