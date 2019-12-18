package com.imooc;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@MapperScan(basePackages = "com.imooc.mapper")//扫描 mybatis mapper 包路径
@ComponentScan(basePackages= {"com.imooc", "org.n3r.idworker"})//扫描 所有需要的包, 包含一些自用的工具类包 所在的路径
public class ImoocSpringbootStartApplication {

    public static void main(String[] args) {
        SpringApplication.run(ImoocSpringbootStartApplication.class, args);
    }

}
