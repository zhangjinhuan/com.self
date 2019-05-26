package com.atguigu.test;

import com.atguigu.config.BeanConfigLifeCycle;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Created by daynew on 2019/5/26.
 */
public class IOCTest_LifeCycle {
    AnnotationConfigApplicationContext ac = new AnnotationConfigApplicationContext(BeanConfigLifeCycle.class);

   @Test
   public void testDogLifeCycle(){
       Object dogBean = ac.getBean("dogBean");
       System.out.println("dog的bean的全类名 = " + dogBean.getClass().getName());
       /*for(String beanName:ac.getBeanDefinitionNames()){
           System.out.println("===" + beanName);
       }*/
       ac.close();
   }
    @Test
    public void test02(){
        //Object catBean = ac.getBean("cat");
        //System.out.println(catBean);
        ac.close();
    }
    @Test
    public void testCarLifeCycle(){
        Object getCar = ac.getBean("getCar");
        System.out.println(getCar.getClass().getName());
        ac.close();
    }
}
