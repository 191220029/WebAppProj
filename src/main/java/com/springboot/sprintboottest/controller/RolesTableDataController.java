package com.springboot.sprintboottest.controller;

import com.springboot.sprintboottest.Entity.role;
import com.springboot.sprintboottest.Entity.roleBaseInfo;
import com.springboot.sprintboottest.Entity.roleElement;
import com.springboot.sprintboottest.Entity.roleSkill;
import com.springboot.sprintboottest.Repository.RoleBaseInfoRepository;
import com.springboot.sprintboottest.Repository.RoleElementRepository;
import com.springboot.sprintboottest.Repository.RoleRepository;
import com.springboot.sprintboottest.Repository.RoleSkillRepository;
import javafx.util.Pair;
import org.apache.catalina.Role;
import org.apache.catalina.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.data.repository.query.Param;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.logging.ConsoleHandler;

@RestController
public class RolesTableDataController {

    @Autowired
    RoleRepository roleRepository;
    @GetMapping("/roles/UserId={UserId}")
    public List<role> rolesDataController(
            @PathVariable("UserId") Integer UserId
    ){
        //System.out.println(UserId);
        List<role> roles = roleRepository.findRoles(UserId);
        //System.out.println(roles);
        return roles;
    }

    @GetMapping("/rolesInfo/RoleCardId={RoleCardId}")
    public role roleInfo(
            @PathVariable("RoleCardId") Integer RoleCardId
    ){
        return roleRepository.findRole(RoleCardId);
    }

    @GetMapping("/roleInfo/defaultSkillValue")
    public role defaultSkillInfo(){
        return roleRepository.findRole(3);
    }

    @GetMapping("/roleBaseInfo/Edit/RoleCardId={RoleCardId}&Name={Name}&" +
            "Era={Era}&JobId={JobId}&Age={Age}&Gender={Gender}&" +
            "HomeAddress={HomeAddress}&Hometown={Hometown}")
    public String roleBaseInfoEdit(
            @PathVariable("RoleCardId") Integer RoleCardId,
            @PathVariable("Name") String Name,
            @PathVariable("Era") String Era,
            @PathVariable("JobId") Integer JobId,
            @PathVariable("Age") Integer Age,
            @PathVariable("Gender") Integer Gender,
            @PathVariable("HomeAddress") String HomeAddress,
            @PathVariable("Hometown") String Hometown
    ){
        roleRepository.updateRoleBaseInfo(RoleCardId, Name, Era, Gender, Age, JobId,
                HomeAddress, Hometown);
        return "OK";
    }

    @GetMapping("/roleElement/Edit/RoleCardId={RoleCardId}&RoleStr={RoleStr}" +
            "&RoleCon={RoleCon}&RoleSiz={RoleSiz}&RoleDex={RoleDex}&RoleApp={RoleApp}" +
            "&RoleInt={RoleInt}&RolePow={RolePow}&RoleLuck={RoleLuck}&RoleEdu={RoleEdu}" +
            "&RoleMov={RoleMov}")
    public String roleElementEdit(
            @PathVariable("RoleStr") Integer RoleStr,
            @PathVariable("RoleCon") Integer RoleCon,
            @PathVariable("RoleSiz") Integer RoleSiz,
            @PathVariable("RoleDex") Integer RoleDex,
            @PathVariable("RoleApp") Integer RoleApp,
            @PathVariable("RoleInt") Integer RoleInt,
            @PathVariable("RolePow") Integer RolePow,
            @PathVariable("RoleLuck") Integer RoleLuck,
            @PathVariable("RoleEdu") Integer RoleEdu,
            @PathVariable("RoleMov") Integer RoleMov,
            @PathVariable("RoleCardId") Integer RoleCardId){
        roleRepository.updateRoleElement(RoleStr, RoleCon, RoleSiz, RoleDex, RoleApp,
                RoleInt, RolePow, RoleLuck, RoleEdu, RoleMov, RoleCardId);
        return "OK";
    }

    @GetMapping("/roleStatus/Edit/RoleCardId={RoleCardId}&CurHitPoints={CurHitPoints}" +
            "&MaxHitPoints={MaxHitPoints}&CurSanity={CurSanity}&MaxSanity={MaxSanity}&CurMagic={CurMagic}" +
            "&MaxMagic={MaxMagic}&PhysicalStatus={PhysicalStatus}&MentalStatus={MentalStatus}")
    public String roleStatusEdit(
            @PathVariable("RoleCardId") Integer RoleCardId,
            @PathVariable("CurHitPoints") Integer CurHitPoints,
            @PathVariable("MaxHitPoints") Integer MaxHitPoints,
            @PathVariable("CurSanity") Integer CurSanity,
            @PathVariable("MaxSanity") Integer MaxSanity,
            @PathVariable("CurMagic") Integer CurMagic,
            @PathVariable("MaxMagic") Integer MaxMagic,
            @PathVariable("PhysicalStatus") String PhysicalStatus,
            @PathVariable("MentalStatus") String MentalStatus
    )    {
        roleRepository.updateRoleStatus(CurHitPoints, MaxHitPoints, CurSanity, MaxSanity,
                CurMagic, MaxMagic, PhysicalStatus, MentalStatus, RoleCardId);
        return "OK";
    }

    @Autowired
    RoleBaseInfoRepository roleBaseInfoRepository;
    @GetMapping("/rolesBaseInfo/UserId={UserId}")
    public List<roleBaseInfo> rolesBaseInfoDataController(
            @PathVariable("UserId") Integer UserId
    ){
        List<roleBaseInfo> roleBaseInfoList = roleBaseInfoRepository.findRolebaseinfo(UserId);
        return roleBaseInfoList;
    }
    @GetMapping("/rolesBaseInfo/RoleId={RoleId}")
    public  roleBaseInfo roleBaseInfoController(
            @PathVariable("RoleId") Integer RoleId
    ){
        return roleBaseInfoRepository.findRolebaseinfo_id(RoleId);
    }

    @Autowired
    RoleElementRepository roleElementRepository;
    @GetMapping("/roleElement/RoleId={RoleId}")
    public roleElement roleElementController(
            @PathVariable("RoleId") Integer RoleId
    ){
        return roleElementRepository.findRoleElement_id(RoleId);
    }


    @Autowired
    RoleSkillRepository roleSkillRepository;
    @GetMapping("/roleSkill/RoleId={RoleId}")
    public roleSkill roleSkillContronller(
            @PathVariable("RoleId") Integer RoleId
    ){
        return roleSkillRepository.findRoleSkill(RoleId);
    }

    @RequestMapping(value = "/roleSkill/modifyRoleSkillValue",
                    method = RequestMethod.POST,
                    produces = {"application/json;charset=UTF-8"})
    public String ModifyRoleSkillValue(
        //@RequestBody String body
        @RequestParam("roleCardId") Integer rcId,
        @RequestParam("inputValue") List<String> jsonValues
    ){
//        System.out.println(body);
        //System.out.println(rcId);
        List<Pair<String, String>> inputValues = new ArrayList<>();
        for(String s : jsonValues){
            //System.out.println(s);
            Pair<String, String> item = new Pair<String, String>(s.substring(s.indexOf('\"') + 1, s.indexOf('=')),
                    s.substring(s.indexOf('=') + 1, s.lastIndexOf('\"')));
            inputValues.add(item);
        }
//        for(Pair<String, String> item : inputValues)
//            System.out.println(item);
        return "OK";
    }

}
