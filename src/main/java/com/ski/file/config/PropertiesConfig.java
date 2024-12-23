package com.ski.file.config;

import javax.annotation.PostConstruct;
import javax.annotation.Resource;

import com.ski.file.util.PropertiesUtil;

import org.springframework.context.annotation.Configuration;
import org.springframework.core.env.Environment;

@Configuration
public class PropertiesConfig {

    @Resource
    private Environment env;

    @PostConstruct
    public void setProperties() {
        PropertiesUtil.setEnvironment(env);
    }

}