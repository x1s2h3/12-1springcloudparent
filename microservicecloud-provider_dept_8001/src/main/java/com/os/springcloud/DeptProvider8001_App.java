package com.os.springcloud;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;


/**
 * 当前“提供者”子项目的启动类
 */
@SpringBootApplication
@EnableEurekaClient
@EnableDiscoveryClient //开发“发现服务信息的功能”
public class DeptProvider8001_App {
    public static void main(String[] args) {

        SpringApplication.run(DeptProvider8001_App.class,args);
    }
}
