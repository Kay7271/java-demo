package com.atguigu.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author Kay
 * @CreateTime 2022-07-31 14:01
 * @Description
 */
@RestController
public class Counter {

    @Autowired
    StringRedisTemplate redisTemplate;

    @RequestMapping("/hello")
    public String counter(){

        Long increment = redisTemplate.opsForValue().increment("count-people");

        return "当前页面被访问了【"+increment+"】次！！！";
    }

}
