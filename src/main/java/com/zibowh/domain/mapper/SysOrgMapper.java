package com.zibowh.domain.mapper;

import com.zibowh.domain.entity.SysOrgPO;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface SysOrgMapper extends BaseMapper<SysOrgPO>{

    void save(SysOrgPO sysOrgPO);

    SysOrgPO selectById(String id);

    /**
     * 按名称查询
     * @param name
     * @return
     */
    @Select("select * from a_sys_org where name = #{name}")
    public List<SysOrgPO> getByName(String name);
}
