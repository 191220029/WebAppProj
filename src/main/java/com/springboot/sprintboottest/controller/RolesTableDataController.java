package com.springboot.sprintboottest.controller;

import com.springboot.sprintboottest.Entity.role;
import com.springboot.sprintboottest.Entity.roleBaseInfo;
import com.springboot.sprintboottest.Entity.roleElement;
import com.springboot.sprintboottest.Entity.roleSkill;
import com.springboot.sprintboottest.Repository.RoleBaseInfoRepository;
import com.springboot.sprintboottest.Repository.RoleElementRepository;
import com.springboot.sprintboottest.Repository.RoleRepository;
import com.springboot.sprintboottest.Repository.RoleSkillRepository;
import org.apache.catalina.Role;
import org.apache.catalina.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collection;
import java.util.List;

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

}
