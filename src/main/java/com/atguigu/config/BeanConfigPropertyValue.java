package com.atguigu.config;

import com.atguigu.bean.Person;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

/**
 * Created by daynew on 2019/5/26.
 */
@Component
@PropertySource(value = {"person.properties"})
public class BeanConfigPropertyValue {

    @Bean
    public Person personPropertyValue(){
        return new Person();
    }
}
