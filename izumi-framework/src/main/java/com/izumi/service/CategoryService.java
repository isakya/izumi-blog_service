package com.izumi.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.izumi.domain.ResponseResult;
import com.izumi.domain.entity.Category;
import com.izumi.domain.vo.CategoryVo;

import java.util.List;


/**
 * 分类表(Category)表服务接口
 *
 * @author makejava
 * @since 2023-02-23 03:51:35
 */
public interface CategoryService extends IService<Category> {

    ResponseResult getCategoryList();

    List<CategoryVo> listAllCategory();
}
