package com.izumi.service.impl;

import com.izumi.utils.SecurityUtils;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("ps")
public class PermissionService {
    // 判断当前用户是否具有permission
    // permission 参数是要判断的权限
    public boolean hasPermission(String permission) {
        // 如果是超级管理员 直接返回true
        if(SecurityUtils.isAdmin()) return true;
        // 否则，获取当前登陆用户所获取的权限列表，如何判断是否存在permission
        List<String> permissions = SecurityUtils.getLoginUser().getPermissions();
        if(permissions == null) {
            return false;
        }
        return permissions.contains(permission);
    }
}
