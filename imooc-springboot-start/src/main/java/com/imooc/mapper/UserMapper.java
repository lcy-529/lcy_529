package com.imooc.mapper;

import com.imooc.pojo.User;
import org.apache.ibatis.annotations.Param;

public interface UserMapper{
    User getInfo(@Param("name")String name, @Param("password")String password);
}