package com.zibowh.domain.entity.mbg;

import java.util.Date;
import javax.persistence.*;

@Table(name = "`wdcyxx_tab`")
public class WdcyxxTab {
    @Column(name = "`id`")
    private String id;

    @Column(name = "`OWNERNAME`")
    private String ownername;

    @Column(name = "`OWNERADDR`")
    private String owneraddr;

    @Column(name = "`LXR`")
    private String lxr;

    @Column(name = "`PTTEL`")
    private String pttel;

    @Column(name = "`QYC_CPH`")
    private String qycCph;

    @Column(name = "`QIC_YSZGZ`")
    private String qicYszgz;

    @Column(name = "`GC_CPH`")
    private String gcCph;

    @Column(name = "`GC_DLYS`")
    private String gcDlys;

    @Column(name = "`JSY_NAME`")
    private String jsyName;

    @Column(name = "`JSYZ_GZH`")
    private String jsyzGzh;

    @Column(name = "`JSY_LXDH`")
    private String jsyLxdh;

    @Column(name = "`YYY_NAME`")
    private String yyyName;

    @Column(name = "`YYY_ZGZH`")
    private String yyyZgzh;

    @Column(name = "`YYY_LXDH`")
    private String yyyLxdh;

    @Column(name = "`CL_ZP`")
    private String clZp;

    @Column(name = "`JSY_ZP`")
    private String jsyZp;

    @Column(name = "`YYY_ZP`")
    private String yyyZp;

    @Column(name = "`CREAT_USER`")
    private String creatUser;

    @Column(name = "`CREAT_DATE`")
    private Date creatDate;

    @Column(name = "`UPD_USER`")
    private String updUser;

    @Column(name = "`UPD_TIME`")
    private Date updTime;

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
     * @return QYC_CPH
     */
    public String getQycCph() {
        return qycCph;
    }

    /**
     * @param qycCph
     */
    public void setQycCph(String qycCph) {
        this.qycCph = qycCph == null ? null : qycCph.trim();
    }

    /**
     * @return QIC_YSZGZ
     */
    public String getQicYszgz() {
        return qicYszgz;
    }

    /**
     * @param qicYszgz
     */
    public void setQicYszgz(String qicYszgz) {
        this.qicYszgz = qicYszgz == null ? null : qicYszgz.trim();
    }

    /**
     * @return GC_CPH
     */
    public String getGcCph() {
        return gcCph;
    }

    /**
     * @param gcCph
     */
    public void setGcCph(String gcCph) {
        this.gcCph = gcCph == null ? null : gcCph.trim();
    }

    /**
     * @return GC_DLYS
     */
    public String getGcDlys() {
        return gcDlys;
    }

    /**
     * @param gcDlys
     */
    public void setGcDlys(String gcDlys) {
        this.gcDlys = gcDlys == null ? null : gcDlys.trim();
    }

    /**
     * @return JSY_NAME
     */
    public String getJsyName() {
        return jsyName;
    }

    /**
     * @param jsyName
     */
    public void setJsyName(String jsyName) {
        this.jsyName = jsyName == null ? null : jsyName.trim();
    }

    /**
     * @return JSYZ_GZH
     */
    public String getJsyzGzh() {
        return jsyzGzh;
    }

    /**
     * @param jsyzGzh
     */
    public void setJsyzGzh(String jsyzGzh) {
        this.jsyzGzh = jsyzGzh == null ? null : jsyzGzh.trim();
    }

    /**
     * @return JSY_LXDH
     */
    public String getJsyLxdh() {
        return jsyLxdh;
    }

    /**
     * @param jsyLxdh
     */
    public void setJsyLxdh(String jsyLxdh) {
        this.jsyLxdh = jsyLxdh == null ? null : jsyLxdh.trim();
    }

    /**
     * @return YYY_NAME
     */
    public String getYyyName() {
        return yyyName;
    }

    /**
     * @param yyyName
     */
    public void setYyyName(String yyyName) {
        this.yyyName = yyyName == null ? null : yyyName.trim();
    }

    /**
     * @return YYY_ZGZH
     */
    public String getYyyZgzh() {
        return yyyZgzh;
    }

    /**
     * @param yyyZgzh
     */
    public void setYyyZgzh(String yyyZgzh) {
        this.yyyZgzh = yyyZgzh == null ? null : yyyZgzh.trim();
    }

    /**
     * @return YYY_LXDH
     */
    public String getYyyLxdh() {
        return yyyLxdh;
    }

    /**
     * @param yyyLxdh
     */
    public void setYyyLxdh(String yyyLxdh) {
        this.yyyLxdh = yyyLxdh == null ? null : yyyLxdh.trim();
    }

    /**
     * @return CL_ZP
     */
    public String getClZp() {
        return clZp;
    }

    /**
     * @param clZp
     */
    public void setClZp(String clZp) {
        this.clZp = clZp == null ? null : clZp.trim();
    }

    /**
     * @return JSY_ZP
     */
    public String getJsyZp() {
        return jsyZp;
    }

    /**
     * @param jsyZp
     */
    public void setJsyZp(String jsyZp) {
        this.jsyZp = jsyZp == null ? null : jsyZp.trim();
    }

    /**
     * @return YYY_ZP
     */
    public String getYyyZp() {
        return yyyZp;
    }

    /**
     * @param yyyZp
     */
    public void setYyyZp(String yyyZp) {
        this.yyyZp = yyyZp == null ? null : yyyZp.trim();
    }

    /**
     * @return CREAT_USER
     */
    public String getCreatUser() {
        return creatUser;
    }

    /**
     * @param creatUser
     */
    public void setCreatUser(String creatUser) {
        this.creatUser = creatUser == null ? null : creatUser.trim();
    }

    /**
     * @return CREAT_DATE
     */
    public Date getCreatDate() {
        return creatDate;
    }

    /**
     * @param creatDate
     */
    public void setCreatDate(Date creatDate) {
        this.creatDate = creatDate;
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