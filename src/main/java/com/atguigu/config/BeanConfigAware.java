package com.atguigu.config;

import com.atguigu.bean.MyAware_ApplicationContextAware;
import com.atguigu.bean.MyAware_BeanNameAware;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

/**
 * Created by daynew on 2019/6/1.
 */
@Configuration
@ComponentScan(value = "com.atguigu")
//@Import({MyAware_ApplicationContextAware.class, MyAware_BeanNameAware.class})
public class BeanConfigAware {
}
