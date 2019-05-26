package com.atguigu.controller;

import com.atguigu.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

/**
 * Created by daynew on 2019/5/25.
 */
@Controller
public class BookController {
    @Autowired
    public BookService bookService;
}
