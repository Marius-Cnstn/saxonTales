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
-- Table structure for table `equipments_to_attributes`
--

DROP TABLE IF EXISTS `equipments_to_attributes`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `equipments_to_attributes` (
  `equipment_id` int NOT NULL,
  `equipment_attribute_id` int NOT NULL,
  PRIMARY KEY (`equipment_id`,`equipment_attribute_id`),
  KEY `FK9d13kmydxb5gvt1gg9t38aw9w` (`equipment_attribute_id`),
  CONSTRAINT `FK9d13kmydxb5gvt1gg9t38aw9w` FOREIGN KEY (`equipment_attribute_id`) REFERENCES `equipment_attribute` (`equipment_attribute_id`),
  CONSTRAINT `FKh4glipi0x7mii0m0tasj9m73m` FOREIGN KEY (`equipment_id`) REFERENCES `equipment` (`equipment_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `equipments_to_attributes`
--

LOCK TABLES `equipments_to_attributes` WRITE;
/*!40000 ALTER TABLE `equipments_to_attributes` DISABLE KEYS */;
INSERT INTO `equipments_to_attributes` VALUES (110,1),(119,1),(128,1),(143,1),(146,1),(155,1),(164,1),(167,1),(176,1),(185,1),(210,1),(213,1),(220,1),(223,1),(226,1),(229,1),(232,1),(247,1),(264,1),(267,1),(280,1),(283,1),(296,1),(299,1),(302,1),(305,1),(308,1),(317,1),(320,1),(333,1),(336,1),(339,1),(342,1),(353,1),(360,1),(369,1),(382,1),(403,1),(412,1),(113,2),(122,2),(131,2),(137,2),(149,2),(158,2),(170,2),(179,2),(206,2),(235,2),(243,2),(250,2),(254,2),(260,2),(270,2),(276,2),(286,2),(292,2),(311,2),(323,2),(345,2),(356,2),(363,2),(372,2),(385,2),(395,2),(399,2),(406,2),(415,2),(117,3),(126,3),(135,3),(141,3),(153,3),(162,3),(174,3),(183,3),(204,3),(239,3),(241,3),(258,3),(274,3),(290,3),(315,3),(327,3),(329,3),(331,3),(349,3),(351,3),(367,3),(376,3),(378,3),(380,3),(389,3),(391,3),(393,3),(410,3),(419,3),(111,4),(114,4),(118,4),(120,4),(123,4),(127,4),(129,4),(132,4),(136,4),(138,4),(142,4),(144,4),(147,4),(150,4),(154,4),(156,4),(159,4),(163,4),(165,4),(168,4),(171,4),(175,4),(177,4),(180,4),(184,4),(186,4),(205,4),(207,4),(211,4),(214,4),(221,4),(224,4),(227,4),(230,4),(233,4),(236,4),(240,4),(242,4),(244,4),(248,4),(251,4),(255,4),(259,4),(261,4),(265,4),(268,4),(271,4),(275,4),(277,4),(281,4),(284,4),(287,4),(291,4),(293,4),(297,4),(300,4),(303,4),(306,4),(309,4),(312,4),(316,4),(318,4),(321,4),(324,4),(328,4),(330,4),(332,4),(334,4),(337,4),(340,4),(343,4),(346,4),(350,4),(352,4),(354,4),(357,4),(361,4),(364,4),(368,4),(377,4),(379,4),(381,4),(390,4),(392,4),(394,4),(411,4),(420,4),(112,6),(115,6),(121,6),(124,6),(130,6),(133,6),(139,6),(145,6),(148,6),(151,6),(157,6),(160,6),(166,6),(169,6),(172,6),(178,6),(181,6),(187,6),(208,6),(212,6),(215,6),(222,6),(225,6),(228,6),(231,6),(234,6),(237,6),(245,6),(249,6),(252,6),(256,6),(262,6),(266,6),(269,6),(272,6),(278,6),(282,6),(285,6),(288,6),(294,6),(298,6),(301,6),(304,6),(307,6),(310,6),(313,6),(319,6),(322,6),(325,6),(335,6),(338,6),(341,6),(344,6),(347,6),(355,6),(358,6),(362,6),(365,6),(374,6),(387,6),(397,6),(401,6),(408,6),(417,6),(370,7),(371,7),(373,7),(383,7),(384,7),(386,7),(396,7),(400,7),(404,7),(405,7),(407,7),(413,7),(414,7),(416,7),(116,8),(125,8),(134,8),(140,8),(152,8),(161,8),(173,8),(182,8),(209,8),(238,8),(246,8),(253,8),(257,8),(263,8),(273,8),(279,8),(289,8),(295,8),(314,8),(326,8),(348,8),(359,8),(366,8),(375,9),(388,9),(398,9),(402,9),(409,9),(418,9),(375,10),(388,10),(398,10),(402,10),(409,10),(418,10),(188,12),(192,12),(196,12),(200,12),(216,12),(189,15),(193,15),(197,15),(201,15),(217,15),(190,16),(194,16),(198,16),(202,16),(218,16),(191,17),(195,17),(199,17),(203,17),(219,17);
/*!40000 ALTER TABLE `equipments_to_attributes` ENABLE KEYS */;
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
