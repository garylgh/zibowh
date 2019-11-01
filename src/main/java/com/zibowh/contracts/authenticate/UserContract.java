package com.zibowh.contracts.authenticate;

import java.sql.Date;
import java.util.Collection;

public interface UserContract {
    String getId();

    Boolean isLoginEnabled();

    Date getLastLoginAt();

    void setLastLoginAt(Date date);

    Collection<RoleContract> getRoles();
}
