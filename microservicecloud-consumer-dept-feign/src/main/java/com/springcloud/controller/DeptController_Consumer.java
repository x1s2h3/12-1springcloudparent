package com.springcloud.controller;


import com.os.springcloud.entities.Dept;
import com.os.springcloud.service.DeptClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@RestController
public class DeptController_Consumer {

    //需要一个提供增删改查方法的对象
    @Autowired
    private DeptClientService deptClientService;

    //增加

    //删除

    //修改

    //查询
    @RequestMapping("showDeptAllByFeign")
    public List<Dept> showDeptAllByFeign(){
        List<Dept> list = deptClientService.findAll();
        return list;
    }

}
