package com.xuecheng.content.service.Impl;/**
 * @author yb2cc
 * @version 1.0
 */

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.xuecheng.base.model.PageParams;
import com.xuecheng.base.model.PageResult;
import com.xuecheng.content.mapper.CourseBaseMapper;
import com.xuecheng.content.service.CourseBaseInfoService;
import com.xuecheng.model.dto.QueryCourseParamsDto;
import com.xuecheng.model.po.CourseBase;
import org.apache.commons.lang.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @description 课程信息管理业务接口实现类
 * @author lovedStudy
 * @date 2023/2/9 14:22
 * @version 1.0
 */
@Service
public class CourseBaseInfoServiceImpl implements CourseBaseInfoService {

    @Autowired
    private CourseBaseMapper courseBaseMapper;


    //课程分页查询
    @Override
    public PageResult<CourseBase> queryCourseBaseList(PageParams pageParams, QueryCourseParamsDto queryCourseParamsDto) {
        //1、创建条件构造器
        LambdaQueryWrapper<CourseBase> queryWrapper = new LambdaQueryWrapper<>();
        //2、构造查询条件，根据课程名称查询
         queryWrapper.like(StringUtils.isNotEmpty((queryCourseParamsDto.getCourseName())),
                                                   CourseBase::getName,queryCourseParamsDto.getCourseName());
        //3、构建查询条件，根据课程审核状态查询
         queryWrapper.eq(StringUtils.isNotEmpty(queryCourseParamsDto.getAuditStatus()),
                                             CourseBase::getAuditStatus,queryCourseParamsDto.getAuditStatus());
        //4、构建查询条件，根据课程发布状态查询
        queryWrapper.eq(StringUtils.isNotEmpty(queryCourseParamsDto.getPublishStatus()),
                                               CourseBase::getStatus,queryCourseParamsDto.getPublishStatus());
        //5、创建分页对象，构建查询结果集
        Page<CourseBase> page = new Page<CourseBase>(pageParams.getPageNo(), pageParams.getPageSize());
        Page<CourseBase> pageResult = courseBaseMapper.selectPage(page, queryWrapper);
        //获取数据列表
        List<CourseBase> items = pageResult.getRecords();
        //获取数据总数
        long total = pageResult.getTotal();
        //构建结果集：因为返回类型是PageResult<CourseBase>，现在获取到的结果类型是Page<CourseBase>，进行类型转换
        PageResult<CourseBase> courseBasePageResult = new PageResult<>(items, total, pageParams.getPageNo(), pageParams.getPageSize());
        //6、返回查询结果
        return courseBasePageResult;
    }
}
