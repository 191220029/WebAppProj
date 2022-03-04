CREATE DATABASE  IF NOT EXISTS `kesulu_online` /*!40100 DEFAULT CHARACTER SET utf8 */ /*!80016 DEFAULT ENCRYPTION='N' */;
USE `kesulu_online`;
-- MySQL dump 10.13  Distrib 8.0.26, for Win64 (x86_64)
--
-- Host: localhost    Database: kesulu_online
-- ------------------------------------------------------
-- Server version	8.0.19

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!50503 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `rolecard`
--

DROP TABLE IF EXISTS `rolecard`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `rolecard` (
  `role_card_id` int unsigned NOT NULL AUTO_INCREMENT,
  `role_card_player_id` int unsigned NOT NULL,
  `era` varchar(10) NOT NULL,
  `role_name` varchar(40) NOT NULL,
  `role_gender` tinyint NOT NULL,
  `role_age` int unsigned NOT NULL,
  `role_home_address` varchar(60) DEFAULT NULL,
  `role_job_id` int unsigned NOT NULL,
  `role_hometown` varchar(40) DEFAULT NULL,
  `rolestr` tinyint unsigned NOT NULL,
  `rolecon` tinyint unsigned NOT NULL,
  `rolesiz` tinyint unsigned NOT NULL,
  `roledex` tinyint unsigned NOT NULL,
  `roleapp` tinyint unsigned NOT NULL,
  `roleint` tinyint unsigned NOT NULL,
  `rolepow` tinyint unsigned NOT NULL,
  `roleedu` tinyint unsigned NOT NULL,
  `rolemov` tinyint unsigned NOT NULL DEFAULT '8',
  `role_img_path` varchar(60) DEFAULT NULL,
  `role_cur_hit_points` tinyint unsigned NOT NULL,
  `role_max_hit_points` tinyint unsigned NOT NULL,
  `role_cur_sanity` tinyint unsigned NOT NULL,
  `role_max_sanity` tinyint unsigned NOT NULL,
  `role_luck` tinyint unsigned NOT NULL,
  `role_cur_magic` tinyint unsigned NOT NULL,
  `role_max_magic` tinyint unsigned NOT NULL,
  `role_physical_status` varchar(5) NOT NULL,
  `role_mental_status` varchar(12) NOT NULL,
  `role_skill_accounting_growth` tinyint NOT NULL DEFAULT '0',
  `role_skill_accounting_job` tinyint NOT NULL DEFAULT '0',
  `role_skill_accounting_interst` tinyint NOT NULL DEFAULT '0',
  `role_skill_anthropology_growth` tinyint NOT NULL DEFAULT '0',
  `role_skill_anthropology_job` tinyint NOT NULL DEFAULT '0',
  `role_skill_anthropology_interst` tinyint NOT NULL DEFAULT '0',
  `role_skill_evaluation_growth` tinyint NOT NULL DEFAULT '0',
  `role_skill_evaluation_job` tinyint NOT NULL DEFAULT '0',
  `role_skill_evaluation_interst` tinyint NOT NULL DEFAULT '0',
  `role_skill_archaeology_growth` tinyint NOT NULL DEFAULT '0',
  `role_skill_archaeology_job` tinyint NOT NULL DEFAULT '0',
  `role_skill_archaeology_interst` tinyint NOT NULL DEFAULT '0',
  `role_skill_writing_growth` tinyint NOT NULL DEFAULT '0',
  `role_skill_writing_job` tinyint NOT NULL DEFAULT '0',
  `role_skill_writing_interst` tinyint NOT NULL DEFAULT '0',
  `role_skill_music_theory_growth` tinyint NOT NULL DEFAULT '0',
  `role_skill_music_theory_job` tinyint NOT NULL DEFAULT '0',
  `role_skill_music_theory_interst` tinyint NOT NULL DEFAULT '0',
  `role_skill_morris_dance_growth` tinyint NOT NULL DEFAULT '0',
  `role_skill_morris_dance_job` tinyint NOT NULL DEFAULT '0',
  `role_skill_morris_dance_interst` tinyint NOT NULL DEFAULT '0',
  `role_skill_opera_singing_growth` tinyint NOT NULL DEFAULT '0',
  `role_skill_opera_singing_job` tinyint NOT NULL DEFAULT '0',
  `role_skill_opera_singing_interst` tinyint NOT NULL DEFAULT '0',
  `role_skill_whitewasher_painter_growth` tinyint NOT NULL DEFAULT '0',
  `role_skill_whitewasher_painter_job` tinyint NOT NULL DEFAULT '0',
  `role_skill_whitewasher_painter_interst` tinyint NOT NULL DEFAULT '0',
  `role_skill_photography_growth` tinyint NOT NULL DEFAULT '0',
  `role_skill_photography_job` tinyint NOT NULL DEFAULT '0',
  `role_skill_photography_interst` tinyint NOT NULL DEFAULT '0',
  `role_skill_dance_growth` tinyint NOT NULL DEFAULT '0',
  `role_skill_dance_job` tinyint NOT NULL DEFAULT '0',
  `role_skill_dance_interst` tinyint NOT NULL DEFAULT '0',
  `role_skill_art_growth` tinyint NOT NULL DEFAULT '0',
  `role_skill_art_job` tinyint NOT NULL DEFAULT '0',
  `role_skill_art_interst` tinyint NOT NULL DEFAULT '0',
  `role_skill_forge_growth` tinyint NOT NULL DEFAULT '0',
  `role_skill_forge_job` tinyint NOT NULL DEFAULT '0',
  `role_skill_forge_interst` tinyint NOT NULL DEFAULT '0',
  `role_skill_pottery_making_growth` tinyint NOT NULL DEFAULT '0',
  `role_skill_pottery_making_job` tinyint NOT NULL DEFAULT '0',
  `role_skill_pottery_making_interst` tinyint NOT NULL DEFAULT '0',
  `role_skill_technical_drawing_growth` tinyint NOT NULL DEFAULT '0',
  `role_skill_technical_drawing_job` tinyint NOT NULL DEFAULT '0',
  `role_skill_technical_drawing_interst` tinyint NOT NULL DEFAULT '0',
  `role_skill_farming_growth` tinyint NOT NULL DEFAULT '0',
  `role_skill_farming_job` tinyint NOT NULL DEFAULT '0',
  `role_skill_farming_interst` tinyint NOT NULL DEFAULT '0',
  `role_skill_typing_growth` tinyint NOT NULL DEFAULT '0',
  `role_skill_typing_job` tinyint NOT NULL DEFAULT '0',
  `role_skill_typing_interst` tinyint NOT NULL DEFAULT '0',
  `role_skill_shorthand_growth` tinyint NOT NULL DEFAULT '0',
  `role_skill_shorthand_job` tinyint NOT NULL DEFAULT '0',
  `role_skill_shorthand_interst` tinyint NOT NULL DEFAULT '0',
  `role_skill_blown_glass_tube_growth` tinyint NOT NULL DEFAULT '0',
  `role_skill_blown_glass_tube_job` tinyint NOT NULL DEFAULT '0',
  `role_skill_blown_glass_tube_interst` tinyint NOT NULL DEFAULT '0',
  `role_skill_tailor_growth` tinyint NOT NULL DEFAULT '0',
  `role_skill_tailor_job` tinyint NOT NULL DEFAULT '0',
  `role_skill_tailor_interst` tinyint NOT NULL DEFAULT '0',
  `role_skill_make_wine_growth` tinyint NOT NULL DEFAULT '0',
  `role_skill_make_wine_job` tinyint NOT NULL DEFAULT '0',
  `role_skill_make_wine_interst` tinyint NOT NULL DEFAULT '0',
  `role_skill_fishing_growth` tinyint NOT NULL DEFAULT '0',
  `role_skill_fishing_job` tinyint NOT NULL DEFAULT '0',
  `role_skill_fishing_interst` tinyint NOT NULL DEFAULT '0',
  `role_skill_sculpture_growth` tinyint NOT NULL DEFAULT '0',
  `role_skill_sculpture_job` tinyint NOT NULL DEFAULT '0',
  `role_skill_sculpture_interst` tinyint NOT NULL DEFAULT '0',
  `role_skill_acrobatics_growth` tinyint NOT NULL DEFAULT '0',
  `role_skill_acrobatics_job` tinyint NOT NULL DEFAULT '0',
  `role_skill_acrobatics_interst` tinyint NOT NULL DEFAULT '0',
  `role_skill_seduce_growth` tinyint NOT NULL DEFAULT '0',
  `role_skill_seduce_job` tinyint NOT NULL DEFAULT '0',
  `role_skill_seduce_interst` tinyint NOT NULL DEFAULT '0',
  `role_skill_climb_growth` tinyint NOT NULL DEFAULT '0',
  `role_skill_climb_job` tinyint NOT NULL DEFAULT '0',
  `role_skill_climb_interst` tinyint NOT NULL DEFAULT '0',
  `role_skill_computer_growth` tinyint NOT NULL DEFAULT '0',
  `role_skill_computer_job` tinyint NOT NULL DEFAULT '0',
  `role_skill_computer_interst` tinyint NOT NULL DEFAULT '0',
  `role_skill_credit_growth` tinyint NOT NULL DEFAULT '0',
  `role_skill_credit_job` tinyint NOT NULL DEFAULT '0',
  `role_skill_credit_interst` tinyint NOT NULL DEFAULT '0',
  `role_skill_cthulhu_mythos_growth` tinyint NOT NULL DEFAULT '0',
  `role_skill_cthulhu_mythos_job` tinyint NOT NULL DEFAULT '0',
  `role_skill_cthulhu_mythos_interst` tinyint NOT NULL DEFAULT '0',
  `role_skill_disguise_growth` tinyint NOT NULL DEFAULT '0',
  `role_skill_disguise_job` tinyint NOT NULL DEFAULT '0',
  `role_skill_disguise_interst` tinyint NOT NULL DEFAULT '0',
  `role_skill_dodge_growth` tinyint NOT NULL DEFAULT '0',
  `role_skill_dodge_job` tinyint NOT NULL DEFAULT '0',
  `role_skill_dodge_interst` tinyint NOT NULL DEFAULT '0',
  `role_skill_car_driving_growth` tinyint NOT NULL DEFAULT '0',
  `role_skill_car_driving_job` tinyint NOT NULL DEFAULT '0',
  `role_skill_car_driving_interst` tinyint NOT NULL DEFAULT '0',
  `role_skill_electrical_maintenance_growth` tinyint NOT NULL DEFAULT '0',
  `role_skill_electrical_maintenance_job` tinyint NOT NULL DEFAULT '0',
  `role_skill_electrical_maintenance_interst` tinyint NOT NULL DEFAULT '0',
  `role_skill_electronics_growth` tinyint NOT NULL DEFAULT '0',
  `role_skill_electronics_job` tinyint NOT NULL DEFAULT '0',
  `role_skill_electronics_interst` tinyint NOT NULL DEFAULT '0',
  `role_skill_speech_skill_growth` tinyint NOT NULL DEFAULT '0',
  `role_skill_speech_skill_job` tinyint NOT NULL DEFAULT '0',
  `role_skill_speech_skill_interst` tinyint NOT NULL DEFAULT '0',
  `role_skill_combat_fight_growth` tinyint NOT NULL DEFAULT '0',
  `role_skill_combat_fight_job` tinyint NOT NULL DEFAULT '0',
  `role_skill_combat_fight_interst` tinyint NOT NULL DEFAULT '0',
  `role_skill_combat_whip_growth` tinyint NOT NULL DEFAULT '0',
  `role_skill_combat_whip_job` tinyint NOT NULL DEFAULT '0',
  `role_skill_combat_whip_interst` tinyint NOT NULL DEFAULT '0',
  `role_skill_combat_electric_saw_growth` tinyint NOT NULL DEFAULT '0',
  `role_skill_combat_electric_saw_job` tinyint NOT NULL DEFAULT '0',
  `role_skill_combat_electric_saw_interst` tinyint NOT NULL DEFAULT '0',
  `role_skill_combat_axe_growth` tinyint NOT NULL DEFAULT '0',
  `role_skill_combat_axe_job` tinyint NOT NULL DEFAULT '0',
  `role_skill_combat_axe_interst` tinyint NOT NULL DEFAULT '0',
  `role_skill_combat_sword_growth` tinyint NOT NULL DEFAULT '0',
  `role_skill_combat_sword_job` tinyint NOT NULL DEFAULT '0',
  `role_skill_combat_sword_interst` tinyint NOT NULL DEFAULT '0',
  `role_skill_combat_hinge_growth` tinyint NOT NULL DEFAULT '0',
  `role_skill_combat_hinge_job` tinyint NOT NULL DEFAULT '0',
  `role_skill_combat_hinge_interst` tinyint NOT NULL DEFAULT '0',
  `role_skill_combat_flail_growth` tinyint NOT NULL DEFAULT '0',
  `role_skill_combat_flail_job` tinyint NOT NULL DEFAULT '0',
  `role_skill_combat_flail_interst` tinyint NOT NULL DEFAULT '0',
  `role_skill_combat_spear_growth` tinyint NOT NULL DEFAULT '0',
  `role_skill_combat_spear_job` tinyint NOT NULL DEFAULT '0',
  `role_skill_combat_spear_interst` tinyint NOT NULL DEFAULT '0',
  `role_skill_shoot_pistol_growth` tinyint NOT NULL DEFAULT '0',
  `role_skill_shoot_pistol_job` tinyint NOT NULL DEFAULT '0',
  `role_skill_shoot_pistol_interst` tinyint NOT NULL DEFAULT '0',
  `role_skill_shoot_rifle_shotgun_growth` tinyint NOT NULL DEFAULT '0',
  `role_skill_shoot_rifle_shotgun_job` tinyint NOT NULL DEFAULT '0',
  `role_skill_shoot_rifle_shotgun_interst` tinyint NOT NULL DEFAULT '0',
  `role_skill_shoot_archery_growth` tinyint NOT NULL DEFAULT '0',
  `role_skill_shoot_archery_job` tinyint NOT NULL DEFAULT '0',
  `role_skill_shoot_archery_interst` tinyint NOT NULL DEFAULT '0',
  `role_skill_shoot_flame_thrower_growth` tinyint NOT NULL DEFAULT '0',
  `role_skill_shoot_flame_thrower_job` tinyint NOT NULL DEFAULT '0',
  `role_skill_shoot_flame_thrower_interst` tinyint NOT NULL DEFAULT '0',
  `role_skill_shoot_machine_gun_growth` tinyint NOT NULL DEFAULT '0',
  `role_skill_shoot_machine_gun_job` tinyint NOT NULL DEFAULT '0',
  `role_skill_shoot_machine_gun_interst` tinyint NOT NULL DEFAULT '0',
  `role_skill_shoot_heavy_weapon_growth` tinyint NOT NULL DEFAULT '0',
  `role_skill_shoot_heavy_weapon_job` tinyint NOT NULL DEFAULT '0',
  `role_skill_shoot_heavy_weapon_interst` tinyint NOT NULL DEFAULT '0',
  `role_skill_first_aid_growth` tinyint NOT NULL DEFAULT '0',
  `role_skill_first_aid_job` tinyint NOT NULL DEFAULT '0',
  `role_skill_first_aid_interst` tinyint NOT NULL DEFAULT '0',
  `role_skill_history_growth` tinyint NOT NULL DEFAULT '0',
  `role_skill_history_job` tinyint NOT NULL DEFAULT '0',
  `role_skill_history_interst` tinyint NOT NULL DEFAULT '0',
  `role_skill_threaten_growth` tinyint NOT NULL DEFAULT '0',
  `role_skill_threaten_job` tinyint NOT NULL DEFAULT '0',
  `role_skill_threaten_interst` tinyint NOT NULL DEFAULT '0',
  `role_skill_jump_growth` tinyint NOT NULL DEFAULT '0',
  `role_skill_jump_job` tinyint NOT NULL DEFAULT '0',
  `role_skill_jump_interst` tinyint NOT NULL DEFAULT '0',
  `role_skill_language_type1` varchar(20) DEFAULT NULL,
  `role_skill_language_val1_growth` tinyint NOT NULL DEFAULT '0',
  `role_skill_language_val1_job` tinyint NOT NULL DEFAULT '0',
  `role_skill_language_val1_interst` tinyint NOT NULL DEFAULT '0',
  `role_skill_language_type2` varchar(20) DEFAULT NULL,
  `role_skill_language_val2_growth` tinyint NOT NULL DEFAULT '0',
  `role_skill_language_val2_job` tinyint NOT NULL DEFAULT '0',
  `role_skill_language_val2_interst` tinyint NOT NULL DEFAULT '0',
  `role_skill_language_type3` varchar(20) DEFAULT NULL,
  `role_skill_language_val3_growth` tinyint NOT NULL DEFAULT '0',
  `role_skill_language_val3_job` tinyint NOT NULL DEFAULT '0',
  `role_skill_language_val3_interst` tinyint NOT NULL DEFAULT '0',
  `role_skill_mother_tongue_type` varchar(20) NOT NULL,
  `role_skill_mother_tongue_val_growth` tinyint NOT NULL DEFAULT '0',
  `role_skill_mother_tongue_val_job` tinyint NOT NULL DEFAULT '0',
  `role_skill_mother_tongue_val_interst` tinyint NOT NULL DEFAULT '0',
  `role_skill_throw_growth` tinyint NOT NULL DEFAULT '0',
  `role_skill_throw_job` tinyint NOT NULL DEFAULT '0',
  `role_skill_throw_interst` tinyint NOT NULL DEFAULT '0',
  `role_skill_track_growth` tinyint NOT NULL DEFAULT '0',
  `role_skill_track_job` tinyint NOT NULL DEFAULT '0',
  `role_skill_track_interst` tinyint NOT NULL DEFAULT '0',
  `role_skill_law_growth` tinyint NOT NULL DEFAULT '0',
  `role_skill_law_job` tinyint NOT NULL DEFAULT '0',
  `role_skill_law_interst` tinyint NOT NULL DEFAULT '0',
  `role_skill_library_use_growth` tinyint NOT NULL DEFAULT '0',
  `role_skill_library_use_job` tinyint NOT NULL DEFAULT '0',
  `role_skill_library_use_interst` tinyint NOT NULL DEFAULT '0',
  `role_skill_listen_growth` tinyint NOT NULL DEFAULT '0',
  `role_skill_listen_job` tinyint NOT NULL DEFAULT '0',
  `role_skill_listen_interst` tinyint NOT NULL DEFAULT '0',
  `role_skill_locksmith_growth` tinyint NOT NULL DEFAULT '0',
  `role_skill_locksmith_job` tinyint NOT NULL DEFAULT '0',
  `role_skill_locksmith_interst` tinyint NOT NULL DEFAULT '0',
  `role_skill_mechanical_repair_growth` tinyint NOT NULL DEFAULT '0',
  `role_skill_mechanical_repair_job` tinyint NOT NULL DEFAULT '0',
  `role_skill_mechanical_repair_interst` tinyint NOT NULL DEFAULT '0',
  `role_skill_medicine_growth` tinyint NOT NULL DEFAULT '0',
  `role_skill_medicine_job` tinyint NOT NULL DEFAULT '0',
  `role_skill_medicine_interst` tinyint NOT NULL DEFAULT '0',
  `role_skill_natural_world_growth` tinyint NOT NULL DEFAULT '10',
  `role_skill_natural_world_job` tinyint NOT NULL DEFAULT '0',
  `role_skill_natural_world_interst` tinyint NOT NULL DEFAULT '0',
  `role_skill_navigate_growth` tinyint NOT NULL DEFAULT '0',
  `role_skill_navigate_job` tinyint NOT NULL DEFAULT '0',
  `role_skill_navigate_interst` tinyint NOT NULL DEFAULT '0',
  `role_skill_occult_growth` tinyint NOT NULL DEFAULT '0',
  `role_skill_occult_job` tinyint NOT NULL DEFAULT '0',
  `role_skill_occult_interst` tinyint NOT NULL DEFAULT '0',
  `role_skill_operate_heavy_machinery_growth` tinyint NOT NULL DEFAULT '0',
  `role_skill_operate_heavy_machinery_job` tinyint NOT NULL DEFAULT '0',
  `role_skill_operate_heavy_machinery_interst` tinyint NOT NULL DEFAULT '0',
  `role_skill_persuade_growth` tinyint NOT NULL DEFAULT '0',
  `role_skill_persuade_job` tinyint NOT NULL DEFAULT '0',
  `role_skill_persuade_interst` tinyint NOT NULL DEFAULT '0',
  `role_skill_drive_aircraft_growth` tinyint NOT NULL DEFAULT '0',
  `role_skill_drive_aircraft_job` tinyint NOT NULL DEFAULT '0',
  `role_skill_drive_aircraft_interst` tinyint NOT NULL DEFAULT '0',
  `role_skill_drive_ship_growth` tinyint NOT NULL DEFAULT '0',
  `role_skill_drive_ship_job` tinyint NOT NULL DEFAULT '0',
  `role_skill_drive_ship_interst` tinyint NOT NULL DEFAULT '0',
  `role_skill_psychoanalysis_growth` tinyint NOT NULL DEFAULT '0',
  `role_skill_psychoanalysis_job` tinyint NOT NULL DEFAULT '0',
  `role_skill_psychoanalysis_interst` tinyint NOT NULL DEFAULT '0',
  `role_skill_psychology_growth` tinyint NOT NULL DEFAULT '0',
  `role_skill_psychology_job` tinyint NOT NULL DEFAULT '0',
  `role_skill_psychology_interst` tinyint NOT NULL DEFAULT '0',
  `role_skill_ride_growth` tinyint NOT NULL DEFAULT '0',
  `role_skill_ride_job` tinyint NOT NULL DEFAULT '0',
  `role_skill_ride_interst` tinyint NOT NULL DEFAULT '0',
  `role_skill_science_geology_growth` tinyint NOT NULL DEFAULT '0',
  `role_skill_science_geology_job` tinyint NOT NULL DEFAULT '0',
  `role_skill_science_geology_interst` tinyint NOT NULL DEFAULT '0',
  `role_skill_science_chemistry_growth` tinyint NOT NULL DEFAULT '1',
  `role_skill_science_chemistry_job` tinyint NOT NULL DEFAULT '0',
  `role_skill_science_chemistry_interst` tinyint NOT NULL DEFAULT '0',
  `role_skill_science_biology_growth` tinyint NOT NULL DEFAULT '0',
  `role_skill_science_biology_job` tinyint NOT NULL DEFAULT '0',
  `role_skill_science_biology_interst` tinyint NOT NULL DEFAULT '0',
  `role_skill_science_math_growth` tinyint NOT NULL DEFAULT '0',
  `role_skill_science_math_job` tinyint NOT NULL DEFAULT '0',
  `role_skill_science_math_interst` tinyint NOT NULL DEFAULT '0',
  `role_skill_science_astronomy_growth` tinyint NOT NULL DEFAULT '1',
  `role_skill_science_astronomy_job` tinyint NOT NULL DEFAULT '0',
  `role_skill_science_astronomy_interst` tinyint NOT NULL DEFAULT '0',
  `role_skill_science_physics_growth` tinyint NOT NULL DEFAULT '0',
  `role_skill_science_physics_job` tinyint NOT NULL DEFAULT '0',
  `role_skill_science_physics_interst` tinyint NOT NULL DEFAULT '0',
  `role_skill_science_pharmacy_growth` tinyint NOT NULL DEFAULT '0',
  `role_skill_science_pharmacy_job` tinyint NOT NULL DEFAULT '0',
  `role_skill_science_pharmacy_interst` tinyint NOT NULL DEFAULT '0',
  `role_skill_science_botany_growth` tinyint NOT NULL DEFAULT '1',
  `role_skill_science_botany_job` tinyint NOT NULL DEFAULT '0',
  `role_skill_science_botany_interst` tinyint NOT NULL DEFAULT '0',
  `role_skill_science_zoology_growth` tinyint NOT NULL DEFAULT '0',
  `role_skill_science_zoology_job` tinyint NOT NULL DEFAULT '0',
  `role_skill_science_zoology_interst` tinyint NOT NULL DEFAULT '0',
  `role_skill_science_cryptography_growth` tinyint NOT NULL DEFAULT '0',
  `role_skill_science_cryptography_job` tinyint NOT NULL DEFAULT '0',
  `role_skill_science_cryptography_interst` tinyint NOT NULL DEFAULT '0',
  `role_skill_science_engineering_growth` tinyint NOT NULL DEFAULT '1',
  `role_skill_science_engineering_job` tinyint NOT NULL DEFAULT '0',
  `role_skill_science_engineering_interst` tinyint NOT NULL DEFAULT '0',
  `role_skill_science_meteorology_growth` tinyint NOT NULL DEFAULT '0',
  `role_skill_science_meteorology_job` tinyint NOT NULL DEFAULT '0',
  `role_skill_science_meteorology_interst` tinyint NOT NULL DEFAULT '0',
  `role_skill_science_judicial_science_growth` tinyint NOT NULL DEFAULT '0',
  `role_skill_science_judicial_science_job` tinyint NOT NULL DEFAULT '0',
  `role_skill_science_judicial_science_interst` tinyint NOT NULL DEFAULT '0',
  `role_skill_sleight_of_hand_growth` tinyint NOT NULL DEFAULT '0',
  `role_skill_sleight_of_hand_job` tinyint NOT NULL DEFAULT '0',
  `role_skill_sleight_of_hand_interst` tinyint NOT NULL DEFAULT '0',
  `role_skill_recon_growth` tinyint NOT NULL DEFAULT '0',
  `role_skill_recon_job` tinyint NOT NULL DEFAULT '0',
  `role_skill_recon_interst` tinyint NOT NULL DEFAULT '0',
  `role_skill_stealth_growth` tinyint NOT NULL DEFAULT '0',
  `role_skill_stealth_job` tinyint NOT NULL DEFAULT '0',
  `role_skill_stealth_interst` tinyint NOT NULL DEFAULT '0',
  `role_skill_survival_growth` tinyint NOT NULL DEFAULT '0',
  `role_skill_survival_job` tinyint NOT NULL DEFAULT '0',
  `role_skill_survival_interst` tinyint NOT NULL DEFAULT '0',
  `role_skill_swim_growth` tinyint NOT NULL DEFAULT '0',
  `role_skill_swim_job` tinyint NOT NULL DEFAULT '0',
  `role_skill_swim_interst` tinyint NOT NULL DEFAULT '0',
  `role_skill_beast_training_growth` tinyint NOT NULL DEFAULT '0',
  `role_skill_beast_training_job` tinyint NOT NULL DEFAULT '0',
  `role_skill_beast_training_interst` tinyint NOT NULL DEFAULT '0',
  `role_skill_diving_growth` tinyint NOT NULL DEFAULT '0',
  `role_skill_diving_job` tinyint NOT NULL DEFAULT '0',
  `role_skill_diving_interst` tinyint NOT NULL DEFAULT '0',
  `role_skill_demolition_growth` tinyint NOT NULL DEFAULT '0',
  `role_skill_demolition_job` tinyint NOT NULL DEFAULT '0',
  `role_skill_demolition_interst` tinyint NOT NULL DEFAULT '0',
  `role_skill_read_lips_growth` tinyint NOT NULL DEFAULT '0',
  `role_skill_read_lips_job` tinyint NOT NULL DEFAULT '0',
  `role_skill_read_lips_interst` tinyint NOT NULL DEFAULT '0',
  `role_skill_hypnosis_growth` tinyint NOT NULL DEFAULT '0',
  `role_skill_hypnosis_job` tinyint NOT NULL DEFAULT '0',
  `role_skill_hypnosis_interst` tinyint NOT NULL DEFAULT '0',
  `role_skill_artillery_growth` tinyint NOT NULL DEFAULT '0',
  `role_skill_artillery_job` tinyint NOT NULL DEFAULT '0',
  `role_skill_artillery_interst` tinyint NOT NULL DEFAULT '0',
  `role_skill_lore_type` varchar(20) DEFAULT NULL,
  `role_skill_lore_val_growth` tinyint NOT NULL DEFAULT '0',
  `role_skill_lore_val_job` tinyint NOT NULL DEFAULT '0',
  `role_skill_lore_val_interst` tinyint NOT NULL DEFAULT '0',
  PRIMARY KEY (`role_card_id`),
  UNIQUE KEY `RoleCardId_UNIQUE` (`role_card_id`),
  KEY `RoleJobId_JobId_idx` (`role_job_id`),
  KEY `RoleCardPlayerId_UserId` (`role_card_player_id`),
  CONSTRAINT `RoleCardPlayerId_UserId` FOREIGN KEY (`role_card_player_id`) REFERENCES `user` (`user_id`) ON DELETE CASCADE ON UPDATE CASCADE,
  CONSTRAINT `RoleJobId_JobId` FOREIGN KEY (`role_job_id`) REFERENCES `job_list` (`job_id`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `rolecard`
--

LOCK TABLES `rolecard` WRITE;
/*!40000 ALTER TABLE `rolecard` DISABLE KEYS */;
INSERT INTO `rolecard` VALUES (1,1,'1920s','test role1',2,1,'福克斯',3,'test string',15,15,70,3,5,7,50,45,24,'test string',1,1,1,1,1,1,1,'健康','神志清醒',1,0,0,1,0,0,1,0,0,1,0,0,1,0,0,1,0,0,1,0,0,1,0,0,1,0,0,1,0,0,1,0,0,1,0,0,1,0,0,1,0,0,1,0,0,1,0,0,1,0,0,1,0,0,1,0,0,1,0,0,1,0,0,1,0,0,1,0,0,1,0,0,1,0,0,1,0,0,1,0,0,1,0,0,1,0,0,1,0,0,1,0,0,1,0,0,1,0,0,1,0,0,1,0,0,1,0,0,1,0,0,1,0,0,1,0,0,1,0,0,1,0,0,1,0,0,1,0,0,1,0,0,1,0,0,1,0,0,1,0,0,1,0,0,1,0,0,1,0,0,1,0,0,1,0,0,1,0,0,'test string',1,0,0,'test string',1,0,0,'test string',1,0,0,'test string',1,0,0,1,0,0,1,0,0,1,0,0,1,0,0,1,0,0,1,0,0,1,0,0,1,0,0,1,0,0,1,0,0,1,0,0,1,0,0,1,0,0,1,0,0,1,0,0,1,0,0,1,0,0,1,0,0,1,0,0,1,0,0,1,0,0,1,0,0,1,0,0,1,0,0,1,0,0,1,0,0,1,0,0,1,0,0,1,0,0,1,0,0,1,0,0,1,0,0,1,0,0,1,0,0,1,0,0,1,0,0,1,0,0,1,0,0,1,0,0,1,0,0,1,0,0,1,0,0,'test string',1,0,0),(2,1,'1920s','test role2',1,1,'test string',1,'test string',1,1,1,1,1,1,1,1,1,'test string',1,1,1,1,1,1,1,'健康','test string',1,0,0,1,0,0,1,0,0,1,0,0,1,0,0,1,0,0,1,0,0,1,0,0,1,0,0,1,0,0,1,0,0,1,0,0,1,0,0,1,0,0,1,0,0,1,0,0,1,0,0,1,0,0,1,0,0,1,0,0,1,0,0,1,0,0,1,0,0,1,0,0,1,0,0,1,0,0,1,0,0,1,0,0,1,0,0,1,0,0,1,0,0,1,0,0,1,0,0,1,0,0,1,0,0,1,0,0,1,0,0,1,0,0,1,0,0,1,0,0,1,0,0,1,0,0,1,0,0,1,0,0,1,0,0,1,0,0,1,0,0,1,0,0,1,0,0,1,0,0,1,0,0,1,0,0,1,0,0,'test string',1,0,0,'test string',1,0,0,'test string',1,0,0,'test string',1,0,0,1,0,0,1,0,0,1,0,0,1,0,0,1,0,0,1,0,0,1,0,0,1,0,0,1,0,0,1,0,0,1,0,0,1,0,0,1,0,0,1,0,0,1,0,0,1,0,0,1,0,0,1,0,0,1,0,0,1,0,0,1,0,0,1,0,0,1,0,0,1,0,0,1,0,0,1,0,0,1,0,0,1,0,0,1,0,0,1,0,0,1,0,0,1,0,0,1,0,0,1,0,0,1,0,0,1,0,0,1,0,0,1,0,0,1,0,0,1,0,0,1,0,0,1,0,0,'test string',1,0,0);
/*!40000 ALTER TABLE `rolecard` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2022-03-04 19:09:16
