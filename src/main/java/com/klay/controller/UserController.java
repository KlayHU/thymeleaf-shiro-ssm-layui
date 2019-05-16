package com.klay.controller;
import com.klay.Bean.User;
import com.klay.Bean.UserDTO;
import com.klay.Bean.layuiResult;
import com.klay.Util.PageDataResult;
import com.klay.service.UserService;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.*;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.apache.shiro.subject.Subject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("/user")
public class UserController {


    @Autowired
    private UserService userService;

    /**
     * 测试方法
     */
    @RequestMapping("/hello")
    @ResponseBody
    public String hello() {
        return "Ok";
    }

    /**
     * 测试Thymeleaf
     */
    @RequestMapping("/Thymeleaf")
    public String Thymeleaf(Model model) {
        //把数据存入model
        model.addAttribute("name", "欢迎进入！");
        //返回first.html
        return "first";
    }

    @RequestMapping(value = "/add",method = RequestMethod.POST)
    @ResponseBody
    public String addUserMsg(User user) {
        int i = userService.addUserMsg(user);
        return returnMethod(i);
    }

    @RequestMapping(value = "/add" , method = RequestMethod.GET)
    public String add(){
        return  "/user/userManage";
    }

    @RequestMapping("/update")
    public String update() {
        return "/user/update";
    }

    @RequestMapping("/toLogin")
    public String toLogin() {
        return "/login";
    }

    @RequestMapping("/noAuth")
    public String noAuth() {
        return "/noAuth";
    }

    /**
     * 登录逻辑处理
     */
    @RequestMapping("/login")
    public String login(String name, String password, Model model) {
        System.out.println("name=" + name);
        /**
         * 使用shiro编写认证操作
         */
        //1.获取subjcet
        Subject subject = SecurityUtils.getSubject();
        //2.封装用户数据
        UsernamePasswordToken token = new UsernamePasswordToken(name, password);
        //3.执行登录方法
        try {
            subject.login(token);

            //登陆成功
            //跳转到first.html
            return "redirect:/user/Thymeleaf";
        } catch (UnknownAccountException e) {
            //e.printStackTrace();
            //登录失败:用户名不存在
            model.addAttribute("msg", "用户名不存在");
            return "login";
        } catch (IncorrectCredentialsException e) {
            //e.printStackTrace();
            //登录失败:密码错误
            model.addAttribute("msg", "密码错误");
            return "login";
        }
    }

    @RequestMapping("/succeed")
    public String succeed(){
        return "succeed";
    }

    public String returnMethod(int i){
        if(i==1){
            return "添加成功！";
        }else{
            return "操作失败！";
        }
    }

    @RequestMapping(value = "/list")
    public String list(){
        System.out.println("hello!");
        return "user/userList";
    }
    /**
     * 分页查询用户列表
     * @return ok/fail
     */
    @RequestMapping("/ListData")
    @ResponseBody
    public layuiResult<User> listData(){
        layuiResult<User> result = new layuiResult<>();
        List<User> list = userService.getUsers();
        result.setData(list);
        result.setCount(1000);
        return result;
    }
}

