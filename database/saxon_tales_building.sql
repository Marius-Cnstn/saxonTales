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
-- Table structure for table `building`
--

DROP TABLE IF EXISTS `building`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `building` (
  `building_id` int NOT NULL AUTO_INCREMENT,
  `building_cathegory_id` int DEFAULT NULL,
  `homestead_id` int DEFAULT NULL,
  `building_level_id` int DEFAULT NULL,
  PRIMARY KEY (`building_id`),
  KEY `FK5oqevvpqiiobxgmx8iuncsoub` (`building_cathegory_id`),
  KEY `FKoshuf8j7mqlygorc5sk1ufgnx` (`building_level_id`),
  KEY `FK7gblf407oq3vd6cq5niwruhdb` (`homestead_id`),
  CONSTRAINT `FK5oqevvpqiiobxgmx8iuncsoub` FOREIGN KEY (`building_cathegory_id`) REFERENCES `building_cathegory` (`building_cathegory_id`),
  CONSTRAINT `FK7gblf407oq3vd6cq5niwruhdb` FOREIGN KEY (`homestead_id`) REFERENCES `homestead` (`homestead_id`),
  CONSTRAINT `FKoshuf8j7mqlygorc5sk1ufgnx` FOREIGN KEY (`building_level_id`) REFERENCES `building_level` (`building_level_id`)
) ENGINE=InnoDB AUTO_INCREMENT=111 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `building`
--

LOCK TABLES `building` WRITE;
/*!40000 ALTER TABLE `building` DISABLE KEYS */;
INSERT INTO `building` VALUES (52,1,NULL,3),(53,2,NULL,6),(54,1,NULL,3),(55,2,NULL,5),(56,1,NULL,3),(57,2,NULL,4),(58,1,NULL,3),(59,2,NULL,4),(60,1,NULL,3),(61,2,NULL,4),(62,1,NULL,3),(63,2,NULL,5),(64,1,NULL,1),(65,1,NULL,1),(66,1,NULL,1),(67,2,NULL,4),(68,2,NULL,4),(69,2,NULL,5),(70,1,NULL,1),(71,2,NULL,4),(72,1,NULL,3),(73,2,NULL,6),(74,1,NULL,3),(75,2,NULL,4),(76,2,NULL,4),(77,1,NULL,3),(78,1,NULL,1),(79,2,NULL,4),(80,1,NULL,1),(81,2,NULL,4),(82,1,NULL,3),(83,2,NULL,4),(84,2,NULL,4),(85,1,NULL,3),(86,2,NULL,4),(87,1,NULL,1),(88,2,NULL,4),(89,1,NULL,1),(90,2,NULL,4),(91,1,NULL,1),(92,2,NULL,4),(93,2,NULL,4),(94,1,NULL,1),(95,2,NULL,4),(96,2,NULL,4),(97,1,NULL,1),(98,2,NULL,4),(99,2,NULL,4),(100,1,NULL,1),(101,2,NULL,4),(102,1,NULL,1),(103,1,NULL,1),(104,1,NULL,1),(105,2,NULL,5),(106,2,NULL,4),(107,1,NULL,1),(108,1,NULL,1),(109,1,NULL,1),(110,2,NULL,4);
/*!40000 ALTER TABLE `building` ENABLE KEYS */;
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
