package com.izumi.controller;

import com.izumi.domain.ResponseResult;
import com.izumi.domain.entity.User;
import com.izumi.service.BlogLoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BlogLoginController {
    @Autowired
    private BlogLoginService blogLoginService;

    @PostMapping("/login")
    public ResponseResult login(@RequestBody User user) {
        return blogLoginService.login(user);
    }
}
