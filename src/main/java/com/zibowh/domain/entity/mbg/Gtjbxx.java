package com.zibowh.domain.entity.mbg;

import javax.persistence.*;

@Table(name = "`gtjbxx`")
public class Gtjbxx {
    @Id
    @Column(name = "`GT_CODE`")
    private String gtCode;

    @Column(name = "`GTCNAME`")
    private String gtcname;

    @Column(name = "`CAR_CARDNO`")
    private String carCardno;

    @Column(name = "`IS_CARD`")
    private String isCard;

    @Column(name = "`CAR_TYPE`")
    private Integer carType;

    @Column(name = "`ENTERPRISE_NAME`")
    private String enterpriseName;

    @Column(name = "`PHONE`")
    private String phone;

    @Column(name = "`NAME`")
    private String name;

    @Column(name = "`IS_ADRESS`")
    private Integer isAdress;

    @Column(name = "`CAR_STATE`")
    private Integer carState;

    /**
     * @return GT_CODE
     */
    public String getGtCode() {
        return gtCode;
    }

    /**
     * @param gtCode
     */
    public void setGtCode(String gtCode) {
        this.gtCode = gtCode == null ? null : gtCode.trim();
    }

    /**
     * @return GTCNAME
     */
    public String getGtcname() {
        return gtcname;
    }

    /**
     * @param gtcname
     */
    public void setGtcname(String gtcname) {
        this.gtcname = gtcname == null ? null : gtcname.trim();
    }

    /**
     * @return CAR_CARDNO
     */
    public String getCarCardno() {
        return carCardno;
    }

    /**
     * @param carCardno
     */
    public void setCarCardno(String carCardno) {
        this.carCardno = carCardno == null ? null : carCardno.trim();
    }

    /**
     * @return IS_CARD
     */
    public String getIsCard() {
        return isCard;
    }

    /**
     * @param isCard
     */
    public void setIsCard(String isCard) {
        this.isCard = isCard == null ? null : isCard.trim();
    }

    /**
     * @return CAR_TYPE
     */
    public Integer getCarType() {
        return carType;
    }

    /**
     * @param carType
     */
    public void setCarType(Integer carType) {
        this.carType = carType;
    }

    /**
     * @return ENTERPRISE_NAME
     */
    public String getEnterpriseName() {
        return enterpriseName;
    }

    /**
     * @param enterpriseName
     */
    public void setEnterpriseName(String enterpriseName) {
        this.enterpriseName = enterpriseName == null ? null : enterpriseName.trim();
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
     * @return IS_ADRESS
     */
    public Integer getIsAdress() {
        return isAdress;
    }

    /**
     * @param isAdress
     */
    public void setIsAdress(Integer isAdress) {
        this.isAdress = isAdress;
    }

    /**
     * @return CAR_STATE
     */
    public Integer getCarState() {
        return carState;
    }

    /**
     * @param carState
     */
    public void setCarState(Integer carState) {
        this.carState = carState;
    }
}