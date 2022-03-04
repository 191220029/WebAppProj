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
-- Table structure for table `experiece_package`
--

DROP TABLE IF EXISTS `experiece_package`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `experiece_package` (
  `ExperiecePackageId` int unsigned NOT NULL AUTO_INCREMENT,
  `ExperiecePackageName` varchar(60) NOT NULL,
  `SanityDec` varchar(20) NOT NULL,
  `AgeLimit` varchar(12) NOT NULL,
  `AdditionalBackground` varchar(100) NOT NULL,
  `SkillPointsInc` int unsigned NOT NULL,
  `SkillAllocatable` varchar(200) NOT NULL,
  PRIMARY KEY (`ExperiecePackageId`)
) ENGINE=InnoDB AUTO_INCREMENT=13 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `experiece_package`
--

LOCK TABLES `experiece_package` WRITE;
/*!40000 ALTER TABLE `experiece_package` DISABLE KEYS */;
INSERT INTO `experiece_package` VALUES (7,'战场经历包（普通士兵）','1D10+5','自行调整','战争相关的伤疤/疤痕或恐惧症/躁狂症',70,'攀爬，格斗（斗殴），射击（步霰），急救，恐吓，聆听，潜行，投掷，妙手，侦查，生存'),(8,'战场经历包（军官）','1D10+5','自行调整','战争相关的伤疤/疤痕或恐惧症/躁狂症',70,'攀爬，格斗（斗殴），射击（手枪），急救，聆听，导航、魅惑、说服、恐吓中一项，潜行，投掷，侦查'),(9,'警务经历包','1D10','大于等于25','警察工作相关的伤疤/疤痕或恐惧症/躁狂症',60,'攀爬，汽车驾驶，格斗（斗殴），射击（手枪或步霰），急救，法律，聆听，外语，两项社交技能（魅惑、话术、说服、'),(10,'罪犯经历包','1D10','大于等于20','犯罪历史相关的伤疤/疤痕或恐惧症/躁狂症',60,'攀爬，汽车驾驶，格斗（任一），射击（任一），一项社交技能（魅惑、话术、说服、恐吓），法律，聆听，锁匠，心理'),(11,'医务经历包','1D10','大于等于30','个人背景相关的伤疤/疤痕或恐惧症/躁狂症',60,'急救，法律，聆听，医学，心理学，侦查，科学（任二）'),(12,'神话经历包','CM','自行调整','与神话经理相关的伤疤/疤痕或恐惧症/躁狂症、遭遇的怪异存在',0,'克苏鲁神话');
/*!40000 ALTER TABLE `experiece_package` ENABLE KEYS */;
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
