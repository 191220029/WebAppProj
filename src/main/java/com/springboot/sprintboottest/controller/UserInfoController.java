package com.springboot.sprintboottest.controller;

import com.springboot.sprintboottest.Entity.user;
import com.springboot.sprintboottest.Repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

@Controller
public class UserInfoController {
    @GetMapping("/userInfo")
    public String userInfo(HttpServletRequest request, Model model) {
        Object UserId = request.getSession().getAttribute("UserId");
        model.addAttribute("UserId", UserId);
        Object photo = request.getSession().getAttribute("photo");
        model.addAttribute("photo", photo);
        return "userInfo";
    }

    @Autowired
    UserRepository userRepository;

    @ResponseBody
    @RequestMapping("/userInfo")
    public user getUserById(
            @RequestParam("userId") Integer userId
    ) {
        return userRepository.findByUserId(userId);
    }

    @ResponseBody
    @RequestMapping("/userInfo/updateBaseInfo")
    public String updateBaseInfo(
            @RequestParam("userAssignment") String user_assignment,
            @RequestParam("userEmail") String user_email,
            @RequestParam("userGender") Integer user_gender,
            @RequestParam("userName") String user_name,
            @RequestParam("userId") Integer userId,
            HttpSession session
    ) {
        userRepository.updateBaseInfo(user_assignment, user_email, user_gender, user_name, userId);
        session.setAttribute("loginUser", user_name);
        return "OK";
    }

    @ResponseBody
    @RequestMapping("/userInfo/updatePassword")
    public String updatePassword(
            @RequestParam("oldPassword") String oldPassword,
            @RequestParam("password") String password,
            @RequestParam("userId") Integer userId
    ) {
        user userInfo = userRepository.getById(userId);
        if (userInfo.getUserPassword().equals(oldPassword)) {
            userRepository.updatePassword(password, userId);
            return "OK";
        }
        else
            return "原密码错误";
    }
}
