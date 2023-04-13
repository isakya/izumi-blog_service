package com.izumi.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.izumi.domain.entity.Tag;
import com.izumi.mapper.TagMapper;
import com.izumi.service.TagService;
import org.springframework.stereotype.Service;

/**
 * 标签(Tag)表服务实现类
 *
 * @author makejava
 * @since 2023-04-14 05:15:49
 */
@Service("tagService")
public class TagServiceImpl extends ServiceImpl<TagMapper, Tag> implements TagService {

}
