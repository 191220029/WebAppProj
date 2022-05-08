package com.springboot.sprintboottest.controller;

import com.springboot.sprintboottest.Entity.user;
import com.springboot.sprintboottest.Repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;

@Controller
public class UserInfoController {
    @GetMapping("/userInfo")
    public String userInfo(HttpServletRequest request, Model model){
        Object UserId = request.getSession().getAttribute("UserId");
        model.addAttribute("UserId", UserId);
        return "userInfo";
    }

    @Autowired
    UserRepository userRepository;
    @ResponseBody
    @RequestMapping("/userInfo")
    public user getUserById(
            @RequestParam("userId") Integer userId
    ){
        return userRepository.findByUserId(userId);
    }
}
