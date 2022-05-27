package com.springboot.sprintboottest.controller;

import com.springboot.sprintboottest.Entity.user;
import com.springboot.sprintboottest.Entity.role;
import com.springboot.sprintboottest.Entity.roleBaseInfo;
import com.springboot.sprintboottest.Repository.UserRepository;
import com.springboot.sprintboottest.Repository.RoleBaseInfoRepository;
import com.springboot.sprintboottest.Repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class RoleTable_Admin_Controller {
    @Autowired
    UserRepository userRepository;
    @Autowired
    RoleBaseInfoRepository roleBaseInfoRepository;

    @GetMapping("/admin/roleTable")
    public String adminUserTable(){
        //TODO: 返回管理员搜索角色卡页面的html文件名
        return "admin";
    }


    @ResponseBody
    @RequestMapping("/admin/roleTable")
    public List<user> adminSearchUserTable(){

        List<user> users = userRepository.findAllUsers();
        return users;
    }


    @ResponseBody
    @RequestMapping("/admin/roleTable/search")
    public List<roleBaseInfo> adminSearchRole(
            @RequestParam("adminId") Integer adminId,
            @RequestParam("mod") String mod,
            @RequestParam("keyword") String keyword
    )
    {
        //TODO: 返回查找结果
        return null;
    }
}
