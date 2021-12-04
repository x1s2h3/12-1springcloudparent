package com.os.springcloud;


import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer //开启Eureka功能，让微服务项目能否加进来
public class EurekaServer7002_App {
    public static void main(String[] args) {
        new SpringApplicationBuilder(EurekaServer7002_App.class).web(true).run(args);
    }
}
