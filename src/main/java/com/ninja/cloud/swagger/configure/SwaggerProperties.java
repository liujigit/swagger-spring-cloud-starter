package com.ninja.cloud.swagger.configure;

import lombok.Data;
import lombok.experimental.Accessors;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

/**
 * Copyright：botBrain.ai
 * Author: liuji
 * Date: 2019/11/26.
 * Description:
 */
@Data
@Accessors(chain = true)
@Configuration
@ConfigurationProperties(prefix = "swagger")
@ConditionalOnProperty(prefix = "swagger", value = "enable", matchIfMissing = true)
public class SwaggerProperties {
    private boolean enable = false;
    private String basePackage = "";
    private String authorName = "";
    private String authorUrl = "";
    private String authorEmail = "";
    private String title = "";
    private String describe = "";
}
