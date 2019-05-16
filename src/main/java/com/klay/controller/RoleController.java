package com.klay.controller;
import com.klay.Bean.Role;
import com.klay.Bean.User;
import com.klay.Bean.layuiResult;
import com.klay.service.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping("role")
public class RoleController {

    @Autowired
    private RoleService roleService;

    @RequestMapping(value = "/addRole",method = RequestMethod.POST)
    @ResponseBody
    public String addRole(Role role){
        int i = roleService.addRole(role);
        return returnMethod(i);
    }

    @RequestMapping(value = "/addRole",method = RequestMethod.GET)
    public String add(){
        return "/role/addRole";
    }

    @RequestMapping(value = "getRoles", method = RequestMethod.GET)
    @ResponseBody
    public List<Role> getRoles(){
        return roleService.getRoles();
    }

    public String returnMethod(int i){
        if(i==1){
            return "添加成功！";
        }else{
            return "操作失败！";
        }
    }

    @RequestMapping("/list")
    public String list(){
        System.out.println("hello!");
        return "role/roleList";
    }

    /**
     * 分页查询角色信息列表
     * @return ok/fail
     */
    @RequestMapping("/ListData")
    @ResponseBody
    public layuiResult<Role> listData(){
        layuiResult<Role> result = new layuiResult<>();
        List<Role> list = roleService.getRoles();
        result.setData(list);
        result.setCount(1000);
        return result;
    }

}


