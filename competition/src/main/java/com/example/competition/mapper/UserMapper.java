package com.example.competition.mapper;

import com.example.competition.bean.user;
import org.apache.ibatis.annotations.Param;

public interface UserMapper {
    user getInfo(@Param("teacId")Integer teacId, @Param("password")String password);

}
