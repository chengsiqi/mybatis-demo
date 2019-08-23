package com.example.demo.service;

import com.example.demo.model.SysUser;
import com.example.demo.page.PageRequest;
import com.example.demo.page.PageResult;

import java.util.List;

/**
 * @author 程思琦
 * @date 2019/8/22 16:29
 * @description
 **/
public interface SysUserService {

    /**
     * 查询所有用户
     *
     * @author csq
     * @date 16:32 2019/8/22
     * @return
     */
    List<SysUser> selectAll();

    /**
     * 查询指定用户
     *
     * @author csq
     * @date 16:31 2019/8/22
     * @param userId
     * @return
     */
    SysUser findByUserId(Long userId);

    /**
     * 分页查询接口
     * 这里统一封装了分页请求和结果, 避免直接引入具体框架的分页对象, 如MyBatis或JPA的分页对象
     * 从而避免因为替换ORM框架而导致服务层、控制层的分页接口也需要变动的情况, 替换ORM框架也不会影响
     * 服务层以上的分页接口, 起到了解耦的作用
     *
     * @author csq
     * @date 9:37 2019/8/23
     * @param pageRequest 自定义, 统一分页查询请求
     * @return PageResult 自定义, 统一分页查询结果
     */
    PageResult findPage(PageRequest pageRequest);
}
