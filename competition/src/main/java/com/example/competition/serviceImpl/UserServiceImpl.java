package com.example.competition.serviceImpl;

import com.example.competition.bean.user;
import com.example.competition.mapper.UserMapper;
import com.example.competition.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * 描述:
 *
 * @author zhaojianyu
 * @create 2019-12-12 3:30 PM
 */

@Service
public class UserServiceImpl implements UserService {

    @SuppressWarnings("SpringJavaInjectionPointsAutowiringInspection")
    @Autowired
    private UserMapper userMapper;

    @Override
    public user loginIn(Integer teacId, String password) {
        return userMapper.getInfo(teacId,password);
    }

}
