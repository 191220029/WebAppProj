package com.springboot.sprintboottest.controller;

import com.springboot.sprintboottest.Repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpSession;

@Controller
public class LogonController {
    @GetMapping("/logon")
    public String Logon(){
        return "logon";
    }

    @Autowired
    UserRepository userRepository;
    @RequestMapping("/user/logon")
    public String userLogon(
            @RequestParam("username")String username,
            Model model, HttpSession session){
        if(username.isEmpty()){
            model.addAttribute("msg", "用户名不能为空");
            return "logon";
        }
        return "login";
    }
}
