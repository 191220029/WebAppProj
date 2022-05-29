package com.springboot.sprintboottest.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.Arrays;

@Controller
public class IndexController {
    @RequestMapping("/test")
    public String test(Model model){
        model.addAttribute("msg", "<h2>hello, spring-boot<h2>");
        model.addAttribute("users", Arrays.asList("a", "b", "c"));
        return "test";
    }

    @RequestMapping("/index")
    public String index(HttpServletRequest request, HttpSession session){
//        Object loginUser = request.getSession().getAttribute("loginUser");
//        Object userId = request.getSession().getAttribute("UserId");
//        session.setAttribute("loginUser", loginUser);
//        session.setAttribute("UserId", userId);
        return "index";
    }
}
