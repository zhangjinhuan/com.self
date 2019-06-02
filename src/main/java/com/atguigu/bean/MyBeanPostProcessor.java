package com.atguigu.bean;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.stereotype.Component;

/**
 * Created by daynew on 2019/5/26.
 */
@Component
public class MyBeanPostProcessor implements BeanPostProcessor {
    //bean:容器先建的bean，beanName:该bean的name
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        System.out.println("MyBeanPostProcessor前置通知-" + bean + "-----" + beanName);
        return bean;
    }

    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        System.out.println("MyBeanPostProcessor后置通知-" + bean + "-----" + beanName);
        return bean;
    }
}
