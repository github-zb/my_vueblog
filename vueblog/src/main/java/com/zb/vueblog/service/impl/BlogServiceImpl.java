package com.zb.vueblog.service.impl;

import com.zb.vueblog.entity.Blog;
import com.zb.vueblog.mapper.BlogMapper;
import com.zb.vueblog.service.BlogService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author 赵兵
 * @since 2021-06-29
 */
@Service
public class BlogServiceImpl extends ServiceImpl<BlogMapper, Blog> implements BlogService {

}
