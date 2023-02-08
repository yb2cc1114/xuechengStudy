package com.xuecheng.model.dto;/**
 * @author yb2cc
 * @version 1.0
 */

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.ToString;

/**
 * @description TODO
 * @author lovedStudy
 * @date 2023/2/8 23:20
 * @version 1.0
 */
@ToString
@Data
public class QueryCourseParamsDto {

    @ApiModelProperty("审核状态")
    private String auditStatus;

    @ApiModelProperty("课程名称")
    private String courseName;

    @ApiModelProperty("发布状态")
    private String publishStatus;
}
