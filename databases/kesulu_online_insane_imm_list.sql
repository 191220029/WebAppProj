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
-- Table structure for table `insane_imm_list`
--

DROP TABLE IF EXISTS `insane_imm_list`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `insane_imm_list` (
  `InsaneImmId` int unsigned NOT NULL AUTO_INCREMENT,
  `InsaneType` varchar(20) NOT NULL,
  `InsaneSympton` varchar(200) NOT NULL,
  PRIMARY KEY (`InsaneImmId`)
) ENGINE=InnoDB AUTO_INCREMENT=11 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `insane_imm_list`
--

LOCK TABLES `insane_imm_list` WRITE;
/*!40000 ALTER TABLE `insane_imm_list` DISABLE KEYS */;
INSERT INTO `insane_imm_list` VALUES (1,'失忆','调查员会发现自己只记得最后身处的安全地点，却没有任何来到这里的记忆。例如，调查员一一刻还在家中吃着早饭，下一刻就已经直面着不知名的怪物。这将会持续 1D10 轮。'),(2,'假性残疾','调查员陷入了心理性的失明，失聪以及躯体缺失感中，持续 1D10 轮。'),(3,'暴力倾向','调查员陷入了六亲不认的暴力行为中，对周围的敌人与友方进行着无差别的攻击，持续 1D10 轮。'),(4,'偏执','调查员陷入了严重的偏执妄想之中，持续１Ｄ１０轮。有人在暗中窥视着他们，同伴中有人背叛了他们，没有人可以信任，万事皆虚。'),(5,'人际依赖','守秘人适当参考调查员的背景中重要之人的条目，调查员因为一些原因而降他人误认为了他重要的人并且努力的会与那个人保持那种关系，持续 1D10 轮'),(6,'昏厥','调查员当场昏倒，并需要 1D10 轮才能苏醒。'),(7,'逃避行为','调查员会用任何的手段试图逃离现在所处的位置，即使这意味着开走唯一一辆交通工具并将其它人抛诸脑后，调查员会试图逃离 1D10轮。'),(8,'竭嘶底里','调查员表现出大笑，哭泣，嘶吼，害怕等的极端情绪表现，持续 1D10 轮。'),(9,'恐惧','调查员通过一次 D100 或者由守秘人选择，来从恐惧症状表中选择一个恐惧源，就算这一恐惧的事物是并不存在的，调查员的症状会持续1D10 轮。'),(10,'躁狂','调查员通过一次 D100 或者由守秘人选择，来从躁狂症状表中选择一个躁狂的诱因，这个症状将会持续 1D10 轮。');
/*!40000 ALTER TABLE `insane_imm_list` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2022-03-03 19:24:58
