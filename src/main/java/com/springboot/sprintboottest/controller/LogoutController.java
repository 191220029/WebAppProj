package com.springboot.sprintboottest.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.support.SessionStatus;

import javax.servlet.http.HttpSession;

@Controller
public class LogoutController {
    @RequestMapping("user/logout")
    public String userLogout(HttpSession session, SessionStatus sessionStatus){
        session.invalidate();
        sessionStatus.setComplete();
        return "redirect:/login";
    }

}
