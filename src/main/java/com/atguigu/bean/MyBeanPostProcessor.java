package com.atguigu.bean;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.stereotype.Component;

/**
 * Created by daynew on 2019/5/26.
 */
@Component
public class MyBeanPostProcessor implements BeanPostProcessor {
    //o为bean对象，s为bean名字
    public Object postProcessBeforeInitialization(Object o, String s) throws BeansException {
        System.out.println("前置通知方法-" + o + "+" + s);
        return o;
    }

    public Object postProcessAfterInitialization(Object o, String s) throws BeansException {
        System.out.println("后置通知方法-" + o + "+" + s);
        return o;
    }
}
