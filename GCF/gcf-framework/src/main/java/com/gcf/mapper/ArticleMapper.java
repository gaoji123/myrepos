package com.gcf.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.gcf.domain.entity.Article;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Update;


/**
 * 文章表(Article)表数据库访问层
 *
 * @author makejava
 * @since 2024-04-17 11:12:02
 */
public interface ArticleMapper extends BaseMapper<Article> {
    @Update("update gcf_article set view_count = #{viewCount} where id = #{id}")
    void updateViewCountById(@Param("viewCount")Long viewCount, @Param("id") Long id);
}

