package com.example.demo.controller;

import com.example.demo.page.PageRequest;
import com.example.demo.service.SysUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * @author 程思琦
 * @date 2019/8/22 16:35
 * @description
 **/
@RestController
@RequestMapping("/user")
public class SysUserController {

    @Autowired
    private SysUserService sysUserService;

    @GetMapping("findByUserId")
    public Object findByUserId(@RequestParam("userId") Long userId){
        return sysUserService.findByUserId(userId);
    }

    @GetMapping("findAll")
    public Object findAll(){
        return sysUserService.selectAll();
    }

    @PostMapping("findPage")
    public Object findPage(PageRequest pageRequest){
        return sysUserService.findPage(pageRequest);
    }
}
