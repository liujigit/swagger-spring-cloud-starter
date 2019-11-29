package com.ninja.cloud.swagger.configure;

import com.ninja.cloud.swagger.annotation.NinjaSwagger;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.ImportSelector;
import org.springframework.core.annotation.AnnotationAttributes;
import org.springframework.core.type.AnnotationMetadata;
import springfox.documentation.spring.web.plugins.Docket;

/**
 * Copyright：botBrain.ai
 * Author: liuji
 * Date: 2019/5/10.
 * Description:
 */

@Configuration
public class SwaggerImportSelector implements ImportSelector {


    public String[] selectImports(AnnotationMetadata annotationMetadata) {
        Class<?> annotationType = NinjaSwagger.class;
        AnnotationAttributes attributes = AnnotationAttributes.fromMap(annotationMetadata.getAnnotationAttributes(
                annotationType.getName(), false));
        System.setProperty("swagger.base-package", attributes.getString("basePackage"));
        System.setProperty("swagger.describe", attributes.getString("describe"));
        System.setProperty("swagger.author", attributes.getString("author"));
        return new String[]{SwaggerConfig.class.getName()};
    }
}
