package com.springcloud.cfgbeans;


import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
public class ConfigBeanXS {

    @Bean
    @LoadBalanced  //开启负载均衡功能
    public RestTemplate getRestTemplateXS(){
        RestTemplate restTemplate = new RestTemplate();
        return  restTemplate;
    }
}
