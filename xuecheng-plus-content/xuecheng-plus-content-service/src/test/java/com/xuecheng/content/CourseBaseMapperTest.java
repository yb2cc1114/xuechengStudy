package com.xuecheng.content;/**
 * @author yb2cc
 * @version 1.0
 */

import com.xuecheng.content.mapper.CourseBaseMapper;
import com.xuecheng.model.po.CourseBase;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

/**
 * @description TODO
 * @author lovedStudy
 * @date 2023/2/9 1:41
 * @version 1.0
 */
@SpringBootTest
public class CourseBaseMapperTest {

    @Autowired
    private CourseBaseMapper courseBaseMapper;

    @Test
    void testSelect(){
        CourseBase courseBase = courseBaseMapper.selectById(74L);
        Assertions.assertNotNull(courseBase);
    }

}
