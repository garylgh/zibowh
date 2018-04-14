package com.zibowh.config;

import com.zibowh.constants.AppConstants;
import org.apache.commons.lang3.StringUtils;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@ConfigurationProperties(prefix = "redis")
@Component
public class RedisConfig {
    private Integer database;

    private String host;

    private Integer port;

    private String password;

    private Integer timeout;

    private Integer maxTotal;

    private Integer maxWaitMillis;

    private String seralizerType;

    public String getSeralizerType() {
        if(StringUtils.isBlank(seralizerType)){
            return AppConstants.SerializerTypeEnum.HESSIAN.name();
        }
        return seralizerType;
    }

    public void setSeralizerType(String seralizerType) {
        this.seralizerType = seralizerType;
    }

    public Integer getMaxTotal() {
        return maxTotal;
    }

    public void setMaxTotal(Integer maxTotal) {
        this.maxTotal = maxTotal;
    }

    public Integer getMaxWaitMillis() {
        return maxWaitMillis;
    }

    public void setMaxWaitMillis(Integer maxWaitMillis) {
        this.maxWaitMillis = maxWaitMillis;
    }

    public Integer getDatabase() {
        return database;
    }

    public void setDatabase(Integer database) {
        this.database = database;
    }

    public String getHost() {
        return host;
    }

    public void setHost(String host) {
        this.host = host;
    }

    public Integer getPort() {
        return port;
    }

    public void setPort(Integer port) {
        this.port = port;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Integer getTimeout() {
        return timeout;
    }

    public void setTimeout(Integer timeout) {
        this.timeout = timeout;
    }
}
