package com.izumi.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.izumi.domain.entity.Role;

import java.util.List;


/**
 * 角色信息表(Role)表数据库访问层
 *
 * @author makejava
 * @since 2023-04-25 01:18:37
 */
public interface RoleMapper extends BaseMapper<Role> {

    List<String> selectRoleKeyByUserId(Long userId);
}
