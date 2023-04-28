package com.izumi.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.izumi.domain.ResponseResult;
import com.izumi.domain.dto.TagListDto;
import com.izumi.domain.entity.Tag;
import com.izumi.domain.vo.PageVo;
import com.izumi.domain.vo.TagVo;

import java.util.List;


/**
 * 标签(Tag)表服务接口
 *
 * @author makejava
 * @since 2023-04-14 05:15:48
 */
public interface TagService extends IService<Tag> {

    ResponseResult<PageVo> pageTagList(Integer pageNum, Integer pageSize, TagListDto tagListDto);

    ResponseResult addTag(Tag tag);

    ResponseResult deleteTagByIds(List<Long> ids);

    ResponseResult updateTag(Tag tag);

    ResponseResult<Tag> getTagById(Long id);

    List<TagVo> listAllTag();
}
