package com.izumi.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.izumi.domain.entity.Menu;

import java.util.List;


/**
 * 菜单权限表(Menu)表服务接口
 *
 * @author makejava
 * @since 2023-04-25 01:13:48
 */
public interface MenuService extends IService<Menu> {

    List<String> selectPermsByUserId(Long id);
}
