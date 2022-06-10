-- MySQL dump 10.13  Distrib 8.0.29, for Win64 (x86_64)
--
-- Host: localhost    Database: mydb
-- ------------------------------------------------------
-- Server version	8.0.29

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
-- Table structure for table `course_asgnmnt_student`
--

DROP TABLE IF EXISTS `course_asgnmnt_student`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `course_asgnmnt_student` (
  `course_id` int NOT NULL,
  `asgnmnt_id` int NOT NULL,
  `student_id` int NOT NULL,
  PRIMARY KEY (`course_id`,`asgnmnt_id`,`student_id`),
  KEY `fk_asgnmnt_id_idx` (`asgnmnt_id`),
  KEY `cas_course_id_idx` (`course_id`),
  KEY `cas_student_id_idx` (`student_id`),
  CONSTRAINT `cas_asgnmnt_id` FOREIGN KEY (`asgnmnt_id`) REFERENCES `assignment` (`asgnmnt_ID`) ON DELETE RESTRICT ON UPDATE CASCADE,
  CONSTRAINT `cas_course_id` FOREIGN KEY (`course_id`) REFERENCES `course` (`course_ID`) ON DELETE RESTRICT ON UPDATE CASCADE,
  CONSTRAINT `cas_student_id` FOREIGN KEY (`student_id`) REFERENCES `student` (`student_ID`) ON DELETE RESTRICT ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb3;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `course_asgnmnt_student`
--

LOCK TABLES `course_asgnmnt_student` WRITE;
/*!40000 ALTER TABLE `course_asgnmnt_student` DISABLE KEYS */;
INSERT INTO `course_asgnmnt_student` VALUES (1,1,2),(1,2,3),(2,3,1),(2,4,5),(3,5,2),(3,6,8),(4,7,9),(5,8,4);
/*!40000 ALTER TABLE `course_asgnmnt_student` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2022-06-10 21:40:52
