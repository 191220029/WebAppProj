package com.springboot.sprintboottest.controller;

import com.springboot.sprintboottest.Entity.roleBaseInfo;
import com.springboot.sprintboottest.Entity.roleElement;
import com.springboot.sprintboottest.Entity.user;
import com.springboot.sprintboottest.Repository.RoleBaseInfoRepository;
import com.springboot.sprintboottest.Repository.RoleElementRepository;
import com.springboot.sprintboottest.Repository.RoleRepository;
import com.springboot.sprintboottest.Repository.UserRepository;
import jxl.write.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import com.springboot.sprintboottest.Entity.role;

import javax.servlet.http.HttpServletRequest;
import java.io.*;

@Controller
public class RolesTableController {
    @RequestMapping("/table")
    public String rolesTableController(HttpServletRequest request, Model model){
        //Object UserId = request.getSession().getAttribute("UserId");
        //System.out.println(UserId.toString());
        //Collection<role> roles = roleRepository.findRoles(Integer.valueOf(UserId.toString()));
        //System.out.println(roles);
        //String string = roles.toString().replace('=', ':')
        //        .replace("role{","{");
        //System.out.println(string);

        //model.addAttribute("roles", string);
        Object UserId = request.getSession().getAttribute("UserId");
        model.addAttribute("UserId", UserId);
        return "table";
    }

    @GetMapping("/table/roleInfo")
    public String roleInfoController(HttpServletRequest request, Model model){
        Object UserId = request.getSession().getAttribute("UserId");
        model.addAttribute("UserId", UserId);
        return "roleInfo";
    }

    @Autowired
    RoleRepository roleRepository;
    @Autowired
    UserRepository userRepository;
    @Autowired
    RoleBaseInfoRepository roleBaseInfoRepository;
    @Autowired
    RoleElementRepository roleElementRepository;
    @ResponseBody
    @RequestMapping("/table/deleteRole")
    public String deleteRoleController(
            @RequestParam("ID") Integer ID
    ){
        roleRepository.deleteRoleById(ID);
        return "OK";
    }

    @ResponseBody
    @RequestMapping("/table/downloadCSV")
    public String downloadRoleCSV(
            @RequestParam("ID") Integer ID
    )throws IOException, WriteException {
        role r = roleRepository.findRole(ID);
        roleBaseInfo rbi = roleBaseInfoRepository.findRolebaseinfo_id(r.getRoleCardId());
        roleElement re = roleElementRepository.findRoleElement_id(r.getRoleCardId());
        user u = userRepository.findByUserId(r.getRoleCardPlayerId());
        String dir = (new File("").getAbsolutePath())+"\\serverfs\\cards\\";
        return XLSWriter.cardToXLS(r, u, rbi, re, dir);
    }

}
