package com.atguigu.test;

import com.atguigu.bean.MyAware_ApplicationContextAware;
import com.atguigu.bean.MyAware_BeanNameAware;
import com.atguigu.config.BeanConfigAware;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;

/**
 * Created by daynew on 2019/6/1.
 */
/*@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes ={BeanConfigAware.class})*/
public class AwareTest {
    ApplicationContext ac = new AnnotationConfigApplicationContext(BeanConfigAware.class);
    /*@Resource//无法获取容器中的这两个bean，原因是单元测试里不能使用，可以使用spring的单元测试
    private MyAware_ApplicationContextAware myAware_ApplicationContextAware;
    @Autowired
    private MyAware_BeanNameAware myAware_BeanNameAware;*/
    @Test
    public void awareTest() {

        MyAware_ApplicationContextAware myAware_applicationContextAware = (MyAware_ApplicationContextAware) ac.getBean("myAware_ApplicationContextAware");
        MyAware_BeanNameAware myAware_beanNameAware = (MyAware_BeanNameAware) ac.getBean("myAware_BeanNameAware");
        //获取容器中所有的bean名字
        String[] beanDefinitionNames = myAware_applicationContextAware.getApplicationContext().getBeanDefinitionNames();
        StringBuffer sbf = new StringBuffer();
        if(null != beanDefinitionNames){
            //将所有的bean名字拼接成字符串
            for (String beanName : beanDefinitionNames){
                sbf.append(beanName).append("--").append("\n");
            }
        }

        System.out.println("beanNameAware 实例的bean名字" + myAware_beanNameAware.getBeanName()
        + "容器中定义的bean的长度：" + beanDefinitionNames.length
        + "名字：" + sbf);
    }
}
