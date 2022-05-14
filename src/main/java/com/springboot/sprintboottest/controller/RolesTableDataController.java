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

import java.util.*;
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
        Map<String, String> inputValues = new HashMap();
        for(String s : jsonValues){
            //System.out.println(s);
            Pair<String, String> item = new Pair<String, String>(s.substring(s.indexOf('\"') + 1, s.indexOf('=')),
                    s.substring(s.indexOf('=') + 1, s.lastIndexOf('\"')));
//            inputValues.add(item);
            inputValues.put(item.getKey(), item.getValue());
        }
        //System.out.println(inputValues);



        roleSkillRepository.updateRoleSkillInterest(
                Integer.parseInt(inputValues.get("role_skill_accounting_interst")),
                Integer.parseInt(inputValues.get("role_skill_anthropology_interst")),
                Integer.parseInt(inputValues.get("role_skill_evaluation_interst")),
                Integer.parseInt(inputValues.get("role_skill_archaeology_interst")),
                Integer.parseInt(inputValues.get("role_skill_writing_interst")),
                Integer.parseInt(inputValues.get("role_skill_music_theory_interst")),
                Integer.parseInt(inputValues.get("role_skill_morris_dance_interst")),
                Integer.parseInt(inputValues.get("role_skill_opera_singing_interst")),
                Integer.parseInt(inputValues.get("role_skill_whitewasher_painter_interst")),
                Integer.parseInt(inputValues.get("role_skill_photography_interst")),
                Integer.parseInt(inputValues.get("role_skill_dance_interst")),
                Integer.parseInt(inputValues.get("role_skill_art_interst")),
                Integer.parseInt(inputValues.get("role_skill_forge_interst")),
                Integer.parseInt(inputValues.get("role_skill_pottery_making_interst")),
                Integer.parseInt(inputValues.get("role_skill_technical_drawing_interst")),
                Integer.parseInt(inputValues.get("role_skill_farming_interst")),
                Integer.parseInt(inputValues.get("role_skill_typing_interst")),
                Integer.parseInt(inputValues.get("role_skill_shorthand_interst")),
                Integer.parseInt(inputValues.get("role_skill_blown_glass_tube_interst")),
                Integer.parseInt(inputValues.get("role_skill_tailor_interst")),
                Integer.parseInt(inputValues.get("role_skill_make_wine_interst")),
                Integer.parseInt(inputValues.get("role_skill_fishing_interst")),
                Integer.parseInt(inputValues.get("role_skill_sculpture_interst")),
                Integer.parseInt(inputValues.get("role_skill_acrobatics_interst")),
                Integer.parseInt(inputValues.get("role_skill_seduce_interst")),
                Integer.parseInt(inputValues.get("role_skill_climb_interst")),
                Integer.parseInt(inputValues.get("role_skill_computer_interst")),
                Integer.parseInt(inputValues.get("role_skill_credit_interst")),
                Integer.parseInt(inputValues.get("role_skill_cthulhu_mythos_interst")),
                Integer.parseInt(inputValues.get("role_skill_disguise_interst")),
                Integer.parseInt(inputValues.get("role_skill_dodge_interst")),
                Integer.parseInt(inputValues.get("role_skill_car_driving_interst")),
                Integer.parseInt(inputValues.get("role_skill_electrical_maintenance_interst")),
                Integer.parseInt(inputValues.get("role_skill_electronics_interst")),
                Integer.parseInt(inputValues.get("role_skill_speech_skill_interst")),
                Integer.parseInt(inputValues.get("role_skill_combat_fight_interst")),
                Integer.parseInt(inputValues.get("role_skill_combat_whip_interst")),
                Integer.parseInt(inputValues.get("role_skill_combat_electric_saw_interst")),
                Integer.parseInt(inputValues.get("role_skill_combat_axe_interst")),
                Integer.parseInt(inputValues.get("role_skill_combat_sword_interst")),
                Integer.parseInt(inputValues.get("role_skill_combat_hinge_interst")),
                Integer.parseInt(inputValues.get("role_skill_combat_flail_interst")),
                Integer.parseInt(inputValues.get("role_skill_combat_spear_interst")),
                Integer.parseInt(inputValues.get("role_skill_shoot_pistol_interst")),
                Integer.parseInt(inputValues.get("role_skill_shoot_rifle_shotgun_interst")),
                Integer.parseInt(inputValues.get("role_skill_shoot_archery_interst")),
                Integer.parseInt(inputValues.get("role_skill_shoot_flame_thrower_interst")),
                Integer.parseInt(inputValues.get("role_skill_shoot_machine_gun_interst")),
                Integer.parseInt(inputValues.get("role_skill_shoot_heavy_weapon_interst")),
                Integer.parseInt(inputValues.get("role_skill_first_aid_interst")),
                Integer.parseInt(inputValues.get("role_skill_history_interst")),
                Integer.parseInt(inputValues.get("role_skill_threaten_interst")),
                Integer.parseInt(inputValues.get("role_skill_jump_interst")),
                Integer.parseInt(inputValues.get("role_skill_language_val1_interst")),
                Integer.parseInt(inputValues.get("role_skill_language_val2_interst")),
                Integer.parseInt(inputValues.get("role_skill_language_val3_interst")),
                Integer.parseInt(inputValues.get("role_skill_mother_tongue_val_interst")),
                Integer.parseInt(inputValues.get("role_skill_throw_interst")),
                Integer.parseInt(inputValues.get("role_skill_track_interst")),
                Integer.parseInt(inputValues.get("role_skill_law_interst")),
                Integer.parseInt(inputValues.get("role_skill_library_use_interst")),
                Integer.parseInt(inputValues.get("role_skill_listen_interst")),
                Integer.parseInt(inputValues.get("role_skill_locksmith_interst")),
                Integer.parseInt(inputValues.get("role_skill_mechanical_repair_interst")),
                Integer.parseInt(inputValues.get("role_skill_medicine_interst")),
                Integer.parseInt(inputValues.get("role_skill_natural_world_interst")),
                Integer.parseInt(inputValues.get("role_skill_navigate_interst")),
                Integer.parseInt(inputValues.get("role_skill_occult_interst")),
                Integer.parseInt(inputValues.get("role_skill_operate_heavy_machinery_interst")),
                Integer.parseInt(inputValues.get("role_skill_persuade_interst")),
                Integer.parseInt(inputValues.get("role_skill_drive_aircraft_interst")),
                Integer.parseInt(inputValues.get("role_skill_drive_ship_interst")),
                Integer.parseInt(inputValues.get("role_skill_psychoanalysis_interst")),
                Integer.parseInt(inputValues.get("role_skill_psychology_interst")),
                Integer.parseInt(inputValues.get("role_skill_ride_interst")),
                Integer.parseInt(inputValues.get("role_skill_science_geology_interst")),
                Integer.parseInt(inputValues.get("role_skill_science_chemistry_interst")),
                Integer.parseInt(inputValues.get("role_skill_science_biology_interst")),
                Integer.parseInt(inputValues.get("role_skill_science_math_interst")),
                Integer.parseInt(inputValues.get("role_skill_science_astronomy_interst")),
                Integer.parseInt(inputValues.get("role_skill_science_physics_interst")),
                Integer.parseInt(inputValues.get("role_skill_science_pharmacy_interst")),
                Integer.parseInt(inputValues.get("role_skill_science_botany_interst")),
                Integer.parseInt(inputValues.get("role_skill_science_zoology_interst")),
                Integer.parseInt(inputValues.get("role_skill_science_cryptography_interst")),
                Integer.parseInt(inputValues.get("role_skill_science_engineering_interst")),
                Integer.parseInt(inputValues.get("role_skill_science_meteorology_interst")),
                Integer.parseInt(inputValues.get("role_skill_science_judicial_science_interst")),
                Integer.parseInt(inputValues.get("role_skill_sleight_of_hand_interst")),
                Integer.parseInt(inputValues.get("role_skill_recon_interst")),
                Integer.parseInt(inputValues.get("role_skill_stealth_interst")),
                Integer.parseInt(inputValues.get("role_skill_survival_interst")),
                Integer.parseInt(inputValues.get("role_skill_swim_interst")),
                Integer.parseInt(inputValues.get("role_skill_beast_training_interst")),
                Integer.parseInt(inputValues.get("role_skill_diving_interst")),
                Integer.parseInt(inputValues.get("role_skill_demolition_interst")),
                Integer.parseInt(inputValues.get("role_skill_read_lips_interst")),
                Integer.parseInt(inputValues.get("role_skill_hypnosis_interst")),
                Integer.parseInt(inputValues.get("role_skill_artillery_interst")),
                Integer.parseInt(inputValues.get("role_skill_lore_val_interst")),
                rcId
        );
        roleSkillRepository.updateRoleSkillGrowth(
                Integer.parseInt(inputValues.get("role_skill_accounting_growth")),
                Integer.parseInt(inputValues.get("role_skill_anthropology_growth")),
                Integer.parseInt(inputValues.get("role_skill_evaluation_growth")),
                Integer.parseInt(inputValues.get("role_skill_archaeology_growth")),
                Integer.parseInt(inputValues.get("role_skill_writing_growth")),
                Integer.parseInt(inputValues.get("role_skill_music_theory_growth")),
                Integer.parseInt(inputValues.get("role_skill_morris_dance_growth")),
                Integer.parseInt(inputValues.get("role_skill_opera_singing_growth")),
                Integer.parseInt(inputValues.get("role_skill_whitewasher_painter_growth")),
                Integer.parseInt(inputValues.get("role_skill_photography_growth")),
                Integer.parseInt(inputValues.get("role_skill_dance_growth")),
                Integer.parseInt(inputValues.get("role_skill_art_growth")),
                Integer.parseInt(inputValues.get("role_skill_forge_growth")),
                Integer.parseInt(inputValues.get("role_skill_pottery_making_growth")),
                Integer.parseInt(inputValues.get("role_skill_technical_drawing_growth")),
                Integer.parseInt(inputValues.get("role_skill_farming_growth")),
                Integer.parseInt(inputValues.get("role_skill_typing_growth")),
                Integer.parseInt(inputValues.get("role_skill_shorthand_growth")),
                Integer.parseInt(inputValues.get("role_skill_blown_glass_tube_growth")),
                Integer.parseInt(inputValues.get("role_skill_tailor_growth")),
                Integer.parseInt(inputValues.get("role_skill_make_wine_growth")),
                Integer.parseInt(inputValues.get("role_skill_fishing_growth")),
                Integer.parseInt(inputValues.get("role_skill_sculpture_growth")),
                Integer.parseInt(inputValues.get("role_skill_acrobatics_growth")),
                Integer.parseInt(inputValues.get("role_skill_seduce_growth")),
                Integer.parseInt(inputValues.get("role_skill_climb_growth")),
                Integer.parseInt(inputValues.get("role_skill_computer_growth")),
                Integer.parseInt(inputValues.get("role_skill_credit_growth")),
                Integer.parseInt(inputValues.get("role_skill_cthulhu_mythos_growth")),
                Integer.parseInt(inputValues.get("role_skill_disguise_growth")),
                Integer.parseInt(inputValues.get("role_skill_dodge_growth")),
                Integer.parseInt(inputValues.get("role_skill_car_driving_growth")),
                Integer.parseInt(inputValues.get("role_skill_electrical_maintenance_growth")),
                Integer.parseInt(inputValues.get("role_skill_electronics_growth")),
                Integer.parseInt(inputValues.get("role_skill_speech_skill_growth")),
                Integer.parseInt(inputValues.get("role_skill_combat_fight_growth")),
                Integer.parseInt(inputValues.get("role_skill_combat_whip_growth")),
                Integer.parseInt(inputValues.get("role_skill_combat_electric_saw_growth")),
                Integer.parseInt(inputValues.get("role_skill_combat_axe_growth")),
                Integer.parseInt(inputValues.get("role_skill_combat_sword_growth")),
                Integer.parseInt(inputValues.get("role_skill_combat_hinge_growth")),
                Integer.parseInt(inputValues.get("role_skill_combat_flail_growth")),
                Integer.parseInt(inputValues.get("role_skill_combat_spear_growth")),
                Integer.parseInt(inputValues.get("role_skill_shoot_pistol_growth")),
                Integer.parseInt(inputValues.get("role_skill_shoot_rifle_shotgun_growth")),
                Integer.parseInt(inputValues.get("role_skill_shoot_archery_growth")),
                Integer.parseInt(inputValues.get("role_skill_shoot_flame_thrower_growth")),
                Integer.parseInt(inputValues.get("role_skill_shoot_machine_gun_growth")),
                Integer.parseInt(inputValues.get("role_skill_shoot_heavy_weapon_growth")),
                Integer.parseInt(inputValues.get("role_skill_first_aid_growth")),
                Integer.parseInt(inputValues.get("role_skill_history_growth")),
                Integer.parseInt(inputValues.get("role_skill_threaten_growth")),
                Integer.parseInt(inputValues.get("role_skill_jump_growth")),
                Integer.parseInt(inputValues.get("role_skill_language_val1_growth")),
                Integer.parseInt(inputValues.get("role_skill_language_val2_growth")),
                Integer.parseInt(inputValues.get("role_skill_language_val3_growth")),
                Integer.parseInt(inputValues.get("role_skill_mother_tongue_val_growth")),
                Integer.parseInt(inputValues.get("role_skill_throw_growth")),
                Integer.parseInt(inputValues.get("role_skill_track_growth")),
                Integer.parseInt(inputValues.get("role_skill_law_growth")),
                Integer.parseInt(inputValues.get("role_skill_library_use_growth")),
                Integer.parseInt(inputValues.get("role_skill_listen_growth")),
                Integer.parseInt(inputValues.get("role_skill_locksmith_growth")),
                Integer.parseInt(inputValues.get("role_skill_mechanical_repair_growth")),
                Integer.parseInt(inputValues.get("role_skill_medicine_growth")),
                Integer.parseInt(inputValues.get("role_skill_natural_world_growth")),
                Integer.parseInt(inputValues.get("role_skill_navigate_growth")),
                Integer.parseInt(inputValues.get("role_skill_occult_growth")),
                Integer.parseInt(inputValues.get("role_skill_operate_heavy_machinery_growth")),
                Integer.parseInt(inputValues.get("role_skill_persuade_growth")),
                Integer.parseInt(inputValues.get("role_skill_drive_aircraft_growth")),
                Integer.parseInt(inputValues.get("role_skill_drive_ship_growth")),
                Integer.parseInt(inputValues.get("role_skill_psychoanalysis_growth")),
                Integer.parseInt(inputValues.get("role_skill_psychology_growth")),
                Integer.parseInt(inputValues.get("role_skill_ride_growth")),
                Integer.parseInt(inputValues.get("role_skill_science_geology_growth")),
                Integer.parseInt(inputValues.get("role_skill_science_chemistry_growth")),
                Integer.parseInt(inputValues.get("role_skill_science_biology_growth")),
                Integer.parseInt(inputValues.get("role_skill_science_math_growth")),
                Integer.parseInt(inputValues.get("role_skill_science_astronomy_growth")),
                Integer.parseInt(inputValues.get("role_skill_science_physics_growth")),
                Integer.parseInt(inputValues.get("role_skill_science_pharmacy_growth")),
                Integer.parseInt(inputValues.get("role_skill_science_botany_growth")),
                Integer.parseInt(inputValues.get("role_skill_science_zoology_growth")),
                Integer.parseInt(inputValues.get("role_skill_science_cryptography_growth")),
                Integer.parseInt(inputValues.get("role_skill_science_engineering_growth")),
                Integer.parseInt(inputValues.get("role_skill_science_meteorology_growth")),
                Integer.parseInt(inputValues.get("role_skill_science_judicial_science_growth")),
                Integer.parseInt(inputValues.get("role_skill_sleight_of_hand_growth")),
                Integer.parseInt(inputValues.get("role_skill_recon_growth")),
                Integer.parseInt(inputValues.get("role_skill_stealth_growth")),
                Integer.parseInt(inputValues.get("role_skill_survival_growth")),
                Integer.parseInt(inputValues.get("role_skill_swim_growth")),
                Integer.parseInt(inputValues.get("role_skill_beast_training_growth")),
                Integer.parseInt(inputValues.get("role_skill_diving_growth")),
                Integer.parseInt(inputValues.get("role_skill_demolition_growth")),
                Integer.parseInt(inputValues.get("role_skill_read_lips_growth")),
                Integer.parseInt(inputValues.get("role_skill_hypnosis_growth")),
                Integer.parseInt(inputValues.get("role_skill_artillery_growth")),
                Integer.parseInt(inputValues.get("role_skill_lore_val_growth")),
                rcId
        );
        roleSkillRepository.updateRoleSkillJob(
                Integer.parseInt(inputValues.get("role_skill_accounting_job")),
                Integer.parseInt(inputValues.get("role_skill_anthropology_job")),
                Integer.parseInt(inputValues.get("role_skill_evaluation_job")),
                Integer.parseInt(inputValues.get("role_skill_archaeology_job")),
                Integer.parseInt(inputValues.get("role_skill_writing_job")),
                Integer.parseInt(inputValues.get("role_skill_music_theory_job")),
                Integer.parseInt(inputValues.get("role_skill_morris_dance_job")),
                Integer.parseInt(inputValues.get("role_skill_opera_singing_job")),
                Integer.parseInt(inputValues.get("role_skill_whitewasher_painter_job")),
                Integer.parseInt(inputValues.get("role_skill_photography_job")),
                Integer.parseInt(inputValues.get("role_skill_dance_job")),
                Integer.parseInt(inputValues.get("role_skill_art_job")),
                Integer.parseInt(inputValues.get("role_skill_forge_job")),
                Integer.parseInt(inputValues.get("role_skill_pottery_making_job")),
                Integer.parseInt(inputValues.get("role_skill_technical_drawing_job")),
                Integer.parseInt(inputValues.get("role_skill_farming_job")),
                Integer.parseInt(inputValues.get("role_skill_typing_job")),
                Integer.parseInt(inputValues.get("role_skill_shorthand_job")),
                Integer.parseInt(inputValues.get("role_skill_blown_glass_tube_job")),
                Integer.parseInt(inputValues.get("role_skill_tailor_job")),
                Integer.parseInt(inputValues.get("role_skill_make_wine_job")),
                Integer.parseInt(inputValues.get("role_skill_fishing_job")),
                Integer.parseInt(inputValues.get("role_skill_sculpture_job")),
                Integer.parseInt(inputValues.get("role_skill_acrobatics_job")),
                Integer.parseInt(inputValues.get("role_skill_seduce_job")),
                Integer.parseInt(inputValues.get("role_skill_climb_job")),
                Integer.parseInt(inputValues.get("role_skill_computer_job")),
                Integer.parseInt(inputValues.get("role_skill_credit_job")),
                Integer.parseInt(inputValues.get("role_skill_cthulhu_mythos_job")),
                Integer.parseInt(inputValues.get("role_skill_disguise_job")),
                Integer.parseInt(inputValues.get("role_skill_dodge_job")),
                Integer.parseInt(inputValues.get("role_skill_car_driving_job")),
                Integer.parseInt(inputValues.get("role_skill_electrical_maintenance_job")),
                Integer.parseInt(inputValues.get("role_skill_electronics_job")),
                Integer.parseInt(inputValues.get("role_skill_speech_skill_job")),
                Integer.parseInt(inputValues.get("role_skill_combat_fight_job")),
                Integer.parseInt(inputValues.get("role_skill_combat_whip_job")),
                Integer.parseInt(inputValues.get("role_skill_combat_electric_saw_job")),
                Integer.parseInt(inputValues.get("role_skill_combat_axe_job")),
                Integer.parseInt(inputValues.get("role_skill_combat_sword_job")),
                Integer.parseInt(inputValues.get("role_skill_combat_hinge_job")),
                Integer.parseInt(inputValues.get("role_skill_combat_flail_job")),
                Integer.parseInt(inputValues.get("role_skill_combat_spear_job")),
                Integer.parseInt(inputValues.get("role_skill_shoot_pistol_job")),
                Integer.parseInt(inputValues.get("role_skill_shoot_rifle_shotgun_job")),
                Integer.parseInt(inputValues.get("role_skill_shoot_archery_job")),
                Integer.parseInt(inputValues.get("role_skill_shoot_flame_thrower_job")),
                Integer.parseInt(inputValues.get("role_skill_shoot_machine_gun_job")),
                Integer.parseInt(inputValues.get("role_skill_shoot_heavy_weapon_job")),
                Integer.parseInt(inputValues.get("role_skill_first_aid_job")),
                Integer.parseInt(inputValues.get("role_skill_history_job")),
                Integer.parseInt(inputValues.get("role_skill_threaten_job")),
                Integer.parseInt(inputValues.get("role_skill_jump_job")),
                Integer.parseInt(inputValues.get("role_skill_language_val1_job")),
                Integer.parseInt(inputValues.get("role_skill_language_val2_job")),
                Integer.parseInt(inputValues.get("role_skill_language_val3_job")),
                Integer.parseInt(inputValues.get("role_skill_mother_tongue_val_job")),
                Integer.parseInt(inputValues.get("role_skill_throw_job")),
                Integer.parseInt(inputValues.get("role_skill_track_job")),
                Integer.parseInt(inputValues.get("role_skill_law_job")),
                Integer.parseInt(inputValues.get("role_skill_library_use_job")),
                Integer.parseInt(inputValues.get("role_skill_listen_job")),
                Integer.parseInt(inputValues.get("role_skill_locksmith_job")),
                Integer.parseInt(inputValues.get("role_skill_mechanical_repair_job")),
                Integer.parseInt(inputValues.get("role_skill_medicine_job")),
                Integer.parseInt(inputValues.get("role_skill_natural_world_job")),
                Integer.parseInt(inputValues.get("role_skill_navigate_job")),
                Integer.parseInt(inputValues.get("role_skill_occult_job")),
                Integer.parseInt(inputValues.get("role_skill_operate_heavy_machinery_job")),
                Integer.parseInt(inputValues.get("role_skill_persuade_job")),
                Integer.parseInt(inputValues.get("role_skill_drive_aircraft_job")),
                Integer.parseInt(inputValues.get("role_skill_drive_ship_job")),
                Integer.parseInt(inputValues.get("role_skill_psychoanalysis_job")),
                Integer.parseInt(inputValues.get("role_skill_psychology_job")),
                Integer.parseInt(inputValues.get("role_skill_ride_job")),
                Integer.parseInt(inputValues.get("role_skill_science_geology_job")),
                Integer.parseInt(inputValues.get("role_skill_science_chemistry_job")),
                Integer.parseInt(inputValues.get("role_skill_science_biology_job")),
                Integer.parseInt(inputValues.get("role_skill_science_math_job")),
                Integer.parseInt(inputValues.get("role_skill_science_astronomy_job")),
                Integer.parseInt(inputValues.get("role_skill_science_physics_job")),
                Integer.parseInt(inputValues.get("role_skill_science_pharmacy_job")),
                Integer.parseInt(inputValues.get("role_skill_science_botany_job")),
                Integer.parseInt(inputValues.get("role_skill_science_zoology_job")),
                Integer.parseInt(inputValues.get("role_skill_science_cryptography_job")),
                Integer.parseInt(inputValues.get("role_skill_science_engineering_job")),
                Integer.parseInt(inputValues.get("role_skill_science_meteorology_job")),
                Integer.parseInt(inputValues.get("role_skill_science_judicial_science_job")),
                Integer.parseInt(inputValues.get("role_skill_sleight_of_hand_job")),
                Integer.parseInt(inputValues.get("role_skill_recon_job")),
                Integer.parseInt(inputValues.get("role_skill_stealth_job")),
                Integer.parseInt(inputValues.get("role_skill_survival_job")),
                Integer.parseInt(inputValues.get("role_skill_swim_job")),
                Integer.parseInt(inputValues.get("role_skill_beast_training_job")),
                Integer.parseInt(inputValues.get("role_skill_diving_job")),
                Integer.parseInt(inputValues.get("role_skill_demolition_job")),
                Integer.parseInt(inputValues.get("role_skill_read_lips_job")),
                Integer.parseInt(inputValues.get("role_skill_hypnosis_job")),
                Integer.parseInt(inputValues.get("role_skill_artillery_job")),
                Integer.parseInt(inputValues.get("role_skill_lore_val_job")),
                rcId
        );
        //System.out.println(inputValues.get("role_skill_lore_type"));
        roleSkillRepository.updateRoleSkillOthers(
                inputValues.get("role_skill_language_type1"),
                inputValues.get("role_skill_language_type2"),
                inputValues.get("role_skill_language_type3"),
                inputValues.get("role_skill_mother_tongue_type"),
                inputValues.get("role_skill_lore_type"),
                rcId
        );
        return "OK";
    }

}
