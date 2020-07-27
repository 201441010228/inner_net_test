package com.zy.test.inner_net.controller;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

@RestController
public class FindEatDinner {


    private static final Map<Integer, Long> map = new HashMap<>(16);


    @RequestMapping(value = "random")
    private Object random() {
       Random r = new Random();
       return "这次随机数是" + r.nextInt(10);
    }
}
