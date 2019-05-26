package com.atguigu.bean;

/**
 * Created by daynew on 2019/5/26.
 */
public class Car {
    public Car() {
        System.out.println("Car无参构造。。。");
    }
    public void init(){
        System.out.println("Car初始化方法。。。");
    }
    public void destroy(){
        System.out.println("Car的销毁方法。。。");
    }
}
