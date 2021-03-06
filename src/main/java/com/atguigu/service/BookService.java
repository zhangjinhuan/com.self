package com.atguigu.service;

import com.atguigu.dao.BookDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * Created by daynew on 2019/5/25.
 */
@Service
public class BookService {
    //@Qualifier(value = "bookDao")//指定要装配的bean名字
   // @Autowired(required = false)//required指定是不是必须要有该bean
    @Resource(name = "bookDao2")//默认按照名字装配，
    public BookDao bookDao;

    @Override
    public String toString() {
        return "BookService{" +
                "bookDao=" + bookDao +
                '}';
    }
}
