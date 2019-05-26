package com.atguigu.bean;

import org.springframework.beans.factory.annotation.Value;

/**
 * Created by daynew on 2019/5/25.
 */
public class Person {
    //使用@Value给bean属性赋值
    //1.基本数值
    //2.可用SlEl #{}
    //3.可用${}取出配置文件或在运行环境变量里面的值
    @Value("王五")
    private String name ;
    @Value("#{88+2}")
    private String age;
    @Value("${person.nickName}")
    private String nickName;

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    public Person() {
    }

    public Person(String name, String age,String nickName) {
        this.name = name;
        this.age = age;
        this.nickName = nickName;
    }
    public Person(String name, String age) {
        this.name = name;
        this.age = age;
        this.nickName = nickName;
        this.nickName = nickName;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age='" + age + '\'' +
                ", nickName='" + nickName + '\'' +
                '}';
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getName() {

        return name;
    }

    public String getAge() {
        return age;
    }
}
