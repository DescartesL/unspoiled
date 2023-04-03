package com.budu.vo;


import com.budu.entity.Category;
import com.budu.entity.Comment;
import lombok.Data;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Data
public class ArticleInfoVO {

    /**
     * 主键id
     */
    private Long id;
    /**
     *分类id
     */
    private Long categoryId;
    /**
     * 标题
     */
    private String title;
    /**
     * 封面地址
     */
    private String avatar;
    /**
     * 内容
     */
    private String content;
    /**
     * 文章内容MD版
     */
    private String contentMd;
    /**
     * 是否私密
     */
    private Integer isSecret;
    /**
     * 是否原创
     */
    private Integer isOriginal;
    /**
     * 转发地址
     */
    private String originalUrl;
    /**
     * 阅读量
     */
    private Integer quantity;
    /**
     * SEO关键词
     */
    private String keywords;
    /**
     * 创建时间
     */
    private Date createTime;
    /**
     * 修改时间
     */
    private Date updateTime;
    /**
     * 分类
     */
    private Category category;
    /**
     * 评论集合
     */
    private List<Comment> comments = new ArrayList<>();
    /**
     * 标签集合
     */
    private List<TagVO> tagList = new ArrayList<>();
    /**
     * 最新文章
     */
    private List<LatestArticleVO> newestArticleList = new ArrayList<>();
    /**
     * 上一篇
     */
    private LatestArticleVO lastArticle;
    /**
     * 下一篇
     */
    private LatestArticleVO nextArticle;
    /**
     * 推荐
     */
    private List<LatestArticleVO> recommendArticleList = new ArrayList<>();
    /**
     * 点赞量
     */
    private Integer likeCount;

}
