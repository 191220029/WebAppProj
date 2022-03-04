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
-- Temporary view structure for view `role_skills`
--

DROP TABLE IF EXISTS `role_skills`;
/*!50001 DROP VIEW IF EXISTS `role_skills`*/;
SET @saved_cs_client     = @@character_set_client;
/*!50503 SET character_set_client = utf8mb4 */;
/*!50001 CREATE VIEW `role_skills` AS SELECT 
 1 AS `role_card_id`,
 1 AS `role_skill_accounting_growth`,
 1 AS `role_skill_accounting_job`,
 1 AS `role_skill_accounting_interst`,
 1 AS `role_skill_anthropology_growth`,
 1 AS `role_skill_anthropology_job`,
 1 AS `role_skill_anthropology_interst`,
 1 AS `role_skill_evaluation_growth`,
 1 AS `role_skill_evaluation_job`,
 1 AS `role_skill_evaluation_interst`,
 1 AS `role_skill_archaeology_growth`,
 1 AS `role_skill_archaeology_job`,
 1 AS `role_skill_archaeology_interst`,
 1 AS `role_skill_writing_growth`,
 1 AS `role_skill_writing_job`,
 1 AS `role_skill_writing_interst`,
 1 AS `role_skill_music_theory_growth`,
 1 AS `role_skill_music_theory_job`,
 1 AS `role_skill_music_theory_interst`,
 1 AS `role_skill_morris_dance_growth`,
 1 AS `role_skill_morris_dance_job`,
 1 AS `role_skill_morris_dance_interst`,
 1 AS `role_skill_opera_singing_growth`,
 1 AS `role_skill_opera_singing_job`,
 1 AS `role_skill_opera_singing_interst`,
 1 AS `role_skill_whitewasher_painter_growth`,
 1 AS `role_skill_whitewasher_painter_job`,
 1 AS `role_skill_whitewasher_painter_interst`,
 1 AS `role_skill_photography_growth`,
 1 AS `role_skill_photography_job`,
 1 AS `role_skill_photography_interst`,
 1 AS `role_skill_dance_growth`,
 1 AS `role_skill_dance_job`,
 1 AS `role_skill_dance_interst`,
 1 AS `role_skill_art_growth`,
 1 AS `role_skill_art_job`,
 1 AS `role_skill_art_interst`,
 1 AS `role_skill_forge_growth`,
 1 AS `role_skill_forge_job`,
 1 AS `role_skill_forge_interst`,
 1 AS `role_skill_pottery_making_growth`,
 1 AS `role_skill_pottery_making_job`,
 1 AS `role_skill_pottery_making_interst`,
 1 AS `role_skill_technical_drawing_growth`,
 1 AS `role_skill_technical_drawing_job`,
 1 AS `role_skill_technical_drawing_interst`,
 1 AS `role_skill_farming_growth`,
 1 AS `role_skill_farming_job`,
 1 AS `role_skill_farming_interst`,
 1 AS `role_skill_typing_growth`,
 1 AS `role_skill_typing_job`,
 1 AS `role_skill_typing_interst`,
 1 AS `role_skill_shorthand_growth`,
 1 AS `role_skill_shorthand_job`,
 1 AS `role_skill_shorthand_interst`,
 1 AS `role_skill_blown_glass_tube_growth`,
 1 AS `role_skill_blown_glass_tube_job`,
 1 AS `role_skill_blown_glass_tube_interst`,
 1 AS `role_skill_tailor_growth`,
 1 AS `role_skill_tailor_job`,
 1 AS `role_skill_tailor_interst`,
 1 AS `role_skill_make_wine_growth`,
 1 AS `role_skill_make_wine_job`,
 1 AS `role_skill_make_wine_interst`,
 1 AS `role_skill_fishing_growth`,
 1 AS `role_skill_fishing_job`,
 1 AS `role_skill_fishing_interst`,
 1 AS `role_skill_sculpture_growth`,
 1 AS `role_skill_sculpture_job`,
 1 AS `role_skill_sculpture_interst`,
 1 AS `role_skill_acrobatics_growth`,
 1 AS `role_skill_acrobatics_job`,
 1 AS `role_skill_acrobatics_interst`,
 1 AS `role_skill_seduce_growth`,
 1 AS `role_skill_seduce_job`,
 1 AS `role_skill_seduce_interst`,
 1 AS `role_skill_climb_growth`,
 1 AS `role_skill_climb_job`,
 1 AS `role_skill_climb_interst`,
 1 AS `role_skill_computer_growth`,
 1 AS `role_skill_computer_job`,
 1 AS `role_skill_computer_interst`,
 1 AS `role_skill_credit_growth`,
 1 AS `role_skill_credit_job`,
 1 AS `role_skill_credit_interst`,
 1 AS `role_skill_cthulhu_mythos_growth`,
 1 AS `role_skill_cthulhu_mythos_job`,
 1 AS `role_skill_cthulhu_mythos_interst`,
 1 AS `role_skill_disguise_growth`,
 1 AS `role_skill_disguise_job`,
 1 AS `role_skill_disguise_interst`,
 1 AS `role_skill_dodge_growth`,
 1 AS `role_skill_dodge_job`,
 1 AS `role_skill_dodge_interst`,
 1 AS `role_skill_car_driving_growth`,
 1 AS `role_skill_car_driving_job`,
 1 AS `role_skill_car_driving_interst`,
 1 AS `role_skill_electrical_maintenance_growth`,
 1 AS `role_skill_electrical_maintenance_job`,
 1 AS `role_skill_electrical_maintenance_interst`,
 1 AS `role_skill_electronics_growth`,
 1 AS `role_skill_electronics_job`,
 1 AS `role_skill_electronics_interst`,
 1 AS `role_skill_speech_skill_growth`,
 1 AS `role_skill_speech_skill_job`,
 1 AS `role_skill_speech_skill_interst`,
 1 AS `role_skill_combat_fight_growth`,
 1 AS `role_skill_combat_fight_job`,
 1 AS `role_skill_combat_fight_interst`,
 1 AS `role_skill_combat_whip_growth`,
 1 AS `role_skill_combat_whip_job`,
 1 AS `role_skill_combat_whip_interst`,
 1 AS `role_skill_combat_electric_saw_growth`,
 1 AS `role_skill_combat_electric_saw_job`,
 1 AS `role_skill_combat_electric_saw_interst`,
 1 AS `role_skill_combat_axe_growth`,
 1 AS `role_skill_combat_axe_job`,
 1 AS `role_skill_combat_axe_interst`,
 1 AS `role_skill_combat_sword_growth`,
 1 AS `role_skill_combat_sword_job`,
 1 AS `role_skill_combat_sword_interst`,
 1 AS `role_skill_combat_hinge_growth`,
 1 AS `role_skill_combat_hinge_job`,
 1 AS `role_skill_combat_hinge_interst`,
 1 AS `role_skill_combat_flail_growth`,
 1 AS `role_skill_combat_flail_job`,
 1 AS `role_skill_combat_flail_interst`,
 1 AS `role_skill_combat_spear_growth`,
 1 AS `role_skill_combat_spear_job`,
 1 AS `role_skill_combat_spear_interst`,
 1 AS `role_skill_shoot_pistol_growth`,
 1 AS `role_skill_shoot_pistol_job`,
 1 AS `role_skill_shoot_pistol_interst`,
 1 AS `role_skill_shoot_rifle_shotgun_growth`,
 1 AS `role_skill_shoot_rifle_shotgun_job`,
 1 AS `role_skill_shoot_rifle_shotgun_interst`,
 1 AS `role_skill_shoot_archery_growth`,
 1 AS `role_skill_shoot_archery_job`,
 1 AS `role_skill_shoot_archery_interst`,
 1 AS `role_skill_shoot_flame_thrower_growth`,
 1 AS `role_skill_shoot_flame_thrower_job`,
 1 AS `role_skill_shoot_flame_thrower_interst`,
 1 AS `role_skill_shoot_machine_gun_growth`,
 1 AS `role_skill_shoot_machine_gun_job`,
 1 AS `role_skill_shoot_machine_gun_interst`,
 1 AS `role_skill_shoot_heavy_weapon_growth`,
 1 AS `role_skill_shoot_heavy_weapon_job`,
 1 AS `role_skill_shoot_heavy_weapon_interst`,
 1 AS `role_skill_first_aid_growth`,
 1 AS `role_skill_first_aid_job`,
 1 AS `role_skill_first_aid_interst`,
 1 AS `role_skill_history_growth`,
 1 AS `role_skill_history_job`,
 1 AS `role_skill_history_interst`,
 1 AS `role_skill_threaten_growth`,
 1 AS `role_skill_threaten_job`,
 1 AS `role_skill_threaten_interst`,
 1 AS `role_skill_jump_growth`,
 1 AS `role_skill_jump_job`,
 1 AS `role_skill_jump_interst`,
 1 AS `role_skill_language_type1`,
 1 AS `role_skill_language_val1_growth`,
 1 AS `role_skill_language_val1_job`,
 1 AS `role_skill_language_val1_interst`,
 1 AS `role_skill_language_type2`,
 1 AS `role_skill_language_val2_growth`,
 1 AS `role_skill_language_val2_job`,
 1 AS `role_skill_language_val2_interst`,
 1 AS `role_skill_language_type3`,
 1 AS `role_skill_language_val3_growth`,
 1 AS `role_skill_language_val3_job`,
 1 AS `role_skill_language_val3_interst`,
 1 AS `role_skill_mother_tongue_type`,
 1 AS `role_skill_mother_tongue_val_growth`,
 1 AS `role_skill_mother_tongue_val_job`,
 1 AS `role_skill_mother_tongue_val_interst`,
 1 AS `role_skill_throw_growth`,
 1 AS `role_skill_throw_job`,
 1 AS `role_skill_throw_interst`,
 1 AS `role_skill_track_growth`,
 1 AS `role_skill_track_job`,
 1 AS `role_skill_track_interst`,
 1 AS `role_skill_law_growth`,
 1 AS `role_skill_law_job`,
 1 AS `role_skill_law_interst`,
 1 AS `role_skill_library_use_growth`,
 1 AS `role_skill_library_use_job`,
 1 AS `role_skill_library_use_interst`,
 1 AS `role_skill_listen_growth`,
 1 AS `role_skill_listen_job`,
 1 AS `role_skill_listen_interst`,
 1 AS `role_skill_locksmith_growth`,
 1 AS `role_skill_locksmith_job`,
 1 AS `role_skill_locksmith_interst`,
 1 AS `role_skill_mechanical_repair_growth`,
 1 AS `role_skill_mechanical_repair_job`,
 1 AS `role_skill_mechanical_repair_interst`,
 1 AS `role_skill_medicine_growth`,
 1 AS `role_skill_medicine_job`,
 1 AS `role_skill_medicine_interst`,
 1 AS `role_skill_natural_world_growth`,
 1 AS `role_skill_natural_world_job`,
 1 AS `role_skill_natural_world_interst`,
 1 AS `role_skill_navigate_growth`,
 1 AS `role_skill_navigate_job`,
 1 AS `role_skill_navigate_interst`,
 1 AS `role_skill_occult_growth`,
 1 AS `role_skill_occult_job`,
 1 AS `role_skill_occult_interst`,
 1 AS `role_skill_operate_heavy_machinery_growth`,
 1 AS `role_skill_operate_heavy_machinery_job`,
 1 AS `role_skill_operate_heavy_machinery_interst`,
 1 AS `role_skill_persuade_growth`,
 1 AS `role_skill_persuade_job`,
 1 AS `role_skill_persuade_interst`,
 1 AS `role_skill_drive_aircraft_growth`,
 1 AS `role_skill_drive_aircraft_job`,
 1 AS `role_skill_drive_aircraft_interst`,
 1 AS `role_skill_drive_ship_growth`,
 1 AS `role_skill_drive_ship_job`,
 1 AS `role_skill_drive_ship_interst`,
 1 AS `role_skill_psychoanalysis_growth`,
 1 AS `role_skill_psychoanalysis_job`,
 1 AS `role_skill_psychoanalysis_interst`,
 1 AS `role_skill_psychology_growth`,
 1 AS `role_skill_psychology_job`,
 1 AS `role_skill_psychology_interst`,
 1 AS `role_skill_ride_growth`,
 1 AS `role_skill_ride_job`,
 1 AS `role_skill_ride_interst`,
 1 AS `role_skill_science_geology_growth`,
 1 AS `role_skill_science_geology_job`,
 1 AS `role_skill_science_geology_interst`,
 1 AS `role_skill_science_chemistry_growth`,
 1 AS `role_skill_science_chemistry_job`,
 1 AS `role_skill_science_chemistry_interst`,
 1 AS `role_skill_science_biology_growth`,
 1 AS `role_skill_science_biology_job`,
 1 AS `role_skill_science_biology_interst`,
 1 AS `role_skill_science_math_growth`,
 1 AS `role_skill_science_math_job`,
 1 AS `role_skill_science_math_interst`,
 1 AS `role_skill_science_astronomy_growth`,
 1 AS `role_skill_science_astronomy_job`,
 1 AS `role_skill_science_astronomy_interst`,
 1 AS `role_skill_science_physics_growth`,
 1 AS `role_skill_science_physics_job`,
 1 AS `role_skill_science_physics_interst`,
 1 AS `role_skill_science_pharmacy_growth`,
 1 AS `role_skill_science_pharmacy_job`,
 1 AS `role_skill_science_pharmacy_interst`,
 1 AS `role_skill_science_botany_growth`,
 1 AS `role_skill_science_botany_job`,
 1 AS `role_skill_science_botany_interst`,
 1 AS `role_skill_science_zoology_growth`,
 1 AS `role_skill_science_zoology_job`,
 1 AS `role_skill_science_zoology_interst`,
 1 AS `role_skill_science_cryptography_growth`,
 1 AS `role_skill_science_cryptography_job`,
 1 AS `role_skill_science_cryptography_interst`,
 1 AS `role_skill_science_engineering_growth`,
 1 AS `role_skill_science_engineering_job`,
 1 AS `role_skill_science_engineering_interst`,
 1 AS `role_skill_science_meteorology_growth`,
 1 AS `role_skill_science_meteorology_job`,
 1 AS `role_skill_science_meteorology_interst`,
 1 AS `role_skill_science_judicial_science_growth`,
 1 AS `role_skill_science_judicial_science_job`,
 1 AS `role_skill_science_judicial_science_interst`,
 1 AS `role_skill_sleight_of_hand_growth`,
 1 AS `role_skill_sleight_of_hand_job`,
 1 AS `role_skill_sleight_of_hand_interst`,
 1 AS `role_skill_recon_growth`,
 1 AS `role_skill_recon_job`,
 1 AS `role_skill_recon_interst`,
 1 AS `role_skill_stealth_growth`,
 1 AS `role_skill_stealth_job`,
 1 AS `role_skill_stealth_interst`,
 1 AS `role_skill_survival_growth`,
 1 AS `role_skill_survival_job`,
 1 AS `role_skill_survival_interst`,
 1 AS `role_skill_swim_growth`,
 1 AS `role_skill_swim_job`,
 1 AS `role_skill_swim_interst`,
 1 AS `role_skill_beast_training_growth`,
 1 AS `role_skill_beast_training_job`,
 1 AS `role_skill_beast_training_interst`,
 1 AS `role_skill_diving_growth`,
 1 AS `role_skill_diving_job`,
 1 AS `role_skill_diving_interst`,
 1 AS `role_skill_demolition_growth`,
 1 AS `role_skill_demolition_job`,
 1 AS `role_skill_demolition_interst`,
 1 AS `role_skill_read_lips_growth`,
 1 AS `role_skill_read_lips_job`,
 1 AS `role_skill_read_lips_interst`,
 1 AS `role_skill_hypnosis_growth`,
 1 AS `role_skill_hypnosis_job`,
 1 AS `role_skill_hypnosis_interst`,
 1 AS `role_skill_artillery_growth`,
 1 AS `role_skill_artillery_job`,
 1 AS `role_skill_artillery_interst`,
 1 AS `role_skill_lore_type`,
 1 AS `role_skill_lore_val_growth`,
 1 AS `role_skill_lore_val_job`,
 1 AS `role_skill_lore_val_interst`*/;
SET character_set_client = @saved_cs_client;

--
-- Temporary view structure for view `role_elements`
--

DROP TABLE IF EXISTS `role_elements`;
/*!50001 DROP VIEW IF EXISTS `role_elements`*/;
SET @saved_cs_client     = @@character_set_client;
/*!50503 SET character_set_client = utf8mb4 */;
/*!50001 CREATE VIEW `role_elements` AS SELECT 
 1 AS `role_card_id`,
 1 AS `rolestr`,
 1 AS `rolecon`,
 1 AS `rolesiz`,
 1 AS `roledex`,
 1 AS `roleapp`,
 1 AS `roleint`,
 1 AS `rolepow`,
 1 AS `roleedu`,
 1 AS `rolemov`,
 1 AS `role_cur_hit_points`,
 1 AS `role_max_hit_points`,
 1 AS `role_cur_sanity`,
 1 AS `role_max_sanity`,
 1 AS `role_luck`,
 1 AS `role_cur_magic`,
 1 AS `role_max_magic`,
 1 AS `role_physical_status`,
 1 AS `role_mental_status`*/;
SET character_set_client = @saved_cs_client;

--
-- Temporary view structure for view `role_base_info`
--

DROP TABLE IF EXISTS `role_base_info`;
/*!50001 DROP VIEW IF EXISTS `role_base_info`*/;
SET @saved_cs_client     = @@character_set_client;
/*!50503 SET character_set_client = utf8mb4 */;
/*!50001 CREATE VIEW `role_base_info` AS SELECT 
 1 AS `role_card_id`,
 1 AS `role_card_player_id`,
 1 AS `role_name`,
 1 AS `user_name`,
 1 AS `era`,
 1 AS `job_name`,
 1 AS `job_id`,
 1 AS `role_age`,
 1 AS `role_gender`,
 1 AS `role_home_address`,
 1 AS `role_hometown`*/;
SET character_set_client = @saved_cs_client;

--
-- Final view structure for view `role_skills`
--

/*!50001 DROP VIEW IF EXISTS `role_skills`*/;
/*!50001 SET @saved_cs_client          = @@character_set_client */;
/*!50001 SET @saved_cs_results         = @@character_set_results */;
/*!50001 SET @saved_col_connection     = @@collation_connection */;
/*!50001 SET character_set_client      = utf8mb4 */;
/*!50001 SET character_set_results     = utf8mb4 */;
/*!50001 SET collation_connection      = utf8mb4_0900_ai_ci */;
/*!50001 CREATE ALGORITHM=UNDEFINED */
/*!50013 DEFINER=`root`@`localhost` SQL SECURITY DEFINER */
/*!50001 VIEW `role_skills` AS select `rolecard`.`role_card_id` AS `role_card_id`,`rolecard`.`role_skill_accounting_growth` AS `role_skill_accounting_growth`,`rolecard`.`role_skill_accounting_job` AS `role_skill_accounting_job`,`rolecard`.`role_skill_accounting_interst` AS `role_skill_accounting_interst`,`rolecard`.`role_skill_anthropology_growth` AS `role_skill_anthropology_growth`,`rolecard`.`role_skill_anthropology_job` AS `role_skill_anthropology_job`,`rolecard`.`role_skill_anthropology_interst` AS `role_skill_anthropology_interst`,`rolecard`.`role_skill_evaluation_growth` AS `role_skill_evaluation_growth`,`rolecard`.`role_skill_evaluation_job` AS `role_skill_evaluation_job`,`rolecard`.`role_skill_evaluation_interst` AS `role_skill_evaluation_interst`,`rolecard`.`role_skill_archaeology_growth` AS `role_skill_archaeology_growth`,`rolecard`.`role_skill_archaeology_job` AS `role_skill_archaeology_job`,`rolecard`.`role_skill_archaeology_interst` AS `role_skill_archaeology_interst`,`rolecard`.`role_skill_writing_growth` AS `role_skill_writing_growth`,`rolecard`.`role_skill_writing_job` AS `role_skill_writing_job`,`rolecard`.`role_skill_writing_interst` AS `role_skill_writing_interst`,`rolecard`.`role_skill_music_theory_growth` AS `role_skill_music_theory_growth`,`rolecard`.`role_skill_music_theory_job` AS `role_skill_music_theory_job`,`rolecard`.`role_skill_music_theory_interst` AS `role_skill_music_theory_interst`,`rolecard`.`role_skill_morris_dance_growth` AS `role_skill_morris_dance_growth`,`rolecard`.`role_skill_morris_dance_job` AS `role_skill_morris_dance_job`,`rolecard`.`role_skill_morris_dance_interst` AS `role_skill_morris_dance_interst`,`rolecard`.`role_skill_opera_singing_growth` AS `role_skill_opera_singing_growth`,`rolecard`.`role_skill_opera_singing_job` AS `role_skill_opera_singing_job`,`rolecard`.`role_skill_opera_singing_interst` AS `role_skill_opera_singing_interst`,`rolecard`.`role_skill_whitewasher_painter_growth` AS `role_skill_whitewasher_painter_growth`,`rolecard`.`role_skill_whitewasher_painter_job` AS `role_skill_whitewasher_painter_job`,`rolecard`.`role_skill_whitewasher_painter_interst` AS `role_skill_whitewasher_painter_interst`,`rolecard`.`role_skill_photography_growth` AS `role_skill_photography_growth`,`rolecard`.`role_skill_photography_job` AS `role_skill_photography_job`,`rolecard`.`role_skill_photography_interst` AS `role_skill_photography_interst`,`rolecard`.`role_skill_dance_growth` AS `role_skill_dance_growth`,`rolecard`.`role_skill_dance_job` AS `role_skill_dance_job`,`rolecard`.`role_skill_dance_interst` AS `role_skill_dance_interst`,`rolecard`.`role_skill_art_growth` AS `role_skill_art_growth`,`rolecard`.`role_skill_art_job` AS `role_skill_art_job`,`rolecard`.`role_skill_art_interst` AS `role_skill_art_interst`,`rolecard`.`role_skill_forge_growth` AS `role_skill_forge_growth`,`rolecard`.`role_skill_forge_job` AS `role_skill_forge_job`,`rolecard`.`role_skill_forge_interst` AS `role_skill_forge_interst`,`rolecard`.`role_skill_pottery_making_growth` AS `role_skill_pottery_making_growth`,`rolecard`.`role_skill_pottery_making_job` AS `role_skill_pottery_making_job`,`rolecard`.`role_skill_pottery_making_interst` AS `role_skill_pottery_making_interst`,`rolecard`.`role_skill_technical_drawing_growth` AS `role_skill_technical_drawing_growth`,`rolecard`.`role_skill_technical_drawing_job` AS `role_skill_technical_drawing_job`,`rolecard`.`role_skill_technical_drawing_interst` AS `role_skill_technical_drawing_interst`,`rolecard`.`role_skill_farming_growth` AS `role_skill_farming_growth`,`rolecard`.`role_skill_farming_job` AS `role_skill_farming_job`,`rolecard`.`role_skill_farming_interst` AS `role_skill_farming_interst`,`rolecard`.`role_skill_typing_growth` AS `role_skill_typing_growth`,`rolecard`.`role_skill_typing_job` AS `role_skill_typing_job`,`rolecard`.`role_skill_typing_interst` AS `role_skill_typing_interst`,`rolecard`.`role_skill_shorthand_growth` AS `role_skill_shorthand_growth`,`rolecard`.`role_skill_shorthand_job` AS `role_skill_shorthand_job`,`rolecard`.`role_skill_shorthand_interst` AS `role_skill_shorthand_interst`,`rolecard`.`role_skill_blown_glass_tube_growth` AS `role_skill_blown_glass_tube_growth`,`rolecard`.`role_skill_blown_glass_tube_job` AS `role_skill_blown_glass_tube_job`,`rolecard`.`role_skill_blown_glass_tube_interst` AS `role_skill_blown_glass_tube_interst`,`rolecard`.`role_skill_tailor_growth` AS `role_skill_tailor_growth`,`rolecard`.`role_skill_tailor_job` AS `role_skill_tailor_job`,`rolecard`.`role_skill_tailor_interst` AS `role_skill_tailor_interst`,`rolecard`.`role_skill_make_wine_growth` AS `role_skill_make_wine_growth`,`rolecard`.`role_skill_make_wine_job` AS `role_skill_make_wine_job`,`rolecard`.`role_skill_make_wine_interst` AS `role_skill_make_wine_interst`,`rolecard`.`role_skill_fishing_growth` AS `role_skill_fishing_growth`,`rolecard`.`role_skill_fishing_job` AS `role_skill_fishing_job`,`rolecard`.`role_skill_fishing_interst` AS `role_skill_fishing_interst`,`rolecard`.`role_skill_sculpture_growth` AS `role_skill_sculpture_growth`,`rolecard`.`role_skill_sculpture_job` AS `role_skill_sculpture_job`,`rolecard`.`role_skill_sculpture_interst` AS `role_skill_sculpture_interst`,`rolecard`.`role_skill_acrobatics_growth` AS `role_skill_acrobatics_growth`,`rolecard`.`role_skill_acrobatics_job` AS `role_skill_acrobatics_job`,`rolecard`.`role_skill_acrobatics_interst` AS `role_skill_acrobatics_interst`,`rolecard`.`role_skill_seduce_growth` AS `role_skill_seduce_growth`,`rolecard`.`role_skill_seduce_job` AS `role_skill_seduce_job`,`rolecard`.`role_skill_seduce_interst` AS `role_skill_seduce_interst`,`rolecard`.`role_skill_climb_growth` AS `role_skill_climb_growth`,`rolecard`.`role_skill_climb_job` AS `role_skill_climb_job`,`rolecard`.`role_skill_climb_interst` AS `role_skill_climb_interst`,`rolecard`.`role_skill_computer_growth` AS `role_skill_computer_growth`,`rolecard`.`role_skill_computer_job` AS `role_skill_computer_job`,`rolecard`.`role_skill_computer_interst` AS `role_skill_computer_interst`,`rolecard`.`role_skill_credit_growth` AS `role_skill_credit_growth`,`rolecard`.`role_skill_credit_job` AS `role_skill_credit_job`,`rolecard`.`role_skill_credit_interst` AS `role_skill_credit_interst`,`rolecard`.`role_skill_cthulhu_mythos_growth` AS `role_skill_cthulhu_mythos_growth`,`rolecard`.`role_skill_cthulhu_mythos_job` AS `role_skill_cthulhu_mythos_job`,`rolecard`.`role_skill_cthulhu_mythos_interst` AS `role_skill_cthulhu_mythos_interst`,`rolecard`.`role_skill_disguise_growth` AS `role_skill_disguise_growth`,`rolecard`.`role_skill_disguise_job` AS `role_skill_disguise_job`,`rolecard`.`role_skill_disguise_interst` AS `role_skill_disguise_interst`,`rolecard`.`role_skill_dodge_growth` AS `role_skill_dodge_growth`,`rolecard`.`role_skill_dodge_job` AS `role_skill_dodge_job`,`rolecard`.`role_skill_dodge_interst` AS `role_skill_dodge_interst`,`rolecard`.`role_skill_car_driving_growth` AS `role_skill_car_driving_growth`,`rolecard`.`role_skill_car_driving_job` AS `role_skill_car_driving_job`,`rolecard`.`role_skill_car_driving_interst` AS `role_skill_car_driving_interst`,`rolecard`.`role_skill_electrical_maintenance_growth` AS `role_skill_electrical_maintenance_growth`,`rolecard`.`role_skill_electrical_maintenance_job` AS `role_skill_electrical_maintenance_job`,`rolecard`.`role_skill_electrical_maintenance_interst` AS `role_skill_electrical_maintenance_interst`,`rolecard`.`role_skill_electronics_growth` AS `role_skill_electronics_growth`,`rolecard`.`role_skill_electronics_job` AS `role_skill_electronics_job`,`rolecard`.`role_skill_electronics_interst` AS `role_skill_electronics_interst`,`rolecard`.`role_skill_speech_skill_growth` AS `role_skill_speech_skill_growth`,`rolecard`.`role_skill_speech_skill_job` AS `role_skill_speech_skill_job`,`rolecard`.`role_skill_speech_skill_interst` AS `role_skill_speech_skill_interst`,`rolecard`.`role_skill_combat_fight_growth` AS `role_skill_combat_fight_growth`,`rolecard`.`role_skill_combat_fight_job` AS `role_skill_combat_fight_job`,`rolecard`.`role_skill_combat_fight_interst` AS `role_skill_combat_fight_interst`,`rolecard`.`role_skill_combat_whip_growth` AS `role_skill_combat_whip_growth`,`rolecard`.`role_skill_combat_whip_job` AS `role_skill_combat_whip_job`,`rolecard`.`role_skill_combat_whip_interst` AS `role_skill_combat_whip_interst`,`rolecard`.`role_skill_combat_electric_saw_growth` AS `role_skill_combat_electric_saw_growth`,`rolecard`.`role_skill_combat_electric_saw_job` AS `role_skill_combat_electric_saw_job`,`rolecard`.`role_skill_combat_electric_saw_interst` AS `role_skill_combat_electric_saw_interst`,`rolecard`.`role_skill_combat_axe_growth` AS `role_skill_combat_axe_growth`,`rolecard`.`role_skill_combat_axe_job` AS `role_skill_combat_axe_job`,`rolecard`.`role_skill_combat_axe_interst` AS `role_skill_combat_axe_interst`,`rolecard`.`role_skill_combat_sword_growth` AS `role_skill_combat_sword_growth`,`rolecard`.`role_skill_combat_sword_job` AS `role_skill_combat_sword_job`,`rolecard`.`role_skill_combat_sword_interst` AS `role_skill_combat_sword_interst`,`rolecard`.`role_skill_combat_hinge_growth` AS `role_skill_combat_hinge_growth`,`rolecard`.`role_skill_combat_hinge_job` AS `role_skill_combat_hinge_job`,`rolecard`.`role_skill_combat_hinge_interst` AS `role_skill_combat_hinge_interst`,`rolecard`.`role_skill_combat_flail_growth` AS `role_skill_combat_flail_growth`,`rolecard`.`role_skill_combat_flail_job` AS `role_skill_combat_flail_job`,`rolecard`.`role_skill_combat_flail_interst` AS `role_skill_combat_flail_interst`,`rolecard`.`role_skill_combat_spear_growth` AS `role_skill_combat_spear_growth`,`rolecard`.`role_skill_combat_spear_job` AS `role_skill_combat_spear_job`,`rolecard`.`role_skill_combat_spear_interst` AS `role_skill_combat_spear_interst`,`rolecard`.`role_skill_shoot_pistol_growth` AS `role_skill_shoot_pistol_growth`,`rolecard`.`role_skill_shoot_pistol_job` AS `role_skill_shoot_pistol_job`,`rolecard`.`role_skill_shoot_pistol_interst` AS `role_skill_shoot_pistol_interst`,`rolecard`.`role_skill_shoot_rifle_shotgun_growth` AS `role_skill_shoot_rifle_shotgun_growth`,`rolecard`.`role_skill_shoot_rifle_shotgun_job` AS `role_skill_shoot_rifle_shotgun_job`,`rolecard`.`role_skill_shoot_rifle_shotgun_interst` AS `role_skill_shoot_rifle_shotgun_interst`,`rolecard`.`role_skill_shoot_archery_growth` AS `role_skill_shoot_archery_growth`,`rolecard`.`role_skill_shoot_archery_job` AS `role_skill_shoot_archery_job`,`rolecard`.`role_skill_shoot_archery_interst` AS `role_skill_shoot_archery_interst`,`rolecard`.`role_skill_shoot_flame_thrower_growth` AS `role_skill_shoot_flame_thrower_growth`,`rolecard`.`role_skill_shoot_flame_thrower_job` AS `role_skill_shoot_flame_thrower_job`,`rolecard`.`role_skill_shoot_flame_thrower_interst` AS `role_skill_shoot_flame_thrower_interst`,`rolecard`.`role_skill_shoot_machine_gun_growth` AS `role_skill_shoot_machine_gun_growth`,`rolecard`.`role_skill_shoot_machine_gun_job` AS `role_skill_shoot_machine_gun_job`,`rolecard`.`role_skill_shoot_machine_gun_interst` AS `role_skill_shoot_machine_gun_interst`,`rolecard`.`role_skill_shoot_heavy_weapon_growth` AS `role_skill_shoot_heavy_weapon_growth`,`rolecard`.`role_skill_shoot_heavy_weapon_job` AS `role_skill_shoot_heavy_weapon_job`,`rolecard`.`role_skill_shoot_heavy_weapon_interst` AS `role_skill_shoot_heavy_weapon_interst`,`rolecard`.`role_skill_first_aid_growth` AS `role_skill_first_aid_growth`,`rolecard`.`role_skill_first_aid_job` AS `role_skill_first_aid_job`,`rolecard`.`role_skill_first_aid_interst` AS `role_skill_first_aid_interst`,`rolecard`.`role_skill_history_growth` AS `role_skill_history_growth`,`rolecard`.`role_skill_history_job` AS `role_skill_history_job`,`rolecard`.`role_skill_history_interst` AS `role_skill_history_interst`,`rolecard`.`role_skill_threaten_growth` AS `role_skill_threaten_growth`,`rolecard`.`role_skill_threaten_job` AS `role_skill_threaten_job`,`rolecard`.`role_skill_threaten_interst` AS `role_skill_threaten_interst`,`rolecard`.`role_skill_jump_growth` AS `role_skill_jump_growth`,`rolecard`.`role_skill_jump_job` AS `role_skill_jump_job`,`rolecard`.`role_skill_jump_interst` AS `role_skill_jump_interst`,`rolecard`.`role_skill_language_type1` AS `role_skill_language_type1`,`rolecard`.`role_skill_language_val1_growth` AS `role_skill_language_val1_growth`,`rolecard`.`role_skill_language_val1_job` AS `role_skill_language_val1_job`,`rolecard`.`role_skill_language_val1_interst` AS `role_skill_language_val1_interst`,`rolecard`.`role_skill_language_type2` AS `role_skill_language_type2`,`rolecard`.`role_skill_language_val2_growth` AS `role_skill_language_val2_growth`,`rolecard`.`role_skill_language_val2_job` AS `role_skill_language_val2_job`,`rolecard`.`role_skill_language_val2_interst` AS `role_skill_language_val2_interst`,`rolecard`.`role_skill_language_type3` AS `role_skill_language_type3`,`rolecard`.`role_skill_language_val3_growth` AS `role_skill_language_val3_growth`,`rolecard`.`role_skill_language_val3_job` AS `role_skill_language_val3_job`,`rolecard`.`role_skill_language_val3_interst` AS `role_skill_language_val3_interst`,`rolecard`.`role_skill_mother_tongue_type` AS `role_skill_mother_tongue_type`,`rolecard`.`role_skill_mother_tongue_val_growth` AS `role_skill_mother_tongue_val_growth`,`rolecard`.`role_skill_mother_tongue_val_job` AS `role_skill_mother_tongue_val_job`,`rolecard`.`role_skill_mother_tongue_val_interst` AS `role_skill_mother_tongue_val_interst`,`rolecard`.`role_skill_throw_growth` AS `role_skill_throw_growth`,`rolecard`.`role_skill_throw_job` AS `role_skill_throw_job`,`rolecard`.`role_skill_throw_interst` AS `role_skill_throw_interst`,`rolecard`.`role_skill_track_growth` AS `role_skill_track_growth`,`rolecard`.`role_skill_track_job` AS `role_skill_track_job`,`rolecard`.`role_skill_track_interst` AS `role_skill_track_interst`,`rolecard`.`role_skill_law_growth` AS `role_skill_law_growth`,`rolecard`.`role_skill_law_job` AS `role_skill_law_job`,`rolecard`.`role_skill_law_interst` AS `role_skill_law_interst`,`rolecard`.`role_skill_library_use_growth` AS `role_skill_library_use_growth`,`rolecard`.`role_skill_library_use_job` AS `role_skill_library_use_job`,`rolecard`.`role_skill_library_use_interst` AS `role_skill_library_use_interst`,`rolecard`.`role_skill_listen_growth` AS `role_skill_listen_growth`,`rolecard`.`role_skill_listen_job` AS `role_skill_listen_job`,`rolecard`.`role_skill_listen_interst` AS `role_skill_listen_interst`,`rolecard`.`role_skill_locksmith_growth` AS `role_skill_locksmith_growth`,`rolecard`.`role_skill_locksmith_job` AS `role_skill_locksmith_job`,`rolecard`.`role_skill_locksmith_interst` AS `role_skill_locksmith_interst`,`rolecard`.`role_skill_mechanical_repair_growth` AS `role_skill_mechanical_repair_growth`,`rolecard`.`role_skill_mechanical_repair_job` AS `role_skill_mechanical_repair_job`,`rolecard`.`role_skill_mechanical_repair_interst` AS `role_skill_mechanical_repair_interst`,`rolecard`.`role_skill_medicine_growth` AS `role_skill_medicine_growth`,`rolecard`.`role_skill_medicine_job` AS `role_skill_medicine_job`,`rolecard`.`role_skill_medicine_interst` AS `role_skill_medicine_interst`,`rolecard`.`role_skill_natural_world_growth` AS `role_skill_natural_world_growth`,`rolecard`.`role_skill_natural_world_job` AS `role_skill_natural_world_job`,`rolecard`.`role_skill_natural_world_interst` AS `role_skill_natural_world_interst`,`rolecard`.`role_skill_navigate_growth` AS `role_skill_navigate_growth`,`rolecard`.`role_skill_navigate_job` AS `role_skill_navigate_job`,`rolecard`.`role_skill_navigate_interst` AS `role_skill_navigate_interst`,`rolecard`.`role_skill_occult_growth` AS `role_skill_occult_growth`,`rolecard`.`role_skill_occult_job` AS `role_skill_occult_job`,`rolecard`.`role_skill_occult_interst` AS `role_skill_occult_interst`,`rolecard`.`role_skill_operate_heavy_machinery_growth` AS `role_skill_operate_heavy_machinery_growth`,`rolecard`.`role_skill_operate_heavy_machinery_job` AS `role_skill_operate_heavy_machinery_job`,`rolecard`.`role_skill_operate_heavy_machinery_interst` AS `role_skill_operate_heavy_machinery_interst`,`rolecard`.`role_skill_persuade_growth` AS `role_skill_persuade_growth`,`rolecard`.`role_skill_persuade_job` AS `role_skill_persuade_job`,`rolecard`.`role_skill_persuade_interst` AS `role_skill_persuade_interst`,`rolecard`.`role_skill_drive_aircraft_growth` AS `role_skill_drive_aircraft_growth`,`rolecard`.`role_skill_drive_aircraft_job` AS `role_skill_drive_aircraft_job`,`rolecard`.`role_skill_drive_aircraft_interst` AS `role_skill_drive_aircraft_interst`,`rolecard`.`role_skill_drive_ship_growth` AS `role_skill_drive_ship_growth`,`rolecard`.`role_skill_drive_ship_job` AS `role_skill_drive_ship_job`,`rolecard`.`role_skill_drive_ship_interst` AS `role_skill_drive_ship_interst`,`rolecard`.`role_skill_psychoanalysis_growth` AS `role_skill_psychoanalysis_growth`,`rolecard`.`role_skill_psychoanalysis_job` AS `role_skill_psychoanalysis_job`,`rolecard`.`role_skill_psychoanalysis_interst` AS `role_skill_psychoanalysis_interst`,`rolecard`.`role_skill_psychology_growth` AS `role_skill_psychology_growth`,`rolecard`.`role_skill_psychology_job` AS `role_skill_psychology_job`,`rolecard`.`role_skill_psychology_interst` AS `role_skill_psychology_interst`,`rolecard`.`role_skill_ride_growth` AS `role_skill_ride_growth`,`rolecard`.`role_skill_ride_job` AS `role_skill_ride_job`,`rolecard`.`role_skill_ride_interst` AS `role_skill_ride_interst`,`rolecard`.`role_skill_science_geology_growth` AS `role_skill_science_geology_growth`,`rolecard`.`role_skill_science_geology_job` AS `role_skill_science_geology_job`,`rolecard`.`role_skill_science_geology_interst` AS `role_skill_science_geology_interst`,`rolecard`.`role_skill_science_chemistry_growth` AS `role_skill_science_chemistry_growth`,`rolecard`.`role_skill_science_chemistry_job` AS `role_skill_science_chemistry_job`,`rolecard`.`role_skill_science_chemistry_interst` AS `role_skill_science_chemistry_interst`,`rolecard`.`role_skill_science_biology_growth` AS `role_skill_science_biology_growth`,`rolecard`.`role_skill_science_biology_job` AS `role_skill_science_biology_job`,`rolecard`.`role_skill_science_biology_interst` AS `role_skill_science_biology_interst`,`rolecard`.`role_skill_science_math_growth` AS `role_skill_science_math_growth`,`rolecard`.`role_skill_science_math_job` AS `role_skill_science_math_job`,`rolecard`.`role_skill_science_math_interst` AS `role_skill_science_math_interst`,`rolecard`.`role_skill_science_astronomy_growth` AS `role_skill_science_astronomy_growth`,`rolecard`.`role_skill_science_astronomy_job` AS `role_skill_science_astronomy_job`,`rolecard`.`role_skill_science_astronomy_interst` AS `role_skill_science_astronomy_interst`,`rolecard`.`role_skill_science_physics_growth` AS `role_skill_science_physics_growth`,`rolecard`.`role_skill_science_physics_job` AS `role_skill_science_physics_job`,`rolecard`.`role_skill_science_physics_interst` AS `role_skill_science_physics_interst`,`rolecard`.`role_skill_science_pharmacy_growth` AS `role_skill_science_pharmacy_growth`,`rolecard`.`role_skill_science_pharmacy_job` AS `role_skill_science_pharmacy_job`,`rolecard`.`role_skill_science_pharmacy_interst` AS `role_skill_science_pharmacy_interst`,`rolecard`.`role_skill_science_botany_growth` AS `role_skill_science_botany_growth`,`rolecard`.`role_skill_science_botany_job` AS `role_skill_science_botany_job`,`rolecard`.`role_skill_science_botany_interst` AS `role_skill_science_botany_interst`,`rolecard`.`role_skill_science_zoology_growth` AS `role_skill_science_zoology_growth`,`rolecard`.`role_skill_science_zoology_job` AS `role_skill_science_zoology_job`,`rolecard`.`role_skill_science_zoology_interst` AS `role_skill_science_zoology_interst`,`rolecard`.`role_skill_science_cryptography_growth` AS `role_skill_science_cryptography_growth`,`rolecard`.`role_skill_science_cryptography_job` AS `role_skill_science_cryptography_job`,`rolecard`.`role_skill_science_cryptography_interst` AS `role_skill_science_cryptography_interst`,`rolecard`.`role_skill_science_engineering_growth` AS `role_skill_science_engineering_growth`,`rolecard`.`role_skill_science_engineering_job` AS `role_skill_science_engineering_job`,`rolecard`.`role_skill_science_engineering_interst` AS `role_skill_science_engineering_interst`,`rolecard`.`role_skill_science_meteorology_growth` AS `role_skill_science_meteorology_growth`,`rolecard`.`role_skill_science_meteorology_job` AS `role_skill_science_meteorology_job`,`rolecard`.`role_skill_science_meteorology_interst` AS `role_skill_science_meteorology_interst`,`rolecard`.`role_skill_science_judicial_science_growth` AS `role_skill_science_judicial_science_growth`,`rolecard`.`role_skill_science_judicial_science_job` AS `role_skill_science_judicial_science_job`,`rolecard`.`role_skill_science_judicial_science_interst` AS `role_skill_science_judicial_science_interst`,`rolecard`.`role_skill_sleight_of_hand_growth` AS `role_skill_sleight_of_hand_growth`,`rolecard`.`role_skill_sleight_of_hand_job` AS `role_skill_sleight_of_hand_job`,`rolecard`.`role_skill_sleight_of_hand_interst` AS `role_skill_sleight_of_hand_interst`,`rolecard`.`role_skill_recon_growth` AS `role_skill_recon_growth`,`rolecard`.`role_skill_recon_job` AS `role_skill_recon_job`,`rolecard`.`role_skill_recon_interst` AS `role_skill_recon_interst`,`rolecard`.`role_skill_stealth_growth` AS `role_skill_stealth_growth`,`rolecard`.`role_skill_stealth_job` AS `role_skill_stealth_job`,`rolecard`.`role_skill_stealth_interst` AS `role_skill_stealth_interst`,`rolecard`.`role_skill_survival_growth` AS `role_skill_survival_growth`,`rolecard`.`role_skill_survival_job` AS `role_skill_survival_job`,`rolecard`.`role_skill_survival_interst` AS `role_skill_survival_interst`,`rolecard`.`role_skill_swim_growth` AS `role_skill_swim_growth`,`rolecard`.`role_skill_swim_job` AS `role_skill_swim_job`,`rolecard`.`role_skill_swim_interst` AS `role_skill_swim_interst`,`rolecard`.`role_skill_beast_training_growth` AS `role_skill_beast_training_growth`,`rolecard`.`role_skill_beast_training_job` AS `role_skill_beast_training_job`,`rolecard`.`role_skill_beast_training_interst` AS `role_skill_beast_training_interst`,`rolecard`.`role_skill_diving_growth` AS `role_skill_diving_growth`,`rolecard`.`role_skill_diving_job` AS `role_skill_diving_job`,`rolecard`.`role_skill_diving_interst` AS `role_skill_diving_interst`,`rolecard`.`role_skill_demolition_growth` AS `role_skill_demolition_growth`,`rolecard`.`role_skill_demolition_job` AS `role_skill_demolition_job`,`rolecard`.`role_skill_demolition_interst` AS `role_skill_demolition_interst`,`rolecard`.`role_skill_read_lips_growth` AS `role_skill_read_lips_growth`,`rolecard`.`role_skill_read_lips_job` AS `role_skill_read_lips_job`,`rolecard`.`role_skill_read_lips_interst` AS `role_skill_read_lips_interst`,`rolecard`.`role_skill_hypnosis_growth` AS `role_skill_hypnosis_growth`,`rolecard`.`role_skill_hypnosis_job` AS `role_skill_hypnosis_job`,`rolecard`.`role_skill_hypnosis_interst` AS `role_skill_hypnosis_interst`,`rolecard`.`role_skill_artillery_growth` AS `role_skill_artillery_growth`,`rolecard`.`role_skill_artillery_job` AS `role_skill_artillery_job`,`rolecard`.`role_skill_artillery_interst` AS `role_skill_artillery_interst`,`rolecard`.`role_skill_lore_type` AS `role_skill_lore_type`,`rolecard`.`role_skill_lore_val_growth` AS `role_skill_lore_val_growth`,`rolecard`.`role_skill_lore_val_job` AS `role_skill_lore_val_job`,`rolecard`.`role_skill_lore_val_interst` AS `role_skill_lore_val_interst` from `rolecard` */;
/*!50001 SET character_set_client      = @saved_cs_client */;
/*!50001 SET character_set_results     = @saved_cs_results */;
/*!50001 SET collation_connection      = @saved_col_connection */;

--
-- Final view structure for view `role_elements`
--

/*!50001 DROP VIEW IF EXISTS `role_elements`*/;
/*!50001 SET @saved_cs_client          = @@character_set_client */;
/*!50001 SET @saved_cs_results         = @@character_set_results */;
/*!50001 SET @saved_col_connection     = @@collation_connection */;
/*!50001 SET character_set_client      = utf8mb4 */;
/*!50001 SET character_set_results     = utf8mb4 */;
/*!50001 SET collation_connection      = utf8mb4_0900_ai_ci */;
/*!50001 CREATE ALGORITHM=UNDEFINED */
/*!50013 DEFINER=`root`@`localhost` SQL SECURITY DEFINER */
/*!50001 VIEW `role_elements` AS select `rolecard`.`role_card_id` AS `role_card_id`,`rolecard`.`rolestr` AS `rolestr`,`rolecard`.`rolecon` AS `rolecon`,`rolecard`.`rolesiz` AS `rolesiz`,`rolecard`.`roledex` AS `roledex`,`rolecard`.`roleapp` AS `roleapp`,`rolecard`.`roleint` AS `roleint`,`rolecard`.`rolepow` AS `rolepow`,`rolecard`.`roleedu` AS `roleedu`,`rolecard`.`rolemov` AS `rolemov`,`rolecard`.`role_cur_hit_points` AS `role_cur_hit_points`,`rolecard`.`role_max_hit_points` AS `role_max_hit_points`,`rolecard`.`role_cur_sanity` AS `role_cur_sanity`,`rolecard`.`role_max_sanity` AS `role_max_sanity`,`rolecard`.`role_luck` AS `role_luck`,`rolecard`.`role_cur_magic` AS `role_cur_magic`,`rolecard`.`role_max_magic` AS `role_max_magic`,`rolecard`.`role_physical_status` AS `role_physical_status`,`rolecard`.`role_mental_status` AS `role_mental_status` from `rolecard` */;
/*!50001 SET character_set_client      = @saved_cs_client */;
/*!50001 SET character_set_results     = @saved_cs_results */;
/*!50001 SET collation_connection      = @saved_col_connection */;

--
-- Final view structure for view `role_base_info`
--

/*!50001 DROP VIEW IF EXISTS `role_base_info`*/;
/*!50001 SET @saved_cs_client          = @@character_set_client */;
/*!50001 SET @saved_cs_results         = @@character_set_results */;
/*!50001 SET @saved_col_connection     = @@collation_connection */;
/*!50001 SET character_set_client      = utf8mb4 */;
/*!50001 SET character_set_results     = utf8mb4 */;
/*!50001 SET collation_connection      = utf8mb4_0900_ai_ci */;
/*!50001 CREATE ALGORITHM=UNDEFINED */
/*!50013 DEFINER=`root`@`localhost` SQL SECURITY DEFINER */
/*!50001 VIEW `role_base_info` AS select `rolecard`.`role_card_id` AS `role_card_id`,`rolecard`.`role_card_player_id` AS `role_card_player_id`,`rolecard`.`role_name` AS `role_name`,`user`.`user_name` AS `user_name`,`rolecard`.`era` AS `era`,`job_list`.`job_name` AS `job_name`,`job_list`.`job_id` AS `job_id`,`rolecard`.`role_age` AS `role_age`,`rolecard`.`role_gender` AS `role_gender`,`rolecard`.`role_home_address` AS `role_home_address`,`rolecard`.`role_hometown` AS `role_hometown` from ((`rolecard` join `user`) join `job_list`) where ((`user`.`user_id` = `rolecard`.`role_card_player_id`) and (`rolecard`.`role_job_id` = `job_list`.`job_id`)) */;
/*!50001 SET character_set_client      = @saved_cs_client */;
/*!50001 SET character_set_results     = @saved_cs_results */;
/*!50001 SET collation_connection      = @saved_col_connection */;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2022-03-04 19:09:18
