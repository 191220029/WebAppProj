package com.springboot.sprintboottest.Config;

import com.springboot.sprintboottest.Entity.user;
import com.springboot.sprintboottest.Repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.servlet.HandlerInterceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class AdminHandlerInterceptor implements HandlerInterceptor {
    @Autowired
    UserRepository userRepository;
    @Override
    public boolean preHandle(HttpServletRequest request,
                             HttpServletResponse response, Object handler)
            throws Exception{
        Object loginUser = request.getSession().getAttribute("loginUser");
        user u = userRepository.findByUserName(loginUser.toString());
        if(u.getUserPrivilegeLevel() > 10){
            request.getRequestDispatcher("/index").forward(request, response);
            return false;
        }
        return true;
    }
}
