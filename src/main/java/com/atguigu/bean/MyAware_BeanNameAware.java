package com.atguigu.bean;

import com.atguigu.util.PrintTrackUtil;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.stereotype.Component;

/**
 * Created by daynew on 2019/6/1.
 */
@Component
public class MyAware_BeanNameAware implements BeanNameAware {
    private String beanName;
    public void setBeanName(String beanName) {
        //PrintTrackUtil.printTrack("beanName is set to" + beanName);
        this.beanName=beanName;
    }

    public String getBeanName() {
        return beanName;
    }
}
