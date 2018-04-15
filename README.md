### 构建

### 开发模式
1.命令行启动
```
mvn spring-boot:run
```
2.IDE（Eclipse或IDE）启动

    运行App.java
    
3.修改端口

    修改application.yaml 的server.port端口号即可

### 项目结构描述

1. controller

    配置方式参考SpringMVC文档
    
2. 事务

    使用@Transactional注解方式
    
2. data access level
    
    数据持久化使用mybatis，具体步骤如下：
    
    - 添加resources/mapper/xxxMapper.xml文件
    - 添加对应的实体类com.zibowh.domain.entit
    y/xxxPO.java
    - 添加对应com.zibowh.domain.entit
          y/mapper/xxxMapper.java
          
3. config
    - 在application.yaml添加相应的配置项
    - 在com.zibowh.config包中添加对应的配置类
    - 使用参考com.zibowh.tools.cache.RedisUtils的RedisConfig
4. filter
    
    创建filter参考com.zibowh.filter.JustaFilter
    
5. redis
    
    redis使用参考RedisUtilsTests类
6. session共享

    开启App.java上的@EnableRedisHttpSession注解

### 发布
1. 打包
    ```
    mvn package
    ```
2. 运行
    ```
    java -jar zibowh-demo.jar --server.port=9000 --spring.profiles.active=prod
   
    ```
### 参考
1. 关于spring boot
    https://docs.spring.io/spring-boot/docs/current/reference/htmlsingle/#using-boot-starter
    http://tengj.top/categories/Spring-Boot%E5%B9%B2%E8%B4%A7%E7%B3%BB%E5%88%97/
2. 关于spring session
    https://docs.spring.io/spring-session/docs/current/reference/html5/guides/boot-redis.html
3. 关于redis
    https://blog.csdn.net/truelove12358/article/details/78342167
4. 关于spring mvc
    
