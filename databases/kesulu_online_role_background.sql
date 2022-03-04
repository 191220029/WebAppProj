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
-- Table structure for table `role_background`
--

DROP TABLE IF EXISTS `role_background`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `role_background` (
  `RoleCardId` int unsigned NOT NULL,
  `SelfDescription` varchar(100) DEFAULT NULL,
  `Belief` varchar(100) DEFAULT NULL,
  `ImportantPerson` varchar(100) DEFAULT NULL,
  `ImportantPlace` varchar(100) DEFAULT NULL,
  `ImportantThings` varchar(100) DEFAULT NULL,
  `Characteristic` varchar(100) DEFAULT NULL,
  `Scar` varchar(100) DEFAULT NULL,
  `PhobiaOrManic` varchar(600) DEFAULT NULL,
  `role_backgroundcol1` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`RoleCardId`),
  UNIQUE KEY `RoleCardId_UNIQUE` (`RoleCardId`),
  CONSTRAINT `RoleId_RoleId_Background` FOREIGN KEY (`RoleCardId`) REFERENCES `rolecard` (`role_card_id`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `role_background`
--

LOCK TABLES `role_background` WRITE;
/*!40000 ALTER TABLE `role_background` DISABLE KEYS */;
/*!40000 ALTER TABLE `role_background` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2022-03-04 19:09:18
