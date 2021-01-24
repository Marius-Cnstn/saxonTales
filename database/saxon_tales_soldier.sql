-- MySQL dump 10.13  Distrib 8.0.21, for Win64 (x86_64)
--
-- Host: localhost    Database: saxon_tales
-- ------------------------------------------------------
-- Server version	8.0.21

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
-- Table structure for table `soldier`
--

DROP TABLE IF EXISTS `soldier`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `soldier` (
  `soldier_id` int NOT NULL AUTO_INCREMENT,
  `soldier_cathegory_id` int DEFAULT NULL,
  `army_id` int DEFAULT NULL,
  `attack` int DEFAULT NULL,
  `defense` int DEFAULT NULL,
  `attack_bonus` int DEFAULT NULL,
  `economic_bonus` int DEFAULT NULL,
  `first_name` varchar(255) DEFAULT NULL,
  `nick_name` varchar(255) DEFAULT NULL,
  `profit_share` int DEFAULT NULL,
  PRIMARY KEY (`soldier_id`),
  KEY `FKax58jtbw42267ikb20n3bsovb` (`soldier_cathegory_id`),
  KEY `FK9akgjjkbkg6lgcift1hxgepvn` (`army_id`),
  CONSTRAINT `FK9akgjjkbkg6lgcift1hxgepvn` FOREIGN KEY (`army_id`) REFERENCES `army` (`army_id`),
  CONSTRAINT `FKax58jtbw42267ikb20n3bsovb` FOREIGN KEY (`soldier_cathegory_id`) REFERENCES `soldier_cathegory` (`soldier_cathegory_id`)
) ENGINE=InnoDB AUTO_INCREMENT=129 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `soldier`
--

LOCK TABLES `soldier` WRITE;
/*!40000 ALTER TABLE `soldier` DISABLE KEYS */;
INSERT INTO `soldier` VALUES (126,1,NULL,8,14,NULL,NULL,NULL,NULL,NULL),(127,2,NULL,10,11,NULL,NULL,NULL,NULL,NULL),(128,3,NULL,6,4,NULL,NULL,NULL,NULL,NULL);
/*!40000 ALTER TABLE `soldier` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2021-01-24 21:54:51
