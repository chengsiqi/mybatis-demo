package com.example.demo.service;

import com.example.demo.model.SysUser;

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
}
