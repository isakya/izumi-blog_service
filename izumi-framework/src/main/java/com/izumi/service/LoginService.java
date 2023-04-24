package com.izumi.service;

import com.izumi.domain.ResponseResult;
import com.izumi.domain.entity.User;

public interface LoginService {
    ResponseResult login(User user);
}
