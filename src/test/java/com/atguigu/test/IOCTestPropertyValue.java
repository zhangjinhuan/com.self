package com.atguigu.test;

import com.atguigu.config.BeanConfigPropertyValue;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Created by daynew on 2019/5/26.
 */
public class IOCTestPropertyValue {
    AnnotationConfigApplicationContext ac = new AnnotationConfigApplicationContext(BeanConfigPropertyValue.class);

    @Test
    public void testPropertyValue01() {
        Object personPropertyValue = ac.getBean("personPropertyValue");
        System.out.println(personPropertyValue);
    }


}
