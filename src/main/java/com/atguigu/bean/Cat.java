package com.atguigu.bean;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.stereotype.Component;

/**通过实现InitializingBean，DisposableBean两个接口定义bean的初始化和销毁方法
 * Created by daynew on 2019/5/26.
 */
@Component(value = "catBean")
public class Cat implements InitializingBean,DisposableBean {
    public Cat() {
        System.out.println("Cat的无参构造");
    }

    public void destroy() throws Exception {
        System.out.println("Cat的销毁方法");
    }

    public void afterPropertiesSet() throws Exception {
        System.out.println("Cat的初始化方法");
    }
}
