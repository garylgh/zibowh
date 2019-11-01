package com.zibowh.domain.entity.mbg;

import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.*;

@Table(name = "`t_busi_bill`")
public class TBusiBill {
    @Id
    @Column(name = "`BILLNO`")
    private String billno;

    @Column(name = "`BILLNUM`")
    private String billnum;

    @Column(name = "`OWNER_ID`")
    private String ownerId;

    @Column(name = "`OWNERTYPE`")
    private Integer ownertype;

    /**
     * 0:系统生成
            1:接口上传
            2：托运企业填报
     */
    @Column(name = "`BILLTYPE`")
    private Integer billtype;

    @Column(name = "`BILLSTATE`")
    private String billstate;

    @Column(name = "`QRCODE`")
    private String qrcode;

    @Column(name = "`BILLGENTIME`")
    private Date billgentime;

    @Column(name = "`SNAME`")
    private String sname;

    @Column(name = "`STEL`")
    private String stel;

    @Column(name = "`SNAME_ID`")
    private String snameId;

    @Column(name = "`RNAME_ID`")
    private String rnameId;

    @Column(name = "`RNAME`")
    private String rname;

    @Column(name = "`RTTEL`")
    private String rttel;

    @Column(name = "`STARTPOS`")
    private String startpos;

    @Column(name = "`SZIPCODE`")
    private String szipcode;

    @Column(name = "`ENDPOS`")
    private String endpos;

    @Column(name = "`EZIPCODE`")
    private String ezipcode;

    @Column(name = "`LOADDATE`")
    private Date loaddate;

    @Column(name = "`UNLOADDTE`")
    private Date unloaddte;

    @Column(name = "`GOODSINFO`")
    private String goodsinfo;

    @Column(name = "`LINEID`")
    private String lineid;

    @Column(name = "`LINENAME`")
    private String linename;

    @Column(name = "`LINEMILE`")
    private BigDecimal linemile;

    @Column(name = "`YSNAME_ID`")
    private String ysnameId;

    @Column(name = "`YSNAME`")
    private String ysname;

    @Column(name = "`YSMCERTID`")
    private String ysmcertid;

    @Column(name = "`YSENTTEL`")
    private String ysenttel;

    @Column(name = "`VEHICL_ID`")
    private String vehiclId;

    @Column(name = "`VEHICL_CODE`")
    private String vehiclCode;

    @Column(name = "`CCERTID`")
    private String ccertid;

    @Column(name = "`GVEHICLE_ID`")
    private String gvehicleId;

    @Column(name = "`GVEHICLE_CODE`")
    private String gvehicleCode;

    @Column(name = "`GCCERTID`")
    private String gccertid;

    @Column(name = "`JSYNAME`")
    private String jsyname;

    @Column(name = "`JSYID_ECERT`")
    private String jsyidEcert;

    @Column(name = "`JSYTEL`")
    private String jsytel;

    @Column(name = "`YYYNAME`")
    private String yyyname;

    @Column(name = "`YYYID_ECERT`")
    private String yyyidEcert;

    @Column(name = "`YYYTEL`")
    private String yyytel;

    @Column(name = "`PRINTIME`")
    private Date printime;

    @Column(name = "`CREATTIME`")
    private Date creattime;

    @Column(name = "`CREATEOR`")
    private String createor;

    @Column(name = "`ATTENTIONNOTE`")
    private String attentionnote;

    @Column(name = "`HANDLENOTE`")
    private String handlenote;

    @Column(name = "`DEL_FLG`")
    private Integer delFlg;

    @Column(name = "`CANCELOPER`")
    private String canceloper;

    @Column(name = "`CANCELTIME`")
    private Date canceltime;

    @Column(name = "`DISP_EXPINFO`")
    private String dispExpinfo;

    @Column(name = "`TON`")
    private BigDecimal ton;

    @Column(name = "`HWZZL`")
    private BigDecimal hwzzl;

    @Column(name = "`TASK_ID`")
    private String taskId;

    @Column(name = "`CANCELREASON`")
    private String cancelreason;

    /**
     * 1：已接单
            0：未接单
     */
    @Column(name = "`APPJDZT`")
    private Integer appjdzt;

    @Column(name = "`APPRECVTIME`")
    private Date apprecvtime;

    @Column(name = "`APPOPENTIME`")
    private Date appopentime;

    @Column(name = "`TYDBH`")
    private String tydbh;

    @Column(name = "`JSY_EID`")
    private String jsyEid;

    @Column(name = "`YYY_EID`")
    private String yyyEid;

    /**
     * @return BILLNO
     */
    public String getBillno() {
        return billno;
    }

    /**
     * @param billno
     */
    public void setBillno(String billno) {
        this.billno = billno == null ? null : billno.trim();
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
     * @return OWNERTYPE
     */
    public Integer getOwnertype() {
        return ownertype;
    }

    /**
     * @param ownertype
     */
    public void setOwnertype(Integer ownertype) {
        this.ownertype = ownertype;
    }

    /**
     * 获取0:系统生成
            1:接口上传
            2：托运企业填报
     *
     * @return BILLTYPE - 0:系统生成
            1:接口上传
            2：托运企业填报
     */
    public Integer getBilltype() {
        return billtype;
    }

    /**
     * 设置0:系统生成
            1:接口上传
            2：托运企业填报
     *
     * @param billtype 0:系统生成
            1:接口上传
            2：托运企业填报
     */
    public void setBilltype(Integer billtype) {
        this.billtype = billtype;
    }

    /**
     * @return BILLSTATE
     */
    public String getBillstate() {
        return billstate;
    }

    /**
     * @param billstate
     */
    public void setBillstate(String billstate) {
        this.billstate = billstate == null ? null : billstate.trim();
    }

    /**
     * @return QRCODE
     */
    public String getQrcode() {
        return qrcode;
    }

    /**
     * @param qrcode
     */
    public void setQrcode(String qrcode) {
        this.qrcode = qrcode == null ? null : qrcode.trim();
    }

    /**
     * @return BILLGENTIME
     */
    public Date getBillgentime() {
        return billgentime;
    }

    /**
     * @param billgentime
     */
    public void setBillgentime(Date billgentime) {
        this.billgentime = billgentime;
    }

    /**
     * @return SNAME
     */
    public String getSname() {
        return sname;
    }

    /**
     * @param sname
     */
    public void setSname(String sname) {
        this.sname = sname == null ? null : sname.trim();
    }

    /**
     * @return STEL
     */
    public String getStel() {
        return stel;
    }

    /**
     * @param stel
     */
    public void setStel(String stel) {
        this.stel = stel == null ? null : stel.trim();
    }

    /**
     * @return SNAME_ID
     */
    public String getSnameId() {
        return snameId;
    }

    /**
     * @param snameId
     */
    public void setSnameId(String snameId) {
        this.snameId = snameId == null ? null : snameId.trim();
    }

    /**
     * @return RNAME_ID
     */
    public String getRnameId() {
        return rnameId;
    }

    /**
     * @param rnameId
     */
    public void setRnameId(String rnameId) {
        this.rnameId = rnameId == null ? null : rnameId.trim();
    }

    /**
     * @return RNAME
     */
    public String getRname() {
        return rname;
    }

    /**
     * @param rname
     */
    public void setRname(String rname) {
        this.rname = rname == null ? null : rname.trim();
    }

    /**
     * @return RTTEL
     */
    public String getRttel() {
        return rttel;
    }

    /**
     * @param rttel
     */
    public void setRttel(String rttel) {
        this.rttel = rttel == null ? null : rttel.trim();
    }

    /**
     * @return STARTPOS
     */
    public String getStartpos() {
        return startpos;
    }

    /**
     * @param startpos
     */
    public void setStartpos(String startpos) {
        this.startpos = startpos == null ? null : startpos.trim();
    }

    /**
     * @return SZIPCODE
     */
    public String getSzipcode() {
        return szipcode;
    }

    /**
     * @param szipcode
     */
    public void setSzipcode(String szipcode) {
        this.szipcode = szipcode == null ? null : szipcode.trim();
    }

    /**
     * @return ENDPOS
     */
    public String getEndpos() {
        return endpos;
    }

    /**
     * @param endpos
     */
    public void setEndpos(String endpos) {
        this.endpos = endpos == null ? null : endpos.trim();
    }

    /**
     * @return EZIPCODE
     */
    public String getEzipcode() {
        return ezipcode;
    }

    /**
     * @param ezipcode
     */
    public void setEzipcode(String ezipcode) {
        this.ezipcode = ezipcode == null ? null : ezipcode.trim();
    }

    /**
     * @return LOADDATE
     */
    public Date getLoaddate() {
        return loaddate;
    }

    /**
     * @param loaddate
     */
    public void setLoaddate(Date loaddate) {
        this.loaddate = loaddate;
    }

    /**
     * @return UNLOADDTE
     */
    public Date getUnloaddte() {
        return unloaddte;
    }

    /**
     * @param unloaddte
     */
    public void setUnloaddte(Date unloaddte) {
        this.unloaddte = unloaddte;
    }

    /**
     * @return GOODSINFO
     */
    public String getGoodsinfo() {
        return goodsinfo;
    }

    /**
     * @param goodsinfo
     */
    public void setGoodsinfo(String goodsinfo) {
        this.goodsinfo = goodsinfo == null ? null : goodsinfo.trim();
    }

    /**
     * @return LINEID
     */
    public String getLineid() {
        return lineid;
    }

    /**
     * @param lineid
     */
    public void setLineid(String lineid) {
        this.lineid = lineid == null ? null : lineid.trim();
    }

    /**
     * @return LINENAME
     */
    public String getLinename() {
        return linename;
    }

    /**
     * @param linename
     */
    public void setLinename(String linename) {
        this.linename = linename == null ? null : linename.trim();
    }

    /**
     * @return LINEMILE
     */
    public BigDecimal getLinemile() {
        return linemile;
    }

    /**
     * @param linemile
     */
    public void setLinemile(BigDecimal linemile) {
        this.linemile = linemile;
    }

    /**
     * @return YSNAME_ID
     */
    public String getYsnameId() {
        return ysnameId;
    }

    /**
     * @param ysnameId
     */
    public void setYsnameId(String ysnameId) {
        this.ysnameId = ysnameId == null ? null : ysnameId.trim();
    }

    /**
     * @return YSNAME
     */
    public String getYsname() {
        return ysname;
    }

    /**
     * @param ysname
     */
    public void setYsname(String ysname) {
        this.ysname = ysname == null ? null : ysname.trim();
    }

    /**
     * @return YSMCERTID
     */
    public String getYsmcertid() {
        return ysmcertid;
    }

    /**
     * @param ysmcertid
     */
    public void setYsmcertid(String ysmcertid) {
        this.ysmcertid = ysmcertid == null ? null : ysmcertid.trim();
    }

    /**
     * @return YSENTTEL
     */
    public String getYsenttel() {
        return ysenttel;
    }

    /**
     * @param ysenttel
     */
    public void setYsenttel(String ysenttel) {
        this.ysenttel = ysenttel == null ? null : ysenttel.trim();
    }

    /**
     * @return VEHICL_ID
     */
    public String getVehiclId() {
        return vehiclId;
    }

    /**
     * @param vehiclId
     */
    public void setVehiclId(String vehiclId) {
        this.vehiclId = vehiclId == null ? null : vehiclId.trim();
    }

    /**
     * @return VEHICL_CODE
     */
    public String getVehiclCode() {
        return vehiclCode;
    }

    /**
     * @param vehiclCode
     */
    public void setVehiclCode(String vehiclCode) {
        this.vehiclCode = vehiclCode == null ? null : vehiclCode.trim();
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
     * @return GCCERTID
     */
    public String getGccertid() {
        return gccertid;
    }

    /**
     * @param gccertid
     */
    public void setGccertid(String gccertid) {
        this.gccertid = gccertid == null ? null : gccertid.trim();
    }

    /**
     * @return JSYNAME
     */
    public String getJsyname() {
        return jsyname;
    }

    /**
     * @param jsyname
     */
    public void setJsyname(String jsyname) {
        this.jsyname = jsyname == null ? null : jsyname.trim();
    }

    /**
     * @return JSYID_ECERT
     */
    public String getJsyidEcert() {
        return jsyidEcert;
    }

    /**
     * @param jsyidEcert
     */
    public void setJsyidEcert(String jsyidEcert) {
        this.jsyidEcert = jsyidEcert == null ? null : jsyidEcert.trim();
    }

    /**
     * @return JSYTEL
     */
    public String getJsytel() {
        return jsytel;
    }

    /**
     * @param jsytel
     */
    public void setJsytel(String jsytel) {
        this.jsytel = jsytel == null ? null : jsytel.trim();
    }

    /**
     * @return YYYNAME
     */
    public String getYyyname() {
        return yyyname;
    }

    /**
     * @param yyyname
     */
    public void setYyyname(String yyyname) {
        this.yyyname = yyyname == null ? null : yyyname.trim();
    }

    /**
     * @return YYYID_ECERT
     */
    public String getYyyidEcert() {
        return yyyidEcert;
    }

    /**
     * @param yyyidEcert
     */
    public void setYyyidEcert(String yyyidEcert) {
        this.yyyidEcert = yyyidEcert == null ? null : yyyidEcert.trim();
    }

    /**
     * @return YYYTEL
     */
    public String getYyytel() {
        return yyytel;
    }

    /**
     * @param yyytel
     */
    public void setYyytel(String yyytel) {
        this.yyytel = yyytel == null ? null : yyytel.trim();
    }

    /**
     * @return PRINTIME
     */
    public Date getPrintime() {
        return printime;
    }

    /**
     * @param printime
     */
    public void setPrintime(Date printime) {
        this.printime = printime;
    }

    /**
     * @return CREATTIME
     */
    public Date getCreattime() {
        return creattime;
    }

    /**
     * @param creattime
     */
    public void setCreattime(Date creattime) {
        this.creattime = creattime;
    }

    /**
     * @return CREATEOR
     */
    public String getCreateor() {
        return createor;
    }

    /**
     * @param createor
     */
    public void setCreateor(String createor) {
        this.createor = createor == null ? null : createor.trim();
    }

    /**
     * @return ATTENTIONNOTE
     */
    public String getAttentionnote() {
        return attentionnote;
    }

    /**
     * @param attentionnote
     */
    public void setAttentionnote(String attentionnote) {
        this.attentionnote = attentionnote == null ? null : attentionnote.trim();
    }

    /**
     * @return HANDLENOTE
     */
    public String getHandlenote() {
        return handlenote;
    }

    /**
     * @param handlenote
     */
    public void setHandlenote(String handlenote) {
        this.handlenote = handlenote == null ? null : handlenote.trim();
    }

    /**
     * @return DEL_FLG
     */
    public Integer getDelFlg() {
        return delFlg;
    }

    /**
     * @param delFlg
     */
    public void setDelFlg(Integer delFlg) {
        this.delFlg = delFlg;
    }

    /**
     * @return CANCELOPER
     */
    public String getCanceloper() {
        return canceloper;
    }

    /**
     * @param canceloper
     */
    public void setCanceloper(String canceloper) {
        this.canceloper = canceloper == null ? null : canceloper.trim();
    }

    /**
     * @return CANCELTIME
     */
    public Date getCanceltime() {
        return canceltime;
    }

    /**
     * @param canceltime
     */
    public void setCanceltime(Date canceltime) {
        this.canceltime = canceltime;
    }

    /**
     * @return DISP_EXPINFO
     */
    public String getDispExpinfo() {
        return dispExpinfo;
    }

    /**
     * @param dispExpinfo
     */
    public void setDispExpinfo(String dispExpinfo) {
        this.dispExpinfo = dispExpinfo == null ? null : dispExpinfo.trim();
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
     * @return HWZZL
     */
    public BigDecimal getHwzzl() {
        return hwzzl;
    }

    /**
     * @param hwzzl
     */
    public void setHwzzl(BigDecimal hwzzl) {
        this.hwzzl = hwzzl;
    }

    /**
     * @return TASK_ID
     */
    public String getTaskId() {
        return taskId;
    }

    /**
     * @param taskId
     */
    public void setTaskId(String taskId) {
        this.taskId = taskId == null ? null : taskId.trim();
    }

    /**
     * @return CANCELREASON
     */
    public String getCancelreason() {
        return cancelreason;
    }

    /**
     * @param cancelreason
     */
    public void setCancelreason(String cancelreason) {
        this.cancelreason = cancelreason == null ? null : cancelreason.trim();
    }

    /**
     * 获取1：已接单
            0：未接单
     *
     * @return APPJDZT - 1：已接单
            0：未接单
     */
    public Integer getAppjdzt() {
        return appjdzt;
    }

    /**
     * 设置1：已接单
            0：未接单
     *
     * @param appjdzt 1：已接单
            0：未接单
     */
    public void setAppjdzt(Integer appjdzt) {
        this.appjdzt = appjdzt;
    }

    /**
     * @return APPRECVTIME
     */
    public Date getApprecvtime() {
        return apprecvtime;
    }

    /**
     * @param apprecvtime
     */
    public void setApprecvtime(Date apprecvtime) {
        this.apprecvtime = apprecvtime;
    }

    /**
     * @return APPOPENTIME
     */
    public Date getAppopentime() {
        return appopentime;
    }

    /**
     * @param appopentime
     */
    public void setAppopentime(Date appopentime) {
        this.appopentime = appopentime;
    }

    /**
     * @return TYDBH
     */
    public String getTydbh() {
        return tydbh;
    }

    /**
     * @param tydbh
     */
    public void setTydbh(String tydbh) {
        this.tydbh = tydbh == null ? null : tydbh.trim();
    }

    /**
     * @return JSY_EID
     */
    public String getJsyEid() {
        return jsyEid;
    }

    /**
     * @param jsyEid
     */
    public void setJsyEid(String jsyEid) {
        this.jsyEid = jsyEid == null ? null : jsyEid.trim();
    }

    /**
     * @return YYY_EID
     */
    public String getYyyEid() {
        return yyyEid;
    }

    /**
     * @param yyyEid
     */
    public void setYyyEid(String yyyEid) {
        this.yyyEid = yyyEid == null ? null : yyyEid.trim();
    }
}