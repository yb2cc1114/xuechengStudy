package com.xuecheng.content;

/**
 * @author yb2cc
 * @version 1.0
 */

import com.spring4all.swagger.EnableSwagger2Doc;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @description TODO
 * @author lovedStudy
 * @date 2023/2/8 23:39
 * @version 1.0
 */
//Swagger测试注解
@EnableSwagger2Doc
@Slf4j
@SpringBootApplication
public class ContentApplication {
    public static void main(String[] args) {
        SpringApplication.run(ContentApplication.class,args);
        log.info("内容管理服务启动成功！");
    }
}
