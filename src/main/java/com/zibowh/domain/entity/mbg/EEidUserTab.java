package com.zibowh.domain.entity.mbg;

import javax.persistence.*;

@Table(name = "`e_eid_user_tab`")
public class EEidUserTab {
    @Id
    @Column(name = "`ID`")
    private Long id;

    @Column(name = "`EMP_ID`")
    private String empId;

    @Column(name = "`ID_CARD`")
    private String idCard;

    @Column(name = "`EID_ID`")
    private String eidId;

    /**
     * @return ID
     */
    public Long getId() {
        return id;
    }

    /**
     * @param id
     */
    public void setId(Long id) {
        this.id = id;
    }

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
     * @return ID_CARD
     */
    public String getIdCard() {
        return idCard;
    }

    /**
     * @param idCard
     */
    public void setIdCard(String idCard) {
        this.idCard = idCard == null ? null : idCard.trim();
    }

    /**
     * @return EID_ID
     */
    public String getEidId() {
        return eidId;
    }

    /**
     * @param eidId
     */
    public void setEidId(String eidId) {
        this.eidId = eidId == null ? null : eidId.trim();
    }
}