package com.izumi.controller;

import com.izumi.domain.ResponseResult;
import com.izumi.domain.entity.Menu;
import com.izumi.service.MenuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/system/menu")
public class MenuController {
    @Autowired
    private MenuService menuService;

    @GetMapping("/list")
    public ResponseResult<List<Menu>> getAllMenuList(String status, String menuName) {
        return menuService.getAllMenuList(status, menuName);
    }

    @PostMapping
    public ResponseResult addMenu(@RequestBody Menu menu) {
        return menuService.addMenu(menu);
    }


}
