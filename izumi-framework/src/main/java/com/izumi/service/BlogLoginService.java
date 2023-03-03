package com.izumi.service;

import com.izumi.domain.ResponseResult;
import com.izumi.domain.entity.User;

public interface BlogLoginService {

    ResponseResult login(User user);
}
