package com.example.demo.commen;

import com.baomidou.mybatisplus.annotation.DbType;
import com.baomidou.mybatisplus.extension.plugins.MybatisPlusInterceptor;
import com.baomidou.mybatisplus.extension.plugins.inner.PaginationInnerInterceptor;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 *  mybatis 分页插件
 */

@Configuration
@MapperScan("com.example.demo.mapper")
public class MybatisPlusConfig {

    @Bean
    public MybatisPlusInterceptor paginationInnerInterceptor() {
        MybatisPlusInterceptor innerInterceptor = new MybatisPlusInterceptor();
        innerInterceptor.addInnerInterceptor(new PaginationInnerInterceptor(DbType.MYSQL));
        return innerInterceptor;
    }
}
