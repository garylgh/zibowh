package com.zibowh.domain.entity.mbg;

import java.util.Date;
import javax.persistence.*;

@Table(name = "`jcszx`")
public class Jcszx {
    @Id
    @Column(name = "`id`")
    private Integer id;

    @Column(name = "`JC_TYPE`")
    private String jcType;

    @Column(name = "`JC_XH`")
    private String jcXh;

    /**
     * 0：系统默认
            1：自定义
     */
    @Column(name = "`JC_LX`")
    private String jcLx;

    @Column(name = "`JC_NR`")
    private String jcNr;

    @Column(name = "`OWNER_ID`")
    private Integer ownerId;

    @Column(name = "`FATHER_ID`")
    private Integer fatherId;

    @Column(name = "`DEL_FLG`")
    private Integer delFlg;

    @Column(name = "`CREAT_USER`")
    private String creatUser;

    @Column(name = "`UPD_USER`")
    private String updUser;

    @Column(name = "`CREAT_TIME`")
    private Date creatTime;

    @Column(name = "`UPD_TIME`")
    private Date updTime;

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
     * @return JC_TYPE
     */
    public String getJcType() {
        return jcType;
    }

    /**
     * @param jcType
     */
    public void setJcType(String jcType) {
        this.jcType = jcType == null ? null : jcType.trim();
    }

    /**
     * @return JC_XH
     */
    public String getJcXh() {
        return jcXh;
    }

    /**
     * @param jcXh
     */
    public void setJcXh(String jcXh) {
        this.jcXh = jcXh == null ? null : jcXh.trim();
    }

    /**
     * 获取0：系统默认
            1：自定义
     *
     * @return JC_LX - 0：系统默认
            1：自定义
     */
    public String getJcLx() {
        return jcLx;
    }

    /**
     * 设置0：系统默认
            1：自定义
     *
     * @param jcLx 0：系统默认
            1：自定义
     */
    public void setJcLx(String jcLx) {
        this.jcLx = jcLx == null ? null : jcLx.trim();
    }

    /**
     * @return JC_NR
     */
    public String getJcNr() {
        return jcNr;
    }

    /**
     * @param jcNr
     */
    public void setJcNr(String jcNr) {
        this.jcNr = jcNr == null ? null : jcNr.trim();
    }

    /**
     * @return OWNER_ID
     */
    public Integer getOwnerId() {
        return ownerId;
    }

    /**
     * @param ownerId
     */
    public void setOwnerId(Integer ownerId) {
        this.ownerId = ownerId;
    }

    /**
     * @return FATHER_ID
     */
    public Integer getFatherId() {
        return fatherId;
    }

    /**
     * @param fatherId
     */
    public void setFatherId(Integer fatherId) {
        this.fatherId = fatherId;
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
     * @return CREAT_TIME
     */
    public Date getCreatTime() {
        return creatTime;
    }

    /**
     * @param creatTime
     */
    public void setCreatTime(Date creatTime) {
        this.creatTime = creatTime;
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