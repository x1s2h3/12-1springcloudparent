package com.os.springcloud.controller;


import com.os.springcloud.entities.Dept;
import com.os.springcloud.service.DeptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
public class DeptController {

    @Autowired
    private DeptService deptService;

    @Resource
    private DiscoveryClient helloclient;

    //增加

    //删除

    //修改

    //查询
    @RequestMapping("showDeptAll")
    public List<Dept> showDeptAll(){
        List<Dept>list = deptService.findAll();
        return list;
    }

    /**
     * 拿到当前微服务的摘要信息
     */
    @RequestMapping("getServiceInfo")
    public Object getServiceInfo(){
        //需要通过一个对象来调用具体的服务方法
        List<String> list = helloclient.getServices();
        //拿到当前的在Eureka中注册服务名称
        System.out.println("list:"+list);
        List<ServiceInstance> applist = helloclient.getInstances("xishiApp");
        for (ServiceInstance si : applist){
            System.out.println("si.getHost():"+si.getHost());
            System.out.println("si.getPort():"+si.getPort());
            System.out.println("si.getServiceId"+si.getServiceId());
            System.out.println("si.getUri()"+si.getUri());
            System.out.println("si.getMetadata()"+si.getMetadata());
        }
        return this.helloclient;
    }
}
