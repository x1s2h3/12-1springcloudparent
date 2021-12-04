package com.os.springcloud.cfgbeans;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Controller;
import org.springframework.web.client.RestTemplate;


@Configuration
public class ConfigBeanMMD {

    @Bean
    @LoadBalanced  //开启负载均衡功能
    public RestTemplate getRestTemplateWdy(){
        RestTemplate restTemplate = new RestTemplate();
        return  restTemplate;
    }
}
