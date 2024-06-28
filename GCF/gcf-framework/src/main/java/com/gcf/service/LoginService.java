package com.gcf.service;

import com.gcf.domain.ResponseResult;
import com.gcf.domain.entity.User;

public interface LoginService {
    ResponseResult login(User user);
    ResponseResult logout();

}