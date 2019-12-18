package com.imooc.controller;

import com.imooc.pojo.IMoocJSONResult;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 描述:
 * Controller Test
 *
 * @author zhaojianyu
 * @create 2019-12-06 9:46 AM
 */
@RestController
public class HiController {

    @RequestMapping("/hello")
    public Object hello() {
        return "hello springboot~~";
    }
}
