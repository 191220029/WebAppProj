package com.springboot.sprintboottest.Entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "rolecard")
public class role {
    @Id
    @Column(name = "RoleCardId")
    private Integer RoleCardId;

    @Column(name = "RoleCardPlayerId")
    private Integer RoleCardPlayerId;
    @Column(name = "Era")
    private String Era;
    @Column(name = "RoleName")
    private String RoleName;
    @Column(name = "RoleGender")
    private Integer RoleGender;
    @Column(name = "RoleAge")
    private Integer RoleAge;
    @Column(name = "RoleHomeAddress")
    private String RoleHomeAddress;
    @Column(name = "RoleJobId")
    private Integer RoleJobId;
    @Column(name = "RoleHometown")
    private String RoleHometown;
    @Column(name = "RoleSTR")
    private Integer RoleSTR;
    @Column(name = "RoleCON")
    private Integer RoleCON;
    @Column(name = "RoleSIZ")
    private Integer RoleSIZ;
    @Column(name = "RoleDEX")
    private Integer RoleDEX;
    @Column(name = "RoleAPP")
    private Integer RoleAPP;
    @Column(name = "RoleINT")
    private Integer RoleINT;
    @Column(name = "RolePOW")
    private Integer RolePOW;
    @Column(name = "RoleEDU")
    private Integer RoleEDU;
    @Column(name = "RoleMOV")
    private Integer RoleMOV;
    @Column(name = "RoleImgPath")
    private String RoleImgPath;
    @Column(name = "RoleCurHitPoints")
    private Integer RoleCurHitPoints;
    @Column(name = "RoleMaxHitPoints")
    private Integer RoleMaxHitPoints;
    @Column(name = "RoleCurSanity")
    private Integer RoleCurSanity;
    @Column(name = "RoleMaxSanity")
    private Integer RoleMaxSanity;
    @Column(name = "RoleLuck")
    private Integer RoleLuck;
    @Column(name = "RoleCurMagic")
    private Integer RoleCurMagic;
    @Column(name = "RoleMaxMagic")
    private Integer RoleMaxMagic;
    @Column(name = "RolePhysicalStatus")
    private String RolePhysicalStatus;
    @Column(name = "RoleMentalStatus")
    private String RoleMentalStatus;

    @Column(name = "role_skill_accounting_growth")
    private Integer role_skill_accounting_growth;
    @Column(name = "role_skill_accounting_job")
    private Integer role_skill_accounting_job;
    @Column(name = "role_skill_accounting_interst")
    private Integer role_skill_accounting_interst;
    @Column(name = "role_skill_anthropology_growth")
    private Integer role_skill_anthropology_growth;
    @Column(name = "role_skill_anthropology_job")
    private Integer role_skill_anthropology_job;
    @Column(name = "role_skill_anthropology_interst")
    private Integer role_skill_anthropology_interst;
    @Column(name = "role_skill_evaluation_growth")
    private Integer role_skill_evaluation_growth;
    @Column(name = "role_skill_evaluation_job")
    private Integer role_skill_evaluation_job;
    @Column(name = "role_skill_evaluation_interst")
    private Integer role_skill_evaluation_interst;
    @Column(name = "role_skill_archaeology_growth")
    private Integer role_skill_archaeology_growth;
    @Column(name = "role_skill_archaeology_job")
    private Integer role_skill_archaeology_job;
    @Column(name = "role_skill_archaeology_interst")
    private Integer role_skill_archaeology_interst;
    @Column(name = "role_skill_writing_growth")
    private Integer role_skill_writing_growth;
    @Column(name = "role_skill_writing_job")
    private Integer role_skill_writing_job;
    @Column(name = "role_skill_writing_interst")
    private Integer role_skill_writing_interst;
    @Column(name = "role_skill_music_theory_growth")
    private Integer role_skill_music_theory_growth;
    @Column(name = "role_skill_music_theory_job")
    private Integer role_skill_music_theory_job;
    @Column(name = "role_skill_music_theory_interst")
    private Integer role_skill_music_theory_interst;
    @Column(name = "role_skill_morris_dance_growth")
    private Integer role_skill_morris_dance_growth;
    @Column(name = "role_skill_morris_dance_job")
    private Integer role_skill_morris_dance_job;
    @Column(name = "role_skill_morris_dance_interst")
    private Integer role_skill_morris_dance_interst;
    @Column(name = "role_skill_opera_singing_growth")
    private Integer role_skill_opera_singing_growth;
    @Column(name = "role_skill_opera_singing_job")
    private Integer role_skill_opera_singing_job;
    @Column(name = "role_skill_opera_singing_interst")
    private Integer role_skill_opera_singing_interst;
    @Column(name = "role_skill_whitewasher_painter_growth")
    private Integer role_skill_whitewasher_painter_growth;
    @Column(name = "role_skill_whitewasher_painter_job")
    private Integer role_skill_whitewasher_painter_job;
    @Column(name = "role_skill_whitewasher_painter_interst")
    private Integer role_skill_whitewasher_painter_interst;
    @Column(name = "role_skill_photography_growth")
    private Integer role_skill_photography_growth;
    @Column(name = "role_skill_photography_job")
    private Integer role_skill_photography_job;
    @Column(name = "role_skill_photography_interst")
    private Integer role_skill_photography_interst;
    @Column(name = "role_skill_dance_growth")
    private Integer role_skill_dance_growth;
    @Column(name = "role_skill_dance_job")
    private Integer role_skill_dance_job;
    @Column(name = "role_skill_dance_interst")
    private Integer role_skill_dance_interst;
    @Column(name = "role_skill_art_growth")
    private Integer role_skill_art_growth;
    @Column(name = "role_skill_art_job")
    private Integer role_skill_art_job;
    @Column(name = "role_skill_art_interst")
    private Integer role_skill_art_interst;
    @Column(name = "role_skill_forge_growth")
    private Integer role_skill_forge_growth;
    @Column(name = "role_skill_forge_job")
    private Integer role_skill_forge_job;
    @Column(name = "role_skill_forge_interst")
    private Integer role_skill_forge_interst;
    @Column(name = "role_skill_pottery_making_growth")
    private Integer role_skill_pottery_making_growth;
    @Column(name = "role_skill_pottery_making_job")
    private Integer role_skill_pottery_making_job;
    @Column(name = "role_skill_pottery_making_interst")
    private Integer role_skill_pottery_making_interst;
    @Column(name = "role_skill_technical_drawing_growth")
    private Integer role_skill_technical_drawing_growth;
    @Column(name = "role_skill_technical_drawing_job")
    private Integer role_skill_technical_drawing_job;
    @Column(name = "role_skill_technical_drawing_interst")
    private Integer role_skill_technical_drawing_interst;
    @Column(name = "role_skill_farming_growth")
    private Integer role_skill_farming_growth;
    @Column(name = "role_skill_farming_job")
    private Integer role_skill_farming_job;
    @Column(name = "role_skill_farming_interst")
    private Integer role_skill_farming_interst;
    @Column(name = "role_skill_typing_growth")
    private Integer role_skill_typing_growth;
    @Column(name = "role_skill_typing_job")
    private Integer role_skill_typing_job;
    @Column(name = "role_skill_typing_interst")
    private Integer role_skill_typing_interst;
    @Column(name = "role_skill_shorthand_growth")
    private Integer role_skill_shorthand_growth;
    @Column(name = "role_skill_shorthand_job")
    private Integer role_skill_shorthand_job;
    @Column(name = "role_skill_shorthand_interst")
    private Integer role_skill_shorthand_interst;
    @Column(name = "role_skill_blown_glass_tube_growth")
    private Integer role_skill_blown_glass_tube_growth;
    @Column(name = "role_skill_blown_glass_tube_job")
    private Integer role_skill_blown_glass_tube_job;
    @Column(name = "role_skill_blown_glass_tube_interst")
    private Integer role_skill_blown_glass_tube_interst;
    @Column(name = "role_skill_tailor_growth")
    private Integer role_skill_tailor_growth;
    @Column(name = "role_skill_tailor_job")
    private Integer role_skill_tailor_job;
    @Column(name = "role_skill_tailor_interst")
    private Integer role_skill_tailor_interst;
    @Column(name = "role_skill_make_wine_growth")
    private Integer role_skill_make_wine_growth;
    @Column(name = "role_skill_make_wine_job")
    private Integer role_skill_make_wine_job;
    @Column(name = "role_skill_make_wine_interst")
    private Integer role_skill_make_wine_interst;
    @Column(name = "role_skill_fishing_growth")
    private Integer role_skill_fishing_growth;
    @Column(name = "role_skill_fishing_job")
    private Integer role_skill_fishing_job;
    @Column(name = "role_skill_fishing_interst")
    private Integer role_skill_fishing_interst;
    @Column(name = "role_skill_sculpture_growth")
    private Integer role_skill_sculpture_growth;
    @Column(name = "role_skill_sculpture_job")
    private Integer role_skill_sculpture_job;
    @Column(name = "role_skill_sculpture_interst")
    private Integer role_skill_sculpture_interst;
    @Column(name = "role_skill_acrobatics_growth")
    private Integer role_skill_acrobatics_growth;
    @Column(name = "role_skill_acrobatics_job")
    private Integer role_skill_acrobatics_job;
    @Column(name = "role_skill_acrobatics_interst")
    private Integer role_skill_acrobatics_interst;
    @Column(name = "role_skill_seduce_growth")
    private Integer role_skill_seduce_growth;
    @Column(name = "role_skill_seduce_job")
    private Integer role_skill_seduce_job;
    @Column(name = "role_skill_seduce_interst")
    private Integer role_skill_seduce_interst;
    @Column(name = "role_skill_climb_growth")
    private Integer role_skill_climb_growth;
    @Column(name = "role_skill_climb_job")
    private Integer role_skill_climb_job;
    @Column(name = "role_skill_climb_interst")
    private Integer role_skill_climb_interst;
    @Column(name = "role_skill_computer_growth")
    private Integer role_skill_computer_growth;
    @Column(name = "role_skill_computer_job")
    private Integer role_skill_computer_job;
    @Column(name = "role_skill_computer_interst")
    private Integer role_skill_computer_interst;
    @Column(name = "role_skill_credit_growth")
    private Integer role_skill_credit_growth;
    @Column(name = "role_skill_credit_job")
    private Integer role_skill_credit_job;
    @Column(name = "role_skill_credit_interst")
    private Integer role_skill_credit_interst;
    @Column(name = "role_skill_cthulhu_mythos_growth")
    private Integer role_skill_cthulhu_mythos_growth;
    @Column(name = "role_skill_cthulhu_mythos_job")
    private Integer role_skill_cthulhu_mythos_job;
    @Column(name = "role_skill_cthulhu_mythos_interst")
    private Integer role_skill_cthulhu_mythos_interst;
    @Column(name = "role_skill_disguise_growth")
    private Integer role_skill_disguise_growth;
    @Column(name = "role_skill_disguise_job")
    private Integer role_skill_disguise_job;
    @Column(name = "role_skill_disguise_interst")
    private Integer role_skill_disguise_interst;
    @Column(name = "role_skill_dodge_growth")
    private Integer role_skill_dodge_growth;
    @Column(name = "role_skill_dodge_job")
    private Integer role_skill_dodge_job;
    @Column(name = "role_skill_dodge_interst")
    private Integer role_skill_dodge_interst;
    @Column(name = "role_skill_car_driving_growth")
    private Integer role_skill_car_driving_growth;
    @Column(name = "role_skill_car_driving_job")
    private Integer role_skill_car_driving_job;
    @Column(name = "role_skill_car_driving_interst")
    private Integer role_skill_car_driving_interst;
    @Column(name = "role_skill_electrical_maintenance_growth")
    private Integer role_skill_electrical_maintenance_growth;
    @Column(name = "role_skill_electrical_maintenance_job")
    private Integer role_skill_electrical_maintenance_job;
    @Column(name = "role_skill_electrical_maintenance_interst")
    private Integer role_skill_electrical_maintenance_interst;
    @Column(name = "role_skill_electronics_growth")
    private Integer role_skill_electronics_growth;
    @Column(name = "role_skill_electronics_job")
    private Integer role_skill_electronics_job;
    @Column(name = "role_skill_electronics_interst")
    private Integer role_skill_electronics_interst;
    @Column(name = "role_skill_speech_skill_growth")
    private Integer role_skill_speech_skill_growth;
    @Column(name = "role_skill_speech_skill_job")
    private Integer role_skill_speech_skill_job;
    @Column(name = "role_skill_speech_skill_interst")
    private Integer role_skill_speech_skill_interst;
    @Column(name = "role_skill_combat_fight_growth")
    private Integer role_skill_combat_fight_growth;
    @Column(name = "role_skill_combat_fight_job")
    private Integer role_skill_combat_fight_job;
    @Column(name = "role_skill_combat_fight_interst")
    private Integer role_skill_combat_fight_interst;
    @Column(name = "role_skill_combat_whip_growth")
    private Integer role_skill_combat_whip_growth;
    @Column(name = "role_skill_combat_whip_job")
    private Integer role_skill_combat_whip_job;
    @Column(name = "role_skill_combat_whip_interst")
    private Integer role_skill_combat_whip_interst;
    @Column(name = "role_skill_combat_electric_saw_growth")
    private Integer role_skill_combat_electric_saw_growth;
    @Column(name = "role_skill_combat_electric_saw_job")
    private Integer role_skill_combat_electric_saw_job;
    @Column(name = "role_skill_combat_electric_saw_interst")
    private Integer role_skill_combat_electric_saw_interst;
    @Column(name = "role_skill_combat_axe_growth")
    private Integer role_skill_combat_axe_growth;
    @Column(name = "role_skill_combat_axe_job")
    private Integer role_skill_combat_axe_job;
    @Column(name = "role_skill_combat_axe_interst")
    private Integer role_skill_combat_axe_interst;
    @Column(name = "role_skill_combat_sword_growth")
    private Integer role_skill_combat_sword_growth;
    @Column(name = "role_skill_combat_sword_job")
    private Integer role_skill_combat_sword_job;
    @Column(name = "role_skill_combat_sword_interst")
    private Integer role_skill_combat_sword_interst;
    @Column(name = "role_skill_combat_hinge_growth")
    private Integer role_skill_combat_hinge_growth;
    @Column(name = "role_skill_combat_hinge_job")
    private Integer role_skill_combat_hinge_job;
    @Column(name = "role_skill_combat_hinge_interst")
    private Integer role_skill_combat_hinge_interst;
    @Column(name = "role_skill_combat_flail_growth")
    private Integer role_skill_combat_flail_growth;
    @Column(name = "role_skill_combat_flail_job")
    private Integer role_skill_combat_flail_job;
    @Column(name = "role_skill_combat_flail_interst")
    private Integer role_skill_combat_flail_interst;
    @Column(name = "role_skill_combat_spear_growth")
    private Integer role_skill_combat_spear_growth;
    @Column(name = "role_skill_combat_spear_job")
    private Integer role_skill_combat_spear_job;
    @Column(name = "role_skill_combat_spear_interst")
    private Integer role_skill_combat_spear_interst;
    @Column(name = "role_skill_shoot_pistol_growth")
    private Integer role_skill_shoot_pistol_growth;
    @Column(name = "role_skill_shoot_pistol_job")
    private Integer role_skill_shoot_pistol_job;
    @Column(name = "role_skill_shoot_pistol_interst")
    private Integer role_skill_shoot_pistol_interst;
    @Column(name = "role_skill_shoot_rifle_shotgun_growth")
    private Integer role_skill_shoot_rifle_shotgun_growth;
    @Column(name = "role_skill_shoot_rifle_shotgun_job")
    private Integer role_skill_shoot_rifle_shotgun_job;
    @Column(name = "role_skill_shoot_rifle_shotgun_interst")
    private Integer role_skill_shoot_rifle_shotgun_interst;
    @Column(name = "role_skill_shoot_archery_growth")
    private Integer role_skill_shoot_archery_growth;
    @Column(name = "role_skill_shoot_archery_job")
    private Integer role_skill_shoot_archery_job;
    @Column(name = "role_skill_shoot_archery_interst")
    private Integer role_skill_shoot_archery_interst;
    @Column(name = "role_skill_shoot_flame_thrower_growth")
    private Integer role_skill_shoot_flame_thrower_growth;
    @Column(name = "role_skill_shoot_flame_thrower_job")
    private Integer role_skill_shoot_flame_thrower_job;
    @Column(name = "role_skill_shoot_flame_thrower_interst")
    private Integer role_skill_shoot_flame_thrower_interst;
    @Column(name = "role_skill_shoot_machine_gun_growth")
    private Integer role_skill_shoot_machine_gun_growth;
    @Column(name = "role_skill_shoot_machine_gun_job")
    private Integer role_skill_shoot_machine_gun_job;
    @Column(name = "role_skill_shoot_machine_gun_interst")
    private Integer role_skill_shoot_machine_gun_interst;
    @Column(name = "role_skill_shoot_heavy_weapon_growth")
    private Integer role_skill_shoot_heavy_weapon_growth;
    @Column(name = "role_skill_shoot_heavy_weapon_job")
    private Integer role_skill_shoot_heavy_weapon_job;
    @Column(name = "role_skill_shoot_heavy_weapon_interst")
    private Integer role_skill_shoot_heavy_weapon_interst;
    @Column(name = "role_skill_first_aid_growth")
    private Integer role_skill_first_aid_growth;
    @Column(name = "role_skill_first_aid_job")
    private Integer role_skill_first_aid_job;
    @Column(name = "role_skill_first_aid_interst")
    private Integer role_skill_first_aid_interst;
    @Column(name = "role_skill_history_growth")
    private Integer role_skill_history_growth;
    @Column(name = "role_skill_history_job")
    private Integer role_skill_history_job;
    @Column(name = "role_skill_history_interst")
    private Integer role_skill_history_interst;
    @Column(name = "role_skill_threaten_growth")
    private Integer role_skill_threaten_growth;
    @Column(name = "role_skill_threaten_job")
    private Integer role_skill_threaten_job;
    @Column(name = "role_skill_threaten_interst")
    private Integer role_skill_threaten_interst;
    @Column(name = "role_skill_jump_growth")
    private Integer role_skill_jump_growth;
    @Column(name = "role_skill_jump_job")
    private Integer role_skill_jump_job;
    @Column(name = "role_skill_jump_interst")
    private Integer role_skill_jump_interst;
    @Column(name = "role_skill_language_type1")
    private String role_skill_language_type1;
    @Column(name = "role_skill_language_val1_growth")
    private Integer role_skill_language_val1_growth;
    @Column(name = "role_skill_language_val1_job")
    private Integer role_skill_language_val1_job;
    @Column(name = "role_skill_language_val1_interst")
    private Integer role_skill_language_val1_interst;
    @Column(name = "role_skill_language_type2")
    private String role_skill_language_type2;
    @Column(name = "role_skill_language_val2_growth")
    private Integer role_skill_language_val2_growth;
    @Column(name = "role_skill_language_val2_job")
    private Integer role_skill_language_val2_job;
    @Column(name = "role_skill_language_val2_interst")
    private Integer role_skill_language_val2_interst;
    @Column(name = "role_skill_language_type3")
    private String role_skill_language_type3;
    @Column(name = "role_skill_language_val3_growth")
    private Integer role_skill_language_val3_growth;
    @Column(name = "role_skill_language_val3_job")
    private Integer role_skill_language_val3_job;
    @Column(name = "role_skill_language_val3_interst")
    private Integer role_skill_language_val3_interst;
    @Column(name = "role_skill_mother_tongue_type")
    private String role_skill_mother_tongue_type;
    @Column(name = "role_skill_mother_tongue_val_growth")
    private Integer role_skill_mother_tongue_val_growth;
    @Column(name = "role_skill_mother_tongue_val_job")
    private Integer role_skill_mother_tongue_val_job;
    @Column(name = "role_skill_mother_tongue_val_interst")
    private Integer role_skill_mother_tongue_val_interst;
    @Column(name = "role_skill_throw_growth")
    private Integer role_skill_throw_growth;
    @Column(name = "role_skill_throw_job")
    private Integer role_skill_throw_job;
    @Column(name = "role_skill_throw_interst")
    private Integer role_skill_throw_interst;
    @Column(name = "role_skill_track_growth")
    private Integer role_skill_track_growth;
    @Column(name = "role_skill_track_job")
    private Integer role_skill_track_job;
    @Column(name = "role_skill_track_interst")
    private Integer role_skill_track_interst;
    @Column(name = "role_skill_law_growth")
    private Integer role_skill_law_growth;
    @Column(name = "role_skill_law_job")
    private Integer role_skill_law_job;
    @Column(name = "role_skill_law_interst")
    private Integer role_skill_law_interst;
    @Column(name = "role_skill_library_use_growth")
    private Integer role_skill_library_use_growth;
    @Column(name = "role_skill_library_use_job")
    private Integer role_skill_library_use_job;
    @Column(name = "role_skill_library_use_interst")
    private Integer role_skill_library_use_interst;
    @Column(name = "role_skill_listen_growth")
    private Integer role_skill_listen_growth;
    @Column(name = "role_skill_listen_job")
    private Integer role_skill_listen_job;
    @Column(name = "role_skill_listen_interst")
    private Integer role_skill_listen_interst;
    @Column(name = "role_skill_locksmith_growth")
    private Integer role_skill_locksmith_growth;
    @Column(name = "role_skill_locksmith_job")
    private Integer role_skill_locksmith_job;
    @Column(name = "role_skill_locksmith_interst")
    private Integer role_skill_locksmith_interst;
    @Column(name = "role_skill_mechanical_repair_growth")
    private Integer role_skill_mechanical_repair_growth;
    @Column(name = "role_skill_mechanical_repair_job")
    private Integer role_skill_mechanical_repair_job;
    @Column(name = "role_skill_mechanical_repair_interst")
    private Integer role_skill_mechanical_repair_interst;
    @Column(name = "role_skill_medicine_growth")
    private Integer role_skill_medicine_growth;
    @Column(name = "role_skill_medicine_job")
    private Integer role_skill_medicine_job;
    @Column(name = "role_skill_medicine_interst")
    private Integer role_skill_medicine_interst;
    @Column(name = "role_skill_natural_world_growth")
    private Integer role_skill_natural_world_growth;
    @Column(name = "role_skill_natural_world_job")
    private Integer role_skill_natural_world_job;
    @Column(name = "role_skill_natural_world_interst")
    private Integer role_skill_natural_world_interst;
    @Column(name = "role_skill_navigate_growth")
    private Integer role_skill_navigate_growth;
    @Column(name = "role_skill_navigate_job")
    private Integer role_skill_navigate_job;
    @Column(name = "role_skill_navigate_interst")
    private Integer role_skill_navigate_interst;
    @Column(name = "role_skill_occult_growth")
    private Integer role_skill_occult_growth;
    @Column(name = "role_skill_occult_job")
    private Integer role_skill_occult_job;
    @Column(name = "role_skill_occult_interst")
    private Integer role_skill_occult_interst;
    @Column(name = "role_skill_operate_heavy_machinery_growth")
    private Integer role_skill_operate_heavy_machinery_growth;
    @Column(name = "role_skill_operate_heavy_machinery_job")
    private Integer role_skill_operate_heavy_machinery_job;
    @Column(name = "role_skill_operate_heavy_machinery_interst")
    private Integer role_skill_operate_heavy_machinery_interst;
    @Column(name = "role_skill_persuade_growth")
    private Integer role_skill_persuade_growth;
    @Column(name = "role_skill_persuade_job")
    private Integer role_skill_persuade_job;
    @Column(name = "role_skill_persuade_interst")
    private Integer role_skill_persuade_interst;
    @Column(name = "role_skill_drive_aircraft_growth")
    private Integer role_skill_drive_aircraft_growth;
    @Column(name = "role_skill_drive_aircraft_job")
    private Integer role_skill_drive_aircraft_job;
    @Column(name = "role_skill_drive_aircraft_interst")
    private Integer role_skill_drive_aircraft_interst;
    @Column(name = "role_skill_drive_ship_growth")
    private Integer role_skill_drive_ship_growth;
    @Column(name = "role_skill_drive_ship_job")
    private Integer role_skill_drive_ship_job;
    @Column(name = "role_skill_drive_ship_interst")
    private Integer role_skill_drive_ship_interst;
    @Column(name = "role_skill_psychoanalysis_growth")
    private Integer role_skill_psychoanalysis_growth;
    @Column(name = "role_skill_psychoanalysis_job")
    private Integer role_skill_psychoanalysis_job;
    @Column(name = "role_skill_psychoanalysis_interst")
    private Integer role_skill_psychoanalysis_interst;
    @Column(name = "role_skill_psychology_growth")
    private Integer role_skill_psychology_growth;
    @Column(name = "role_skill_psychology_job")
    private Integer role_skill_psychology_job;
    @Column(name = "role_skill_psychology_interst")
    private Integer role_skill_psychology_interst;
    @Column(name = "role_skill_ride_growth")
    private Integer role_skill_ride_growth;
    @Column(name = "role_skill_ride_job")
    private Integer role_skill_ride_job;
    @Column(name = "role_skill_ride_interst")
    private Integer role_skill_ride_interst;
    @Column(name = "role_skill_science_geology_growth")
    private Integer role_skill_science_geology_growth;
    @Column(name = "role_skill_science_geology_job")
    private Integer role_skill_science_geology_job;
    @Column(name = "role_skill_science_geology_interst")
    private Integer role_skill_science_geology_interst;
    @Column(name = "role_skill_science_chemistry_growth")
    private Integer role_skill_science_chemistry_growth;
    @Column(name = "role_skill_science_chemistry_job")
    private Integer role_skill_science_chemistry_job;
    @Column(name = "role_skill_science_chemistry_interst")
    private Integer role_skill_science_chemistry_interst;
    @Column(name = "role_skill_science_biology_growth")
    private Integer role_skill_science_biology_growth;
    @Column(name = "role_skill_science_biology_job")
    private Integer role_skill_science_biology_job;
    @Column(name = "role_skill_science_biology_interst")
    private Integer role_skill_science_biology_interst;
    @Column(name = "role_skill_science_math_growth")
    private Integer role_skill_science_math_growth;
    @Column(name = "role_skill_science_math_job")
    private Integer role_skill_science_math_job;
    @Column(name = "role_skill_science_math_interst")
    private Integer role_skill_science_math_interst;
    @Column(name = "role_skill_science_astronomy_growth")
    private Integer role_skill_science_astronomy_growth;
    @Column(name = "role_skill_science_astronomy_job")
    private Integer role_skill_science_astronomy_job;
    @Column(name = "role_skill_science_astronomy_interst")
    private Integer role_skill_science_astronomy_interst;
    @Column(name = "role_skill_science_physics_growth")
    private Integer role_skill_science_physics_growth;
    @Column(name = "role_skill_science_physics_job")
    private Integer role_skill_science_physics_job;
    @Column(name = "role_skill_science_physics_interst")
    private Integer role_skill_science_physics_interst;
    @Column(name = "role_skill_science_pharmacy_growth")
    private Integer role_skill_science_pharmacy_growth;
    @Column(name = "role_skill_science_pharmacy_job")
    private Integer role_skill_science_pharmacy_job;
    @Column(name = "role_skill_science_pharmacy_interst")
    private Integer role_skill_science_pharmacy_interst;
    @Column(name = "role_skill_science_botany_growth")
    private Integer role_skill_science_botany_growth;
    @Column(name = "role_skill_science_botany_job")
    private Integer role_skill_science_botany_job;
    @Column(name = "role_skill_science_botany_interst")
    private Integer role_skill_science_botany_interst;
    @Column(name = "role_skill_science_zoology_growth")
    private Integer role_skill_science_zoology_growth;
    @Column(name = "role_skill_science_zoology_job")
    private Integer role_skill_science_zoology_job;
    @Column(name = "role_skill_science_zoology_interst")
    private Integer role_skill_science_zoology_interst;
    @Column(name = "role_skill_science_cryptography_growth")
    private Integer role_skill_science_cryptography_growth;
    @Column(name = "role_skill_science_cryptography_job")
    private Integer role_skill_science_cryptography_job;
    @Column(name = "role_skill_science_cryptography_interst")
    private Integer role_skill_science_cryptography_interst;
    @Column(name = "role_skill_science_engineering_growth")
    private Integer role_skill_science_engineering_growth;
    @Column(name = "role_skill_science_engineering_job")
    private Integer role_skill_science_engineering_job;
    @Column(name = "role_skill_science_engineering_interst")
    private Integer role_skill_science_engineering_interst;
    @Column(name = "role_skill_science_meteorology_growth")
    private Integer role_skill_science_meteorology_growth;
    @Column(name = "role_skill_science_meteorology_job")
    private Integer role_skill_science_meteorology_job;
    @Column(name = "role_skill_science_meteorology_interst")
    private Integer role_skill_science_meteorology_interst;
    @Column(name = "role_skill_science_judicial_science_growth")
    private Integer role_skill_science_judicial_science_growth;
    @Column(name = "role_skill_science_judicial_science_job")
    private Integer role_skill_science_judicial_science_job;
    @Column(name = "role_skill_science_judicial_science_interst")
    private Integer role_skill_science_judicial_science_interst;
    @Column(name = "role_skill_sleight_of_hand_growth")
    private Integer role_skill_sleight_of_hand_growth;
    @Column(name = "role_skill_sleight_of_hand_job")
    private Integer role_skill_sleight_of_hand_job;
    @Column(name = "role_skill_sleight_of_hand_interst")
    private Integer role_skill_sleight_of_hand_interst;
    @Column(name = "role_skill_recon_growth")
    private Integer role_skill_recon_growth;
    @Column(name = "role_skill_recon_job")
    private Integer role_skill_recon_job;
    @Column(name = "role_skill_recon_interst")
    private Integer role_skill_recon_interst;
    @Column(name = "role_skill_stealth_growth")
    private Integer role_skill_stealth_growth;
    @Column(name = "role_skill_stealth_job")
    private Integer role_skill_stealth_job;
    @Column(name = "role_skill_stealth_interst")
    private Integer role_skill_stealth_interst;
    @Column(name = "role_skill_survival_growth")
    private Integer role_skill_survival_growth;
    @Column(name = "role_skill_survival_job")
    private Integer role_skill_survival_job;
    @Column(name = "role_skill_survival_interst")
    private Integer role_skill_survival_interst;
    @Column(name = "role_skill_swim_growth")
    private Integer role_skill_swim_growth;
    @Column(name = "role_skill_swim_job")
    private Integer role_skill_swim_job;
    @Column(name = "role_skill_swim_interst")
    private Integer role_skill_swim_interst;
    @Column(name = "role_skill_beast_training_growth")
    private Integer role_skill_beast_training_growth;
    @Column(name = "role_skill_beast_training_job")
    private Integer role_skill_beast_training_job;
    @Column(name = "role_skill_beast_training_interst")
    private Integer role_skill_beast_training_interst;
    @Column(name = "role_skill_diving_growth")
    private Integer role_skill_diving_growth;
    @Column(name = "role_skill_diving_job")
    private Integer role_skill_diving_job;
    @Column(name = "role_skill_diving_interst")
    private Integer role_skill_diving_interst;
    @Column(name = "role_skill_demolition_growth")
    private Integer role_skill_demolition_growth;
    @Column(name = "role_skill_demolition_job")
    private Integer role_skill_demolition_job;
    @Column(name = "role_skill_demolition_interst")
    private Integer role_skill_demolition_interst;
    @Column(name = "role_skill_read_lips_growth")
    private Integer role_skill_read_lips_growth;
    @Column(name = "role_skill_read_lips_job")
    private Integer role_skill_read_lips_job;
    @Column(name = "role_skill_read_lips_interst")
    private Integer role_skill_read_lips_interst;
    @Column(name = "role_skill_hypnosis_growth")
    private Integer role_skill_hypnosis_growth;
    @Column(name = "role_skill_hypnosis_job")
    private Integer role_skill_hypnosis_job;
    @Column(name = "role_skill_hypnosis_interst")
    private Integer role_skill_hypnosis_interst;
    @Column(name = "role_skill_artillery_growth")
    private Integer role_skill_artillery_growth;
    @Column(name = "role_skill_artillery_job")
    private Integer role_skill_artillery_job;
    @Column(name = "role_skill_artillery_interst")
    private Integer role_skill_artillery_interst;
    @Column(name = "role_skill_lore_type")
    private String role_skill_lore_type;
    @Column(name = "role_skill_lore_val_growth")
    private Integer role_skill_lore_val_growth;
    @Column(name = "role_skill_lore_val_job")
    private Integer role_skill_lore_val_job;
    @Column(name = "role_skill_lore_val_interst")
    private Integer role_skill_lore_val_interst;


    public role() {
    }

    public Integer getRoleCardId() {
        return RoleCardId;
    }

    public void setRoleCardId(Integer roleCardId) {
        RoleCardId = roleCardId;
    }

    public Integer getRoleCardPlayerId() {
        return RoleCardPlayerId;
    }

    public void setRoleCardPlayerId(Integer roleCardPlayerId) {
        RoleCardPlayerId = roleCardPlayerId;
    }

    public String getEra() {
        return Era;
    }

    public void setEra(String era) {
        Era = era;
    }

    public String getRoleName() {
        return RoleName;
    }

    public void setRoleName(String roleName) {
        RoleName = roleName;
    }

    public Integer getRoleGender() {
        return RoleGender;
    }

    public void setRoleGender(Integer roleGender) {
        RoleGender = roleGender;
    }

    public Integer getRoleAge() {
        return RoleAge;
    }

    public void setRoleAge(Integer roleAge) {
        RoleAge = roleAge;
    }

    public String getRoleHomeAddress() {
        return RoleHomeAddress;
    }

    public void setRoleHomeAddress(String roleHomeAddress) {
        RoleHomeAddress = roleHomeAddress;
    }

    public Integer getRoleJobId() {
        return RoleJobId;
    }

    public void setRoleJobId(Integer roleJobId) {
        RoleJobId = roleJobId;
    }

    public String getRoleHometown() {
        return RoleHometown;
    }

    public void setRoleHometown(String roleHometown) {
        RoleHometown = roleHometown;
    }

    public Integer getRoleSTR() {
        return RoleSTR;
    }

    public void setRoleSTR(Integer roleSTR) {
        RoleSTR = roleSTR;
    }

    public Integer getRoleCON() {
        return RoleCON;
    }

    public void setRoleCON(Integer roleCON) {
        RoleCON = roleCON;
    }

    public Integer getRoleSIZ() {
        return RoleSIZ;
    }

    public void setRoleSIZ(Integer roleSIZ) {
        RoleSIZ = roleSIZ;
    }

    public Integer getRoleDEX() {
        return RoleDEX;
    }

    public void setRoleDEX(Integer roleDEX) {
        RoleDEX = roleDEX;
    }

    public Integer getRoleAPP() {
        return RoleAPP;
    }

    public void setRoleAPP(Integer roleAPP) {
        RoleAPP = roleAPP;
    }

    public Integer getRoleINT() {
        return RoleINT;
    }

    public void setRoleINT(Integer roleINT) {
        RoleINT = roleINT;
    }

    public Integer getRolePOW() {
        return RolePOW;
    }

    public void setRolePOW(Integer rolePOW) {
        RolePOW = rolePOW;
    }

    public Integer getRoleEDU() {
        return RoleEDU;
    }

    public void setRoleEDU(Integer roleEDU) {
        RoleEDU = roleEDU;
    }

    public Integer getRoleMOV() {
        return RoleMOV;
    }

    public void setRoleMOV(Integer roleMOV) {
        RoleMOV = roleMOV;
    }

    public String getRoleImgPath() {
        return RoleImgPath;
    }

    public void setRoleImgPath(String roleImgPath) {
        RoleImgPath = roleImgPath;
    }

    public Integer getRoleCurHitPoints() {
        return RoleCurHitPoints;
    }

    public void setRoleCurHitPoints(Integer roleCurHitPoints) {
        RoleCurHitPoints = roleCurHitPoints;
    }

    public Integer getRoleMaxHitPoints() {
        return RoleMaxHitPoints;
    }

    public void setRoleMaxHitPoints(Integer roleMaxHitPoints) {
        RoleMaxHitPoints = roleMaxHitPoints;
    }

    public Integer getRoleCurSanity() {
        return RoleCurSanity;
    }

    public void setRoleCurSanity(Integer roleCurSanity) {
        RoleCurSanity = roleCurSanity;
    }

    public Integer getRoleMaxSanity() {
        return RoleMaxSanity;
    }

    public void setRoleMaxSanity(Integer roleMaxSanity) {
        RoleMaxSanity = roleMaxSanity;
    }

    public Integer getRoleLuck() {
        return RoleLuck;
    }

    public void setRoleLuck(Integer roleLuck) {
        RoleLuck = roleLuck;
    }

    public Integer getRoleCurMagic() {
        return RoleCurMagic;
    }

    public void setRoleCurMagic(Integer roleCurMagic) {
        RoleCurMagic = roleCurMagic;
    }

    public Integer getRoleMaxMagic() {
        return RoleMaxMagic;
    }

    public void setRoleMaxMagic(Integer roleMaxMagic) {
        RoleMaxMagic = roleMaxMagic;
    }

    public String getRolePhysicalStatus() {
        return RolePhysicalStatus;
    }

    public void setRolePhysicalStatus(String rolePhysicalStatus) {
        RolePhysicalStatus = rolePhysicalStatus;
    }

    public String getRoleMentalStatus() {
        return RoleMentalStatus;
    }

    public void setRoleMentalStatus(String roleMentalStatus) {
        RoleMentalStatus = roleMentalStatus;
    }

    public Integer getRole_skill_accounting_growth() {
        return role_skill_accounting_growth;
    }

    public void setRole_skill_accounting_growth(Integer role_skill_accounting_growth) {
        this.role_skill_accounting_growth = role_skill_accounting_growth;
    }

    public Integer getRole_skill_accounting_job() {
        return role_skill_accounting_job;
    }

    public void setRole_skill_accounting_job(Integer role_skill_accounting_job) {
        this.role_skill_accounting_job = role_skill_accounting_job;
    }

    public Integer getRole_skill_accounting_interst() {
        return role_skill_accounting_interst;
    }

    public void setRole_skill_accounting_interst(Integer role_skill_accounting_interst) {
        this.role_skill_accounting_interst = role_skill_accounting_interst;
    }

    public Integer getRole_skill_anthropology_growth() {
        return role_skill_anthropology_growth;
    }

    public void setRole_skill_anthropology_growth(Integer role_skill_anthropology_growth) {
        this.role_skill_anthropology_growth = role_skill_anthropology_growth;
    }

    public Integer getRole_skill_anthropology_job() {
        return role_skill_anthropology_job;
    }

    public void setRole_skill_anthropology_job(Integer role_skill_anthropology_job) {
        this.role_skill_anthropology_job = role_skill_anthropology_job;
    }

    public Integer getRole_skill_anthropology_interst() {
        return role_skill_anthropology_interst;
    }

    public void setRole_skill_anthropology_interst(Integer role_skill_anthropology_interst) {
        this.role_skill_anthropology_interst = role_skill_anthropology_interst;
    }

    public Integer getRole_skill_evaluation_growth() {
        return role_skill_evaluation_growth;
    }

    public void setRole_skill_evaluation_growth(Integer role_skill_evaluation_growth) {
        this.role_skill_evaluation_growth = role_skill_evaluation_growth;
    }

    public Integer getRole_skill_evaluation_job() {
        return role_skill_evaluation_job;
    }

    public void setRole_skill_evaluation_job(Integer role_skill_evaluation_job) {
        this.role_skill_evaluation_job = role_skill_evaluation_job;
    }

    public Integer getRole_skill_evaluation_interst() {
        return role_skill_evaluation_interst;
    }

    public void setRole_skill_evaluation_interst(Integer role_skill_evaluation_interst) {
        this.role_skill_evaluation_interst = role_skill_evaluation_interst;
    }

    public Integer getRole_skill_archaeology_growth() {
        return role_skill_archaeology_growth;
    }

    public void setRole_skill_archaeology_growth(Integer role_skill_archaeology_growth) {
        this.role_skill_archaeology_growth = role_skill_archaeology_growth;
    }

    public Integer getRole_skill_archaeology_job() {
        return role_skill_archaeology_job;
    }

    public void setRole_skill_archaeology_job(Integer role_skill_archaeology_job) {
        this.role_skill_archaeology_job = role_skill_archaeology_job;
    }

    public Integer getRole_skill_archaeology_interst() {
        return role_skill_archaeology_interst;
    }

    public void setRole_skill_archaeology_interst(Integer role_skill_archaeology_interst) {
        this.role_skill_archaeology_interst = role_skill_archaeology_interst;
    }

    public Integer getRole_skill_writing_growth() {
        return role_skill_writing_growth;
    }

    public void setRole_skill_writing_growth(Integer role_skill_writing_growth) {
        this.role_skill_writing_growth = role_skill_writing_growth;
    }

    public Integer getRole_skill_writing_job() {
        return role_skill_writing_job;
    }

    public void setRole_skill_writing_job(Integer role_skill_writing_job) {
        this.role_skill_writing_job = role_skill_writing_job;
    }

    public Integer getRole_skill_writing_interst() {
        return role_skill_writing_interst;
    }

    public void setRole_skill_writing_interst(Integer role_skill_writing_interst) {
        this.role_skill_writing_interst = role_skill_writing_interst;
    }

    public Integer getRole_skill_music_theory_growth() {
        return role_skill_music_theory_growth;
    }

    public void setRole_skill_music_theory_growth(Integer role_skill_music_theory_growth) {
        this.role_skill_music_theory_growth = role_skill_music_theory_growth;
    }

    public Integer getRole_skill_music_theory_job() {
        return role_skill_music_theory_job;
    }

    public void setRole_skill_music_theory_job(Integer role_skill_music_theory_job) {
        this.role_skill_music_theory_job = role_skill_music_theory_job;
    }

    public Integer getRole_skill_music_theory_interst() {
        return role_skill_music_theory_interst;
    }

    public void setRole_skill_music_theory_interst(Integer role_skill_music_theory_interst) {
        this.role_skill_music_theory_interst = role_skill_music_theory_interst;
    }

    public Integer getRole_skill_morris_dance_growth() {
        return role_skill_morris_dance_growth;
    }

    public void setRole_skill_morris_dance_growth(Integer role_skill_morris_dance_growth) {
        this.role_skill_morris_dance_growth = role_skill_morris_dance_growth;
    }

    public Integer getRole_skill_morris_dance_job() {
        return role_skill_morris_dance_job;
    }

    public void setRole_skill_morris_dance_job(Integer role_skill_morris_dance_job) {
        this.role_skill_morris_dance_job = role_skill_morris_dance_job;
    }

    public Integer getRole_skill_morris_dance_interst() {
        return role_skill_morris_dance_interst;
    }

    public void setRole_skill_morris_dance_interst(Integer role_skill_morris_dance_interst) {
        this.role_skill_morris_dance_interst = role_skill_morris_dance_interst;
    }

    public Integer getRole_skill_opera_singing_growth() {
        return role_skill_opera_singing_growth;
    }

    public void setRole_skill_opera_singing_growth(Integer role_skill_opera_singing_growth) {
        this.role_skill_opera_singing_growth = role_skill_opera_singing_growth;
    }

    public Integer getRole_skill_opera_singing_job() {
        return role_skill_opera_singing_job;
    }

    public void setRole_skill_opera_singing_job(Integer role_skill_opera_singing_job) {
        this.role_skill_opera_singing_job = role_skill_opera_singing_job;
    }

    public Integer getRole_skill_opera_singing_interst() {
        return role_skill_opera_singing_interst;
    }

    public void setRole_skill_opera_singing_interst(Integer role_skill_opera_singing_interst) {
        this.role_skill_opera_singing_interst = role_skill_opera_singing_interst;
    }

    public Integer getRole_skill_whitewasher_painter_growth() {
        return role_skill_whitewasher_painter_growth;
    }

    public void setRole_skill_whitewasher_painter_growth(Integer role_skill_whitewasher_painter_growth) {
        this.role_skill_whitewasher_painter_growth = role_skill_whitewasher_painter_growth;
    }

    public Integer getRole_skill_whitewasher_painter_job() {
        return role_skill_whitewasher_painter_job;
    }

    public void setRole_skill_whitewasher_painter_job(Integer role_skill_whitewasher_painter_job) {
        this.role_skill_whitewasher_painter_job = role_skill_whitewasher_painter_job;
    }

    public Integer getRole_skill_whitewasher_painter_interst() {
        return role_skill_whitewasher_painter_interst;
    }

    public void setRole_skill_whitewasher_painter_interst(Integer role_skill_whitewasher_painter_interst) {
        this.role_skill_whitewasher_painter_interst = role_skill_whitewasher_painter_interst;
    }

    public Integer getRole_skill_photography_growth() {
        return role_skill_photography_growth;
    }

    public void setRole_skill_photography_growth(Integer role_skill_photography_growth) {
        this.role_skill_photography_growth = role_skill_photography_growth;
    }

    public Integer getRole_skill_photography_job() {
        return role_skill_photography_job;
    }

    public void setRole_skill_photography_job(Integer role_skill_photography_job) {
        this.role_skill_photography_job = role_skill_photography_job;
    }

    public Integer getRole_skill_photography_interst() {
        return role_skill_photography_interst;
    }

    public void setRole_skill_photography_interst(Integer role_skill_photography_interst) {
        this.role_skill_photography_interst = role_skill_photography_interst;
    }

    public Integer getRole_skill_dance_growth() {
        return role_skill_dance_growth;
    }

    public void setRole_skill_dance_growth(Integer role_skill_dance_growth) {
        this.role_skill_dance_growth = role_skill_dance_growth;
    }

    public Integer getRole_skill_dance_job() {
        return role_skill_dance_job;
    }

    public void setRole_skill_dance_job(Integer role_skill_dance_job) {
        this.role_skill_dance_job = role_skill_dance_job;
    }

    public Integer getRole_skill_dance_interst() {
        return role_skill_dance_interst;
    }

    public void setRole_skill_dance_interst(Integer role_skill_dance_interst) {
        this.role_skill_dance_interst = role_skill_dance_interst;
    }

    public Integer getRole_skill_art_growth() {
        return role_skill_art_growth;
    }

    public void setRole_skill_art_growth(Integer role_skill_art_growth) {
        this.role_skill_art_growth = role_skill_art_growth;
    }

    public Integer getRole_skill_art_job() {
        return role_skill_art_job;
    }

    public void setRole_skill_art_job(Integer role_skill_art_job) {
        this.role_skill_art_job = role_skill_art_job;
    }

    public Integer getRole_skill_art_interst() {
        return role_skill_art_interst;
    }

    public void setRole_skill_art_interst(Integer role_skill_art_interst) {
        this.role_skill_art_interst = role_skill_art_interst;
    }

    public Integer getRole_skill_forge_growth() {
        return role_skill_forge_growth;
    }

    public void setRole_skill_forge_growth(Integer role_skill_forge_growth) {
        this.role_skill_forge_growth = role_skill_forge_growth;
    }

    public Integer getRole_skill_forge_job() {
        return role_skill_forge_job;
    }

    public void setRole_skill_forge_job(Integer role_skill_forge_job) {
        this.role_skill_forge_job = role_skill_forge_job;
    }

    public Integer getRole_skill_forge_interst() {
        return role_skill_forge_interst;
    }

    public void setRole_skill_forge_interst(Integer role_skill_forge_interst) {
        this.role_skill_forge_interst = role_skill_forge_interst;
    }

    public Integer getRole_skill_pottery_making_growth() {
        return role_skill_pottery_making_growth;
    }

    public void setRole_skill_pottery_making_growth(Integer role_skill_pottery_making_growth) {
        this.role_skill_pottery_making_growth = role_skill_pottery_making_growth;
    }

    public Integer getRole_skill_pottery_making_job() {
        return role_skill_pottery_making_job;
    }

    public void setRole_skill_pottery_making_job(Integer role_skill_pottery_making_job) {
        this.role_skill_pottery_making_job = role_skill_pottery_making_job;
    }

    public Integer getRole_skill_pottery_making_interst() {
        return role_skill_pottery_making_interst;
    }

    public void setRole_skill_pottery_making_interst(Integer role_skill_pottery_making_interst) {
        this.role_skill_pottery_making_interst = role_skill_pottery_making_interst;
    }

    public Integer getRole_skill_technical_drawing_growth() {
        return role_skill_technical_drawing_growth;
    }

    public void setRole_skill_technical_drawing_growth(Integer role_skill_technical_drawing_growth) {
        this.role_skill_technical_drawing_growth = role_skill_technical_drawing_growth;
    }

    public Integer getRole_skill_technical_drawing_job() {
        return role_skill_technical_drawing_job;
    }

    public void setRole_skill_technical_drawing_job(Integer role_skill_technical_drawing_job) {
        this.role_skill_technical_drawing_job = role_skill_technical_drawing_job;
    }

    public Integer getRole_skill_technical_drawing_interst() {
        return role_skill_technical_drawing_interst;
    }

    public void setRole_skill_technical_drawing_interst(Integer role_skill_technical_drawing_interst) {
        this.role_skill_technical_drawing_interst = role_skill_technical_drawing_interst;
    }

    public Integer getRole_skill_farming_growth() {
        return role_skill_farming_growth;
    }

    public void setRole_skill_farming_growth(Integer role_skill_farming_growth) {
        this.role_skill_farming_growth = role_skill_farming_growth;
    }

    public Integer getRole_skill_farming_job() {
        return role_skill_farming_job;
    }

    public void setRole_skill_farming_job(Integer role_skill_farming_job) {
        this.role_skill_farming_job = role_skill_farming_job;
    }

    public Integer getRole_skill_farming_interst() {
        return role_skill_farming_interst;
    }

    public void setRole_skill_farming_interst(Integer role_skill_farming_interst) {
        this.role_skill_farming_interst = role_skill_farming_interst;
    }

    public Integer getRole_skill_typing_growth() {
        return role_skill_typing_growth;
    }

    public void setRole_skill_typing_growth(Integer role_skill_typing_growth) {
        this.role_skill_typing_growth = role_skill_typing_growth;
    }

    public Integer getRole_skill_typing_job() {
        return role_skill_typing_job;
    }

    public void setRole_skill_typing_job(Integer role_skill_typing_job) {
        this.role_skill_typing_job = role_skill_typing_job;
    }

    public Integer getRole_skill_typing_interst() {
        return role_skill_typing_interst;
    }

    public void setRole_skill_typing_interst(Integer role_skill_typing_interst) {
        this.role_skill_typing_interst = role_skill_typing_interst;
    }

    public Integer getRole_skill_shorthand_growth() {
        return role_skill_shorthand_growth;
    }

    public void setRole_skill_shorthand_growth(Integer role_skill_shorthand_growth) {
        this.role_skill_shorthand_growth = role_skill_shorthand_growth;
    }

    public Integer getRole_skill_shorthand_job() {
        return role_skill_shorthand_job;
    }

    public void setRole_skill_shorthand_job(Integer role_skill_shorthand_job) {
        this.role_skill_shorthand_job = role_skill_shorthand_job;
    }

    public Integer getRole_skill_shorthand_interst() {
        return role_skill_shorthand_interst;
    }

    public void setRole_skill_shorthand_interst(Integer role_skill_shorthand_interst) {
        this.role_skill_shorthand_interst = role_skill_shorthand_interst;
    }

    public Integer getRole_skill_blown_glass_tube_growth() {
        return role_skill_blown_glass_tube_growth;
    }

    public void setRole_skill_blown_glass_tube_growth(Integer role_skill_blown_glass_tube_growth) {
        this.role_skill_blown_glass_tube_growth = role_skill_blown_glass_tube_growth;
    }

    public Integer getRole_skill_blown_glass_tube_job() {
        return role_skill_blown_glass_tube_job;
    }

    public void setRole_skill_blown_glass_tube_job(Integer role_skill_blown_glass_tube_job) {
        this.role_skill_blown_glass_tube_job = role_skill_blown_glass_tube_job;
    }

    public Integer getRole_skill_blown_glass_tube_interst() {
        return role_skill_blown_glass_tube_interst;
    }

    public void setRole_skill_blown_glass_tube_interst(Integer role_skill_blown_glass_tube_interst) {
        this.role_skill_blown_glass_tube_interst = role_skill_blown_glass_tube_interst;
    }

    public Integer getRole_skill_tailor_growth() {
        return role_skill_tailor_growth;
    }

    public void setRole_skill_tailor_growth(Integer role_skill_tailor_growth) {
        this.role_skill_tailor_growth = role_skill_tailor_growth;
    }

    public Integer getRole_skill_tailor_job() {
        return role_skill_tailor_job;
    }

    public void setRole_skill_tailor_job(Integer role_skill_tailor_job) {
        this.role_skill_tailor_job = role_skill_tailor_job;
    }

    public Integer getRole_skill_tailor_interst() {
        return role_skill_tailor_interst;
    }

    public void setRole_skill_tailor_interst(Integer role_skill_tailor_interst) {
        this.role_skill_tailor_interst = role_skill_tailor_interst;
    }

    public Integer getRole_skill_make_wine_growth() {
        return role_skill_make_wine_growth;
    }

    public void setRole_skill_make_wine_growth(Integer role_skill_make_wine_growth) {
        this.role_skill_make_wine_growth = role_skill_make_wine_growth;
    }

    public Integer getRole_skill_make_wine_job() {
        return role_skill_make_wine_job;
    }

    public void setRole_skill_make_wine_job(Integer role_skill_make_wine_job) {
        this.role_skill_make_wine_job = role_skill_make_wine_job;
    }

    public Integer getRole_skill_make_wine_interst() {
        return role_skill_make_wine_interst;
    }

    public void setRole_skill_make_wine_interst(Integer role_skill_make_wine_interst) {
        this.role_skill_make_wine_interst = role_skill_make_wine_interst;
    }

    public Integer getRole_skill_fishing_growth() {
        return role_skill_fishing_growth;
    }

    public void setRole_skill_fishing_growth(Integer role_skill_fishing_growth) {
        this.role_skill_fishing_growth = role_skill_fishing_growth;
    }

    public Integer getRole_skill_fishing_job() {
        return role_skill_fishing_job;
    }

    public void setRole_skill_fishing_job(Integer role_skill_fishing_job) {
        this.role_skill_fishing_job = role_skill_fishing_job;
    }

    public Integer getRole_skill_fishing_interst() {
        return role_skill_fishing_interst;
    }

    public void setRole_skill_fishing_interst(Integer role_skill_fishing_interst) {
        this.role_skill_fishing_interst = role_skill_fishing_interst;
    }

    public Integer getRole_skill_sculpture_growth() {
        return role_skill_sculpture_growth;
    }

    public void setRole_skill_sculpture_growth(Integer role_skill_sculpture_growth) {
        this.role_skill_sculpture_growth = role_skill_sculpture_growth;
    }

    public Integer getRole_skill_sculpture_job() {
        return role_skill_sculpture_job;
    }

    public void setRole_skill_sculpture_job(Integer role_skill_sculpture_job) {
        this.role_skill_sculpture_job = role_skill_sculpture_job;
    }

    public Integer getRole_skill_sculpture_interst() {
        return role_skill_sculpture_interst;
    }

    public void setRole_skill_sculpture_interst(Integer role_skill_sculpture_interst) {
        this.role_skill_sculpture_interst = role_skill_sculpture_interst;
    }

    public Integer getRole_skill_acrobatics_growth() {
        return role_skill_acrobatics_growth;
    }

    public void setRole_skill_acrobatics_growth(Integer role_skill_acrobatics_growth) {
        this.role_skill_acrobatics_growth = role_skill_acrobatics_growth;
    }

    public Integer getRole_skill_acrobatics_job() {
        return role_skill_acrobatics_job;
    }

    public void setRole_skill_acrobatics_job(Integer role_skill_acrobatics_job) {
        this.role_skill_acrobatics_job = role_skill_acrobatics_job;
    }

    public Integer getRole_skill_acrobatics_interst() {
        return role_skill_acrobatics_interst;
    }

    public void setRole_skill_acrobatics_interst(Integer role_skill_acrobatics_interst) {
        this.role_skill_acrobatics_interst = role_skill_acrobatics_interst;
    }

    public Integer getRole_skill_seduce_growth() {
        return role_skill_seduce_growth;
    }

    public void setRole_skill_seduce_growth(Integer role_skill_seduce_growth) {
        this.role_skill_seduce_growth = role_skill_seduce_growth;
    }

    public Integer getRole_skill_seduce_job() {
        return role_skill_seduce_job;
    }

    public void setRole_skill_seduce_job(Integer role_skill_seduce_job) {
        this.role_skill_seduce_job = role_skill_seduce_job;
    }

    public Integer getRole_skill_seduce_interst() {
        return role_skill_seduce_interst;
    }

    public void setRole_skill_seduce_interst(Integer role_skill_seduce_interst) {
        this.role_skill_seduce_interst = role_skill_seduce_interst;
    }

    public Integer getRole_skill_climb_growth() {
        return role_skill_climb_growth;
    }

    public void setRole_skill_climb_growth(Integer role_skill_climb_growth) {
        this.role_skill_climb_growth = role_skill_climb_growth;
    }

    public Integer getRole_skill_climb_job() {
        return role_skill_climb_job;
    }

    public void setRole_skill_climb_job(Integer role_skill_climb_job) {
        this.role_skill_climb_job = role_skill_climb_job;
    }

    public Integer getRole_skill_climb_interst() {
        return role_skill_climb_interst;
    }

    public void setRole_skill_climb_interst(Integer role_skill_climb_interst) {
        this.role_skill_climb_interst = role_skill_climb_interst;
    }

    public Integer getRole_skill_computer_growth() {
        return role_skill_computer_growth;
    }

    public void setRole_skill_computer_growth(Integer role_skill_computer_growth) {
        this.role_skill_computer_growth = role_skill_computer_growth;
    }

    public Integer getRole_skill_computer_job() {
        return role_skill_computer_job;
    }

    public void setRole_skill_computer_job(Integer role_skill_computer_job) {
        this.role_skill_computer_job = role_skill_computer_job;
    }

    public Integer getRole_skill_computer_interst() {
        return role_skill_computer_interst;
    }

    public void setRole_skill_computer_interst(Integer role_skill_computer_interst) {
        this.role_skill_computer_interst = role_skill_computer_interst;
    }

    public Integer getRole_skill_credit_growth() {
        return role_skill_credit_growth;
    }

    public void setRole_skill_credit_growth(Integer role_skill_credit_growth) {
        this.role_skill_credit_growth = role_skill_credit_growth;
    }

    public Integer getRole_skill_credit_job() {
        return role_skill_credit_job;
    }

    public void setRole_skill_credit_job(Integer role_skill_credit_job) {
        this.role_skill_credit_job = role_skill_credit_job;
    }

    public Integer getRole_skill_credit_interst() {
        return role_skill_credit_interst;
    }

    public void setRole_skill_credit_interst(Integer role_skill_credit_interst) {
        this.role_skill_credit_interst = role_skill_credit_interst;
    }

    public Integer getRole_skill_cthulhu_mythos_growth() {
        return role_skill_cthulhu_mythos_growth;
    }

    public void setRole_skill_cthulhu_mythos_growth(Integer role_skill_cthulhu_mythos_growth) {
        this.role_skill_cthulhu_mythos_growth = role_skill_cthulhu_mythos_growth;
    }

    public Integer getRole_skill_cthulhu_mythos_job() {
        return role_skill_cthulhu_mythos_job;
    }

    public void setRole_skill_cthulhu_mythos_job(Integer role_skill_cthulhu_mythos_job) {
        this.role_skill_cthulhu_mythos_job = role_skill_cthulhu_mythos_job;
    }

    public Integer getRole_skill_cthulhu_mythos_interst() {
        return role_skill_cthulhu_mythos_interst;
    }

    public void setRole_skill_cthulhu_mythos_interst(Integer role_skill_cthulhu_mythos_interst) {
        this.role_skill_cthulhu_mythos_interst = role_skill_cthulhu_mythos_interst;
    }

    public Integer getRole_skill_disguise_growth() {
        return role_skill_disguise_growth;
    }

    public void setRole_skill_disguise_growth(Integer role_skill_disguise_growth) {
        this.role_skill_disguise_growth = role_skill_disguise_growth;
    }

    public Integer getRole_skill_disguise_job() {
        return role_skill_disguise_job;
    }

    public void setRole_skill_disguise_job(Integer role_skill_disguise_job) {
        this.role_skill_disguise_job = role_skill_disguise_job;
    }

    public Integer getRole_skill_disguise_interst() {
        return role_skill_disguise_interst;
    }

    public void setRole_skill_disguise_interst(Integer role_skill_disguise_interst) {
        this.role_skill_disguise_interst = role_skill_disguise_interst;
    }

    public Integer getRole_skill_dodge_growth() {
        return role_skill_dodge_growth;
    }

    public void setRole_skill_dodge_growth(Integer role_skill_dodge_growth) {
        this.role_skill_dodge_growth = role_skill_dodge_growth;
    }

    public Integer getRole_skill_dodge_job() {
        return role_skill_dodge_job;
    }

    public void setRole_skill_dodge_job(Integer role_skill_dodge_job) {
        this.role_skill_dodge_job = role_skill_dodge_job;
    }

    public Integer getRole_skill_dodge_interst() {
        return role_skill_dodge_interst;
    }

    public void setRole_skill_dodge_interst(Integer role_skill_dodge_interst) {
        this.role_skill_dodge_interst = role_skill_dodge_interst;
    }

    public Integer getRole_skill_car_driving_growth() {
        return role_skill_car_driving_growth;
    }

    public void setRole_skill_car_driving_growth(Integer role_skill_car_driving_growth) {
        this.role_skill_car_driving_growth = role_skill_car_driving_growth;
    }

    public Integer getRole_skill_car_driving_job() {
        return role_skill_car_driving_job;
    }

    public void setRole_skill_car_driving_job(Integer role_skill_car_driving_job) {
        this.role_skill_car_driving_job = role_skill_car_driving_job;
    }

    public Integer getRole_skill_car_driving_interst() {
        return role_skill_car_driving_interst;
    }

    public void setRole_skill_car_driving_interst(Integer role_skill_car_driving_interst) {
        this.role_skill_car_driving_interst = role_skill_car_driving_interst;
    }

    public Integer getRole_skill_electrical_maintenance_growth() {
        return role_skill_electrical_maintenance_growth;
    }

    public void setRole_skill_electrical_maintenance_growth(Integer role_skill_electrical_maintenance_growth) {
        this.role_skill_electrical_maintenance_growth = role_skill_electrical_maintenance_growth;
    }

    public Integer getRole_skill_electrical_maintenance_job() {
        return role_skill_electrical_maintenance_job;
    }

    public void setRole_skill_electrical_maintenance_job(Integer role_skill_electrical_maintenance_job) {
        this.role_skill_electrical_maintenance_job = role_skill_electrical_maintenance_job;
    }

    public Integer getRole_skill_electrical_maintenance_interst() {
        return role_skill_electrical_maintenance_interst;
    }

    public void setRole_skill_electrical_maintenance_interst(Integer role_skill_electrical_maintenance_interst) {
        this.role_skill_electrical_maintenance_interst = role_skill_electrical_maintenance_interst;
    }

    public Integer getRole_skill_electronics_growth() {
        return role_skill_electronics_growth;
    }

    public void setRole_skill_electronics_growth(Integer role_skill_electronics_growth) {
        this.role_skill_electronics_growth = role_skill_electronics_growth;
    }

    public Integer getRole_skill_electronics_job() {
        return role_skill_electronics_job;
    }

    public void setRole_skill_electronics_job(Integer role_skill_electronics_job) {
        this.role_skill_electronics_job = role_skill_electronics_job;
    }

    public Integer getRole_skill_electronics_interst() {
        return role_skill_electronics_interst;
    }

    public void setRole_skill_electronics_interst(Integer role_skill_electronics_interst) {
        this.role_skill_electronics_interst = role_skill_electronics_interst;
    }

    public Integer getRole_skill_speech_skill_growth() {
        return role_skill_speech_skill_growth;
    }

    public void setRole_skill_speech_skill_growth(Integer role_skill_speech_skill_growth) {
        this.role_skill_speech_skill_growth = role_skill_speech_skill_growth;
    }

    public Integer getRole_skill_speech_skill_job() {
        return role_skill_speech_skill_job;
    }

    public void setRole_skill_speech_skill_job(Integer role_skill_speech_skill_job) {
        this.role_skill_speech_skill_job = role_skill_speech_skill_job;
    }

    public Integer getRole_skill_speech_skill_interst() {
        return role_skill_speech_skill_interst;
    }

    public void setRole_skill_speech_skill_interst(Integer role_skill_speech_skill_interst) {
        this.role_skill_speech_skill_interst = role_skill_speech_skill_interst;
    }

    public Integer getRole_skill_combat_fight_growth() {
        return role_skill_combat_fight_growth;
    }

    public void setRole_skill_combat_fight_growth(Integer role_skill_combat_fight_growth) {
        this.role_skill_combat_fight_growth = role_skill_combat_fight_growth;
    }

    public Integer getRole_skill_combat_fight_job() {
        return role_skill_combat_fight_job;
    }

    public void setRole_skill_combat_fight_job(Integer role_skill_combat_fight_job) {
        this.role_skill_combat_fight_job = role_skill_combat_fight_job;
    }

    public Integer getRole_skill_combat_fight_interst() {
        return role_skill_combat_fight_interst;
    }

    public void setRole_skill_combat_fight_interst(Integer role_skill_combat_fight_interst) {
        this.role_skill_combat_fight_interst = role_skill_combat_fight_interst;
    }

    public Integer getRole_skill_combat_whip_growth() {
        return role_skill_combat_whip_growth;
    }

    public void setRole_skill_combat_whip_growth(Integer role_skill_combat_whip_growth) {
        this.role_skill_combat_whip_growth = role_skill_combat_whip_growth;
    }

    public Integer getRole_skill_combat_whip_job() {
        return role_skill_combat_whip_job;
    }

    public void setRole_skill_combat_whip_job(Integer role_skill_combat_whip_job) {
        this.role_skill_combat_whip_job = role_skill_combat_whip_job;
    }

    public Integer getRole_skill_combat_whip_interst() {
        return role_skill_combat_whip_interst;
    }

    public void setRole_skill_combat_whip_interst(Integer role_skill_combat_whip_interst) {
        this.role_skill_combat_whip_interst = role_skill_combat_whip_interst;
    }

    public Integer getRole_skill_combat_electric_saw_growth() {
        return role_skill_combat_electric_saw_growth;
    }

    public void setRole_skill_combat_electric_saw_growth(Integer role_skill_combat_electric_saw_growth) {
        this.role_skill_combat_electric_saw_growth = role_skill_combat_electric_saw_growth;
    }

    public Integer getRole_skill_combat_electric_saw_job() {
        return role_skill_combat_electric_saw_job;
    }

    public void setRole_skill_combat_electric_saw_job(Integer role_skill_combat_electric_saw_job) {
        this.role_skill_combat_electric_saw_job = role_skill_combat_electric_saw_job;
    }

    public Integer getRole_skill_combat_electric_saw_interst() {
        return role_skill_combat_electric_saw_interst;
    }

    public void setRole_skill_combat_electric_saw_interst(Integer role_skill_combat_electric_saw_interst) {
        this.role_skill_combat_electric_saw_interst = role_skill_combat_electric_saw_interst;
    }

    public Integer getRole_skill_combat_axe_growth() {
        return role_skill_combat_axe_growth;
    }

    public void setRole_skill_combat_axe_growth(Integer role_skill_combat_axe_growth) {
        this.role_skill_combat_axe_growth = role_skill_combat_axe_growth;
    }

    public Integer getRole_skill_combat_axe_job() {
        return role_skill_combat_axe_job;
    }

    public void setRole_skill_combat_axe_job(Integer role_skill_combat_axe_job) {
        this.role_skill_combat_axe_job = role_skill_combat_axe_job;
    }

    public Integer getRole_skill_combat_axe_interst() {
        return role_skill_combat_axe_interst;
    }

    public void setRole_skill_combat_axe_interst(Integer role_skill_combat_axe_interst) {
        this.role_skill_combat_axe_interst = role_skill_combat_axe_interst;
    }

    public Integer getRole_skill_combat_sword_growth() {
        return role_skill_combat_sword_growth;
    }

    public void setRole_skill_combat_sword_growth(Integer role_skill_combat_sword_growth) {
        this.role_skill_combat_sword_growth = role_skill_combat_sword_growth;
    }

    public Integer getRole_skill_combat_sword_job() {
        return role_skill_combat_sword_job;
    }

    public void setRole_skill_combat_sword_job(Integer role_skill_combat_sword_job) {
        this.role_skill_combat_sword_job = role_skill_combat_sword_job;
    }

    public Integer getRole_skill_combat_sword_interst() {
        return role_skill_combat_sword_interst;
    }

    public void setRole_skill_combat_sword_interst(Integer role_skill_combat_sword_interst) {
        this.role_skill_combat_sword_interst = role_skill_combat_sword_interst;
    }

    public Integer getRole_skill_combat_hinge_growth() {
        return role_skill_combat_hinge_growth;
    }

    public void setRole_skill_combat_hinge_growth(Integer role_skill_combat_hinge_growth) {
        this.role_skill_combat_hinge_growth = role_skill_combat_hinge_growth;
    }

    public Integer getRole_skill_combat_hinge_job() {
        return role_skill_combat_hinge_job;
    }

    public void setRole_skill_combat_hinge_job(Integer role_skill_combat_hinge_job) {
        this.role_skill_combat_hinge_job = role_skill_combat_hinge_job;
    }

    public Integer getRole_skill_combat_hinge_interst() {
        return role_skill_combat_hinge_interst;
    }

    public void setRole_skill_combat_hinge_interst(Integer role_skill_combat_hinge_interst) {
        this.role_skill_combat_hinge_interst = role_skill_combat_hinge_interst;
    }

    public Integer getRole_skill_combat_flail_growth() {
        return role_skill_combat_flail_growth;
    }

    public void setRole_skill_combat_flail_growth(Integer role_skill_combat_flail_growth) {
        this.role_skill_combat_flail_growth = role_skill_combat_flail_growth;
    }

    public Integer getRole_skill_combat_flail_job() {
        return role_skill_combat_flail_job;
    }

    public void setRole_skill_combat_flail_job(Integer role_skill_combat_flail_job) {
        this.role_skill_combat_flail_job = role_skill_combat_flail_job;
    }

    public Integer getRole_skill_combat_flail_interst() {
        return role_skill_combat_flail_interst;
    }

    public void setRole_skill_combat_flail_interst(Integer role_skill_combat_flail_interst) {
        this.role_skill_combat_flail_interst = role_skill_combat_flail_interst;
    }

    public Integer getRole_skill_combat_spear_growth() {
        return role_skill_combat_spear_growth;
    }

    public void setRole_skill_combat_spear_growth(Integer role_skill_combat_spear_growth) {
        this.role_skill_combat_spear_growth = role_skill_combat_spear_growth;
    }

    public Integer getRole_skill_combat_spear_job() {
        return role_skill_combat_spear_job;
    }

    public void setRole_skill_combat_spear_job(Integer role_skill_combat_spear_job) {
        this.role_skill_combat_spear_job = role_skill_combat_spear_job;
    }

    public Integer getRole_skill_combat_spear_interst() {
        return role_skill_combat_spear_interst;
    }

    public void setRole_skill_combat_spear_interst(Integer role_skill_combat_spear_interst) {
        this.role_skill_combat_spear_interst = role_skill_combat_spear_interst;
    }

    public Integer getRole_skill_shoot_pistol_growth() {
        return role_skill_shoot_pistol_growth;
    }

    public void setRole_skill_shoot_pistol_growth(Integer role_skill_shoot_pistol_growth) {
        this.role_skill_shoot_pistol_growth = role_skill_shoot_pistol_growth;
    }

    public Integer getRole_skill_shoot_pistol_job() {
        return role_skill_shoot_pistol_job;
    }

    public void setRole_skill_shoot_pistol_job(Integer role_skill_shoot_pistol_job) {
        this.role_skill_shoot_pistol_job = role_skill_shoot_pistol_job;
    }

    public Integer getRole_skill_shoot_pistol_interst() {
        return role_skill_shoot_pistol_interst;
    }

    public void setRole_skill_shoot_pistol_interst(Integer role_skill_shoot_pistol_interst) {
        this.role_skill_shoot_pistol_interst = role_skill_shoot_pistol_interst;
    }

    public Integer getRole_skill_shoot_rifle_shotgun_growth() {
        return role_skill_shoot_rifle_shotgun_growth;
    }

    public void setRole_skill_shoot_rifle_shotgun_growth(Integer role_skill_shoot_rifle_shotgun_growth) {
        this.role_skill_shoot_rifle_shotgun_growth = role_skill_shoot_rifle_shotgun_growth;
    }

    public Integer getRole_skill_shoot_rifle_shotgun_job() {
        return role_skill_shoot_rifle_shotgun_job;
    }

    public void setRole_skill_shoot_rifle_shotgun_job(Integer role_skill_shoot_rifle_shotgun_job) {
        this.role_skill_shoot_rifle_shotgun_job = role_skill_shoot_rifle_shotgun_job;
    }

    public Integer getRole_skill_shoot_rifle_shotgun_interst() {
        return role_skill_shoot_rifle_shotgun_interst;
    }

    public void setRole_skill_shoot_rifle_shotgun_interst(Integer role_skill_shoot_rifle_shotgun_interst) {
        this.role_skill_shoot_rifle_shotgun_interst = role_skill_shoot_rifle_shotgun_interst;
    }

    public Integer getRole_skill_shoot_archery_growth() {
        return role_skill_shoot_archery_growth;
    }

    public void setRole_skill_shoot_archery_growth(Integer role_skill_shoot_archery_growth) {
        this.role_skill_shoot_archery_growth = role_skill_shoot_archery_growth;
    }

    public Integer getRole_skill_shoot_archery_job() {
        return role_skill_shoot_archery_job;
    }

    public void setRole_skill_shoot_archery_job(Integer role_skill_shoot_archery_job) {
        this.role_skill_shoot_archery_job = role_skill_shoot_archery_job;
    }

    public Integer getRole_skill_shoot_archery_interst() {
        return role_skill_shoot_archery_interst;
    }

    public void setRole_skill_shoot_archery_interst(Integer role_skill_shoot_archery_interst) {
        this.role_skill_shoot_archery_interst = role_skill_shoot_archery_interst;
    }

    public Integer getRole_skill_shoot_flame_thrower_growth() {
        return role_skill_shoot_flame_thrower_growth;
    }

    public void setRole_skill_shoot_flame_thrower_growth(Integer role_skill_shoot_flame_thrower_growth) {
        this.role_skill_shoot_flame_thrower_growth = role_skill_shoot_flame_thrower_growth;
    }

    public Integer getRole_skill_shoot_flame_thrower_job() {
        return role_skill_shoot_flame_thrower_job;
    }

    public void setRole_skill_shoot_flame_thrower_job(Integer role_skill_shoot_flame_thrower_job) {
        this.role_skill_shoot_flame_thrower_job = role_skill_shoot_flame_thrower_job;
    }

    public Integer getRole_skill_shoot_flame_thrower_interst() {
        return role_skill_shoot_flame_thrower_interst;
    }

    public void setRole_skill_shoot_flame_thrower_interst(Integer role_skill_shoot_flame_thrower_interst) {
        this.role_skill_shoot_flame_thrower_interst = role_skill_shoot_flame_thrower_interst;
    }

    public Integer getRole_skill_shoot_machine_gun_growth() {
        return role_skill_shoot_machine_gun_growth;
    }

    public void setRole_skill_shoot_machine_gun_growth(Integer role_skill_shoot_machine_gun_growth) {
        this.role_skill_shoot_machine_gun_growth = role_skill_shoot_machine_gun_growth;
    }

    public Integer getRole_skill_shoot_machine_gun_job() {
        return role_skill_shoot_machine_gun_job;
    }

    public void setRole_skill_shoot_machine_gun_job(Integer role_skill_shoot_machine_gun_job) {
        this.role_skill_shoot_machine_gun_job = role_skill_shoot_machine_gun_job;
    }

    public Integer getRole_skill_shoot_machine_gun_interst() {
        return role_skill_shoot_machine_gun_interst;
    }

    public void setRole_skill_shoot_machine_gun_interst(Integer role_skill_shoot_machine_gun_interst) {
        this.role_skill_shoot_machine_gun_interst = role_skill_shoot_machine_gun_interst;
    }

    public Integer getRole_skill_shoot_heavy_weapon_growth() {
        return role_skill_shoot_heavy_weapon_growth;
    }

    public void setRole_skill_shoot_heavy_weapon_growth(Integer role_skill_shoot_heavy_weapon_growth) {
        this.role_skill_shoot_heavy_weapon_growth = role_skill_shoot_heavy_weapon_growth;
    }

    public Integer getRole_skill_shoot_heavy_weapon_job() {
        return role_skill_shoot_heavy_weapon_job;
    }

    public void setRole_skill_shoot_heavy_weapon_job(Integer role_skill_shoot_heavy_weapon_job) {
        this.role_skill_shoot_heavy_weapon_job = role_skill_shoot_heavy_weapon_job;
    }

    public Integer getRole_skill_shoot_heavy_weapon_interst() {
        return role_skill_shoot_heavy_weapon_interst;
    }

    public void setRole_skill_shoot_heavy_weapon_interst(Integer role_skill_shoot_heavy_weapon_interst) {
        this.role_skill_shoot_heavy_weapon_interst = role_skill_shoot_heavy_weapon_interst;
    }

    public Integer getRole_skill_first_aid_growth() {
        return role_skill_first_aid_growth;
    }

    public void setRole_skill_first_aid_growth(Integer role_skill_first_aid_growth) {
        this.role_skill_first_aid_growth = role_skill_first_aid_growth;
    }

    public Integer getRole_skill_first_aid_job() {
        return role_skill_first_aid_job;
    }

    public void setRole_skill_first_aid_job(Integer role_skill_first_aid_job) {
        this.role_skill_first_aid_job = role_skill_first_aid_job;
    }

    public Integer getRole_skill_first_aid_interst() {
        return role_skill_first_aid_interst;
    }

    public void setRole_skill_first_aid_interst(Integer role_skill_first_aid_interst) {
        this.role_skill_first_aid_interst = role_skill_first_aid_interst;
    }

    public Integer getRole_skill_history_growth() {
        return role_skill_history_growth;
    }

    public void setRole_skill_history_growth(Integer role_skill_history_growth) {
        this.role_skill_history_growth = role_skill_history_growth;
    }

    public Integer getRole_skill_history_job() {
        return role_skill_history_job;
    }

    public void setRole_skill_history_job(Integer role_skill_history_job) {
        this.role_skill_history_job = role_skill_history_job;
    }

    public Integer getRole_skill_history_interst() {
        return role_skill_history_interst;
    }

    public void setRole_skill_history_interst(Integer role_skill_history_interst) {
        this.role_skill_history_interst = role_skill_history_interst;
    }

    public Integer getRole_skill_threaten_growth() {
        return role_skill_threaten_growth;
    }

    public void setRole_skill_threaten_growth(Integer role_skill_threaten_growth) {
        this.role_skill_threaten_growth = role_skill_threaten_growth;
    }

    public Integer getRole_skill_threaten_job() {
        return role_skill_threaten_job;
    }

    public void setRole_skill_threaten_job(Integer role_skill_threaten_job) {
        this.role_skill_threaten_job = role_skill_threaten_job;
    }

    public Integer getRole_skill_threaten_interst() {
        return role_skill_threaten_interst;
    }

    public void setRole_skill_threaten_interst(Integer role_skill_threaten_interst) {
        this.role_skill_threaten_interst = role_skill_threaten_interst;
    }

    public Integer getRole_skill_jump_growth() {
        return role_skill_jump_growth;
    }

    public void setRole_skill_jump_growth(Integer role_skill_jump_growth) {
        this.role_skill_jump_growth = role_skill_jump_growth;
    }

    public Integer getRole_skill_jump_job() {
        return role_skill_jump_job;
    }

    public void setRole_skill_jump_job(Integer role_skill_jump_job) {
        this.role_skill_jump_job = role_skill_jump_job;
    }

    public Integer getRole_skill_jump_interst() {
        return role_skill_jump_interst;
    }

    public void setRole_skill_jump_interst(Integer role_skill_jump_interst) {
        this.role_skill_jump_interst = role_skill_jump_interst;
    }

    public String getRole_skill_language_type1() {
        return role_skill_language_type1;
    }

    public void setRole_skill_language_type1(String role_skill_language_type1) {
        this.role_skill_language_type1 = role_skill_language_type1;
    }

    public Integer getRole_skill_language_val1_growth() {
        return role_skill_language_val1_growth;
    }

    public void setRole_skill_language_val1_growth(Integer role_skill_language_val1_growth) {
        this.role_skill_language_val1_growth = role_skill_language_val1_growth;
    }

    public Integer getRole_skill_language_val1_job() {
        return role_skill_language_val1_job;
    }

    public void setRole_skill_language_val1_job(Integer role_skill_language_val1_job) {
        this.role_skill_language_val1_job = role_skill_language_val1_job;
    }

    public Integer getRole_skill_language_val1_interst() {
        return role_skill_language_val1_interst;
    }

    public void setRole_skill_language_val1_interst(Integer role_skill_language_val1_interst) {
        this.role_skill_language_val1_interst = role_skill_language_val1_interst;
    }

    public String getRole_skill_language_type2() {
        return role_skill_language_type2;
    }

    public void setRole_skill_language_type2(String role_skill_language_type2) {
        this.role_skill_language_type2 = role_skill_language_type2;
    }

    public Integer getRole_skill_language_val2_growth() {
        return role_skill_language_val2_growth;
    }

    public void setRole_skill_language_val2_growth(Integer role_skill_language_val2_growth) {
        this.role_skill_language_val2_growth = role_skill_language_val2_growth;
    }

    public Integer getRole_skill_language_val2_job() {
        return role_skill_language_val2_job;
    }

    public void setRole_skill_language_val2_job(Integer role_skill_language_val2_job) {
        this.role_skill_language_val2_job = role_skill_language_val2_job;
    }

    public Integer getRole_skill_language_val2_interst() {
        return role_skill_language_val2_interst;
    }

    public void setRole_skill_language_val2_interst(Integer role_skill_language_val2_interst) {
        this.role_skill_language_val2_interst = role_skill_language_val2_interst;
    }

    public String getRole_skill_language_type3() {
        return role_skill_language_type3;
    }

    public void setRole_skill_language_type3(String role_skill_language_type3) {
        this.role_skill_language_type3 = role_skill_language_type3;
    }

    public Integer getRole_skill_language_val3_growth() {
        return role_skill_language_val3_growth;
    }

    public void setRole_skill_language_val3_growth(Integer role_skill_language_val3_growth) {
        this.role_skill_language_val3_growth = role_skill_language_val3_growth;
    }

    public Integer getRole_skill_language_val3_job() {
        return role_skill_language_val3_job;
    }

    public void setRole_skill_language_val3_job(Integer role_skill_language_val3_job) {
        this.role_skill_language_val3_job = role_skill_language_val3_job;
    }

    public Integer getRole_skill_language_val3_interst() {
        return role_skill_language_val3_interst;
    }

    public void setRole_skill_language_val3_interst(Integer role_skill_language_val3_interst) {
        this.role_skill_language_val3_interst = role_skill_language_val3_interst;
    }

    public String getRole_skill_mother_tongue_type() {
        return role_skill_mother_tongue_type;
    }

    public void setRole_skill_mother_tongue_type(String role_skill_mother_tongue_type) {
        this.role_skill_mother_tongue_type = role_skill_mother_tongue_type;
    }

    public Integer getRole_skill_mother_tongue_val_growth() {
        return role_skill_mother_tongue_val_growth;
    }

    public void setRole_skill_mother_tongue_val_growth(Integer role_skill_mother_tongue_val_growth) {
        this.role_skill_mother_tongue_val_growth = role_skill_mother_tongue_val_growth;
    }

    public Integer getRole_skill_mother_tongue_val_job() {
        return role_skill_mother_tongue_val_job;
    }

    public void setRole_skill_mother_tongue_val_job(Integer role_skill_mother_tongue_val_job) {
        this.role_skill_mother_tongue_val_job = role_skill_mother_tongue_val_job;
    }

    public Integer getRole_skill_mother_tongue_val_interst() {
        return role_skill_mother_tongue_val_interst;
    }

    public void setRole_skill_mother_tongue_val_interst(Integer role_skill_mother_tongue_val_interst) {
        this.role_skill_mother_tongue_val_interst = role_skill_mother_tongue_val_interst;
    }

    public Integer getRole_skill_throw_growth() {
        return role_skill_throw_growth;
    }

    public void setRole_skill_throw_growth(Integer role_skill_throw_growth) {
        this.role_skill_throw_growth = role_skill_throw_growth;
    }

    public Integer getRole_skill_throw_job() {
        return role_skill_throw_job;
    }

    public void setRole_skill_throw_job(Integer role_skill_throw_job) {
        this.role_skill_throw_job = role_skill_throw_job;
    }

    public Integer getRole_skill_throw_interst() {
        return role_skill_throw_interst;
    }

    public void setRole_skill_throw_interst(Integer role_skill_throw_interst) {
        this.role_skill_throw_interst = role_skill_throw_interst;
    }

    public Integer getRole_skill_track_growth() {
        return role_skill_track_growth;
    }

    public void setRole_skill_track_growth(Integer role_skill_track_growth) {
        this.role_skill_track_growth = role_skill_track_growth;
    }

    public Integer getRole_skill_track_job() {
        return role_skill_track_job;
    }

    public void setRole_skill_track_job(Integer role_skill_track_job) {
        this.role_skill_track_job = role_skill_track_job;
    }

    public Integer getRole_skill_track_interst() {
        return role_skill_track_interst;
    }

    public void setRole_skill_track_interst(Integer role_skill_track_interst) {
        this.role_skill_track_interst = role_skill_track_interst;
    }

    public Integer getRole_skill_law_growth() {
        return role_skill_law_growth;
    }

    public void setRole_skill_law_growth(Integer role_skill_law_growth) {
        this.role_skill_law_growth = role_skill_law_growth;
    }

    public Integer getRole_skill_law_job() {
        return role_skill_law_job;
    }

    public void setRole_skill_law_job(Integer role_skill_law_job) {
        this.role_skill_law_job = role_skill_law_job;
    }

    public Integer getRole_skill_law_interst() {
        return role_skill_law_interst;
    }

    public void setRole_skill_law_interst(Integer role_skill_law_interst) {
        this.role_skill_law_interst = role_skill_law_interst;
    }

    public Integer getRole_skill_library_use_growth() {
        return role_skill_library_use_growth;
    }

    public void setRole_skill_library_use_growth(Integer role_skill_library_use_growth) {
        this.role_skill_library_use_growth = role_skill_library_use_growth;
    }

    public Integer getRole_skill_library_use_job() {
        return role_skill_library_use_job;
    }

    public void setRole_skill_library_use_job(Integer role_skill_library_use_job) {
        this.role_skill_library_use_job = role_skill_library_use_job;
    }

    public Integer getRole_skill_library_use_interst() {
        return role_skill_library_use_interst;
    }

    public void setRole_skill_library_use_interst(Integer role_skill_library_use_interst) {
        this.role_skill_library_use_interst = role_skill_library_use_interst;
    }

    public Integer getRole_skill_listen_growth() {
        return role_skill_listen_growth;
    }

    public void setRole_skill_listen_growth(Integer role_skill_listen_growth) {
        this.role_skill_listen_growth = role_skill_listen_growth;
    }

    public Integer getRole_skill_listen_job() {
        return role_skill_listen_job;
    }

    public void setRole_skill_listen_job(Integer role_skill_listen_job) {
        this.role_skill_listen_job = role_skill_listen_job;
    }

    public Integer getRole_skill_listen_interst() {
        return role_skill_listen_interst;
    }

    public void setRole_skill_listen_interst(Integer role_skill_listen_interst) {
        this.role_skill_listen_interst = role_skill_listen_interst;
    }

    public Integer getRole_skill_locksmith_growth() {
        return role_skill_locksmith_growth;
    }

    public void setRole_skill_locksmith_growth(Integer role_skill_locksmith_growth) {
        this.role_skill_locksmith_growth = role_skill_locksmith_growth;
    }

    public Integer getRole_skill_locksmith_job() {
        return role_skill_locksmith_job;
    }

    public void setRole_skill_locksmith_job(Integer role_skill_locksmith_job) {
        this.role_skill_locksmith_job = role_skill_locksmith_job;
    }

    public Integer getRole_skill_locksmith_interst() {
        return role_skill_locksmith_interst;
    }

    public void setRole_skill_locksmith_interst(Integer role_skill_locksmith_interst) {
        this.role_skill_locksmith_interst = role_skill_locksmith_interst;
    }

    public Integer getRole_skill_mechanical_repair_growth() {
        return role_skill_mechanical_repair_growth;
    }

    public void setRole_skill_mechanical_repair_growth(Integer role_skill_mechanical_repair_growth) {
        this.role_skill_mechanical_repair_growth = role_skill_mechanical_repair_growth;
    }

    public Integer getRole_skill_mechanical_repair_job() {
        return role_skill_mechanical_repair_job;
    }

    public void setRole_skill_mechanical_repair_job(Integer role_skill_mechanical_repair_job) {
        this.role_skill_mechanical_repair_job = role_skill_mechanical_repair_job;
    }

    public Integer getRole_skill_mechanical_repair_interst() {
        return role_skill_mechanical_repair_interst;
    }

    public void setRole_skill_mechanical_repair_interst(Integer role_skill_mechanical_repair_interst) {
        this.role_skill_mechanical_repair_interst = role_skill_mechanical_repair_interst;
    }

    public Integer getRole_skill_medicine_growth() {
        return role_skill_medicine_growth;
    }

    public void setRole_skill_medicine_growth(Integer role_skill_medicine_growth) {
        this.role_skill_medicine_growth = role_skill_medicine_growth;
    }

    public Integer getRole_skill_medicine_job() {
        return role_skill_medicine_job;
    }

    public void setRole_skill_medicine_job(Integer role_skill_medicine_job) {
        this.role_skill_medicine_job = role_skill_medicine_job;
    }

    public Integer getRole_skill_medicine_interst() {
        return role_skill_medicine_interst;
    }

    public void setRole_skill_medicine_interst(Integer role_skill_medicine_interst) {
        this.role_skill_medicine_interst = role_skill_medicine_interst;
    }

    public Integer getRole_skill_natural_world_growth() {
        return role_skill_natural_world_growth;
    }

    public void setRole_skill_natural_world_growth(Integer role_skill_natural_world_growth) {
        this.role_skill_natural_world_growth = role_skill_natural_world_growth;
    }

    public Integer getRole_skill_natural_world_job() {
        return role_skill_natural_world_job;
    }

    public void setRole_skill_natural_world_job(Integer role_skill_natural_world_job) {
        this.role_skill_natural_world_job = role_skill_natural_world_job;
    }

    public Integer getRole_skill_natural_world_interst() {
        return role_skill_natural_world_interst;
    }

    public void setRole_skill_natural_world_interst(Integer role_skill_natural_world_interst) {
        this.role_skill_natural_world_interst = role_skill_natural_world_interst;
    }

    public Integer getRole_skill_navigate_growth() {
        return role_skill_navigate_growth;
    }

    public void setRole_skill_navigate_growth(Integer role_skill_navigate_growth) {
        this.role_skill_navigate_growth = role_skill_navigate_growth;
    }

    public Integer getRole_skill_navigate_job() {
        return role_skill_navigate_job;
    }

    public void setRole_skill_navigate_job(Integer role_skill_navigate_job) {
        this.role_skill_navigate_job = role_skill_navigate_job;
    }

    public Integer getRole_skill_navigate_interst() {
        return role_skill_navigate_interst;
    }

    public void setRole_skill_navigate_interst(Integer role_skill_navigate_interst) {
        this.role_skill_navigate_interst = role_skill_navigate_interst;
    }

    public Integer getRole_skill_occult_growth() {
        return role_skill_occult_growth;
    }

    public void setRole_skill_occult_growth(Integer role_skill_occult_growth) {
        this.role_skill_occult_growth = role_skill_occult_growth;
    }

    public Integer getRole_skill_occult_job() {
        return role_skill_occult_job;
    }

    public void setRole_skill_occult_job(Integer role_skill_occult_job) {
        this.role_skill_occult_job = role_skill_occult_job;
    }

    public Integer getRole_skill_occult_interst() {
        return role_skill_occult_interst;
    }

    public void setRole_skill_occult_interst(Integer role_skill_occult_interst) {
        this.role_skill_occult_interst = role_skill_occult_interst;
    }

    public Integer getRole_skill_operate_heavy_machinery_growth() {
        return role_skill_operate_heavy_machinery_growth;
    }

    public void setRole_skill_operate_heavy_machinery_growth(Integer role_skill_operate_heavy_machinery_growth) {
        this.role_skill_operate_heavy_machinery_growth = role_skill_operate_heavy_machinery_growth;
    }

    public Integer getRole_skill_operate_heavy_machinery_job() {
        return role_skill_operate_heavy_machinery_job;
    }

    public void setRole_skill_operate_heavy_machinery_job(Integer role_skill_operate_heavy_machinery_job) {
        this.role_skill_operate_heavy_machinery_job = role_skill_operate_heavy_machinery_job;
    }

    public Integer getRole_skill_operate_heavy_machinery_interst() {
        return role_skill_operate_heavy_machinery_interst;
    }

    public void setRole_skill_operate_heavy_machinery_interst(Integer role_skill_operate_heavy_machinery_interst) {
        this.role_skill_operate_heavy_machinery_interst = role_skill_operate_heavy_machinery_interst;
    }

    public Integer getRole_skill_persuade_growth() {
        return role_skill_persuade_growth;
    }

    public void setRole_skill_persuade_growth(Integer role_skill_persuade_growth) {
        this.role_skill_persuade_growth = role_skill_persuade_growth;
    }

    public Integer getRole_skill_persuade_job() {
        return role_skill_persuade_job;
    }

    public void setRole_skill_persuade_job(Integer role_skill_persuade_job) {
        this.role_skill_persuade_job = role_skill_persuade_job;
    }

    public Integer getRole_skill_persuade_interst() {
        return role_skill_persuade_interst;
    }

    public void setRole_skill_persuade_interst(Integer role_skill_persuade_interst) {
        this.role_skill_persuade_interst = role_skill_persuade_interst;
    }

    public Integer getRole_skill_drive_aircraft_growth() {
        return role_skill_drive_aircraft_growth;
    }

    public void setRole_skill_drive_aircraft_growth(Integer role_skill_drive_aircraft_growth) {
        this.role_skill_drive_aircraft_growth = role_skill_drive_aircraft_growth;
    }

    public Integer getRole_skill_drive_aircraft_job() {
        return role_skill_drive_aircraft_job;
    }

    public void setRole_skill_drive_aircraft_job(Integer role_skill_drive_aircraft_job) {
        this.role_skill_drive_aircraft_job = role_skill_drive_aircraft_job;
    }

    public Integer getRole_skill_drive_aircraft_interst() {
        return role_skill_drive_aircraft_interst;
    }

    public void setRole_skill_drive_aircraft_interst(Integer role_skill_drive_aircraft_interst) {
        this.role_skill_drive_aircraft_interst = role_skill_drive_aircraft_interst;
    }

    public Integer getRole_skill_drive_ship_growth() {
        return role_skill_drive_ship_growth;
    }

    public void setRole_skill_drive_ship_growth(Integer role_skill_drive_ship_growth) {
        this.role_skill_drive_ship_growth = role_skill_drive_ship_growth;
    }

    public Integer getRole_skill_drive_ship_job() {
        return role_skill_drive_ship_job;
    }

    public void setRole_skill_drive_ship_job(Integer role_skill_drive_ship_job) {
        this.role_skill_drive_ship_job = role_skill_drive_ship_job;
    }

    public Integer getRole_skill_drive_ship_interst() {
        return role_skill_drive_ship_interst;
    }

    public void setRole_skill_drive_ship_interst(Integer role_skill_drive_ship_interst) {
        this.role_skill_drive_ship_interst = role_skill_drive_ship_interst;
    }

    public Integer getRole_skill_psychoanalysis_growth() {
        return role_skill_psychoanalysis_growth;
    }

    public void setRole_skill_psychoanalysis_growth(Integer role_skill_psychoanalysis_growth) {
        this.role_skill_psychoanalysis_growth = role_skill_psychoanalysis_growth;
    }

    public Integer getRole_skill_psychoanalysis_job() {
        return role_skill_psychoanalysis_job;
    }

    public void setRole_skill_psychoanalysis_job(Integer role_skill_psychoanalysis_job) {
        this.role_skill_psychoanalysis_job = role_skill_psychoanalysis_job;
    }

    public Integer getRole_skill_psychoanalysis_interst() {
        return role_skill_psychoanalysis_interst;
    }

    public void setRole_skill_psychoanalysis_interst(Integer role_skill_psychoanalysis_interst) {
        this.role_skill_psychoanalysis_interst = role_skill_psychoanalysis_interst;
    }

    public Integer getRole_skill_psychology_growth() {
        return role_skill_psychology_growth;
    }

    public void setRole_skill_psychology_growth(Integer role_skill_psychology_growth) {
        this.role_skill_psychology_growth = role_skill_psychology_growth;
    }

    public Integer getRole_skill_psychology_job() {
        return role_skill_psychology_job;
    }

    public void setRole_skill_psychology_job(Integer role_skill_psychology_job) {
        this.role_skill_psychology_job = role_skill_psychology_job;
    }

    public Integer getRole_skill_psychology_interst() {
        return role_skill_psychology_interst;
    }

    public void setRole_skill_psychology_interst(Integer role_skill_psychology_interst) {
        this.role_skill_psychology_interst = role_skill_psychology_interst;
    }

    public Integer getRole_skill_ride_growth() {
        return role_skill_ride_growth;
    }

    public void setRole_skill_ride_growth(Integer role_skill_ride_growth) {
        this.role_skill_ride_growth = role_skill_ride_growth;
    }

    public Integer getRole_skill_ride_job() {
        return role_skill_ride_job;
    }

    public void setRole_skill_ride_job(Integer role_skill_ride_job) {
        this.role_skill_ride_job = role_skill_ride_job;
    }

    public Integer getRole_skill_ride_interst() {
        return role_skill_ride_interst;
    }

    public void setRole_skill_ride_interst(Integer role_skill_ride_interst) {
        this.role_skill_ride_interst = role_skill_ride_interst;
    }

    public Integer getRole_skill_science_geology_growth() {
        return role_skill_science_geology_growth;
    }

    public void setRole_skill_science_geology_growth(Integer role_skill_science_geology_growth) {
        this.role_skill_science_geology_growth = role_skill_science_geology_growth;
    }

    public Integer getRole_skill_science_geology_job() {
        return role_skill_science_geology_job;
    }

    public void setRole_skill_science_geology_job(Integer role_skill_science_geology_job) {
        this.role_skill_science_geology_job = role_skill_science_geology_job;
    }

    public Integer getRole_skill_science_geology_interst() {
        return role_skill_science_geology_interst;
    }

    public void setRole_skill_science_geology_interst(Integer role_skill_science_geology_interst) {
        this.role_skill_science_geology_interst = role_skill_science_geology_interst;
    }

    public Integer getRole_skill_science_chemistry_growth() {
        return role_skill_science_chemistry_growth;
    }

    public void setRole_skill_science_chemistry_growth(Integer role_skill_science_chemistry_growth) {
        this.role_skill_science_chemistry_growth = role_skill_science_chemistry_growth;
    }

    public Integer getRole_skill_science_chemistry_job() {
        return role_skill_science_chemistry_job;
    }

    public void setRole_skill_science_chemistry_job(Integer role_skill_science_chemistry_job) {
        this.role_skill_science_chemistry_job = role_skill_science_chemistry_job;
    }

    public Integer getRole_skill_science_chemistry_interst() {
        return role_skill_science_chemistry_interst;
    }

    public void setRole_skill_science_chemistry_interst(Integer role_skill_science_chemistry_interst) {
        this.role_skill_science_chemistry_interst = role_skill_science_chemistry_interst;
    }

    public Integer getRole_skill_science_biology_growth() {
        return role_skill_science_biology_growth;
    }

    public void setRole_skill_science_biology_growth(Integer role_skill_science_biology_growth) {
        this.role_skill_science_biology_growth = role_skill_science_biology_growth;
    }

    public Integer getRole_skill_science_biology_job() {
        return role_skill_science_biology_job;
    }

    public void setRole_skill_science_biology_job(Integer role_skill_science_biology_job) {
        this.role_skill_science_biology_job = role_skill_science_biology_job;
    }

    public Integer getRole_skill_science_biology_interst() {
        return role_skill_science_biology_interst;
    }

    public void setRole_skill_science_biology_interst(Integer role_skill_science_biology_interst) {
        this.role_skill_science_biology_interst = role_skill_science_biology_interst;
    }

    public Integer getRole_skill_science_math_growth() {
        return role_skill_science_math_growth;
    }

    public void setRole_skill_science_math_growth(Integer role_skill_science_math_growth) {
        this.role_skill_science_math_growth = role_skill_science_math_growth;
    }

    public Integer getRole_skill_science_math_job() {
        return role_skill_science_math_job;
    }

    public void setRole_skill_science_math_job(Integer role_skill_science_math_job) {
        this.role_skill_science_math_job = role_skill_science_math_job;
    }

    public Integer getRole_skill_science_math_interst() {
        return role_skill_science_math_interst;
    }

    public void setRole_skill_science_math_interst(Integer role_skill_science_math_interst) {
        this.role_skill_science_math_interst = role_skill_science_math_interst;
    }

    public Integer getRole_skill_science_astronomy_growth() {
        return role_skill_science_astronomy_growth;
    }

    public void setRole_skill_science_astronomy_growth(Integer role_skill_science_astronomy_growth) {
        this.role_skill_science_astronomy_growth = role_skill_science_astronomy_growth;
    }

    public Integer getRole_skill_science_astronomy_job() {
        return role_skill_science_astronomy_job;
    }

    public void setRole_skill_science_astronomy_job(Integer role_skill_science_astronomy_job) {
        this.role_skill_science_astronomy_job = role_skill_science_astronomy_job;
    }

    public Integer getRole_skill_science_astronomy_interst() {
        return role_skill_science_astronomy_interst;
    }

    public void setRole_skill_science_astronomy_interst(Integer role_skill_science_astronomy_interst) {
        this.role_skill_science_astronomy_interst = role_skill_science_astronomy_interst;
    }

    public Integer getRole_skill_science_physics_growth() {
        return role_skill_science_physics_growth;
    }

    public void setRole_skill_science_physics_growth(Integer role_skill_science_physics_growth) {
        this.role_skill_science_physics_growth = role_skill_science_physics_growth;
    }

    public Integer getRole_skill_science_physics_job() {
        return role_skill_science_physics_job;
    }

    public void setRole_skill_science_physics_job(Integer role_skill_science_physics_job) {
        this.role_skill_science_physics_job = role_skill_science_physics_job;
    }

    public Integer getRole_skill_science_physics_interst() {
        return role_skill_science_physics_interst;
    }

    public void setRole_skill_science_physics_interst(Integer role_skill_science_physics_interst) {
        this.role_skill_science_physics_interst = role_skill_science_physics_interst;
    }

    public Integer getRole_skill_science_pharmacy_growth() {
        return role_skill_science_pharmacy_growth;
    }

    public void setRole_skill_science_pharmacy_growth(Integer role_skill_science_pharmacy_growth) {
        this.role_skill_science_pharmacy_growth = role_skill_science_pharmacy_growth;
    }

    public Integer getRole_skill_science_pharmacy_job() {
        return role_skill_science_pharmacy_job;
    }

    public void setRole_skill_science_pharmacy_job(Integer role_skill_science_pharmacy_job) {
        this.role_skill_science_pharmacy_job = role_skill_science_pharmacy_job;
    }

    public Integer getRole_skill_science_pharmacy_interst() {
        return role_skill_science_pharmacy_interst;
    }

    public void setRole_skill_science_pharmacy_interst(Integer role_skill_science_pharmacy_interst) {
        this.role_skill_science_pharmacy_interst = role_skill_science_pharmacy_interst;
    }

    public Integer getRole_skill_science_botany_growth() {
        return role_skill_science_botany_growth;
    }

    public void setRole_skill_science_botany_growth(Integer role_skill_science_botany_growth) {
        this.role_skill_science_botany_growth = role_skill_science_botany_growth;
    }

    public Integer getRole_skill_science_botany_job() {
        return role_skill_science_botany_job;
    }

    public void setRole_skill_science_botany_job(Integer role_skill_science_botany_job) {
        this.role_skill_science_botany_job = role_skill_science_botany_job;
    }

    public Integer getRole_skill_science_botany_interst() {
        return role_skill_science_botany_interst;
    }

    public void setRole_skill_science_botany_interst(Integer role_skill_science_botany_interst) {
        this.role_skill_science_botany_interst = role_skill_science_botany_interst;
    }

    public Integer getRole_skill_science_zoology_growth() {
        return role_skill_science_zoology_growth;
    }

    public void setRole_skill_science_zoology_growth(Integer role_skill_science_zoology_growth) {
        this.role_skill_science_zoology_growth = role_skill_science_zoology_growth;
    }

    public Integer getRole_skill_science_zoology_job() {
        return role_skill_science_zoology_job;
    }

    public void setRole_skill_science_zoology_job(Integer role_skill_science_zoology_job) {
        this.role_skill_science_zoology_job = role_skill_science_zoology_job;
    }

    public Integer getRole_skill_science_zoology_interst() {
        return role_skill_science_zoology_interst;
    }

    public void setRole_skill_science_zoology_interst(Integer role_skill_science_zoology_interst) {
        this.role_skill_science_zoology_interst = role_skill_science_zoology_interst;
    }

    public Integer getRole_skill_science_cryptography_growth() {
        return role_skill_science_cryptography_growth;
    }

    public void setRole_skill_science_cryptography_growth(Integer role_skill_science_cryptography_growth) {
        this.role_skill_science_cryptography_growth = role_skill_science_cryptography_growth;
    }

    public Integer getRole_skill_science_cryptography_job() {
        return role_skill_science_cryptography_job;
    }

    public void setRole_skill_science_cryptography_job(Integer role_skill_science_cryptography_job) {
        this.role_skill_science_cryptography_job = role_skill_science_cryptography_job;
    }

    public Integer getRole_skill_science_cryptography_interst() {
        return role_skill_science_cryptography_interst;
    }

    public void setRole_skill_science_cryptography_interst(Integer role_skill_science_cryptography_interst) {
        this.role_skill_science_cryptography_interst = role_skill_science_cryptography_interst;
    }

    public Integer getRole_skill_science_engineering_growth() {
        return role_skill_science_engineering_growth;
    }

    public void setRole_skill_science_engineering_growth(Integer role_skill_science_engineering_growth) {
        this.role_skill_science_engineering_growth = role_skill_science_engineering_growth;
    }

    public Integer getRole_skill_science_engineering_job() {
        return role_skill_science_engineering_job;
    }

    public void setRole_skill_science_engineering_job(Integer role_skill_science_engineering_job) {
        this.role_skill_science_engineering_job = role_skill_science_engineering_job;
    }

    public Integer getRole_skill_science_engineering_interst() {
        return role_skill_science_engineering_interst;
    }

    public void setRole_skill_science_engineering_interst(Integer role_skill_science_engineering_interst) {
        this.role_skill_science_engineering_interst = role_skill_science_engineering_interst;
    }

    public Integer getRole_skill_science_meteorology_growth() {
        return role_skill_science_meteorology_growth;
    }

    public void setRole_skill_science_meteorology_growth(Integer role_skill_science_meteorology_growth) {
        this.role_skill_science_meteorology_growth = role_skill_science_meteorology_growth;
    }

    public Integer getRole_skill_science_meteorology_job() {
        return role_skill_science_meteorology_job;
    }

    public void setRole_skill_science_meteorology_job(Integer role_skill_science_meteorology_job) {
        this.role_skill_science_meteorology_job = role_skill_science_meteorology_job;
    }

    public Integer getRole_skill_science_meteorology_interst() {
        return role_skill_science_meteorology_interst;
    }

    public void setRole_skill_science_meteorology_interst(Integer role_skill_science_meteorology_interst) {
        this.role_skill_science_meteorology_interst = role_skill_science_meteorology_interst;
    }

    public Integer getRole_skill_science_judicial_science_growth() {
        return role_skill_science_judicial_science_growth;
    }

    public void setRole_skill_science_judicial_science_growth(Integer role_skill_science_judicial_science_growth) {
        this.role_skill_science_judicial_science_growth = role_skill_science_judicial_science_growth;
    }

    public Integer getRole_skill_science_judicial_science_job() {
        return role_skill_science_judicial_science_job;
    }

    public void setRole_skill_science_judicial_science_job(Integer role_skill_science_judicial_science_job) {
        this.role_skill_science_judicial_science_job = role_skill_science_judicial_science_job;
    }

    public Integer getRole_skill_science_judicial_science_interst() {
        return role_skill_science_judicial_science_interst;
    }

    public void setRole_skill_science_judicial_science_interst(Integer role_skill_science_judicial_science_interst) {
        this.role_skill_science_judicial_science_interst = role_skill_science_judicial_science_interst;
    }

    public Integer getRole_skill_sleight_of_hand_growth() {
        return role_skill_sleight_of_hand_growth;
    }

    public void setRole_skill_sleight_of_hand_growth(Integer role_skill_sleight_of_hand_growth) {
        this.role_skill_sleight_of_hand_growth = role_skill_sleight_of_hand_growth;
    }

    public Integer getRole_skill_sleight_of_hand_job() {
        return role_skill_sleight_of_hand_job;
    }

    public void setRole_skill_sleight_of_hand_job(Integer role_skill_sleight_of_hand_job) {
        this.role_skill_sleight_of_hand_job = role_skill_sleight_of_hand_job;
    }

    public Integer getRole_skill_sleight_of_hand_interst() {
        return role_skill_sleight_of_hand_interst;
    }

    public void setRole_skill_sleight_of_hand_interst(Integer role_skill_sleight_of_hand_interst) {
        this.role_skill_sleight_of_hand_interst = role_skill_sleight_of_hand_interst;
    }

    public Integer getRole_skill_recon_growth() {
        return role_skill_recon_growth;
    }

    public void setRole_skill_recon_growth(Integer role_skill_recon_growth) {
        this.role_skill_recon_growth = role_skill_recon_growth;
    }

    public Integer getRole_skill_recon_job() {
        return role_skill_recon_job;
    }

    public void setRole_skill_recon_job(Integer role_skill_recon_job) {
        this.role_skill_recon_job = role_skill_recon_job;
    }

    public Integer getRole_skill_recon_interst() {
        return role_skill_recon_interst;
    }

    public void setRole_skill_recon_interst(Integer role_skill_recon_interst) {
        this.role_skill_recon_interst = role_skill_recon_interst;
    }

    public Integer getRole_skill_stealth_growth() {
        return role_skill_stealth_growth;
    }

    public void setRole_skill_stealth_growth(Integer role_skill_stealth_growth) {
        this.role_skill_stealth_growth = role_skill_stealth_growth;
    }

    public Integer getRole_skill_stealth_job() {
        return role_skill_stealth_job;
    }

    public void setRole_skill_stealth_job(Integer role_skill_stealth_job) {
        this.role_skill_stealth_job = role_skill_stealth_job;
    }

    public Integer getRole_skill_stealth_interst() {
        return role_skill_stealth_interst;
    }

    public void setRole_skill_stealth_interst(Integer role_skill_stealth_interst) {
        this.role_skill_stealth_interst = role_skill_stealth_interst;
    }

    public Integer getRole_skill_survival_growth() {
        return role_skill_survival_growth;
    }

    public void setRole_skill_survival_growth(Integer role_skill_survival_growth) {
        this.role_skill_survival_growth = role_skill_survival_growth;
    }

    public Integer getRole_skill_survival_job() {
        return role_skill_survival_job;
    }

    public void setRole_skill_survival_job(Integer role_skill_survival_job) {
        this.role_skill_survival_job = role_skill_survival_job;
    }

    public Integer getRole_skill_survival_interst() {
        return role_skill_survival_interst;
    }

    public void setRole_skill_survival_interst(Integer role_skill_survival_interst) {
        this.role_skill_survival_interst = role_skill_survival_interst;
    }

    public Integer getRole_skill_swim_growth() {
        return role_skill_swim_growth;
    }

    public void setRole_skill_swim_growth(Integer role_skill_swim_growth) {
        this.role_skill_swim_growth = role_skill_swim_growth;
    }

    public Integer getRole_skill_swim_job() {
        return role_skill_swim_job;
    }

    public void setRole_skill_swim_job(Integer role_skill_swim_job) {
        this.role_skill_swim_job = role_skill_swim_job;
    }

    public Integer getRole_skill_swim_interst() {
        return role_skill_swim_interst;
    }

    public void setRole_skill_swim_interst(Integer role_skill_swim_interst) {
        this.role_skill_swim_interst = role_skill_swim_interst;
    }

    public Integer getRole_skill_beast_training_growth() {
        return role_skill_beast_training_growth;
    }

    public void setRole_skill_beast_training_growth(Integer role_skill_beast_training_growth) {
        this.role_skill_beast_training_growth = role_skill_beast_training_growth;
    }

    public Integer getRole_skill_beast_training_job() {
        return role_skill_beast_training_job;
    }

    public void setRole_skill_beast_training_job(Integer role_skill_beast_training_job) {
        this.role_skill_beast_training_job = role_skill_beast_training_job;
    }

    public Integer getRole_skill_beast_training_interst() {
        return role_skill_beast_training_interst;
    }

    public void setRole_skill_beast_training_interst(Integer role_skill_beast_training_interst) {
        this.role_skill_beast_training_interst = role_skill_beast_training_interst;
    }

    public Integer getRole_skill_diving_growth() {
        return role_skill_diving_growth;
    }

    public void setRole_skill_diving_growth(Integer role_skill_diving_growth) {
        this.role_skill_diving_growth = role_skill_diving_growth;
    }

    public Integer getRole_skill_diving_job() {
        return role_skill_diving_job;
    }

    public void setRole_skill_diving_job(Integer role_skill_diving_job) {
        this.role_skill_diving_job = role_skill_diving_job;
    }

    public Integer getRole_skill_diving_interst() {
        return role_skill_diving_interst;
    }

    public void setRole_skill_diving_interst(Integer role_skill_diving_interst) {
        this.role_skill_diving_interst = role_skill_diving_interst;
    }

    public Integer getRole_skill_demolition_growth() {
        return role_skill_demolition_growth;
    }

    public void setRole_skill_demolition_growth(Integer role_skill_demolition_growth) {
        this.role_skill_demolition_growth = role_skill_demolition_growth;
    }

    public Integer getRole_skill_demolition_job() {
        return role_skill_demolition_job;
    }

    public void setRole_skill_demolition_job(Integer role_skill_demolition_job) {
        this.role_skill_demolition_job = role_skill_demolition_job;
    }

    public Integer getRole_skill_demolition_interst() {
        return role_skill_demolition_interst;
    }

    public void setRole_skill_demolition_interst(Integer role_skill_demolition_interst) {
        this.role_skill_demolition_interst = role_skill_demolition_interst;
    }

    public Integer getRole_skill_read_lips_growth() {
        return role_skill_read_lips_growth;
    }

    public void setRole_skill_read_lips_growth(Integer role_skill_read_lips_growth) {
        this.role_skill_read_lips_growth = role_skill_read_lips_growth;
    }

    public Integer getRole_skill_read_lips_job() {
        return role_skill_read_lips_job;
    }

    public void setRole_skill_read_lips_job(Integer role_skill_read_lips_job) {
        this.role_skill_read_lips_job = role_skill_read_lips_job;
    }

    public Integer getRole_skill_read_lips_interst() {
        return role_skill_read_lips_interst;
    }

    public void setRole_skill_read_lips_interst(Integer role_skill_read_lips_interst) {
        this.role_skill_read_lips_interst = role_skill_read_lips_interst;
    }

    public Integer getRole_skill_hypnosis_growth() {
        return role_skill_hypnosis_growth;
    }

    public void setRole_skill_hypnosis_growth(Integer role_skill_hypnosis_growth) {
        this.role_skill_hypnosis_growth = role_skill_hypnosis_growth;
    }

    public Integer getRole_skill_hypnosis_job() {
        return role_skill_hypnosis_job;
    }

    public void setRole_skill_hypnosis_job(Integer role_skill_hypnosis_job) {
        this.role_skill_hypnosis_job = role_skill_hypnosis_job;
    }

    public Integer getRole_skill_hypnosis_interst() {
        return role_skill_hypnosis_interst;
    }

    public void setRole_skill_hypnosis_interst(Integer role_skill_hypnosis_interst) {
        this.role_skill_hypnosis_interst = role_skill_hypnosis_interst;
    }

    public Integer getRole_skill_artillery_growth() {
        return role_skill_artillery_growth;
    }

    public void setRole_skill_artillery_growth(Integer role_skill_artillery_growth) {
        this.role_skill_artillery_growth = role_skill_artillery_growth;
    }

    public Integer getRole_skill_artillery_job() {
        return role_skill_artillery_job;
    }

    public void setRole_skill_artillery_job(Integer role_skill_artillery_job) {
        this.role_skill_artillery_job = role_skill_artillery_job;
    }

    public Integer getRole_skill_artillery_interst() {
        return role_skill_artillery_interst;
    }

    public void setRole_skill_artillery_interst(Integer role_skill_artillery_interst) {
        this.role_skill_artillery_interst = role_skill_artillery_interst;
    }

    public String getRole_skill_lore_type() {
        return role_skill_lore_type;
    }

    public void setRole_skill_lore_type(String role_skill_lore_type) {
        this.role_skill_lore_type = role_skill_lore_type;
    }

    public Integer getRole_skill_lore_val_growth() {
        return role_skill_lore_val_growth;
    }

    public void setRole_skill_lore_val_growth(Integer role_skill_lore_val_growth) {
        this.role_skill_lore_val_growth = role_skill_lore_val_growth;
    }

    public Integer getRole_skill_lore_val_job() {
        return role_skill_lore_val_job;
    }

    public void setRole_skill_lore_val_job(Integer role_skill_lore_val_job) {
        this.role_skill_lore_val_job = role_skill_lore_val_job;
    }

    public Integer getRole_skill_lore_val_interst() {
        return role_skill_lore_val_interst;
    }

    public void setRole_skill_lore_val_interst(Integer role_skill_lore_val_interst) {
        this.role_skill_lore_val_interst = role_skill_lore_val_interst;
    }
}
