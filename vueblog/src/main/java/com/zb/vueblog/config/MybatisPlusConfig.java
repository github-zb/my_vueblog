package com.zb.vueblog.config;

import com.baomidou.mybatisplus.extension.plugins.PaginationInterceptor;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@Configuration   //表明属于配置类
@EnableTransactionManagement   //启用事务管理
@MapperScan("com.zb.vueblog.mapper")  //定义Mapper扫描路径
public class MybatisPlusConfig {
    //MybatisPlus的分页插件
    @Bean
    public PaginationInterceptor paginationInterceptor() {
        PaginationInterceptor paginationInterceptor = new PaginationInterceptor();
        return paginationInterceptor;
    }

}
