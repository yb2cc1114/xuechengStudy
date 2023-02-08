package com.xuecheng.content.config;/**
 * @author yb2cc
 * @version 1.0
 */

import com.baomidou.mybatisplus.annotation.DbType;
import com.baomidou.mybatisplus.extension.plugins.MybatisPlusInterceptor;
import com.baomidou.mybatisplus.extension.plugins.inner.PaginationInnerInterceptor;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @description TODO
 * @author lovedStudy
 * @date 2023/2/9 1:33
 * @version 1.0
 * *
 * * <P>
 * * Mybatis-Plus 配置
 * * </p>
 *
 */
@MapperScan("com.xuecheng.content.mapper")
@Configuration
public class MybatisPlusConfig {

    /**
     * 定义分页拦截器
     */
    @Bean
    public MybatisPlusInterceptor mybatisPlusInterceptor() {
        MybatisPlusInterceptor interceptor = new MybatisPlusInterceptor();
        interceptor.addInnerInterceptor(new
                PaginationInnerInterceptor(DbType.MYSQL));
        return interceptor;
    }
}
