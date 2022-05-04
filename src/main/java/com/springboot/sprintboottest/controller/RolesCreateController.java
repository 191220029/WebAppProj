package com.springboot.sprintboottest.controller;

import com.springboot.sprintboottest.Repository.RoleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class RolesCreateController {
    @Autowired
    RoleRepository roleRepository;
    @GetMapping("/rolecreate")
    public String rolesCreateController(){
        return "rolecreate";
    }
}
