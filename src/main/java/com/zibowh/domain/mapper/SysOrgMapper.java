package com.zibowh.domain.mapper;

import com.zibowh.domain.entity.SysOrgPO;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface SysOrgMapper {

    void save(SysOrgPO sysOrgPO);

    SysOrgPO selectById(String id);
}
