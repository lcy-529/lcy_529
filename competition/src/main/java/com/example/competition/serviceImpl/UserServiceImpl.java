package com.example.competition.serviceImpl;

import com.example.competition.bean.UserBean;
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
    public UserBean loginIn(String name, String password) {
        return userMapper.getInfo(name,password);
    }

}
