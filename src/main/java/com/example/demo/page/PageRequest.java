package com.example.demo.page;

/**
 * 分页请求
 *
 * @author 程思琦
 * @date 2019/8/23 9:52
 * @description
 **/
public class PageRequest {

    /**
     * 当前页数
     */
    private int pageNum;

    /**
     * 每页数量
     */
    private int pageSize;

    public int getPageNum() {
        return pageNum;
    }

    public void setPageNum(int pageNum) {
        this.pageNum = pageNum;
    }

    public int getPageSize() {
        return pageSize;
    }

    public void setPageSize(int pageSize) {
        this.pageSize = pageSize;
    }
}
