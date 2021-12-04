package com.os.springcloud.controller;

import com.os.springcloud.entities.Dept;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;
import java.util.List;


@RestController
public class DeptController_Consumer {

    //定义变量，用于存放通用的部分网址(使用负载均衡之前)
//    private static final String REST_URL_PREFIX = "http://127.0.0.1:8001";
    ////定义变量，用于存放通用的部分网址(使用负载均衡之后)
    private static final String REST_URL_PREFIX = "http://xishiapp";

    //需要一个提供增删改查方法的对象
    @Resource
    private RestTemplate restTemplate;

    //增加

    //删除

    //修改

    //查询
    @RequestMapping("showDeptALLByConsumer")
    public List<Dept> showDeptALLByConsumer(){
        List<Dept> list = restTemplate.getForObject(REST_URL_PREFIX+"/showDeptAll", List.class);
        return list;
    }

    /**
     * 获取“提供者子项目”中微服务摘要信息
     */
    @RequestMapping("getServiceInfoByConsumer")
    public Object getServiceInfoByConsumer(){
        Object obj = restTemplate.getForObject(REST_URL_PREFIX+"/getServiceInfo", Object.class);
        return obj;
    }

}
