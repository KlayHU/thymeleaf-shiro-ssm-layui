package com.klay.controller;
import com.klay.Bean.Permission;
import com.klay.Bean.User;
import com.klay.Bean.layuiResult;
import com.klay.service.PermissionService;
import com.sun.tools.doclets.internal.toolkit.AnnotationTypeWriter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping("perms")
public class PermissionController {


    @Autowired
    private PermissionService permissionService;

    @RequestMapping(value = "/addPerms",method = RequestMethod.POST)
    @ResponseBody
    public String addPerms(Permission permission){
        return permissionService.addPerms(permission);
    }

    @RequestMapping(value = "/addPerms",method = RequestMethod.GET)
    public String add(){
        return "/Perms/addPerms";
    }


    @RequestMapping("/list")
    public String list(){
        System.out.println("hello!");
        return "Perms/permsList";
    }
    /**
     * 分页查询权限列表
     * @return ok/fail
     */
    @RequestMapping("/ListData")
    @ResponseBody
    public layuiResult<Permission> listData(){
        layuiResult<Permission> result = new layuiResult<>();
        List<Permission> list = permissionService.getPerms();
        result.setData(list);
        result.setCount(1000);
        return result;
    }
}
