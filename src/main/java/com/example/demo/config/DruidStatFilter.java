package com.example.demo.config;

import com.alibaba.druid.support.http.WebStatFilter;

import javax.servlet.annotation.WebFilter;
import javax.servlet.annotation.WebInitParam;

/**
 *
 * 如果不使用 DruidConfig 中配置的Servlet和 Filter配置,也可以通过下面的监控器配置实现
 *
 * 配置监控拦截器(相当于 FilterRegistrationBean), druid监控拦截器
 *
 * @author 程思琦
 * @date 2019/8/23 17:02
 **/
/*
@WebFilter(filterName = "druidWebStatFilter",
urlPatterns = "/*",
initParams = {
    @WebInitParam(name = "exclusions", value = "*.js,*.gif,*.jpg,*.png,*.css,*.ico,/druid/*"), // 忽略资源
})
public class DruidStatFilter extends WebStatFilter {
}
*/
