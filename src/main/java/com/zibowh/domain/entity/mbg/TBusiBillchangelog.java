package com.zibowh.domain.entity.mbg;

import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.*;

@Table(name = "`t_busi_billchangelog`")
public class TBusiBillchangelog {
    @Id
    @Column(name = "`LOG_ID`")
    private String logId;

    @Column(name = "`BILL_ID`")
    private String billId;

    @Column(name = "`BILLNUM`")
    private String billnum;

    @Column(name = "`BILLSTATE`")
    private Integer billstate;

    @Column(name = "`CHANGENOTE`")
    private String changenote;

    @Column(name = "`CHANGETIME`")
    private Date changetime;

    @Column(name = "`CHANGETYPE`")
    private Integer changetype;

    @Column(name = "`OUSER_ID`")
    private String ouserId;

    @Column(name = "`ONAME`")
    private String oname;

    @Column(name = "`LON`")
    private BigDecimal lon;

    @Column(name = "`LAT`")
    private BigDecimal lat;

    @Column(name = "`WARNING`")
    private String warning;

    @Column(name = "`Column_13`")
    private String column13;

    @Column(name = "`Column_14`")
    private String column14;

    @Column(name = "`Column_15`")
    private String column15;

    @Column(name = "`Column_16`")
    private String column16;

    @Column(name = "`Column_17`")
    private String column17;

    /**
     * @return LOG_ID
     */
    public String getLogId() {
        return logId;
    }

    /**
     * @param logId
     */
    public void setLogId(String logId) {
        this.logId = logId == null ? null : logId.trim();
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
     * @return BILLNUM
     */
    public String getBillnum() {
        return billnum;
    }

    /**
     * @param billnum
     */
    public void setBillnum(String billnum) {
        this.billnum = billnum == null ? null : billnum.trim();
    }

    /**
     * @return BILLSTATE
     */
    public Integer getBillstate() {
        return billstate;
    }

    /**
     * @param billstate
     */
    public void setBillstate(Integer billstate) {
        this.billstate = billstate;
    }

    /**
     * @return CHANGENOTE
     */
    public String getChangenote() {
        return changenote;
    }

    /**
     * @param changenote
     */
    public void setChangenote(String changenote) {
        this.changenote = changenote == null ? null : changenote.trim();
    }

    /**
     * @return CHANGETIME
     */
    public Date getChangetime() {
        return changetime;
    }

    /**
     * @param changetime
     */
    public void setChangetime(Date changetime) {
        this.changetime = changetime;
    }

    /**
     * @return CHANGETYPE
     */
    public Integer getChangetype() {
        return changetype;
    }

    /**
     * @param changetype
     */
    public void setChangetype(Integer changetype) {
        this.changetype = changetype;
    }

    /**
     * @return OUSER_ID
     */
    public String getOuserId() {
        return ouserId;
    }

    /**
     * @param ouserId
     */
    public void setOuserId(String ouserId) {
        this.ouserId = ouserId == null ? null : ouserId.trim();
    }

    /**
     * @return ONAME
     */
    public String getOname() {
        return oname;
    }

    /**
     * @param oname
     */
    public void setOname(String oname) {
        this.oname = oname == null ? null : oname.trim();
    }

    /**
     * @return LON
     */
    public BigDecimal getLon() {
        return lon;
    }

    /**
     * @param lon
     */
    public void setLon(BigDecimal lon) {
        this.lon = lon;
    }

    /**
     * @return LAT
     */
    public BigDecimal getLat() {
        return lat;
    }

    /**
     * @param lat
     */
    public void setLat(BigDecimal lat) {
        this.lat = lat;
    }

    /**
     * @return WARNING
     */
    public String getWarning() {
        return warning;
    }

    /**
     * @param warning
     */
    public void setWarning(String warning) {
        this.warning = warning == null ? null : warning.trim();
    }

    /**
     * @return Column_13
     */
    public String getColumn13() {
        return column13;
    }

    /**
     * @param column13
     */
    public void setColumn13(String column13) {
        this.column13 = column13 == null ? null : column13.trim();
    }

    /**
     * @return Column_14
     */
    public String getColumn14() {
        return column14;
    }

    /**
     * @param column14
     */
    public void setColumn14(String column14) {
        this.column14 = column14 == null ? null : column14.trim();
    }

    /**
     * @return Column_15
     */
    public String getColumn15() {
        return column15;
    }

    /**
     * @param column15
     */
    public void setColumn15(String column15) {
        this.column15 = column15 == null ? null : column15.trim();
    }

    /**
     * @return Column_16
     */
    public String getColumn16() {
        return column16;
    }

    /**
     * @param column16
     */
    public void setColumn16(String column16) {
        this.column16 = column16 == null ? null : column16.trim();
    }

    /**
     * @return Column_17
     */
    public String getColumn17() {
        return column17;
    }

    /**
     * @param column17
     */
    public void setColumn17(String column17) {
        this.column17 = column17 == null ? null : column17.trim();
    }
}