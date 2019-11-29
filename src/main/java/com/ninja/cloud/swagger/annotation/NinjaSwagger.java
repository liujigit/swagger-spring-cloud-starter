package com.ninja.cloud.swagger.annotation;

import com.ninja.cloud.swagger.configure.SwaggerConfig;
import com.ninja.cloud.swagger.configure.SwaggerImportSelector;
import com.ninja.cloud.swagger.configure.SwaggerProperties;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Import;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Copyright：botBrain.ai
 * Author: liuji
 * Date: 2019/11/26.
 * Description:
 */
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
@Import({SwaggerImportSelector.class, SwaggerConfig.class})
public @interface NinjaSwagger {
    /**
     * 扫描的api路径
     *
     * @return
     */
    String basePackage();

    /**
     * 项目简介
     *
     * @return
     */
    String describe() default "";

    /**
     * 作者
     *
     * @return
     */
    String author() default "";
}
