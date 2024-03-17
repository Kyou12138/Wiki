package com.kyou.wiki.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

//    @RequestMapping(value = "/user/1", method = RequestMethod.GET)
    @GetMapping("/hello")
    public String hello(){
        return "Hello World!";
    }
}
