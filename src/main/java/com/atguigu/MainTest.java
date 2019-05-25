package com.atguigu;

import com.atguigu.bean.Person;
import org.springframework.context.ApplicationContext;
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
    }
}
