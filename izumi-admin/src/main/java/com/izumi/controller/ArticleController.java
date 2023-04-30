package com.izumi.controller;

import com.izumi.domain.ResponseResult;
import com.izumi.domain.dto.AddArticleDto;
import com.izumi.domain.dto.UpdateArticleDto;
import com.izumi.domain.entity.Article;
import com.izumi.domain.vo.UpdateArticleVo;
import com.izumi.service.ArticleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/content/article")
public class ArticleController {
    @Autowired
    private ArticleService articleService;

    @PostMapping
    public ResponseResult add(@RequestBody AddArticleDto article) {
        return articleService.add(article);
    }

    @GetMapping("/list")
    public ResponseResult<List<Article>> getAllArticleList(Integer pageNum, Integer pageSize, Article article) {
        return articleService.getAllArticleList(pageNum, pageSize, article);
    }
    @GetMapping("/{id}")
    public ResponseResult<List<UpdateArticleVo>> getArticleDetailById(@PathVariable Long id) {
        return articleService.getArticleDetailById(id);
    }
    @PutMapping
    public ResponseResult updateArticle(@RequestBody UpdateArticleDto updateArticleDto) {
        return articleService.updateArticle(updateArticleDto);
    }

    @DeleteMapping("/{id}")
    public ResponseResult deleteArticleById(@PathVariable Long id) {
        return articleService.deleteArticleById(id);
    }
}
