package com.example.demo.config;

import com.alibaba.druid.support.http.StatViewServlet;

import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;

/**
 * 如果不使用 DruidConfig 中配置的Servlet和 Filter配置,也可以通过下面的监控器配置实现
 *
 * 配置Druid监控视图(相当于 ServletRegistrationBean)
 *
 * @author 程思琦
 * @date 2019/8/23 17:08
 **/
/*
@WebServlet(urlPatterns = "/druid/*",
initParams = {
        @WebInitParam(name = "allow", value = "127.0.0.1"), // IP白名单 ( 没有配置或者为空, 则允许所有访问)
        @WebInitParam(name = "deny", value = "192.168.21.43"),  // IP黑名单 ( 存在共同时, deny优先于allow)
        @WebInitParam(name = "loginUsername", value = "admin"), // 用户名
        @WebInitParam(name = "loginPassword", value = "admin"), // 密码
        @WebInitParam(name = "resetEnable", value = "true"),    // 禁用HTML页面上的"Reset All" 功能
})
public class DruidStatViewServlet extends StatViewServlet {
}
*/
