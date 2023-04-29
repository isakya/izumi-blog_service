package com.izumi.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.izumi.domain.entity.ArticleTag;
import com.izumi.mapper.ArticleTagMapper;
import com.izumi.service.ArticleTagService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * 文章标签关联表(ArticleTag)表服务实现类
 *
 * @author makejava
 * @since 2023-04-29 10:32:24
 */
@Service("articleTagService")
public class ArticleTagServiceImpl extends ServiceImpl<ArticleTagMapper, ArticleTag> implements ArticleTagService {


}
