package com.izumi.controller;

import com.izumi.domain.ResponseResult;
import com.izumi.domain.dto.TagListDto;
import com.izumi.domain.entity.Tag;
import com.izumi.domain.vo.PageVo;
import com.izumi.service.TagService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/content/tag")
public class TagController {
    @Autowired
    private TagService tagService;
    @GetMapping("/list")
    public ResponseResult<PageVo> list(Integer pageNum, Integer pageSize, TagListDto tagListDto) {
        return tagService.pageTagList(pageNum, pageSize, tagListDto);
    }

    @PostMapping
    public ResponseResult addTag(@RequestBody Tag tag) {
        return tagService.addTag(tag);
    }
    @DeleteMapping("{ids}")
    public ResponseResult deleteTagByIds(@PathVariable("ids") List<Long> ids) {
        return tagService.deleteTagByIds(ids);
    }
}
