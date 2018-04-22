package com.zibowh.controllers.api.swagger;

import com.google.common.base.Predicate;
import com.zibowh.controllers.api.WayBillController;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.ResponseEntity;
import org.springframework.web.context.request.async.DeferredResult;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import java.util.ArrayList;
import java.util.HashSet;

import static com.google.common.base.Predicates.or;
import static springfox.documentation.builders.PathSelectors.regex;

/**
 * SwaggerConfig
 */
@Configuration
@EnableSwagger2
public class SwaggerConfig {

    private Docket docket(String title, String desc, String version, Predicate<String> paths) {
        ApiInfo info = new ApiInfo(title,//大标题
                desc,//小标题
                version,//版本
                "NO terms of service",
                new Contact("", "", ""),
                "The Apache License, Version 2.0",//链接显示文字
                "http://www.apache.org/licenses/LICENSE-2.0.html",//网站链接
                new ArrayList<>()
        );
        return new Docket(DocumentationType.SWAGGER_2)
                .groupName(title)
                .genericModelSubstitutes(DeferredResult.class)
                .genericModelSubstitutes(ResponseEntity.class)
                .produces(new HashSet<String>() {{
                    add("application/json");
                }})
                .useDefaultResponseMessages(false)
                .forCodeGeneration(true)
                .pathMapping("/")// base，最终调用接口后会和paths拼接在一起
                .select()
                .paths(paths)//过滤的接口
                .build()
                .apiInfo(info);
    }

    @Bean
    public Docket push() {
        return this.docket("推送", "推送", "v1", or(
                regex(WayBillController.apiPath + ".*"),
                regex(WayBillController.apiPath + ".*")
        ));
    }
}
