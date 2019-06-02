package com.atguigu.config;

import com.atguigu.bean.Color;
import com.atguigu.bean.MyBeanPostProcessor;
import com.atguigu.bean.Person;
import com.atguigu.condition.LinuxCondition;
import com.atguigu.condition.WindowsCondition;
import org.springframework.context.annotation.*;
import org.springframework.stereotype.Controller;

/**
 * Created by daynew on 2019/5/25.
 */
@Configuration
/*@ComponentScan(value = "com.atguigu",includeFilters = {
        @ComponentScan.Filter(type = FilterType.ANNOTATION,classes = {Controller.class})
        @ComponentScan.Filter(type = FilterType.CUSTOM,classes = {MyTypeFilter.class})//自定义扫描规则
},useDefaultFilters=false)*/

@Conditional({WindowsCondition.class})//配置在类上，表示满足条件则这个类中配置的所有bean注册的才生效，不满足里面的所有都不生效
@Import({Color.class,MyBeanPostProcessor.class})//导入组件，id默认为组件的全类名
public class BeanConfig {
    @Conditional({WindowsCondition.class})//配置在方法上
    @Bean(value = "Bill")
    public Person person01(){
        return new Person("Bill Gates","50");
    }
    @Conditional({LinuxCondition.class})
    @Bean("Linus")
    public Person person02(){
        return new Person("Linus","40");
    }
    @Bean("person2")
    public Person getPerson(){
        return new Person("李四","19");
    }
}
