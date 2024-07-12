package com.imooc.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * @Description: TODO
 * @author: Shuting Shi
 * @date: 2024年07月11日 11:38 p.m.
 */

@Data
@ConfigurationProperties(prefix = "projectUrl")
@Component
public class ProjectUrlConfig {

    private String wechatMpAuthorize;

    public String wechatOpenAuthorize;

    public String sell;
}