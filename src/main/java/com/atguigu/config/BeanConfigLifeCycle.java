package com.atguigu.config;

import com.atguigu.bean.Car;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**bean的生命周期
 * 通常是容器管理bean的生命周期
 * 也可自定义bean的初始化和销毁方法
 * Created by daynew on 2019/5/26.
 */
@Configuration
@ComponentScan(value = "com.atguigu")
public class BeanConfigLifeCycle {
    @Bean(initMethod = "init",destroyMethod = "destroy")//指定bean的初始化和销毁方法
    public Car getCar(){
        return new Car();
    }
}
