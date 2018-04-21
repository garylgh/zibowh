package com.zibowh.domain.entity.mbg;

import javax.persistence.*;

@Table(name = "`t_base_goodpackage`")
public class TBaseGoodpackage {
    @Id
    @Column(name = "`PACKID`")
    private String packid;

    @Column(name = "`WXP_ID`")
    private String wxpId;

    @Column(name = "`PACKTYPE`")
    private String packtype;

    @Column(name = "`PACKSPEC`")
    private String packspec;

    /**
     * @return PACKID
     */
    public String getPackid() {
        return packid;
    }

    /**
     * @param packid
     */
    public void setPackid(String packid) {
        this.packid = packid == null ? null : packid.trim();
    }

    /**
     * @return WXP_ID
     */
    public String getWxpId() {
        return wxpId;
    }

    /**
     * @param wxpId
     */
    public void setWxpId(String wxpId) {
        this.wxpId = wxpId == null ? null : wxpId.trim();
    }

    /**
     * @return PACKTYPE
     */
    public String getPacktype() {
        return packtype;
    }

    /**
     * @param packtype
     */
    public void setPacktype(String packtype) {
        this.packtype = packtype == null ? null : packtype.trim();
    }

    /**
     * @return PACKSPEC
     */
    public String getPackspec() {
        return packspec;
    }

    /**
     * @param packspec
     */
    public void setPackspec(String packspec) {
        this.packspec = packspec == null ? null : packspec.trim();
    }
}