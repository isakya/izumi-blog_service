package com.izumi.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.izumi.domain.ResponseResult;
import com.izumi.domain.entity.User;


/**
 * 用户表(User)表服务接口
 *
 * @author makejava
 * @since 2023-03-11 20:34:04
 */
public interface UserService extends IService<User> {

    ResponseResult userInfo();

    ResponseResult updateUserInfo(User user);

    ResponseResult register(User user);
}
