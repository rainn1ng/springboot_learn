package com.example.helloworld.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Copyright (c) $today.year. Shanghai Zhenhui Information Technology Co,. ltd. All rights are reserved.
 * <p>
 * 描述：
 * Created by rain.wang on 2019/8/5 - 10:42 AM
 *
 * @author rain.wang
 */

@RestController
public class HelloWorldController {
    @GetMapping("hello")
    public String hello(){
        return "hello world";
    }
}