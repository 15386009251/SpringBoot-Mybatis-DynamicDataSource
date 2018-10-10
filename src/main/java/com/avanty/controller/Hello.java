package com.avanty.controller;

import com.avanty.dds.TargetDataSource;
import com.avanty.pojo.User1;
import com.avanty.pojo.User2;
import com.avanty.service.User1ServiceImpl;
import com.avanty.service.User2ServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author zhan
 */

@RestController
public class Hello {

    @Autowired
    User1ServiceImpl user1ServiceImpl;

    @Autowired
    User2ServiceImpl user2ServiceImpl;

    @RequestMapping("/hello")
    public String hello(){
        return "Hello World!";
    }

    @GetMapping("/user1")
    public User1 user1Select(String name){
        return user1ServiceImpl.find1ByName(name);
    }

    @GetMapping("/user2")
    public User2 user2Select(String name){
        return user2ServiceImpl.find2ByName(name);
    }

}
