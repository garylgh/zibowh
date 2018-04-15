package com.zibowh.controllers;

import com.zibowh.config.DataSourceConfig;
import com.zibowh.controllers.request.SysOrgRequestBean;
import com.zibowh.domain.entity.SysOrgPO;
import com.zibowh.service.SysOrgService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

@RestController
@RequestMapping("/api")
public class SysOrgController {
    // 这一行只是为了演示如何加载yaml配置的数据
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
         return "test" + dsconfig.getName();
    }

    /**
     * GET 方法示例
     * 返回值为json
     */
    @GetMapping(value = "/sysorg/query")
    public SysOrgPO query(@RequestParam("id") String id, HttpServletRequest request, HttpSession session) {
        SysOrgPO sopo = sysOrgService.query(id);
        return sopo;
    }
}
