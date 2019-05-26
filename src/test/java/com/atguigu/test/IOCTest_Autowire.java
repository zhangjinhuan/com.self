package com.atguigu.test;

import com.atguigu.config.BeanConfigAutowire;
import com.atguigu.service.BookService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Created by daynew on 2019/5/26.
 */
public class IOCTest_Autowire {
    AnnotationConfigApplicationContext ac = new AnnotationConfigApplicationContext(BeanConfigAutowire.class);

    @Test
    public void testAutowire(){
        BookService bookService = (BookService) ac.getBean("bookService");
        System.out.println(bookService);
        printBeanName(ac);
    }

    public void printBeanName(ApplicationContext ac){
        String[] beanDefinitionNames = ac.getBeanDefinitionNames();
        for (String beanName:beanDefinitionNames
             ) {
            System.out.println(beanName);
        }
    }
}
