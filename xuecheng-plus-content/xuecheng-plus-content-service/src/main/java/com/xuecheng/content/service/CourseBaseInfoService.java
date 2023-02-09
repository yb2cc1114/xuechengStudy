package com.xuecheng.content.service;/**
 * @author yb2cc
 * @version 1.0
 */

import com.xuecheng.base.model.PageParams;
import com.xuecheng.base.model.PageResult;
import com.xuecheng.model.dto.QueryCourseParamsDto;
import com.xuecheng.model.po.CourseBase;

/**
 * @description 课程基本信息管理业务接口
 * @author lovedStudy
 * @date 2023/2/9 14:18
 * @version 1.0
 */

public interface CourseBaseInfoService {

    /**
    * @description 课程查询接口（分页查询）
    * @author ${USER}
    * @date ${DATE} ${TIME}
    * @version 1.0
     * pageParams 分页参数
     * queryCourseParamsDto 查询条件
    */
    PageResult<CourseBase> queryCourseBaseList(PageParams pageParams, QueryCourseParamsDto queryCourseParamsDto);
}
