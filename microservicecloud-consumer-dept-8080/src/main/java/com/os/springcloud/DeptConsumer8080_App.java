package com.os.springcloud;

import com.os.myrule.MySelfRule;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.ribbon.RibbonClient;


@SpringBootApplication
@EnableEurekaClient
//在启动该微服务的时候就能去加载我们的自定义Ribbon配置类，从而使配置生效
@RibbonClient(name="xishiApp",configuration = MySelfRule.class)
public class DeptConsumer8080_App {

    public static void main(String[] args) {
        SpringApplication.run(DeptConsumer8080_App.class,args);
    }
}
