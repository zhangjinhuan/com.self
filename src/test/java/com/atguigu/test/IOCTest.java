package com.atguigu.test;

import com.atguigu.bean.Person;
import com.atguigu.config.BeanConfig;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.env.Environment;

import java.util.Map;

/**
 * Created by daynew on 2019/5/25.
 */
public class IOCTest {
    ApplicationContext ac = new AnnotationConfigApplicationContext(BeanConfig.class);

    @Test
    public void test02(){
        String[] beanDefinitionNames = ac.getBeanDefinitionNames();
        Environment environment = ac.getEnvironment();
        String osName = environment.getProperty("os.name");
        //System.out.println("当前操作系统：" + osName);
        for (String bean:beanDefinitionNames) {
            System.out.println(bean);
        }

    }
    @Test
    public void test01(){
        //ApplicationContext ac = new ClassPathXmlApplicationContext("bean.xml");
        String[] beanNames = ac.getBeanDefinitionNames();
        for(String beanName:beanNames){
            System.out.println(beanName);
        }
    }
}
