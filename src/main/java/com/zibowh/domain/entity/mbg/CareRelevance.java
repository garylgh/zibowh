package com.zibowh.domain.entity.mbg;

import javax.persistence.*;

@Table(name = "`care_relevance`")
public class CareRelevance {
    @Id
    @Column(name = "`id`")
    private Integer id;

    @Column(name = "`QYCID`")
    private String qycid;

    @Column(name = "`GCID`")
    private String gcid;

    @Column(name = "`GT_CODE`")
    private String gtCode;

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
}