package com.izumi.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.izumi.domain.ResponseResult;
import com.izumi.domain.entity.Comment;
import com.izumi.domain.vo.CommentVo;
import com.izumi.domain.vo.PageVo;
import com.izumi.mapper.CommentMapper;
import com.izumi.service.CommentService;
import com.izumi.service.UserService;
import com.izumi.utils.BeanCopyUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 评论表(Comment)表服务实现类
 *
 * @author makejava
 * @since 2023-03-11 19:51:22
 */
@Service("commentService")
public class CommentServiceImpl extends ServiceImpl<CommentMapper, Comment> implements CommentService {

    @Autowired
    private UserService userService;


    @Override
    public ResponseResult commentList(Long articleId, Integer pageNum, Integer pageSize) {
        // 查询对应文章的根评论
        LambdaQueryWrapper<Comment> queryWrapper = new LambdaQueryWrapper<>();


        // 对articleId进行判断
        queryWrapper.eq(Comment::getArticleId, articleId   );
        // 根评论 rootId为-1
        queryWrapper.eq(Comment::getRootId, -1);

        // 分页查询
        Page<Comment> page = new Page<>(pageNum, pageSize);
        page(page, queryWrapper);
        List<Comment> records = page.getRecords();


        List<CommentVo> commentVoList = toCommentListVoList(page.getRecords());



        return ResponseResult.okResult(new PageVo(commentVoList, page.getTotal()));
    }

    private List<CommentVo> toCommentListVoList(List<Comment> list) {
        List<CommentVo> commentVos = BeanCopyUtils.copyBeanList(list, CommentVo.class);
        // 遍历vo集合
        for (CommentVo commentVo : commentVos) {
            // 通过createBy查询用户的昵称并赋值
            String nickName = userService.getById(commentVo.getCreateBy()).getNickName();
            commentVo.setUsername(nickName);
            // 通过toCommentUserId查询用户的昵称并赋值
            // 如果toCommentUserId不为-1才进行查询
            if(commentVo.getToCommentId()!=-1){
                String toCommentUserName = userService.getById(commentVo.getToCommentUserId()).getUserName();
                commentVo.setToCommentUserName(toCommentUserName);
            }
        }


        return commentVos;
    }
}
