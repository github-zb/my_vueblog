package com.zb.vueblog.controller;


import com.zb.vueblog.common.lang.Result;
import com.zb.vueblog.entity.User;
import com.zb.vueblog.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author 赵兵
 * @since 2021-06-29
 */
@RestController  //将此类叫给springboot管理，就是将类加入到IOC容器中，由springboot调度使用
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("/index")
    public Result index(){
        User user = userService.getById(1L);
        return Result.succ(user);
    }

    @GetMapping("/{id}")
    public Object queryById(@PathVariable("id") Long id){
        System.out.println("------------------此方法运行了---------------");
        return userService.getById(id);
    }


}
