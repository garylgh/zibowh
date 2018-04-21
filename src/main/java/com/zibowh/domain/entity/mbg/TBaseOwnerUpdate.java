package com.zibowh.domain.entity.mbg;

import java.util.Date;
import javax.persistence.*;

@Table(name = "`t_base_owner_update`")
public class TBaseOwnerUpdate {
    @Id
    @Column(name = "`UPDETE_ID`")
    private String updeteId;

    @Column(name = "`HEADLINE`")
    private String headline;

    @Column(name = "`UPDETEPEOPLE`")
    private String updetepeople;

    @Column(name = "`ROLE`")
    private String role;

    @Column(name = "`UPDETEDATE`")
    private Date updetedate;

    @Column(name = "`UPDATESTAU`")
    private String updatestau;

    @Column(name = "`OPERATION`")
    private String operation;

    /**
     * @return UPDETE_ID
     */
    public String getUpdeteId() {
        return updeteId;
    }

    /**
     * @param updeteId
     */
    public void setUpdeteId(String updeteId) {
        this.updeteId = updeteId == null ? null : updeteId.trim();
    }

    /**
     * @return HEADLINE
     */
    public String getHeadline() {
        return headline;
    }

    /**
     * @param headline
     */
    public void setHeadline(String headline) {
        this.headline = headline == null ? null : headline.trim();
    }

    /**
     * @return UPDETEPEOPLE
     */
    public String getUpdetepeople() {
        return updetepeople;
    }

    /**
     * @param updetepeople
     */
    public void setUpdetepeople(String updetepeople) {
        this.updetepeople = updetepeople == null ? null : updetepeople.trim();
    }

    /**
     * @return ROLE
     */
    public String getRole() {
        return role;
    }

    /**
     * @param role
     */
    public void setRole(String role) {
        this.role = role == null ? null : role.trim();
    }

    /**
     * @return UPDETEDATE
     */
    public Date getUpdetedate() {
        return updetedate;
    }

    /**
     * @param updetedate
     */
    public void setUpdetedate(Date updetedate) {
        this.updetedate = updetedate;
    }

    /**
     * @return UPDATESTAU
     */
    public String getUpdatestau() {
        return updatestau;
    }

    /**
     * @param updatestau
     */
    public void setUpdatestau(String updatestau) {
        this.updatestau = updatestau == null ? null : updatestau.trim();
    }

    /**
     * @return OPERATION
     */
    public String getOperation() {
        return operation;
    }

    /**
     * @param operation
     */
    public void setOperation(String operation) {
        this.operation = operation == null ? null : operation.trim();
    }
}