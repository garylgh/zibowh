package com.zibowh.controllers;

import com.zibowh.config.DataSourceConfig;
import com.zibowh.controllers.request.SysOrgRequestBean;
import com.zibowh.domain.entity.SysOrgPO;
import com.zibowh.service.SysOrgService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class SysOrgController {
    @Autowired
    private DataSourceConfig dsconfig;

    @Autowired
    private SysOrgService sysOrgService;

    /**
     * POST 方法示例
     * 返回值为json
     */
    @PostMapping(value = "/sysorg/save")
    public String save(@RequestBody SysOrgRequestBean sorBean) {
         sysOrgService.save(sorBean);
         return "test";
    }

    /**
     * GET 方法示例
     * 返回值为json
     */
    @GetMapping(value = "/sysorg/query")
    public SysOrgPO query(@RequestParam("id") String id) {
        SysOrgPO sopo = sysOrgService.query(id);
        return sopo;
    }
}
