package com.example.competition.service;

import com.example.competition.bean.UserBean;

public interface UserService {
    UserBean loginIn(String name, String password);
}
