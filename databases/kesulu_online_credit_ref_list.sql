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
-- Table structure for table `credit_ref_list`
--

DROP TABLE IF EXISTS `credit_ref_list`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `credit_ref_list` (
  `CreditId` int unsigned NOT NULL AUTO_INCREMENT,
  `LivingStandard` varchar(12) NOT NULL,
  `CreditLevelRange` varchar(12) NOT NULL,
  `CashRange_1920s` varchar(40) NOT NULL,
  `CashRange_modern` varchar(40) NOT NULL,
  `OtherAssets_1920s` varchar(40) NOT NULL,
  `OtherAssets_modern` varchar(40) NOT NULL,
  `ConsumptionLevel_1920s` varchar(80) NOT NULL,
  `ConsumptionLevel_modern` varchar(80) NOT NULL,
  PRIMARY KEY (`CreditId`)
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `credit_ref_list`
--

LOCK TABLES `credit_ref_list` WRITE;
/*!40000 ALTER TABLE `credit_ref_list` DISABLE KEYS */;
INSERT INTO `credit_ref_list` VALUES (1,'身无分文','0 或更低  ','$0.50 ','没有','$0.50 ','10','没有','$10.00'),(2,'贫穷 ','1-9','$1-9 CR x 1','$10-90 CR x 10','$2','$20-180 CR x 20','$200-1800 CR x 200','$40'),(3,'标准','10-49','$20-98 CR × 2','$500-2450 CR × 50','$10','$400-1960 CR × 40','$10000-49000 CR × 1000','$200'),(4,'小康','50-89','$250-445','CR × 5','$25000-44500','CR × 500 $50 ','$5000-8900 CR × 100','$500000-890000 CR × 10000	$1,000'),(5,'富裕','90-98','$1800-1960 CR × 20','$180000-196000 CR × 2000','$250 ','$36000-39200 CR × 400','$3.6M-3.92M CR × 40000','$5,000'),(6,'富豪','99','$50,000','$5M+','$5,000','1M','$100M+','$100,000');
/*!40000 ALTER TABLE `credit_ref_list` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2022-03-03 19:24:57
