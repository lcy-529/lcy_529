package com.example.competition.service;

import com.example.competition.bean.user;

public interface UserService {
    user loginIn(Integer teacId, String password);
}
