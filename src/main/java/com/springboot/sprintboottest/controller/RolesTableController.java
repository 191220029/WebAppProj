package com.springboot.sprintboottest.controller;

import com.springboot.sprintboottest.Entity.role;
import com.springboot.sprintboottest.Repository.RoleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import java.util.Collection;
import java.util.List;

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



}
