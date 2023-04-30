package com.izumi.domain.vo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
import java.util.List;
@Data
@AllArgsConstructor
@NoArgsConstructor
public class UpdateArticleVo {
    private Long categoryId;
    private String content;
    private String createBy;
    private Date createTime;
    private Integer delFlag;
    private String id;
    private String isComment;
    private String isTop;
    private String status;
    private String summary;
    private List<Long> tags;
    private String thumbnail;
    private String title;
    private String updateBy;
    private Date updateTime;
    private Long viewCount;
}
