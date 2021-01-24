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
-- Table structure for table `soldiers_to_personal_attributes`
--

DROP TABLE IF EXISTS `soldiers_to_personal_attributes`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `soldiers_to_personal_attributes` (
  `soldier_id` int NOT NULL,
  `soldier_attribute_id` int NOT NULL,
  PRIMARY KEY (`soldier_id`,`soldier_attribute_id`),
  KEY `FKdk4iut86gjrmi9wm45wnwb1kx` (`soldier_attribute_id`),
  CONSTRAINT `FKdk4iut86gjrmi9wm45wnwb1kx` FOREIGN KEY (`soldier_attribute_id`) REFERENCES `soldier_personal_attribute` (`soldier_attribute_id`),
  CONSTRAINT `FKqbnuvpl8syt70wp8b1g55th9x` FOREIGN KEY (`soldier_id`) REFERENCES `soldier` (`soldier_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `soldiers_to_personal_attributes`
--

LOCK TABLES `soldiers_to_personal_attributes` WRITE;
/*!40000 ALTER TABLE `soldiers_to_personal_attributes` DISABLE KEYS */;
INSERT INTO `soldiers_to_personal_attributes` VALUES (126,1),(126,2),(127,3),(127,4),(128,5),(128,6);
/*!40000 ALTER TABLE `soldiers_to_personal_attributes` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2021-01-24 21:54:52
