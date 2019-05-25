package com.atguigu.com.atguigu.config;

import com.atguigu.bean.Person;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

/**
 * Created by daynew on 2019/5/25.
 */
@Configuration
public class MainConfig {

    @Bean(value = "person3")//加上value属性，bean名字为value值，不加则为方法名
    public Person getPerson(){
        return new Person("李四","19");
    }
}
