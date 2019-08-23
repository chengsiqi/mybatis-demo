package com.example.demo.service.impl;

import com.example.demo.dao.SysUserMapper;
import com.example.demo.model.SysUser;
import com.example.demo.page.PageRequest;
import com.example.demo.page.PageResult;
import com.example.demo.service.SysUserService;
import com.example.demo.utils.PageUtils;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author 程思琦
 * @date 2019/8/22 16:30
 * @description
 **/
@Service
public class SysUserServiceImpl implements SysUserService {

    @Autowired
    private SysUserMapper sysUserMapper;

    @Override
    public List<SysUser> selectAll() {
        return sysUserMapper.selectAll();
    }

    @Override
    public SysUser findByUserId(Long userId) {
        return sysUserMapper.selectByPrimaryKey(userId);
    }


    @Override
    public PageResult findPage(PageRequest pageRequest) {
        return PageUtils.getPageResult(getPageInfo(pageRequest));
    }

    /**
     * 调用分页插件 完成分页
     *
     * @author csq
     * @date 9:48 2019/8/23
     * @param pageRequest
     * @return PageInfo<SysUser>
     */
    private PageInfo<SysUser> getPageInfo(PageRequest pageRequest){
        // 调用分页插件 pagehelper 完成分页查询
        // PageHelper.startPage(pageNum, pageSize), 将前台分页查询参数传入并拦截MyBatis执行实现分页效果
        PageHelper.startPage(pageRequest.getPageNum(), pageRequest.getPageSize());
        List<SysUser> sysUsers = sysUserMapper.selectPage();
        return new PageInfo<>(sysUsers);
    }
}
