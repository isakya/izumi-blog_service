package com.izumi.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.izumi.domain.ResponseResult;
import com.izumi.domain.entity.Article;

public interface ArticleService extends IService<Article> {
    ResponseResult hotArticleList();
}
