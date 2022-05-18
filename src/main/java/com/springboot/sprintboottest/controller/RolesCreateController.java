package com.springboot.sprintboottest.controller;

import com.springboot.sprintboottest.Entity.role;
import com.springboot.sprintboottest.Entity.user;
import com.springboot.sprintboottest.Repository.RoleRepository;
import com.springboot.sprintboottest.Repository.RoleSkillRepository;
import com.springboot.sprintboottest.Repository.UserRepository;
import javafx.util.Pair;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
public class RolesCreateController {
    @Autowired
    RoleRepository roleRepository;
    @Autowired
    RoleSkillRepository roleSkillRepository;
    @Autowired
    UserRepository userRepository;


    @GetMapping("/rolecreate")
    public String rolesCreateController(
            HttpServletRequest request, Model model
    ){
        Object UserId = request.getSession().getAttribute("UserId");
        model.addAttribute("UserId", UserId);
        user curUser = userRepository.getById(Integer.parseInt(UserId.toString()));
        model.addAttribute("UserName", curUser.getUserName());
        return "rolecreate";
    }

    @ResponseBody
    @RequestMapping("/rolecreate/roleNameUsed")
    public String roleDuplicatedNameCheck(
            @RequestParam("roleName") String name,
            @RequestParam("userId") Integer userId
    ){
        List<role> res = roleRepository.findRoleByUserNameAndRoleName(userId, name);
        if(res.size() > 0)
            return "true";
        else
            return "false";
    }

    @ResponseBody
    @RequestMapping("/rolecreate/create")
    public String roleCreateSubmit(
        @RequestParam("roleCard") List<String> jsonValues
    ){
        Map<String, String> inputValues = new HashMap();
        for(String s : jsonValues){
            String typeName = s.substring(s.indexOf('\"') + 1, s.indexOf('='));
//            System.out.println(s);
//            System.out.println(s.indexOf('=') + "," + s.length());
            if(s.indexOf('=') >= s.length() - 2)
                return typeName + " is null.";
            Pair<String, String> item = new Pair<String, String>(typeName,
                    s.substring(s.indexOf('=') + 1, s.lastIndexOf('\"')));
            inputValues.put(item.getKey(), item.getValue());
        }
        System.out.println(inputValues);

        roleRepository.insertRoleBaseInfo(
                Integer.parseInt(inputValues.get("role_card_player_id")),
                inputValues.get("era"),
                inputValues.get("role_name"),
                Integer.parseInt(inputValues.get("role_gender")),
                Integer.parseInt(inputValues.get("role_age")),
                inputValues.get("role_home_address"),
                Integer.parseInt(inputValues.get("role_job_id")),
                inputValues.get("role_hometown"),
                Integer.parseInt(inputValues.get("rolestr")),
                Integer.parseInt(inputValues.get("rolecon")),
                Integer.parseInt(inputValues.get("rolesiz")),
                Integer.parseInt(inputValues.get("roledex")),
                Integer.parseInt(inputValues.get("roleapp")),
                Integer.parseInt(inputValues.get("roleint")),
                Integer.parseInt(inputValues.get("rolepow")),
                Integer.parseInt(inputValues.get("roleedu")),
                Integer.parseInt(inputValues.get("rolemov")),
                inputValues.get("role_img_path"),
                Integer.parseInt(inputValues.get("role_cur_hit_points")),
                Integer.parseInt(inputValues.get("role_max_hit_points")),
                Integer.parseInt(inputValues.get("role_cur_sanity")),
                Integer.parseInt(inputValues.get("role_max_sanity")),
                Integer.parseInt(inputValues.get("role_luck")),
                Integer.parseInt(inputValues.get("role_cur_magic")),
                Integer.parseInt(inputValues.get("role_max_magic")),
                inputValues.get("role_physical_status"),
                inputValues.get("role_mental_status")
        );
        Integer playerId = Integer.parseInt(inputValues.get("role_card_player_id"));
        String roleName = inputValues.get("role_name");
        List<role> roles = roleRepository.findRoleByUserNameAndRoleName(playerId, roleName);
        Integer rcId = roles.get(0).getRoleCardId();
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