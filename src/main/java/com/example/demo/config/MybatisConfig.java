package com.example.demo.config;

import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.Resource;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;

import javax.sql.DataSource;

/**
 * mybatis 配置类
 * 配置相关扫描路径, 包括DAO, Model, XML映射文件的扫描
 *
 * @author 程思琦
 * @date 2019/8/22 10:56
 * @description
 **/
@Configuration
@MapperScan("com.example.demo.dao")
public class MybatisConfig {

    @Autowired
    private DataSource dataSource;

    @Bean
    public SqlSessionFactory sqlSessionFactory() throws Exception {
        SqlSessionFactoryBean sessionFactoryBean = new SqlSessionFactoryBean();
        sessionFactoryBean.setDataSource(dataSource);
        // 扫描Model
        sessionFactoryBean.setTypeAliasesPackage("com.example.demo.model");

        // 扫描xml映射文件( 可以改为在配置文件application.yml中配置 )
        PathMatchingResourcePatternResolver resolver = new PathMatchingResourcePatternResolver();
        Resource[] resources = resolver.getResources("classpath*:**/sqlmap/*.xml");
        sessionFactoryBean.setMapperLocations(resources);

        return  sessionFactoryBean.getObject();
    }
}
