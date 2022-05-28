package com.springboot.sprintboottest.controller;

import com.springboot.sprintboottest.Entity.user;
import com.springboot.sprintboottest.Repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import javax.servlet.http.HttpSession;
import java.text.SimpleDateFormat;
import java.util.Date;

@Controller
public class LoginController {

    @GetMapping("/login")
    public String Login(){
        return "login";
    }

    @Autowired
    UserRepository userRepository;
    @RequestMapping("/user/login")
    public String userLogin(
            @RequestParam("username")String username,
            @RequestParam("password")String password,
            Model model, HttpSession session){
        //System.out.println(username+password);
        //判断账号密码是否正确
        user u = userRepository.findByUserName(username);
        //用户不存在
        if(u == null){
            model.addAttribute("msg", "不存在该用户");
            return "login";
        }
        //密码正确
        else if(password.equals(u.getUserPassword())){
            session.setAttribute("loginUser", username);
            session.setAttribute("UserId", u.getUserId());
            session.setAttribute("lastLoginTime", u.getUserLastLoginTime());
            session.setAttribute("privilegeLevel", u.getUserPrivilegeLevel());
        if(u.getUserIconPath() == null || u.getUserIconPath().equals("null"))
            session.setAttribute("photo", "/serverfs/img/usricon/default.jpg");
        else
            session.setAttribute("photo", u.getUserIconPath());
        if(u.getUserAssignment() == null)
            session.setAttribute("assignment", "");
        else
            session.setAttribute("assignment", u.getUserAssignment());
        //System.out.println(u.getUserIconPath());
        Date date = new Date();
        SimpleDateFormat ft = new SimpleDateFormat("yyyy-MM-dd");
        userRepository.setLoginTime(ft.format(date), u.getUserId());
        return "redirect:/index";
    }
        //密码错误
        else {
            model.addAttribute("msg", "密码错误");
            return "login";
        }
    }
}
