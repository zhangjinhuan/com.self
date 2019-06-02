package com.atguigu.test;

import com.atguigu.config.BeanConfigProfile;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Created by daynew on 2019/5/26.
 */
public class IOCTestProfie {
    @Test
    public void testProfile(){
        AnnotationConfigApplicationContext ac = new AnnotationConfigApplicationContext();
        ac.getEnvironment().setActiveProfiles("test", "dev");
        ac.register(BeanConfigProfile.class);
        ac.refresh();
        String[] beanDefinitionNames = ac.getBeanDefinitionNames();
        for(String name : beanDefinitionNames){
            System.out.println(name);
        }
    }
}
