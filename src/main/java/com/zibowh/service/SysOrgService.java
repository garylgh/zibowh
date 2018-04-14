package com.zibowh.service;

import com.zibowh.controllers.request.SysOrgRequestBean;
import com.zibowh.domain.entity.SysOrgPO;
import com.zibowh.domain.mapper.SysOrgMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;


@Service
public class SysOrgService {


    @Resource
    private SysOrgMapper sysOrgMapper;

    public String save(SysOrgRequestBean sorBean) {
        SysOrgPO sopo = new SysOrgPO();
        sopo.setId(sorBean.getId());
        sopo.setCounties("countiew1");
        sopo.setName(sorBean.getName());
        sopo.setOrgName(sorBean.getOrgName());
        sopo.setPosition("ghlinPosition");
        sopo.setUserId("ghlinUserId");
        sysOrgMapper.save(sopo);
        return "from save service";
    }

    public SysOrgPO query(String id) {
        SysOrgPO sopo = sysOrgMapper.selectById(id);
        return sopo;
    }
}
