package com.example.demo.dao;

import com.example.demo.model.SysUser;
import com.example.demo.model.SysUserExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

/**
 * 用户接口
 * @author csq
 * @date 15:26 2019/8/22
 */
public interface SysUserMapper {
    long countByExample(SysUserExample example);

    int deleteByExample(SysUserExample example);

    int deleteByPrimaryKey(Long id);

    int insert(SysUser record);

    int insertSelective(SysUser record);

    List<SysUser> selectByExample(SysUserExample example);

    SysUser selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") SysUser record, @Param("example") SysUserExample example);

    int updateByExample(@Param("record") SysUser record, @Param("example") SysUserExample example);

    int updateByPrimaryKeySelective(SysUser record);

    int updateByPrimaryKey(SysUser record);

    /**
     * 查询全部用户
     *
     * @author csq
     * @date 16:26 2019/8/22
     * @return List<SysUser>
     */
    List<SysUser> selectAll();

    /**
     * 分页查询用户信息
     *
     * @author csq
     * @date 9:32 2019/8/23
     * @return List<SysUser>
     */
    List<SysUser> selectPage();
}