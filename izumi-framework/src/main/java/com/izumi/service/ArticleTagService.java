package com.izumi.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.izumi.domain.entity.ArticleTag;

import java.util.List;


/**
 * 文章标签关联表(ArticleTag)表服务接口
 *
 * @author makejava
 * @since 2023-04-29 10:32:24
 */
public interface ArticleTagService extends IService<ArticleTag> {

    List<Long> getTagList(Long id);
}
