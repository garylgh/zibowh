package com.zibowh.controllers;

import com.github.pagehelper.Page;
import com.zibowh.config.DataSourceConfig;
import com.zibowh.controllers.request.SysOrgRequestBean;
import com.zibowh.controllers.response.BaseResponse;
import com.zibowh.domain.entity.SysOrgPO;
import com.zibowh.service.SysOrgService;
import com.zibowh.tools.pageable.PageEntity;
import com.zibowh.tools.pageable.PageUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.HashMap;
import java.util.Map;

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
    public BaseResponse<String> save(@RequestBody SysOrgRequestBean sorBean) {
        sysOrgService.save(sorBean);
        return BaseResponse.build("test1" + dsconfig.getName());
    }

    /**
     * GET 方法示例
     * 返回值为json
     * http://localhost:9000/api/sysorg/page?id=1
     */
    @GetMapping(value = "/sysorg/query")
    public BaseResponse<SysOrgPO> query(@RequestParam("id") String id, HttpServletRequest request, HttpSession session) {
        SysOrgPO sopo = sysOrgService.query(id);
        return BaseResponse.build(sopo);
    }

    /**
     * 分页方法演示
     * 返回值为json
     * http://localhost:9000/api/sysorg/page?name=ghlin13&pageNum=1&pageSize=3
     */
    @GetMapping(value = "/sysorg/page")
    public BaseResponse<Map<String, Object>> page(@RequestParam("name") String name, PageEntity page) {
        //第一个参数是第几页；第二个参数是每页显示条数。
        PageUtil.pageHelper(page);
        Page<SysOrgPO> sopos = (Page<SysOrgPO>) sysOrgService.list(name);
        Map resultMap = new HashMap();
        resultMap.put("sysOrgs", sopos);
        resultMap.put("sysOrgNames", PageUtil.map(sopos, SysOrgPO::getName));
        return BaseResponse.build(resultMap);
    }
}
