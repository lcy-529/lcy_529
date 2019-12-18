package com.imooc.serviceImpl;

import com.imooc.mapper.UserMapper;
import com.imooc.pojo.User;
import com.imooc.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * 描述:
 * user service impl
 *
 * @author zhaojianyu
 * @create 2019-12-12 4:36 PM
 */

@Service
public class UserServiceImpl implements UserService {
    @SuppressWarnings("SpringJavaInjectionPointsAutowiringInspection")
    @Autowired
    private UserMapper userMapper;

    @Override
    public User loginIn(String name, String password) {
        return userMapper.getInfo(name,password);
    }
}
