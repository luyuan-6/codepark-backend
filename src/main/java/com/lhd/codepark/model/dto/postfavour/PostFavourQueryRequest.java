package com.lhd.codepark.model.dto.postfavour;

import com.lhd.codepark.common.PageRequest;

import java.io.Serializable;

import com.lhd.codepark.model.dto.post.PostQueryRequest;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * 帖子收藏查询请求
 *
 * @author lhd 
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class PostFavourQueryRequest extends PageRequest implements Serializable {

    /**
     * 帖子查询请求
     */
    private PostQueryRequest postQueryRequest;

    /**
     * 用户 id
     */
    private Long userId;

    private static final long serialVersionUID = 1L;
}