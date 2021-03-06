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
-- Table structure for table `equipment`
--

DROP TABLE IF EXISTS `equipment`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `equipment` (
  `equipment_id` int NOT NULL AUTO_INCREMENT,
  `equipment_cathegory_id` int DEFAULT NULL,
  `equipment_type_id` int DEFAULT NULL,
  PRIMARY KEY (`equipment_id`),
  KEY `FK2ph3bn4pty3u4khp7qejijp7y` (`equipment_cathegory_id`),
  KEY `FKog1e3ls88y65004cs34gtncgs` (`equipment_type_id`),
  CONSTRAINT `FK2ph3bn4pty3u4khp7qejijp7y` FOREIGN KEY (`equipment_cathegory_id`) REFERENCES `equipment_cathegory` (`equipment_cathegory_id`),
  CONSTRAINT `FKog1e3ls88y65004cs34gtncgs` FOREIGN KEY (`equipment_type_id`) REFERENCES `equipment_type` (`equipment_type_id`)
) ENGINE=InnoDB AUTO_INCREMENT=421 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `equipment`
--

LOCK TABLES `equipment` WRITE;
/*!40000 ALTER TABLE `equipment` DISABLE KEYS */;
INSERT INTO `equipment` VALUES (110,1,1),(111,2,4),(112,3,6),(113,1,2),(114,2,4),(115,3,6),(116,4,9),(117,1,3),(118,2,4),(119,1,1),(120,2,4),(121,3,6),(122,1,2),(123,2,4),(124,3,6),(125,4,9),(126,1,3),(127,2,4),(128,1,1),(129,2,4),(130,3,6),(131,1,2),(132,2,4),(133,3,6),(134,4,9),(135,1,3),(136,2,4),(137,1,2),(138,2,4),(139,3,6),(140,4,9),(141,1,3),(142,2,4),(143,1,1),(144,2,4),(145,3,6),(146,1,1),(147,2,4),(148,3,6),(149,1,2),(150,2,4),(151,3,6),(152,4,9),(153,1,3),(154,2,4),(155,1,1),(156,2,4),(157,3,6),(158,1,2),(159,2,4),(160,3,6),(161,4,9),(162,1,3),(163,2,4),(164,1,1),(165,2,4),(166,3,6),(167,1,1),(168,2,4),(169,3,6),(170,1,2),(171,2,4),(172,3,6),(173,4,9),(174,1,3),(175,2,4),(176,1,1),(177,2,4),(178,3,6),(179,1,2),(180,2,4),(181,3,6),(182,4,9),(183,1,3),(184,2,4),(185,1,1),(186,2,4),(187,3,6),(188,1,1),(189,2,12),(190,3,13),(191,4,14),(192,1,1),(193,2,12),(194,3,13),(195,4,14),(196,1,1),(197,2,12),(198,3,13),(199,4,14),(200,1,1),(201,2,12),(202,3,13),(203,4,14),(204,1,3),(205,2,4),(206,1,2),(207,2,4),(208,3,6),(209,4,9),(210,1,1),(211,2,4),(212,3,6),(213,1,1),(214,2,4),(215,3,6),(216,1,1),(217,2,12),(218,3,13),(219,4,14),(220,1,1),(221,2,4),(222,3,6),(223,1,1),(224,2,4),(225,3,6),(226,1,1),(227,2,4),(228,3,6),(229,1,1),(230,2,4),(231,3,6),(232,1,1),(233,2,4),(234,3,6),(235,1,2),(236,2,4),(237,3,6),(238,4,9),(239,1,3),(240,2,4),(241,1,3),(242,2,4),(243,1,2),(244,2,4),(245,3,6),(246,4,9),(247,1,1),(248,2,4),(249,3,6),(250,1,2),(251,2,4),(252,3,6),(253,4,9),(254,1,2),(255,2,4),(256,3,6),(257,4,9),(258,1,3),(259,2,4),(260,1,2),(261,2,4),(262,3,6),(263,4,9),(264,1,1),(265,2,4),(266,3,6),(267,1,1),(268,2,4),(269,3,6),(270,1,2),(271,2,4),(272,3,6),(273,4,9),(274,1,3),(275,2,4),(276,1,2),(277,2,4),(278,3,6),(279,4,9),(280,1,1),(281,2,4),(282,3,6),(283,1,1),(284,2,4),(285,3,6),(286,1,2),(287,2,4),(288,3,6),(289,4,9),(290,1,3),(291,2,4),(292,1,2),(293,2,4),(294,3,6),(295,4,9),(296,1,1),(297,2,4),(298,3,6),(299,1,1),(300,2,4),(301,3,6),(302,1,1),(303,2,4),(304,3,6),(305,1,1),(306,2,4),(307,3,6),(308,1,1),(309,2,4),(310,3,6),(311,1,2),(312,2,4),(313,3,6),(314,4,9),(315,1,3),(316,2,4),(317,1,1),(318,2,4),(319,3,6),(320,1,1),(321,2,4),(322,3,6),(323,1,2),(324,2,4),(325,3,6),(326,4,9),(327,1,3),(328,2,4),(329,1,3),(330,2,4),(331,1,3),(332,2,4),(333,1,1),(334,2,4),(335,3,6),(336,1,1),(337,2,4),(338,3,6),(339,1,1),(340,2,4),(341,3,6),(342,1,1),(343,2,4),(344,3,6),(345,1,2),(346,2,4),(347,3,6),(348,4,9),(349,1,3),(350,2,4),(351,1,3),(352,2,4),(353,1,1),(354,2,4),(355,3,6),(356,1,2),(357,2,4),(358,3,6),(359,4,9),(360,1,1),(361,2,4),(362,3,6),(363,1,2),(364,2,4),(365,3,6),(366,4,9),(367,1,3),(368,2,4),(369,1,1),(370,2,5),(371,3,7),(372,1,1),(373,2,5),(374,3,6),(375,2,4),(376,1,3),(377,2,4),(378,1,3),(379,2,4),(380,1,3),(381,2,4),(382,1,1),(383,2,5),(384,3,7),(385,1,1),(386,2,5),(387,3,6),(388,2,4),(389,1,3),(390,2,4),(391,1,3),(392,2,4),(393,1,3),(394,2,4),(395,1,1),(396,2,5),(397,3,6),(398,2,4),(399,1,1),(400,2,5),(401,3,6),(402,2,4),(403,1,1),(404,2,5),(405,3,7),(406,1,1),(407,2,5),(408,3,6),(409,2,4),(410,1,3),(411,2,4),(412,1,1),(413,2,5),(414,3,7),(415,1,2),(416,2,5),(417,3,6),(418,4,8),(419,1,3),(420,2,4);
/*!40000 ALTER TABLE `equipment` ENABLE KEYS */;
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
