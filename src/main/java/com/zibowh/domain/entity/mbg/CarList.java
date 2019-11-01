package com.zibowh.domain.entity.mbg;

import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.*;

@Table(name = "`car_list`")
public class CarList {
    @Id
    @Column(name = "`VEHICLE_ID`")
    private String vehicleId;

    @Column(name = "`OWNER_ID`")
    private String ownerId;

    @Column(name = "`VEHICLE_CODE`")
    private String vehicleCode;

    @Column(name = "`VEHICLE_TYPE`")
    private Integer vehicleType;

    @Column(name = "`COLOR`")
    private Integer color;

    @Column(name = "`MGRAREA`")
    private String mgrarea;

    @Column(name = "`CCERTWORD`")
    private String ccertword;

    @Column(name = "`CCERTID`")
    private String ccertid;

    @Column(name = "`FIRSTDATE`")
    private Date firstdate;

    @Column(name = "`EXPIREDATE`")
    private Date expiredate;

    @Column(name = "`GRANTORGAN`")
    private String grantorgan;

    @Column(name = "`TON`")
    private BigDecimal ton;

    @Column(name = "`POTCUBAGE`")
    private String potcubage;

    @Column(name = "`ISJ`")
    private Integer isj;

    @Column(name = "`ISQFS`")
    private Integer isqfs;

    @Column(name = "`ISBZP`")
    private Integer isbzp;

    @Column(name = "`CCERTSTATE`")
    private Integer ccertstate;

    @Column(name = "`SECMAINSTATE`")
    private Integer secmainstate;

    @Column(name = "`NEXTSECMDATE`")
    private Date nextsecmdate;

    @Column(name = "`VCLTECRANK`")
    private Integer vcltecrank;

    @Column(name = "`NEXTTECDATE`")
    private Date nexttecdate;

    @Column(name = "`CHECKRESULT`")
    private Integer checkresult;

    @Column(name = "`NEXTCHECKDATE`")
    private Date nextcheckdate;

    @Column(name = "`WHCIMONEY`")
    private BigDecimal whcimoney;

    @Column(name = "`JSEMP_ID`")
    private String jsempId;

    @Column(name = "`YYEMPID`")
    private String yyempid;

    @Column(name = "`SYSDATAID`")
    private String sysdataid;

    @Column(name = "`LASTSYNCTIME`")
    private Date lastsynctime;

    @Column(name = "`AYTSERVERSTATE`")
    private Integer aytserverstate;

    @Column(name = "`AYTTOKEN`")
    private String ayttoken;

    @Column(name = "`AYTSTARTTIME`")
    private Date aytstarttime;

    @Column(name = "`SYSSTATE`")
    private Integer sysstate;

    @Column(name = "`CREATETIME`")
    private Date createtime;

    @Column(name = "`SFAZGPS`")
    private Integer sfazgps;

    @Column(name = "`GPSYXZT`")
    private Integer gpsyxzt;

    @Column(name = "`GPSYYS`")
    private String gpsyys;

    @Column(name = "`CURYSZT`")
    private Integer curyszt;

    @Column(name = "`YDCHANGETIME`")
    private Date ydchangetime;

    @Column(name = "`YDRECTIME`")
    private Date ydrectime;

    @Column(name = "`YDYY`")
    private String ydyy;

    @Column(name = "`YDSJ`")
    private Date ydsj;

    @Column(name = "`SECMILE`")
    private Integer secmile;

    @Column(name = "`SECMDATE`")
    private Date secmdate;

    @Column(name = "`GVEHICLE_ID`")
    private String gvehicleId;

    @Column(name = "`GVEHICLE_CODE`")
    private String gvehicleCode;

    @Column(name = "`ISGC`")
    private Integer isgc;

    @Column(name = "`EID_NO`")
    private String eidNo;

    @Column(name = "`PROUCT_TYPE`")
    private String prouctType;

    @Column(name = "`PHOTO`")
    private String photo;

    @Column(name = "`WHCIENDDATE`")
    private Date whcienddate;

    @Column(name = "`MTYPE`")
    private String mtype;

    @Column(name = "`QYCID`")
    private String qycid;

    @Column(name = "`GCID`")
    private String gcid;

    @Column(name = "`DEVICE_NAME`")
    private String deviceName;

    /**
     * @return VEHICLE_ID
     */
    public String getVehicleId() {
        return vehicleId;
    }

    /**
     * @param vehicleId
     */
    public void setVehicleId(String vehicleId) {
        this.vehicleId = vehicleId == null ? null : vehicleId.trim();
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
     * @return VEHICLE_TYPE
     */
    public Integer getVehicleType() {
        return vehicleType;
    }

    /**
     * @param vehicleType
     */
    public void setVehicleType(Integer vehicleType) {
        this.vehicleType = vehicleType;
    }

    /**
     * @return COLOR
     */
    public Integer getColor() {
        return color;
    }

    /**
     * @param color
     */
    public void setColor(Integer color) {
        this.color = color;
    }

    /**
     * @return MGRAREA
     */
    public String getMgrarea() {
        return mgrarea;
    }

    /**
     * @param mgrarea
     */
    public void setMgrarea(String mgrarea) {
        this.mgrarea = mgrarea == null ? null : mgrarea.trim();
    }

    /**
     * @return CCERTWORD
     */
    public String getCcertword() {
        return ccertword;
    }

    /**
     * @param ccertword
     */
    public void setCcertword(String ccertword) {
        this.ccertword = ccertword == null ? null : ccertword.trim();
    }

    /**
     * @return CCERTID
     */
    public String getCcertid() {
        return ccertid;
    }

    /**
     * @param ccertid
     */
    public void setCcertid(String ccertid) {
        this.ccertid = ccertid == null ? null : ccertid.trim();
    }

    /**
     * @return FIRSTDATE
     */
    public Date getFirstdate() {
        return firstdate;
    }

    /**
     * @param firstdate
     */
    public void setFirstdate(Date firstdate) {
        this.firstdate = firstdate;
    }

    /**
     * @return EXPIREDATE
     */
    public Date getExpiredate() {
        return expiredate;
    }

    /**
     * @param expiredate
     */
    public void setExpiredate(Date expiredate) {
        this.expiredate = expiredate;
    }

    /**
     * @return GRANTORGAN
     */
    public String getGrantorgan() {
        return grantorgan;
    }

    /**
     * @param grantorgan
     */
    public void setGrantorgan(String grantorgan) {
        this.grantorgan = grantorgan == null ? null : grantorgan.trim();
    }

    /**
     * @return TON
     */
    public BigDecimal getTon() {
        return ton;
    }

    /**
     * @param ton
     */
    public void setTon(BigDecimal ton) {
        this.ton = ton;
    }

    /**
     * @return POTCUBAGE
     */
    public String getPotcubage() {
        return potcubage;
    }

    /**
     * @param potcubage
     */
    public void setPotcubage(String potcubage) {
        this.potcubage = potcubage == null ? null : potcubage.trim();
    }

    /**
     * @return ISJ
     */
    public Integer getIsj() {
        return isj;
    }

    /**
     * @param isj
     */
    public void setIsj(Integer isj) {
        this.isj = isj;
    }

    /**
     * @return ISQFS
     */
    public Integer getIsqfs() {
        return isqfs;
    }

    /**
     * @param isqfs
     */
    public void setIsqfs(Integer isqfs) {
        this.isqfs = isqfs;
    }

    /**
     * @return ISBZP
     */
    public Integer getIsbzp() {
        return isbzp;
    }

    /**
     * @param isbzp
     */
    public void setIsbzp(Integer isbzp) {
        this.isbzp = isbzp;
    }

    /**
     * @return CCERTSTATE
     */
    public Integer getCcertstate() {
        return ccertstate;
    }

    /**
     * @param ccertstate
     */
    public void setCcertstate(Integer ccertstate) {
        this.ccertstate = ccertstate;
    }

    /**
     * @return SECMAINSTATE
     */
    public Integer getSecmainstate() {
        return secmainstate;
    }

    /**
     * @param secmainstate
     */
    public void setSecmainstate(Integer secmainstate) {
        this.secmainstate = secmainstate;
    }

    /**
     * @return NEXTSECMDATE
     */
    public Date getNextsecmdate() {
        return nextsecmdate;
    }

    /**
     * @param nextsecmdate
     */
    public void setNextsecmdate(Date nextsecmdate) {
        this.nextsecmdate = nextsecmdate;
    }

    /**
     * @return VCLTECRANK
     */
    public Integer getVcltecrank() {
        return vcltecrank;
    }

    /**
     * @param vcltecrank
     */
    public void setVcltecrank(Integer vcltecrank) {
        this.vcltecrank = vcltecrank;
    }

    /**
     * @return NEXTTECDATE
     */
    public Date getNexttecdate() {
        return nexttecdate;
    }

    /**
     * @param nexttecdate
     */
    public void setNexttecdate(Date nexttecdate) {
        this.nexttecdate = nexttecdate;
    }

    /**
     * @return CHECKRESULT
     */
    public Integer getCheckresult() {
        return checkresult;
    }

    /**
     * @param checkresult
     */
    public void setCheckresult(Integer checkresult) {
        this.checkresult = checkresult;
    }

    /**
     * @return NEXTCHECKDATE
     */
    public Date getNextcheckdate() {
        return nextcheckdate;
    }

    /**
     * @param nextcheckdate
     */
    public void setNextcheckdate(Date nextcheckdate) {
        this.nextcheckdate = nextcheckdate;
    }

    /**
     * @return WHCIMONEY
     */
    public BigDecimal getWhcimoney() {
        return whcimoney;
    }

    /**
     * @param whcimoney
     */
    public void setWhcimoney(BigDecimal whcimoney) {
        this.whcimoney = whcimoney;
    }

    /**
     * @return JSEMP_ID
     */
    public String getJsempId() {
        return jsempId;
    }

    /**
     * @param jsempId
     */
    public void setJsempId(String jsempId) {
        this.jsempId = jsempId == null ? null : jsempId.trim();
    }

    /**
     * @return YYEMPID
     */
    public String getYyempid() {
        return yyempid;
    }

    /**
     * @param yyempid
     */
    public void setYyempid(String yyempid) {
        this.yyempid = yyempid == null ? null : yyempid.trim();
    }

    /**
     * @return SYSDATAID
     */
    public String getSysdataid() {
        return sysdataid;
    }

    /**
     * @param sysdataid
     */
    public void setSysdataid(String sysdataid) {
        this.sysdataid = sysdataid == null ? null : sysdataid.trim();
    }

    /**
     * @return LASTSYNCTIME
     */
    public Date getLastsynctime() {
        return lastsynctime;
    }

    /**
     * @param lastsynctime
     */
    public void setLastsynctime(Date lastsynctime) {
        this.lastsynctime = lastsynctime;
    }

    /**
     * @return AYTSERVERSTATE
     */
    public Integer getAytserverstate() {
        return aytserverstate;
    }

    /**
     * @param aytserverstate
     */
    public void setAytserverstate(Integer aytserverstate) {
        this.aytserverstate = aytserverstate;
    }

    /**
     * @return AYTTOKEN
     */
    public String getAyttoken() {
        return ayttoken;
    }

    /**
     * @param ayttoken
     */
    public void setAyttoken(String ayttoken) {
        this.ayttoken = ayttoken == null ? null : ayttoken.trim();
    }

    /**
     * @return AYTSTARTTIME
     */
    public Date getAytstarttime() {
        return aytstarttime;
    }

    /**
     * @param aytstarttime
     */
    public void setAytstarttime(Date aytstarttime) {
        this.aytstarttime = aytstarttime;
    }

    /**
     * @return SYSSTATE
     */
    public Integer getSysstate() {
        return sysstate;
    }

    /**
     * @param sysstate
     */
    public void setSysstate(Integer sysstate) {
        this.sysstate = sysstate;
    }

    /**
     * @return CREATETIME
     */
    public Date getCreatetime() {
        return createtime;
    }

    /**
     * @param createtime
     */
    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }

    /**
     * @return SFAZGPS
     */
    public Integer getSfazgps() {
        return sfazgps;
    }

    /**
     * @param sfazgps
     */
    public void setSfazgps(Integer sfazgps) {
        this.sfazgps = sfazgps;
    }

    /**
     * @return GPSYXZT
     */
    public Integer getGpsyxzt() {
        return gpsyxzt;
    }

    /**
     * @param gpsyxzt
     */
    public void setGpsyxzt(Integer gpsyxzt) {
        this.gpsyxzt = gpsyxzt;
    }

    /**
     * @return GPSYYS
     */
    public String getGpsyys() {
        return gpsyys;
    }

    /**
     * @param gpsyys
     */
    public void setGpsyys(String gpsyys) {
        this.gpsyys = gpsyys == null ? null : gpsyys.trim();
    }

    /**
     * @return CURYSZT
     */
    public Integer getCuryszt() {
        return curyszt;
    }

    /**
     * @param curyszt
     */
    public void setCuryszt(Integer curyszt) {
        this.curyszt = curyszt;
    }

    /**
     * @return YDCHANGETIME
     */
    public Date getYdchangetime() {
        return ydchangetime;
    }

    /**
     * @param ydchangetime
     */
    public void setYdchangetime(Date ydchangetime) {
        this.ydchangetime = ydchangetime;
    }

    /**
     * @return YDRECTIME
     */
    public Date getYdrectime() {
        return ydrectime;
    }

    /**
     * @param ydrectime
     */
    public void setYdrectime(Date ydrectime) {
        this.ydrectime = ydrectime;
    }

    /**
     * @return YDYY
     */
    public String getYdyy() {
        return ydyy;
    }

    /**
     * @param ydyy
     */
    public void setYdyy(String ydyy) {
        this.ydyy = ydyy == null ? null : ydyy.trim();
    }

    /**
     * @return YDSJ
     */
    public Date getYdsj() {
        return ydsj;
    }

    /**
     * @param ydsj
     */
    public void setYdsj(Date ydsj) {
        this.ydsj = ydsj;
    }

    /**
     * @return SECMILE
     */
    public Integer getSecmile() {
        return secmile;
    }

    /**
     * @param secmile
     */
    public void setSecmile(Integer secmile) {
        this.secmile = secmile;
    }

    /**
     * @return SECMDATE
     */
    public Date getSecmdate() {
        return secmdate;
    }

    /**
     * @param secmdate
     */
    public void setSecmdate(Date secmdate) {
        this.secmdate = secmdate;
    }

    /**
     * @return GVEHICLE_ID
     */
    public String getGvehicleId() {
        return gvehicleId;
    }

    /**
     * @param gvehicleId
     */
    public void setGvehicleId(String gvehicleId) {
        this.gvehicleId = gvehicleId == null ? null : gvehicleId.trim();
    }

    /**
     * @return GVEHICLE_CODE
     */
    public String getGvehicleCode() {
        return gvehicleCode;
    }

    /**
     * @param gvehicleCode
     */
    public void setGvehicleCode(String gvehicleCode) {
        this.gvehicleCode = gvehicleCode == null ? null : gvehicleCode.trim();
    }

    /**
     * @return ISGC
     */
    public Integer getIsgc() {
        return isgc;
    }

    /**
     * @param isgc
     */
    public void setIsgc(Integer isgc) {
        this.isgc = isgc;
    }

    /**
     * @return EID_NO
     */
    public String getEidNo() {
        return eidNo;
    }

    /**
     * @param eidNo
     */
    public void setEidNo(String eidNo) {
        this.eidNo = eidNo == null ? null : eidNo.trim();
    }

    /**
     * @return PROUCT_TYPE
     */
    public String getProuctType() {
        return prouctType;
    }

    /**
     * @param prouctType
     */
    public void setProuctType(String prouctType) {
        this.prouctType = prouctType == null ? null : prouctType.trim();
    }

    /**
     * @return PHOTO
     */
    public String getPhoto() {
        return photo;
    }

    /**
     * @param photo
     */
    public void setPhoto(String photo) {
        this.photo = photo == null ? null : photo.trim();
    }

    /**
     * @return WHCIENDDATE
     */
    public Date getWhcienddate() {
        return whcienddate;
    }

    /**
     * @param whcienddate
     */
    public void setWhcienddate(Date whcienddate) {
        this.whcienddate = whcienddate;
    }

    /**
     * @return MTYPE
     */
    public String getMtype() {
        return mtype;
    }

    /**
     * @param mtype
     */
    public void setMtype(String mtype) {
        this.mtype = mtype == null ? null : mtype.trim();
    }

    /**
     * @return QYCID
     */
    public String getQycid() {
        return qycid;
    }

    /**
     * @param qycid
     */
    public void setQycid(String qycid) {
        this.qycid = qycid == null ? null : qycid.trim();
    }

    /**
     * @return GCID
     */
    public String getGcid() {
        return gcid;
    }

    /**
     * @param gcid
     */
    public void setGcid(String gcid) {
        this.gcid = gcid == null ? null : gcid.trim();
    }

    /**
     * @return DEVICE_NAME
     */
    public String getDeviceName() {
        return deviceName;
    }

    /**
     * @param deviceName
     */
    public void setDeviceName(String deviceName) {
        this.deviceName = deviceName == null ? null : deviceName.trim();
    }
}