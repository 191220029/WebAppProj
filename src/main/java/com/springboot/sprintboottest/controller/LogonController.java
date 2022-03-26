package com.springboot.sprintboottest.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class LogonController {
    @GetMapping("/logon")
    public String Logon(){
        return "logon";
    }
}
