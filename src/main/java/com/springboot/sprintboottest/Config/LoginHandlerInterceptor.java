package com.springboot.sprintboottest.Config;

import org.springframework.web.servlet.HandlerInterceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class LoginHandlerInterceptor implements HandlerInterceptor {
    @Override
    public boolean preHandle(HttpServletRequest request,
                             HttpServletResponse response, Object handler)
            throws Exception{
        //登陆成功后应该有用户的session
        Object loginUser = request.getSession().getAttribute("loginUser");
        if(loginUser == null){
            request.setAttribute("msg","没有访问权限，请先登录");
            request.getRequestDispatcher("/login").forward(request, response);
            return false;
        }
        return true;
    }
}
