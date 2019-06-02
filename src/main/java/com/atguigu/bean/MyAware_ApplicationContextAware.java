package com.atguigu.bean;

import com.atguigu.util.PrintTrackUtil;
import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

/**
 * Created by daynew on 2019/6/1.
 */
@Service
public class MyAware_ApplicationContextAware implements ApplicationContextAware {
    private ApplicationContext applicationContext;
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        //PrintTrackUtil.printTrack("applicationContext is set to" + applicationContext);
        this.applicationContext=applicationContext;
    }

    public ApplicationContext getApplicationContext() {
        return applicationContext;
    }
}
