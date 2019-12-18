package com.imooc.service;

import com.imooc.pojo.User;

/**
 * 描述:
 *
 * @author zhaojianyu
 * @create 2019-12-12 2:45 PM
 */
public interface UserService {
    User loginIn(String name, String password);
}
