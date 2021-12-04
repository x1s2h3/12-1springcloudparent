package com.os.springcloud.controller;


import com.os.springcloud.entities.Dept;
import com.os.springcloud.service.DeptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class DeptController {

    @Autowired
    private DeptService deptService;
    //增加

    //删除

    //修改

    //查询
    @RequestMapping("showDeptAll")
    public List<Dept> showDeptAll(){
        List<Dept>list = deptService.findAll();
        return list;
    }

}
