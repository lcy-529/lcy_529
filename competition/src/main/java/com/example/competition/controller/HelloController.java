package com.example.competition.controller;

/**
 * 描述:
 *
 * @author zhaojianyu
 * @create 2019-12-12 2:59 PM
 */

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloController {

    @RequestMapping("/index")
    public String sayHello(){
        return "index";
    }
}