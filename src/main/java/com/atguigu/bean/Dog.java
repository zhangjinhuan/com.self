package com.atguigu.bean;

import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

/**
 * Created by daynew on 2019/5/26.
 */
@Component("dogBean")
public class Dog {
    public Dog() {
        System.out.println("Dog的无参构造");
    }
    @PostConstruct
    public void start(){
        System.out.println("Dog初始化方法");
    }
    @PreDestroy
    public void end(){
        System.out.println("Dog销毁方法");
    }
}
