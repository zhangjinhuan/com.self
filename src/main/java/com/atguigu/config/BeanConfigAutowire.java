package com.atguigu.config;

import com.atguigu.dao.BookDao;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

/**
 * Created by daynew on 2019/5/26.
 */
@Configuration
@ComponentScan({"com.atguigu.controller","com.atguigu.service","com.atguigu.dao"})
public class BeanConfigAutowire {
    @Primary//优先装配标注了此注解的bean
    @Bean("bookDao2")
    public BookDao bookDao(){
        BookDao dao = new BookDao();
        dao.setLabel("2");
        return dao;
    }
}
