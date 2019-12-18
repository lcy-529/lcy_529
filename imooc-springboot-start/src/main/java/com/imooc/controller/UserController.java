package com.imooc.controller;

import com.imooc.pojo.User;
import com.imooc.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


/**
 * 描述:
 * Controller Test
 *
 * @author zhaojianyu
 * @create 2019-12-06 9:46 AM
 */
/**
 * @RestController = @Controller + @ResponseBody
 */
@Controller
@RequestMapping("/user")
public class UserController {

    //将Service注入Web层

    @SuppressWarnings("SpringJavaInjectionPointsAutowiringInspection")
    @Autowired
    UserService userService;

    @RequestMapping("/login")
    public String show(){
        return "login";
    }

    @RequestMapping(value = "/loginIn",method = RequestMethod.POST)
    public String login(String name,String password){
        User user = userService.loginIn(name,password);
        if(user!=null){
            return "success";
        }else {
            return "error";
        }
    }
}

