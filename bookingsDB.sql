-- MySQL dump 10.13  Distrib 8.0.19, for macos10.15 (x86_64)
--
-- Host: localhost    Database: bookmyshow
-- ------------------------------------------------------
-- Server version	8.0.19

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!50503 SET NAMES utf8mb4 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `hibernate_sequence`
--

DROP TABLE IF EXISTS `hibernate_sequence`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `hibernate_sequence` (
  `next_val` bigint DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `hibernate_sequence`
--

LOCK TABLES `hibernate_sequence` WRITE;
/*!40000 ALTER TABLE `hibernate_sequence` DISABLE KEYS */;
INSERT INTO `hibernate_sequence` VALUES (37),(37),(37),(37);
/*!40000 ALTER TABLE `hibernate_sequence` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `table_bookings`
--

DROP TABLE IF EXISTS `table_bookings`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `table_bookings` (
  `show_id` bigint NOT NULL,
  `a1` int NOT NULL,
  `a2` int NOT NULL,
  `a3` int NOT NULL,
  `a4` int NOT NULL,
  `a5` int NOT NULL,
  `b1` int NOT NULL,
  `b2` int NOT NULL,
  `b3` int NOT NULL,
  `b4` int NOT NULL,
  `b5` int NOT NULL,
  `c1` int NOT NULL,
  `c2` int NOT NULL,
  `c3` int NOT NULL,
  `c4` int NOT NULL,
  `c5` int NOT NULL,
  PRIMARY KEY (`show_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `table_bookings`
--

LOCK TABLES `table_bookings` WRITE;
/*!40000 ALTER TABLE `table_bookings` DISABLE KEYS */;
INSERT INTO `table_bookings` VALUES (32,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0),(33,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0),(34,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0),(35,0,0,0,1,0,1,0,0,0,0,0,0,0,0,0),(36,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0);
/*!40000 ALTER TABLE `table_bookings` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `table_city`
--

DROP TABLE IF EXISTS `table_city`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `table_city` (
  `c_id` bigint NOT NULL,
  `c_name` varchar(255) NOT NULL,
  `c_pincode` varchar(255) NOT NULL,
  `c_state` varchar(255) NOT NULL,
  PRIMARY KEY (`c_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `table_city`
--

LOCK TABLES `table_city` WRITE;
/*!40000 ALTER TABLE `table_city` DISABLE KEYS */;
INSERT INTO `table_city` VALUES (1,'Bengaluru','590056','Karnataka'),(2,'Belagavi','590059','Karnataka'),(3,'Maysuru','590103','Karnataka');
/*!40000 ALTER TABLE `table_city` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `table_movie`
--

DROP TABLE IF EXISTS `table_movie`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `table_movie` (
  `m_id` bigint NOT NULL,
  `m_description` varchar(255) DEFAULT NULL,
  `m_director` varchar(255) NOT NULL,
  `m_name` varchar(255) NOT NULL,
  PRIMARY KEY (`m_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `table_movie`
--

LOCK TABLES `table_movie` WRITE;
/*!40000 ALTER TABLE `table_movie` DISABLE KEYS */;
INSERT INTO `table_movie` VALUES (10,'description about the WAR 3 movie here','WAR 3 directors','WAR 3'),(11,'description about the WAR 3 movie here','Remo','Shtreed Dance 3');
/*!40000 ALTER TABLE `table_movie` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `table_show`
--

DROP TABLE IF EXISTS `table_show`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `table_show` (
  `show_id` bigint NOT NULL,
  `show_time` varchar(255) NOT NULL,
  `the_movie_m_id` bigint DEFAULT NULL,
  `the_theater_t_id` bigint DEFAULT NULL,
  PRIMARY KEY (`show_id`),
  KEY `FKsayo2xxw82i3o8h7twmmps3um` (`the_movie_m_id`),
  KEY `FKeg2ca18ko9iie9lo3h6ay2ury` (`the_theater_t_id`),
  CONSTRAINT `FKeg2ca18ko9iie9lo3h6ay2ury` FOREIGN KEY (`the_theater_t_id`) REFERENCES `table_theater` (`t_id`),
  CONSTRAINT `FKsayo2xxw82i3o8h7twmmps3um` FOREIGN KEY (`the_movie_m_id`) REFERENCES `table_movie` (`m_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `table_show`
--

LOCK TABLES `table_show` WRITE;
/*!40000 ALTER TABLE `table_show` DISABLE KEYS */;
INSERT INTO `table_show` VALUES (12,'4/4/2020 - 09:00 AM',10,4),(13,'4/4/2020 - 12:00 PM',10,4),(14,'4/4/2020 - 03:00 PM',10,4),(15,'4/4/2020 - 06:00 PM',10,4),(16,'4/4/2020 - 09:00 PM',10,4),(17,'4/4/2020 - 3:00 PM',11,4),(18,'4/4/2020 - 9:00 PM',11,4),(19,'4/4/2020 - 9:00 AM',10,5),(20,'4/4/2020 - 9:00 PM',10,5),(21,'4/4/2020 - 9:00 PM',10,6),(22,'4/4/2020 - 9:00 PM',10,7),(23,'4/4/2020 - 9:00 PM',10,8),(24,'4/4/2020 - 3:00 PM',10,9),(25,'4/4/2020 - 6:00 PM',11,9),(26,'4/4/2020 - 6:00 PM',11,8),(27,'4/4/2020 - 6:00 PM',11,7),(28,'4/4/2020 - 6:00 PM',11,6),(29,'4/4/2020 - 6:00 PM',11,5),(30,'4/4/2020 - 6:00 PM',11,4),(32,'4/4/2020 - 6:00 PM',10,9),(33,'4/4/2020 - 6:00 PM',10,9),(34,'4/4/2020 - 6:00 PM',10,4),(35,'4/4/2020 - 6:00 PM',10,5),(36,'4/4/2020 - 6:00 PM',10,6);
/*!40000 ALTER TABLE `table_show` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `table_theater`
--

DROP TABLE IF EXISTS `table_theater`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `table_theater` (
  `t_id` bigint NOT NULL,
  `t_area` varchar(255) NOT NULL,
  `t_name` varchar(255) NOT NULL,
  `city_c_id` bigint DEFAULT NULL,
  PRIMARY KEY (`t_id`),
  KEY `FKtflvxj66v6b9kicc9kwh3js3g` (`city_c_id`),
  CONSTRAINT `FKtflvxj66v6b9kicc9kwh3js3g` FOREIGN KEY (`city_c_id`) REFERENCES `table_city` (`c_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `table_theater`
--

LOCK TABLES `table_theater` WRITE;
/*!40000 ALTER TABLE `table_theater` DISABLE KEYS */;
INSERT INTO `table_theater` VALUES (4,'Koramangala','Finox mall',1),(5,'Koramangala','PVR Kormangala',1),(6,'RD Collage POST','Shrinival Theater',1),(7,'Head post office','INOX Cinema',2),(8,'Goods shed Road','Chitra Theater',2),(9,'Old school theater road','Rajkamal theater',3);
/*!40000 ALTER TABLE `table_theater` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2020-04-09  0:35:43
