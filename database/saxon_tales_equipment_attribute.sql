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
-- Table structure for table `equipment_attribute`
--

DROP TABLE IF EXISTS `equipment_attribute`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `equipment_attribute` (
  `equipment_attribute_id` int NOT NULL AUTO_INCREMENT,
  `equipment_attribute_name` varchar(255) DEFAULT NULL,
  `equipment_attribute_value` int DEFAULT '0',
  `relative_equipment_cathegory` varchar(255) DEFAULT NULL,
  `relative_equipment_type` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`equipment_attribute_id`)
) ENGINE=InnoDB AUTO_INCREMENT=18 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `equipment_attribute`
--

LOCK TABLES `equipment_attribute` WRITE;
/*!40000 ALTER TABLE `equipment_attribute` DISABLE KEYS */;
INSERT INTO `equipment_attribute` VALUES (1,'Attack',8,'Weapon','Sword'),(2,'Attack',10,'Weapon','Lance'),(3,'Attack',6,'Weapon','Bow'),(4,'Defense',4,'Armor','Leather'),(5,'Defense',7,'Armor','Chain mail'),(6,'Defense',4,'Shield','Light'),(7,'Defense',7,'Shield','Heavy'),(8,'Speed Bonus',10,'Horse','Fast'),(9,'Speed Bonus',7,'Horse','Warhorse'),(10,'Attack Bonus',3,'Horse','Warhorse'),(11,'Attack Bonus',3,'Arrow','Bodkin'),(12,'Attack',12,'Weapon','Knight sword'),(15,'Defense',9,'Armor','Frankish armor'),(16,'Defense',9,'Shield','Oak shield'),(17,'Attack Bonus',5,'Horse','Pureblood Warhorse');
/*!40000 ALTER TABLE `equipment_attribute` ENABLE KEYS */;
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
