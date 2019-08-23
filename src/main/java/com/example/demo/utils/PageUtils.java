package com.example.demo.utils;

import com.example.demo.page.PageResult;
import com.github.pagehelper.PageInfo;

/**
 * 分页查询工具类
 *
 * @author 程思琦
 * @date 2019/8/23 9:58
 * @description
 **/
public class PageUtils {

    /**
     * 将分页信息封装到统一的接口
     *
     * @author csq
     * @date 10:01 2019/8/23
     * @param pageInfo 查询的分页结果信息
     * @return PageResult
     */
    public static PageResult getPageResult(PageInfo<?> pageInfo){
        PageResult pageResult = new PageResult();
        pageResult.setPageNum(pageInfo.getPageNum());
        pageResult.setPageSize(pageInfo.getPageSize());
        pageResult.setTotalSize(pageInfo.getTotal());
        pageResult.setTotalPages(pageInfo.getPages());
        pageResult.setContent(pageInfo.getList());
        return pageResult;
    }
}
