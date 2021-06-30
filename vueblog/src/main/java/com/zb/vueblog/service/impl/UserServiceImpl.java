package com.zb.vueblog.service.impl;

import com.zb.vueblog.entity.User;
import com.zb.vueblog.mapper.UserMapper;
import com.zb.vueblog.service.UserService;
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
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements UserService {

}
