package com.izumi.controller;

import com.izumi.domain.ResponseResult;
import com.izumi.domain.entity.Article;
import com.izumi.service.ArticleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/article")
public class ArticleController {
    @Autowired
    private ArticleService articleService;

    // @GetMapping("/list")
    // public List<Article> test() {
    //     return articleService.list();
    // }

    @GetMapping("/hotArticleList")
    public ResponseResult hotArticleList() {
        ResponseResult result = articleService.hotArticleList();
        return result;

    }
}
