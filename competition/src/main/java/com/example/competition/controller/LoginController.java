package com.example.competition.controller;

import com.example.competition.bean.UserBean;
import com.example.competition.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * 描述:
 *
 * @author zhaojianyu
 * @create 2019-12-12 3:28 PM
 */
@Controller
public class LoginController {

    //将Service注入Web层

    @Autowired
    UserService userService;

    @RequestMapping("/login")
    public String show(){
        return "login";
    }

    @RequestMapping(value = "/loginIn",method = RequestMethod.POST)
    public String login(String name,String password){
        UserBean userBean = userService.loginIn(name,password);
        if(userBean!=null){
            return "success";
        }else {
            return "error";
        }
    }
}
