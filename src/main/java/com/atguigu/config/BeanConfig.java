package com.atguigu.config;

import com.atguigu.bean.Person;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;
import org.springframework.stereotype.Controller;

/**
 * Created by daynew on 2019/5/25.
 */
@Configuration
@ComponentScan(value = "com.atguigu",excludeFilters = {
        @ComponentScan.Filter(type = FilterType.ANNOTATION,classes = {Controller.class})
})
public class BeanConfig {
    @Bean("person2")
    public Person getPerson(){
        return new Person("李四","19");
    }
}
