package com.atguigu.test;

import com.atguigu.config.BeanConfig;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by daynew on 2019/5/25.
 */
public class IOCTest {
    @Test
    public void test01(){
        //ApplicationContext ac = new ClassPathXmlApplicationContext("bean.xml");
        ApplicationContext ac = new AnnotationConfigApplicationContext(BeanConfig.class);
        String[] beanNames = ac.getBeanDefinitionNames();
        for(String beanName:beanNames){
            System.out.println(beanName);
        }
    }
}
