package com.atguigu.condition;

import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.context.annotation.Condition;
import org.springframework.context.annotation.ConditionContext;
import org.springframework.core.env.Environment;
import org.springframework.core.io.ResourceLoader;
import org.springframework.core.type.AnnotatedTypeMetadata;

/**
 * Created by daynew on 2019/5/26.
 */
public class WindowsCondition implements Condition{
    public boolean matches(ConditionContext conditionContext, AnnotatedTypeMetadata annotatedTypeMetadata) {
        //
        ConfigurableListableBeanFactory beanFactory = conditionContext.getBeanFactory();
        //
        ClassLoader classLoader = conditionContext.getClassLoader();
        //获取注册类信息
        BeanDefinitionRegistry registry = conditionContext.getRegistry();
        if(registry.containsBeanDefinition("person")){
            System.out.println("包含person的bean。。。。");
        }
        //
        Environment environment = conditionContext.getEnvironment();
        String property = environment.getProperty("os.name");
        if (property.contains("Windows")){
            return true;
        }
        //ResourceLoader resourceLoader = conditionContext.getResourceLoader();
        return false;
    }
}
