package com.zibowh.domain.entity.mbg;

import java.util.Date;
import javax.persistence.*;

@Table(name = "`t_base_owner_aptitude`")
public class TBaseOwnerAptitude {
    @Id
    @Column(name = "`AP_ID`")
    private String apId;

    @Column(name = "`OWNER_ID`")
    private String ownerId;

    @Column(name = "`CARDNAME`")
    private String cardname;

    @Column(name = "`CARDNUM`")
    private String cardnum;

    @Column(name = "`GRANTORGAN`")
    private String grantorgan;

    @Column(name = "`CARDTIME`")
    private Date cardtime;

    @Column(name = "`QIYEPHOTO`")
    private String qiyephoto;

    @Column(name = "`TEXT`")
    private String text;

    /**
     * @return AP_ID
     */
    public String getApId() {
        return apId;
    }

    /**
     * @param apId
     */
    public void setApId(String apId) {
        this.apId = apId == null ? null : apId.trim();
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
     * @return CARDNAME
     */
    public String getCardname() {
        return cardname;
    }

    /**
     * @param cardname
     */
    public void setCardname(String cardname) {
        this.cardname = cardname == null ? null : cardname.trim();
    }

    /**
     * @return CARDNUM
     */
    public String getCardnum() {
        return cardnum;
    }

    /**
     * @param cardnum
     */
    public void setCardnum(String cardnum) {
        this.cardnum = cardnum == null ? null : cardnum.trim();
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
     * @return CARDTIME
     */
    public Date getCardtime() {
        return cardtime;
    }

    /**
     * @param cardtime
     */
    public void setCardtime(Date cardtime) {
        this.cardtime = cardtime;
    }

    /**
     * @return QIYEPHOTO
     */
    public String getQiyephoto() {
        return qiyephoto;
    }

    /**
     * @param qiyephoto
     */
    public void setQiyephoto(String qiyephoto) {
        this.qiyephoto = qiyephoto == null ? null : qiyephoto.trim();
    }

    /**
     * @return TEXT
     */
    public String getText() {
        return text;
    }

    /**
     * @param text
     */
    public void setText(String text) {
        this.text = text == null ? null : text.trim();
    }
}