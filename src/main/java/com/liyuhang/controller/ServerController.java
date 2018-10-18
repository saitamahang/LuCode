package com.liyuhang.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


/**
 * 服务controller
 * 
 * @author LiYuHang
 * @version 1.0
 * @since 2018/07/24
 */
@Controller
@RequestMapping("/home")
public class ServerController
{
    @RequestMapping("/")
    String get()
    {
        // mapped to hostname:port/home/
        System.out.println("hello" + "");
        return "Hello";
    }

    @RequestMapping("/index")
    String index()
    {
        // mapped to hostname:port/home/index/
        return "Hello from index";
    }

    @RequestMapping("/new")
    public void none()
    {
        System.out.println("springMVC" + "");
    }
}
