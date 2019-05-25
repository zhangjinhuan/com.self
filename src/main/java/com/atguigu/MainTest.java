package com.atguigu;

import com.atguigu.bean.Person;
import com.atguigu.com.atguigu.config.MainConfig;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by daynew on 2019/5/25.
 */
public class MainTest {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("bean.xml");
        Person person1 = applicationContext.getBean(Person.class);//通过类名
        Person person2 = (Person)applicationContext.getBean("person");//通过id
        System.out.println(person1 + "---" + person2 + "++++" + (person1==person2));

        ApplicationContext applicationContext1 = new AnnotationConfigApplicationContext(MainConfig.class);
        Person person3 = applicationContext1.getBean(Person.class);
        String[] names = applicationContext1.getBeanNamesForType(Person.class);//通过id
        for (String name:names
             ) {
            System.out.println(name);
        }
        System.out.println(person3 + "---"  + "++++" );


    }
}
