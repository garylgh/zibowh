package com.zibowh.domain.entity.mbg;

import java.util.Date;
import javax.persistence.*;

@Table(name = "`employee`")
public class Employee {
    @Id
    @Column(name = "`EMP_ID`")
    private String empId;

    @Column(name = "`OWNER_ID`")
    private String ownerId;

    @Column(name = "`NAME`")
    private String name;

    @Column(name = "`TYPE`")
    private String type;

    @Column(name = "`SEX`")
    private String sex;

    @Column(name = "`BIRTHDAY`")
    private Date birthday;

    @Column(name = "`CARD_TYPE`")
    private Integer cardType;

    @Column(name = "`IDCARD`")
    private String idcard;

    @Column(name = "`PHONE`")
    private String phone;

    @Column(name = "`ADRESSS`")
    private String adresss;

    @Column(name = "`IS_LOCAL`")
    private Integer isLocal;

    @Column(name = "`CITY`")
    private String city;

    @Column(name = "`ADRESS`")
    private String adress;

    @Column(name = "`PHOTO_URL`")
    private String photoUrl;

    @Column(name = "`FLAG`")
    private Integer flag;

    @Column(name = "`INS_USER`")
    private String insUser;

    @Column(name = "`INS_TIME`")
    private String insTime;

    @Column(name = "`UPD_USER`")
    private String updUser;

    @Column(name = "`UPD_TIME`")
    private Date updTime;

    /**
     * @return EMP_ID
     */
    public String getEmpId() {
        return empId;
    }

    /**
     * @param empId
     */
    public void setEmpId(String empId) {
        this.empId = empId == null ? null : empId.trim();
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
     * @return NAME
     */
    public String getName() {
        return name;
    }

    /**
     * @param name
     */
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    /**
     * @return TYPE
     */
    public String getType() {
        return type;
    }

    /**
     * @param type
     */
    public void setType(String type) {
        this.type = type == null ? null : type.trim();
    }

    /**
     * @return SEX
     */
    public String getSex() {
        return sex;
    }

    /**
     * @param sex
     */
    public void setSex(String sex) {
        this.sex = sex == null ? null : sex.trim();
    }

    /**
     * @return BIRTHDAY
     */
    public Date getBirthday() {
        return birthday;
    }

    /**
     * @param birthday
     */
    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    /**
     * @return CARD_TYPE
     */
    public Integer getCardType() {
        return cardType;
    }

    /**
     * @param cardType
     */
    public void setCardType(Integer cardType) {
        this.cardType = cardType;
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
     * @return ADRESSS
     */
    public String getAdresss() {
        return adresss;
    }

    /**
     * @param adresss
     */
    public void setAdresss(String adresss) {
        this.adresss = adresss == null ? null : adresss.trim();
    }

    /**
     * @return IS_LOCAL
     */
    public Integer getIsLocal() {
        return isLocal;
    }

    /**
     * @param isLocal
     */
    public void setIsLocal(Integer isLocal) {
        this.isLocal = isLocal;
    }

    /**
     * @return CITY
     */
    public String getCity() {
        return city;
    }

    /**
     * @param city
     */
    public void setCity(String city) {
        this.city = city == null ? null : city.trim();
    }

    /**
     * @return ADRESS
     */
    public String getAdress() {
        return adress;
    }

    /**
     * @param adress
     */
    public void setAdress(String adress) {
        this.adress = adress == null ? null : adress.trim();
    }

    /**
     * @return PHOTO_URL
     */
    public String getPhotoUrl() {
        return photoUrl;
    }

    /**
     * @param photoUrl
     */
    public void setPhotoUrl(String photoUrl) {
        this.photoUrl = photoUrl == null ? null : photoUrl.trim();
    }

    /**
     * @return FLAG
     */
    public Integer getFlag() {
        return flag;
    }

    /**
     * @param flag
     */
    public void setFlag(Integer flag) {
        this.flag = flag;
    }

    /**
     * @return INS_USER
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
     * @return INS_TIME
     */
    public String getInsTime() {
        return insTime;
    }

    /**
     * @param insTime
     */
    public void setInsTime(String insTime) {
        this.insTime = insTime == null ? null : insTime.trim();
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