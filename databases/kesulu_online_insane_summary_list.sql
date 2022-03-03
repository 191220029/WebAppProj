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
-- Table structure for table `insane_summary_list`
--

DROP TABLE IF EXISTS `insane_summary_list`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `insane_summary_list` (
  `InsaneSumId` int unsigned NOT NULL AUTO_INCREMENT,
  `InsaneType` varchar(20) NOT NULL,
  `InsaneSympton` varchar(200) NOT NULL,
  PRIMARY KEY (`InsaneSumId`)
) ENGINE=InnoDB AUTO_INCREMENT=11 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `insane_summary_list`
--

LOCK TABLES `insane_summary_list` WRITE;
/*!40000 ALTER TABLE `insane_summary_list` DISABLE KEYS */;
INSERT INTO `insane_summary_list` VALUES (1,'失忆','回过神来，调查员们发现自己身处一个陌生的地方，并忘记了自己是谁。记忆会随时间恢复。'),(2,'被窃','调查员在 1D10 小时后恢复清醒，发觉自己被盗，身体毫发无损。如果调查员携带着宝贵之物（见调查员背景），做幸运检定来决定其是否被盗。所有有价值的东西无需检定自动消失。'),(3,'遍体鳞伤','调查员在 1D10 小时后恢复清醒，发现自己身上满是拳痕和瘀伤。生命值减少到疯狂前的一半，但这不会造成重伤。调查员没有被窃。这种伤害如何持续到现在由守秘人决定。'),(4,'暴力倾向','调查员陷入强烈的暴力与破坏欲之中。调查员回过神来可能会理解自己做了什么也可能毫无印象。调查员对谁或何物施以暴力，他们是杀人还是仅仅造成了伤害，由守秘人决定。'),(5,'极端信念','查看调查员背景中的思想信念，调查员会采取极端和疯狂的表现手段展示他们的思想信念之一。比如一个信教者会在地铁上高声布道。'),(6,'重要之人','考虑调查员背景中的重要之人，及其重要的原因。在 1D10 小时或更久的时间中，调查员将不顾一切地接近那个人，并为他们之间的关系做出行动。'),(7,'被收容','调查员在精神病院病房或警察局牢房中回过神来，他们可能会慢慢回想起导致自己被关在这里的事情。'),(8,'逃避行为','调查员恢复清醒时发现自己在很远的地方，也许迷失在荒郊野岭，或是在驶向远方的列车或长途汽车上。'),(9,'恐惧','调查员患上一个新的恐惧症状。在表IX：恐惧症状表上骰 1D100 来决定症状，或由守秘人选择一个。调查员在 1D10 小时后回过神来，并开始为避开恐惧源而采取任何措施。'),(10,'狂躁','调查员患上一个新的狂躁症状。在表X：狂躁症状表上骰 1D100 来决定症状，或由守秘人选择一个。调查员会在 1D10 小时后恢复理智。在这次疯狂发作中，调查员将完全沉浸于其新的狂躁症状');
/*!40000 ALTER TABLE `insane_summary_list` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2022-03-03 19:24:59
