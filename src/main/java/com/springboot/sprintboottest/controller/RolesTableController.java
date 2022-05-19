package com.springboot.sprintboottest.controller;

import com.springboot.sprintboottest.Repository.RoleRepository;
import jxl.Workbook;
import jxl.write.WritableWorkbook;
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
    ) throws IOException {
        role r = roleRepository.findRole(ID);
        String dir = "E:\\本科\\SpringBoot\\sprintboot-test\\serverfs\\cards\\";
        File xlsFile = new File(dir);
        if(!xlsFile.exists())
            xlsFile.mkdir();
        xlsFile = new File(dir + ID.toString() + ".xls");
        WritableWorkbook workbook = Workbook.createWorkbook(xlsFile);
        workbook.createSheet("角色卡", 1);
        return xlsFile.getPath().substring(xlsFile.getPath().indexOf("\\serverfs"));
    }

}
