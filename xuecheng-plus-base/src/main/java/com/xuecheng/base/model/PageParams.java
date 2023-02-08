package com.xuecheng.base.model;

/**
 * @author yb2cc
 * @version 1.0
 */

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.ToString;

/**
 * @description 分页查询通用参数
 * @author Mr.M
 * @date 2022/9/6 14:02
 * @version 1.0
 */

/**
 * @description TODO
 * @author lovedStudy
 * @date 2023/2/8 23:15
 * @version 1.0
 */
@Data
@ToString
public class PageParams {

    @ApiModelProperty("当前页码默认值")
    public static final long DEFAULT_PAGE_CURRENT = 1L;

    @ApiModelProperty("每页记录数默认值")
    public static final long DEFAULT_PAGE_SIZE = 10L;

    @ApiModelProperty("当前页码")
    private Long pageNo = DEFAULT_PAGE_CURRENT;

    @ApiModelProperty("每页记录数默认值")
    private Long pageSize = DEFAULT_PAGE_SIZE;
    public PageParams(){
    }
    public PageParams(long pageNo,long pageSize){
        this.pageNo = pageNo;
        this.pageSize = pageSize;
    }
}
