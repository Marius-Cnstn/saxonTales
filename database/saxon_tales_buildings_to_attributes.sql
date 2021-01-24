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
-- Table structure for table `buildings_to_attributes`
--

DROP TABLE IF EXISTS `buildings_to_attributes`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `buildings_to_attributes` (
  `building_id` int NOT NULL,
  `building_attribute_id` int NOT NULL,
  PRIMARY KEY (`building_id`,`building_attribute_id`),
  KEY `FKgbe6sdpuylikj6xiyrc3dgop1` (`building_attribute_id`),
  CONSTRAINT `FKgbe6sdpuylikj6xiyrc3dgop1` FOREIGN KEY (`building_attribute_id`) REFERENCES `building_attribute` (`building_attribute_id`),
  CONSTRAINT `FKrnkok3qxy30k20mjy6gxmqcpx` FOREIGN KEY (`building_id`) REFERENCES `building` (`building_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `buildings_to_attributes`
--

LOCK TABLES `buildings_to_attributes` WRITE;
/*!40000 ALTER TABLE `buildings_to_attributes` DISABLE KEYS */;
INSERT INTO `buildings_to_attributes` VALUES (64,1),(65,1),(66,1),(70,1),(78,1),(80,1),(87,1),(89,1),(91,1),(94,1),(97,1),(100,1),(102,1),(103,1),(104,1),(107,1),(108,1),(109,1),(64,2),(65,2),(66,2),(70,2),(78,2),(80,2),(87,2),(89,2),(91,2),(94,2),(97,2),(100,2),(102,2),(103,2),(104,2),(107,2),(108,2),(109,2),(52,5),(54,5),(56,5),(58,5),(60,5),(62,5),(72,5),(74,5),(77,5),(82,5),(85,5),(52,6),(54,6),(56,6),(58,6),(60,6),(62,6),(72,6),(74,6),(77,6),(82,6),(85,6),(57,7),(59,7),(61,7),(67,7),(68,7),(71,7),(75,7),(76,7),(79,7),(81,7),(83,7),(84,7),(86,7),(88,7),(90,7),(92,7),(93,7),(95,7),(96,7),(98,7),(99,7),(101,7),(106,7),(110,7),(57,8),(59,8),(61,8),(67,8),(68,8),(71,8),(75,8),(76,8),(79,8),(81,8),(83,8),(84,8),(86,8),(88,8),(90,8),(92,8),(93,8),(95,8),(96,8),(98,8),(99,8),(101,8),(106,8),(110,8),(55,9),(63,9),(69,9),(105,9),(55,10),(63,10),(69,10),(105,10),(53,11),(73,11),(53,12),(73,12);
/*!40000 ALTER TABLE `buildings_to_attributes` ENABLE KEYS */;
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
