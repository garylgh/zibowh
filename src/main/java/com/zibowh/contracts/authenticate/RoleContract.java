package com.zibowh.contracts.authenticate;


import java.util.Collection;

interface RoleContract {
    String getName();

    String getDisplayName();

    Collection<Permissions> getPermissions();
}
