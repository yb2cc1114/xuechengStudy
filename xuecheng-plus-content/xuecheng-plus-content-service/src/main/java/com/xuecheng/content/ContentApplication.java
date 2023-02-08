package com.xuecheng.content;/**
 * @author yb2cc
 * @version 1.0
 */

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @description TODO
 * @author lovedStudy
 * @date 2023/2/9 1:44
 * @version 1.0
 */
@Slf4j
@SpringBootApplication
public class ContentApplication {
    public static void main(String[] args) {
        SpringApplication.run(ContentApplication.class,args);
        log.info("业务层启动成功！");
    }
}
