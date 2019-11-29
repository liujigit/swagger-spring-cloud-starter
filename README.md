**swagger接口文档自动配置**

一、起因

    每个项目都需要配置swagger的bean，每个微服务项目都得写，很麻烦
    
二、 使用方法


    1、引入依赖
    <dependency>
        <groupId>com.ninja.cloud</groupId>
        <artifactId>swagger-spring-cloud-starter</artifactId>
        <version>${swagger.starter.version}</version>
    </dependency>
    
    2、添加配置
    
        swagger:
          enable: true                          #是否开启swagger家口文档
          describe:                             #项目简介  
          title: ${spring.application.name}     #项目标题  
          author-name:                          #作者名称
          author-url: https://www.baidu.com/    #作者主页
          author-email: liuji@botbrain.cn       #作者email
          base-ackage:                          #swagger扫描包
        
        
    也可以通过 @NinjaSwagger注解简单配置
    
四、信息
    
    **git**：https://github.com/liujigit/swagger-spring-cloud-starter