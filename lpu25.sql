-- MySQL dump 10.13  Distrib 8.0.42, for Win64 (x86_64)
--
-- Host: localhost    Database: lpu25
-- ------------------------------------------------------
-- Server version	8.0.42

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
-- Table structure for table `book`
--

DROP TABLE IF EXISTS `book`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `book` (
  `bid` int NOT NULL,
  `title` varchar(100) DEFAULT NULL,
  `author` varchar(100) DEFAULT NULL,
  `price` double DEFAULT NULL,
  PRIMARY KEY (`bid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `book`
--

LOCK TABLES `book` WRITE;
/*!40000 ALTER TABLE `book` DISABLE KEYS */;
INSERT INTO `book` VALUES (1,'C Programming Basic','Ritchie',130),(2,'Java Programmming','Herebert Schildt',930),(4,'OS','S Galvin',900),(5,'Computer Networks','DE Comer',850),(6,'Java Programmming6','Herebert Schildt',930);
/*!40000 ALTER TABLE `book` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `department`
--

DROP TABLE IF EXISTS `department`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `department` (
  `depid` int NOT NULL,
  `name` varchar(100) DEFAULT NULL,
  PRIMARY KEY (`depid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `department`
--

LOCK TABLES `department` WRITE;
/*!40000 ALTER TABLE `department` DISABLE KEYS */;
INSERT INTO `department` VALUES (1,'Computers'),(2,'Mechanical'),(3,'Commerce'),(4,'Arts');
/*!40000 ALTER TABLE `department` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `employee`
--

DROP TABLE IF EXISTS `employee`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `employee` (
  `empid` int NOT NULL,
  `name` varchar(100) DEFAULT NULL,
  `designation` varchar(100) DEFAULT NULL,
  `depid` int DEFAULT NULL,
  PRIMARY KEY (`empid`),
  KEY `depid` (`depid`),
  CONSTRAINT `employee_ibfk_1` FOREIGN KEY (`depid`) REFERENCES `department` (`depid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `employee`
--

LOCK TABLES `employee` WRITE;
/*!40000 ALTER TABLE `employee` DISABLE KEYS */;
INSERT INTO `employee` VALUES (1107,'Sunny','Sof Engg',1),(1108,'Rajan Singh','clerk',2),(1109,'Kritika','supt',3),(1110,'Priyanshu','Sof Engg',1),(1111,'Ranga','Sof Engg',1),(1112,'Kalyan','Proj M',1);
/*!40000 ALTER TABLE `employee` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `mytable1`
--

DROP TABLE IF EXISTS `mytable1`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `mytable1` (
  `tableid` int NOT NULL,
  PRIMARY KEY (`tableid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `mytable1`
--

LOCK TABLES `mytable1` WRITE;
/*!40000 ALTER TABLE `mytable1` DISABLE KEYS */;
/*!40000 ALTER TABLE `mytable1` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `student`
--

DROP TABLE IF EXISTS `student`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `student` (
  `roll` int NOT NULL,
  `sname` varchar(128) NOT NULL,
  `branch` varchar(100) DEFAULT NULL,
  `phone` varchar(40) DEFAULT NULL,
  `dob` date DEFAULT NULL,
  `marks` int NOT NULL DEFAULT '60',
  PRIMARY KEY (`roll`),
  CONSTRAINT `marksconstraint` CHECK (((`marks` >= 40) and (`marks` <= 100)))
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `student`
--

LOCK TABLES `student` WRITE;
/*!40000 ALTER TABLE `student` DISABLE KEYS */;
INSERT INTO `student` VALUES (101,'Mohit','CSE','6554213265','2004-05-12',40),(103,'Renu','CSE','38384838484','2004-05-12',60),(104,'Nishi','ECE','9864838484',NULL,82),(105,'Nishi','ECE','9864838484','2004-05-12',60),(107,'Shiv Prasad','CSE','9875846280','2004-05-12',70),(108,'Shiv','ECE',NULL,NULL,45),(110,'Ram Prasad','ME','8754875498','1999-12-12',85);
/*!40000 ALTER TABLE `student` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `student2`
--

DROP TABLE IF EXISTS `student2`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `student2` (
  `roll` int NOT NULL,
  `sname` varchar(128) NOT NULL,
  `branch` varchar(100) DEFAULT NULL,
  `phone` varchar(40) DEFAULT NULL,
  `dob` date DEFAULT NULL,
  `marks` int NOT NULL DEFAULT '60'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `student2`
--

LOCK TABLES `student2` WRITE;
/*!40000 ALTER TABLE `student2` DISABLE KEYS */;
INSERT INTO `student2` VALUES (101,'Mohit','CSE','6554213265','2004-05-12',40),(103,'Renu','CSE','38384838484','2004-05-12',60),(104,'Nishi','ECE','9864838484',NULL,82),(105,'Nishi','ECE','9864838484','2004-05-12',60),(107,'Shiv Prasad','CSE','9875846280','2004-05-12',70),(108,'Shiv','ECE',NULL,NULL,45);
/*!40000 ALTER TABLE `student2` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `student3`
--

DROP TABLE IF EXISTS `student3`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `student3` (
  `roll` int NOT NULL,
  `sname` varchar(128) NOT NULL,
  `branch` varchar(100) DEFAULT NULL,
  `phone` varchar(40) DEFAULT NULL,
  `dob` date DEFAULT NULL,
  `marks` int NOT NULL DEFAULT '60'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `student3`
--

LOCK TABLES `student3` WRITE;
/*!40000 ALTER TABLE `student3` DISABLE KEYS */;
INSERT INTO `student3` VALUES (104,'Nishi','ECE','9864838484',NULL,82),(107,'Shiv Prasad','CSE','9875846280','2004-05-12',70);
/*!40000 ALTER TABLE `student3` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `student4`
--

DROP TABLE IF EXISTS `student4`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `student4` (
  `roll` int NOT NULL,
  `sname` varchar(128) NOT NULL,
  `branch` varchar(100) DEFAULT NULL,
  `phone` varchar(40) DEFAULT NULL,
  `dob` date DEFAULT NULL,
  `marks` int NOT NULL DEFAULT '60'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `student4`
--

LOCK TABLES `student4` WRITE;
/*!40000 ALTER TABLE `student4` DISABLE KEYS */;
/*!40000 ALTER TABLE `student4` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2025-06-27 10:09:00
