package com.springboot.sprintboottest.controller;

import com.springboot.sprintboottest.Entity.user;
import com.springboot.sprintboottest.Repository.UserRepository;
import org.aspectj.bridge.Message;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpSession;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

@Controller
public class LogonController {
    @GetMapping("/logon")
    public String Logon(){
        return "logon";
    }

    @Autowired
    UserRepository userRepository;
    @ResponseBody
    @RequestMapping("/user/logon")
    public String userLogon(
            @RequestParam("username")String username,
            @RequestParam("password")String password,
            @RequestParam("gender")Integer gender,
            @RequestParam("assignment")String assignment,
            @RequestParam("email")String email,
            @RequestParam("icon_path")String icon_path,
            Model model, HttpSession session
    )
    {
        Date date = new Date();
        SimpleDateFormat ft = new SimpleDateFormat("yyyy-MM-dd");
        Integer res = userRepository.insertUser(username, password, gender, assignment, email, icon_path, ft.format(date));
        List<user> users = userRepository.findsByUserName(username);
        //System.out.println(users);
        if(users.isEmpty()){
            model.addAttribute("msg", "不存在该用户");
            return "FALSE";
        }
        else {
            session.setAttribute("loginUser", users.get(0).getUserName());
            session.setAttribute("UserId", users.get(0).getUserId());
            return "OK";
        }
    }
}
