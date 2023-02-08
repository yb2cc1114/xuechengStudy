package com.xuecheng.base.model;/**
 * @author yb2cc
 * @version 1.0
 */

import lombok.Data;
import lombok.ToString;

import java.io.Serializable;
import java.util.List;


/**
 * @description TODO
 * @author lovedStudy
 * @date 2023/2/8 23:25
 * @version 1.0
 */

/**
 * @description 分页查询结果模型类
 * @author Mr.M
 * @date 2022/9/6 14:15
 * @version 1.0
 */
@Data
@ToString
public class PageResult <T> implements Serializable {

    // 数据列表
    private List<T> items;
    //总记录数
    private long counts;
    //当前页码
    private long page;
    //每页记录数
    private long pageSize;
    public PageResult(List<T> items, long counts, long page, long pageSize) {
        this.items = items;
        this.counts = counts;
        this.page = page;
        this.pageSize = pageSize;
    }
}
