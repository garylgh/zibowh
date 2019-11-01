package com.zibowh.domain.entity.mbg;

import java.util.Date;
import javax.persistence.*;

@Table(name = "`draft`")
public class Draft {
    @Id
    @Column(name = "`OWNER_ID`")
    private String ownerId;

    @Column(name = "`OWNERTYPE`")
    private String ownertype;

    @Column(name = "`OWNERNAME`")
    private String ownername;

    @Column(name = "`OWNERJC`")
    private String ownerjc;

    @Column(name = "`ENGLISH`")
    private String english;

    @Column(name = "`ZHUCEZIBEN`")
    private String zhuceziben;

    @Column(name = "`ZHUCETIME`")
    private Date zhucetime;

    @Column(name = "`AREA`")
    private Double area;

    @Column(name = "`PERSNUM`")
    private String persnum;

    @Column(name = "`BUSINESSID`")
    private String businessid;

    @Column(name = "`TONGYICODE`")
    private String tongyicode;

    @Column(name = "`ZUZHICODE`")
    private String zuzhicode;

    @Column(name = "`LICENSECODE`")
    private String licensecode;

    @Column(name = "`FIRSTDATE`")
    private Date firstdate;

    @Column(name = "`EXPIREDATE`")
    private Date expiredate;

    @Column(name = "`GRANTORGAN`")
    private String grantorgan;

    @Column(name = "`OWNERADDR`")
    private String owneraddr;

    @Column(name = "`AZIPCODE`")
    private String azipcode;

    @Column(name = "`MGRAREA`")
    private String mgrarea;

    @Column(name = "`MCERTWORD`")
    private String mcertword;

    @Column(name = "`MCERTID`")
    private String mcertid;

    @Column(name = "`STATE`")
    private String state;

    @Column(name = "`QCEXAMIERESULT`")
    private String qcexamieresult;

    @Column(name = "`LXR`")
    private String lxr;

    @Column(name = "`PTTEL`")
    private String pttel;

    @Column(name = "`SYSSTATE`")
    private Integer sysstate;

    @Column(name = "`OWNERFLAG`")
    private String ownerflag;

    @Column(name = "`AYTSERVERSTATE`")
    private Integer aytserverstate;

    @Column(name = "`AYTTOKEN`")
    private String ayttoken;

    @Column(name = "`AYTSTARTTIME`")
    private Date aytstarttime;

    @Column(name = "`CREATETIME`")
    private Date createtime;

    @Column(name = "`CREATEOR`")
    private String createor;

    @Column(name = "`ORGAN_ID`")
    private String organId;

    @Column(name = "`SYSDATAID`")
    private String sysdataid;

    @Column(name = "`LASTSYNCTIME`")
    private Date lastsynctime;

    @Column(name = "`OWNERZT`")
    private Integer ownerzt;

    @Column(name = "`OWNERXZ`")
    private String ownerxz;

    @Column(name = "`ZHUCEDIZHI`")
    private String zhucedizhi;

    @Column(name = "`FARENNAME`")
    private String farenname;

    @Column(name = "`CARD`")
    private Integer card;

    @Column(name = "`IDCARD`")
    private String idcard;

    @Column(name = "`PHONE`")
    private String phone;

    @Column(name = "`PHOTO`")
    private String photo;

    @Column(name = "`Column_45`")
    private String column45;

    @Column(name = "`Column_46`")
    private String column46;

    @Column(name = "`Column_47`")
    private String column47;

    @Column(name = "`Column_48`")
    private String column48;

    @Column(name = "`Column_49`")
    private String column49;

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
    public String getOwnertype() {
        return ownertype;
    }

    /**
     * @param ownertype
     */
    public void setOwnertype(String ownertype) {
        this.ownertype = ownertype == null ? null : ownertype.trim();
    }

    /**
     * @return OWNERNAME
     */
    public String getOwnername() {
        return ownername;
    }

    /**
     * @param ownername
     */
    public void setOwnername(String ownername) {
        this.ownername = ownername == null ? null : ownername.trim();
    }

    /**
     * @return OWNERJC
     */
    public String getOwnerjc() {
        return ownerjc;
    }

    /**
     * @param ownerjc
     */
    public void setOwnerjc(String ownerjc) {
        this.ownerjc = ownerjc == null ? null : ownerjc.trim();
    }

    /**
     * @return ENGLISH
     */
    public String getEnglish() {
        return english;
    }

    /**
     * @param english
     */
    public void setEnglish(String english) {
        this.english = english == null ? null : english.trim();
    }

    /**
     * @return ZHUCEZIBEN
     */
    public String getZhuceziben() {
        return zhuceziben;
    }

    /**
     * @param zhuceziben
     */
    public void setZhuceziben(String zhuceziben) {
        this.zhuceziben = zhuceziben == null ? null : zhuceziben.trim();
    }

    /**
     * @return ZHUCETIME
     */
    public Date getZhucetime() {
        return zhucetime;
    }

    /**
     * @param zhucetime
     */
    public void setZhucetime(Date zhucetime) {
        this.zhucetime = zhucetime;
    }

    /**
     * @return AREA
     */
    public Double getArea() {
        return area;
    }

    /**
     * @param area
     */
    public void setArea(Double area) {
        this.area = area;
    }

    /**
     * @return PERSNUM
     */
    public String getPersnum() {
        return persnum;
    }

    /**
     * @param persnum
     */
    public void setPersnum(String persnum) {
        this.persnum = persnum == null ? null : persnum.trim();
    }

    /**
     * @return BUSINESSID
     */
    public String getBusinessid() {
        return businessid;
    }

    /**
     * @param businessid
     */
    public void setBusinessid(String businessid) {
        this.businessid = businessid == null ? null : businessid.trim();
    }

    /**
     * @return TONGYICODE
     */
    public String getTongyicode() {
        return tongyicode;
    }

    /**
     * @param tongyicode
     */
    public void setTongyicode(String tongyicode) {
        this.tongyicode = tongyicode == null ? null : tongyicode.trim();
    }

    /**
     * @return ZUZHICODE
     */
    public String getZuzhicode() {
        return zuzhicode;
    }

    /**
     * @param zuzhicode
     */
    public void setZuzhicode(String zuzhicode) {
        this.zuzhicode = zuzhicode == null ? null : zuzhicode.trim();
    }

    /**
     * @return LICENSECODE
     */
    public String getLicensecode() {
        return licensecode;
    }

    /**
     * @param licensecode
     */
    public void setLicensecode(String licensecode) {
        this.licensecode = licensecode == null ? null : licensecode.trim();
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
     * @return OWNERADDR
     */
    public String getOwneraddr() {
        return owneraddr;
    }

    /**
     * @param owneraddr
     */
    public void setOwneraddr(String owneraddr) {
        this.owneraddr = owneraddr == null ? null : owneraddr.trim();
    }

    /**
     * @return AZIPCODE
     */
    public String getAzipcode() {
        return azipcode;
    }

    /**
     * @param azipcode
     */
    public void setAzipcode(String azipcode) {
        this.azipcode = azipcode == null ? null : azipcode.trim();
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
     * @return MCERTWORD
     */
    public String getMcertword() {
        return mcertword;
    }

    /**
     * @param mcertword
     */
    public void setMcertword(String mcertword) {
        this.mcertword = mcertword == null ? null : mcertword.trim();
    }

    /**
     * @return MCERTID
     */
    public String getMcertid() {
        return mcertid;
    }

    /**
     * @param mcertid
     */
    public void setMcertid(String mcertid) {
        this.mcertid = mcertid == null ? null : mcertid.trim();
    }

    /**
     * @return STATE
     */
    public String getState() {
        return state;
    }

    /**
     * @param state
     */
    public void setState(String state) {
        this.state = state == null ? null : state.trim();
    }

    /**
     * @return QCEXAMIERESULT
     */
    public String getQcexamieresult() {
        return qcexamieresult;
    }

    /**
     * @param qcexamieresult
     */
    public void setQcexamieresult(String qcexamieresult) {
        this.qcexamieresult = qcexamieresult == null ? null : qcexamieresult.trim();
    }

    /**
     * @return LXR
     */
    public String getLxr() {
        return lxr;
    }

    /**
     * @param lxr
     */
    public void setLxr(String lxr) {
        this.lxr = lxr == null ? null : lxr.trim();
    }

    /**
     * @return PTTEL
     */
    public String getPttel() {
        return pttel;
    }

    /**
     * @param pttel
     */
    public void setPttel(String pttel) {
        this.pttel = pttel == null ? null : pttel.trim();
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
     * @return OWNERFLAG
     */
    public String getOwnerflag() {
        return ownerflag;
    }

    /**
     * @param ownerflag
     */
    public void setOwnerflag(String ownerflag) {
        this.ownerflag = ownerflag == null ? null : ownerflag.trim();
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
     * @return ORGAN_ID
     */
    public String getOrganId() {
        return organId;
    }

    /**
     * @param organId
     */
    public void setOrganId(String organId) {
        this.organId = organId == null ? null : organId.trim();
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
     * @return OWNERZT
     */
    public Integer getOwnerzt() {
        return ownerzt;
    }

    /**
     * @param ownerzt
     */
    public void setOwnerzt(Integer ownerzt) {
        this.ownerzt = ownerzt;
    }

    /**
     * @return OWNERXZ
     */
    public String getOwnerxz() {
        return ownerxz;
    }

    /**
     * @param ownerxz
     */
    public void setOwnerxz(String ownerxz) {
        this.ownerxz = ownerxz == null ? null : ownerxz.trim();
    }

    /**
     * @return ZHUCEDIZHI
     */
    public String getZhucedizhi() {
        return zhucedizhi;
    }

    /**
     * @param zhucedizhi
     */
    public void setZhucedizhi(String zhucedizhi) {
        this.zhucedizhi = zhucedizhi == null ? null : zhucedizhi.trim();
    }

    /**
     * @return FARENNAME
     */
    public String getFarenname() {
        return farenname;
    }

    /**
     * @param farenname
     */
    public void setFarenname(String farenname) {
        this.farenname = farenname == null ? null : farenname.trim();
    }

    /**
     * @return CARD
     */
    public Integer getCard() {
        return card;
    }

    /**
     * @param card
     */
    public void setCard(Integer card) {
        this.card = card;
    }

    /**
     * @return IDCARD
     */
    public String getIdcard() {
        return idcard;
    }

    /**
     * @param idcard
     */
    public void setIdcard(String idcard) {
        this.idcard = idcard == null ? null : idcard.trim();
    }

    /**
     * @return PHONE
     */
    public String getPhone() {
        return phone;
    }

    /**
     * @param phone
     */
    public void setPhone(String phone) {
        this.phone = phone == null ? null : phone.trim();
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
     * @return Column_45
     */
    public String getColumn45() {
        return column45;
    }

    /**
     * @param column45
     */
    public void setColumn45(String column45) {
        this.column45 = column45 == null ? null : column45.trim();
    }

    /**
     * @return Column_46
     */
    public String getColumn46() {
        return column46;
    }

    /**
     * @param column46
     */
    public void setColumn46(String column46) {
        this.column46 = column46 == null ? null : column46.trim();
    }

    /**
     * @return Column_47
     */
    public String getColumn47() {
        return column47;
    }

    /**
     * @param column47
     */
    public void setColumn47(String column47) {
        this.column47 = column47 == null ? null : column47.trim();
    }

    /**
     * @return Column_48
     */
    public String getColumn48() {
        return column48;
    }

    /**
     * @param column48
     */
    public void setColumn48(String column48) {
        this.column48 = column48 == null ? null : column48.trim();
    }

    /**
     * @return Column_49
     */
    public String getColumn49() {
        return column49;
    }

    /**
     * @param column49
     */
    public void setColumn49(String column49) {
        this.column49 = column49 == null ? null : column49.trim();
    }
}