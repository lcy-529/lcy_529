package com.example.competition.mapper;

import com.example.competition.bean.UserBean;
import org.apache.ibatis.annotations.Param;

public interface UserMapper {
    UserBean getInfo(@Param("name")String name, @Param("password")String password);
}
