package com.springboot.sprintboottest.controller;

import com.springboot.sprintboottest.Entity.user;
import com.springboot.sprintboottest.Entity.role;
import com.springboot.sprintboottest.Entity.roleBaseInfo;
import com.springboot.sprintboottest.Repository.UserRepository;
import com.springboot.sprintboottest.Repository.RoleBaseInfoRepository;
import com.springboot.sprintboottest.Repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.util.List;

@Controller
public class RoleTable_Admin_Controller {
    @Autowired
    UserRepository userRepository;
    @Autowired
    RoleBaseInfoRepository roleBaseInfoRepository;

    @GetMapping("/admin/userTable")
    public String adminUserTable(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //返回管理员搜索角色卡页面的html文件名
        Object userId = request.getSession().getAttribute("UserId");
        user u = userRepository.findByUserId(Integer.parseInt(userId.toString()));
        if(u.getUserPrivilegeLevel() <= 10)
            return "admin";
        else {
            return "/index";
        }
    }


    @ResponseBody
    @RequestMapping("/admin/userTable/all")
    public List<user> adminSearchUserTable(){
        List<user> users = userRepository.findAllUsers();
        return users;
    }

//findByUserName(@Param("username") String username);
    @ResponseBody
    @RequestMapping("/admin/userTable/search")
    public List<user> adminSearchUser(
            @RequestParam("username") String username
    )
    {
        //返回查找结果
        return userRepository.searchByUserName(username);
    }

    @ResponseBody
    @RequestMapping("/admin/userTable/delete")
    public String adminDeleteUser(
            @RequestParam("userId") Integer userId
    ){
        user u = userRepository.findByUserId(userId);
        if(u.getUserPrivilegeLevel() <= 10)
            return "您不能封禁管理员账号。";
        userRepository.deleteById(userId);
        return "TRUE";
    }
}
