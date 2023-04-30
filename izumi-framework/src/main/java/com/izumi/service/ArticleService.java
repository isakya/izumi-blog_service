package com.izumi.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.izumi.domain.ResponseResult;
import com.izumi.domain.dto.AddArticleDto;
import com.izumi.domain.dto.UpdateArticleDto;
import com.izumi.domain.entity.Article;
import com.izumi.domain.vo.UpdateArticleVo;

import java.util.List;

public interface ArticleService extends IService<Article> {
    ResponseResult hotArticleList();

    ResponseResult articleList(Integer pageNum, Integer pageSize, Long categoryId);

    ResponseResult getArticleDetail(Long id);

    ResponseResult updateViewCount(Long id);

    ResponseResult add(AddArticleDto article);

    ResponseResult<List<Article>> getAllArticleList(Integer pageNum, Integer pageSize, Article article);

    ResponseResult<List<UpdateArticleVo>> getArticleDetailById(Long id);

    ResponseResult updateArticle(UpdateArticleDto updateArticleDto);

    ResponseResult deleteArticleById(Long id);
}
