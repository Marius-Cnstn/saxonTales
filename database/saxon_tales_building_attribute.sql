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
-- Table structure for table `building_attribute`
--

DROP TABLE IF EXISTS `building_attribute`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `building_attribute` (
  `building_attribute_id` int NOT NULL AUTO_INCREMENT,
  `building_attribute_name` varchar(255) DEFAULT NULL,
  `building_attribute_value` int DEFAULT NULL,
  `relative_cathegory` varchar(255) DEFAULT NULL,
  `relative_level` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`building_attribute_id`)
) ENGINE=InnoDB AUTO_INCREMENT=13 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `building_attribute`
--

LOCK TABLES `building_attribute` WRITE;
/*!40000 ALTER TABLE `building_attribute` DISABLE KEYS */;
INSERT INTO `building_attribute` VALUES (1,'Construction price',150,'Port','Start'),(2,'Monthly income',50,'Port','Start'),(3,'Upgrade price',50,'Port','Docks'),(4,'Monthly income',60,'Port','Docks'),(5,'Upgrade price',100,'Port','Trading Port'),(6,'Monthly income',80,'Port','Trading Port'),(7,'Construction price',100,'Workshop','Start'),(8,'Monthly income',33,'Workshop','Start'),(9,'Upgrade price',50,'Workshop','Forge'),(10,'Monthly income',40,'Workshop','Forge'),(11,'Upgrade price',50,'Workshop','Armourer'),(12,'Monthly income',50,'Workshop','Armourer');
/*!40000 ALTER TABLE `building_attribute` ENABLE KEYS */;
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
