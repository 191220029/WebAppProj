package com.springboot.sprintboottest.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Date;

@Controller
public class TestController {
    @GetMapping("/test")
    public String test(){
        return "test";
    }

    @RequestMapping("/testRequest")
    @ResponseBody
    public Date testRequest(){
        Date date = new Date();
        return date;
    }
}
