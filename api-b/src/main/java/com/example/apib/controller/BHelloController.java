package com.example.apib.controller;

import com.example.base.entity.BaseUser;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BHelloController {

    BaseUser user;

    @RequestMapping("/hello")
    public String hello(String name){
        return name;
    }
}
