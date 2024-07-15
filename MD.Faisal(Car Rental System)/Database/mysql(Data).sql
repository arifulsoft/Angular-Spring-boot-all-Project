CREATE DATABASE  IF NOT EXISTS `faisal` /*!40100 DEFAULT CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci */ /*!80016 DEFAULT ENCRYPTION='N' */;
USE `faisal`;
-- MySQL dump 10.13  Distrib 8.0.36, for Win64 (x86_64)
--
-- Host: localhost    Database: faisal
-- ------------------------------------------------------
-- Server version	8.0.36

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
-- Table structure for table `admin`
--

DROP TABLE IF EXISTS `admin`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `admin` (
  `id` int NOT NULL,
  `password` varchar(45) DEFAULT NULL,
  `name` varchar(45) DEFAULT NULL,
  `gender` varchar(45) DEFAULT NULL,
  `email` varchar(45) DEFAULT NULL,
  `phone` varchar(45) DEFAULT NULL,
  `address` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `admin`
--

LOCK TABLES `admin` WRITE;
/*!40000 ALTER TABLE `admin` DISABLE KEYS */;
INSERT INTO `admin` VALUES (0,NULL,NULL,'Dhaka',NULL,NULL,NULL),(101,'123','Faisal','Male','faisal@gmail.com','01830770959','Dhaka'),(102,'456','Arif','Male','arig@gmail.com','01967823083','Jamalpur'),(103,'789','Jahir','Male','jahir@gmail.com','0174268975','Mymenshing'),(111,'rahad@gmail.com','555','Dhaka','Rahad','01967923083','male');
/*!40000 ALTER TABLE `admin` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `booking_approval_table`
--

DROP TABLE IF EXISTS `booking_approval_table`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `booking_approval_table` (
  `nid` int NOT NULL,
  `name` varchar(45) DEFAULT NULL,
  `mobile_number` varchar(45) DEFAULT NULL,
  `from` varchar(45) DEFAULT NULL,
  `to` varchar(45) DEFAULT NULL,
  `car_number` varchar(45) DEFAULT NULL,
  `booking_date` date DEFAULT NULL,
  `total_day` int DEFAULT NULL,
  `total_rent` int DEFAULT NULL,
  `due_rent` int DEFAULT NULL,
  `advance_payment` int DEFAULT NULL,
  `status` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`nid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `booking_approval_table`
--

LOCK TABLES `booking_approval_table` WRITE;
/*!40000 ALTER TABLE `booking_approval_table` DISABLE KEYS */;
INSERT INTO `booking_approval_table` VALUES (101,'abc','017','fhfg','fdhgf','fgdfg','2012-03-24',2,12000,121,1100,'pending'),(102,'xys','0123','dhjakja','rty','01523','2012-03-24',45,5200,5000,1000,'pending'),(103,'dfg','015','dhjakja','dhjakja','01523','2012-03-24',2300,253,5000,1000,'pending'),(104,'Faisal Hossain','01745745632','Dhaka','Chittagong','NH-1234','2024-06-12',2,10000,8000,2000,'pending'),(121,'Riaz','777','Dhaka','Cumillah','NH-1478','2024-06-27',4,32000,12000,20000,'pending'),(123,'Hassan Iman','12356','Dhaka','Cumillah','NH-1478','2024-06-27',2,16000,6000,10000,'pending'),(147,'Rahad sikder','147258','Dhaka','Noakhali','NH-1478','2024-06-27',5,40000,15000,25000,'pending');
/*!40000 ALTER TABLE `booking_approval_table` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `car_table`
--

DROP TABLE IF EXISTS `car_table`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `car_table` (
  `serial_no` int NOT NULL AUTO_INCREMENT,
  `car_name` varchar(45) DEFAULT NULL,
  `car_number` varchar(45) DEFAULT NULL,
  `car_color` varchar(45) DEFAULT NULL,
  `car_seating` int DEFAULT NULL,
  `car_image` varchar(100) DEFAULT NULL,
  `rent_per_day` int DEFAULT NULL,
  `quantity` int DEFAULT '1',
  `total` int DEFAULT NULL,
  PRIMARY KEY (`serial_no`)
) ENGINE=InnoDB AUTO_INCREMENT=10 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `car_table`
--

LOCK TABLES `car_table` WRITE;
/*!40000 ALTER TABLE `car_table` DISABLE KEYS */;
INSERT INTO `car_table` VALUES (1,'Toyota','NH-1234','White',5,'assets\\images\\089-01.width-1920.jpegquality-60.png',5000,1,NULL),(2,'Toyota','MH-1425','Black',5,'assets\\images\\fitted (3).jpg',5000,1,NULL),(3,'Toyota','NH-2582','Red',5,'assets\\images\\fitted (1).jpg',5000,1,NULL),(4,'Toyota-Hiace','MH-1212','White',10,'assets\\images\\Hiace-5.png',8000,1,NULL),(5,'Toyota-Hiace','NH-1478','Black',10,'assets\\images\\fitted.jpg',8000,1,NULL),(6,'Toyota-Hiace','SH-4422','White',10,'assets\\images\\29573328_1560733370642492_1055896105165622659_n.jpg',8500,1,NULL);
/*!40000 ALTER TABLE `car_table` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `car_transaction_table`
--

DROP TABLE IF EXISTS `car_transaction_table`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `car_transaction_table` (
  `serial_no` int NOT NULL AUTO_INCREMENT,
  `car_name` varchar(45) DEFAULT NULL,
  `car_number` varchar(45) DEFAULT NULL,
  `from` varchar(45) DEFAULT NULL,
  `to` varchar(45) DEFAULT NULL,
  `booking_date` date DEFAULT NULL,
  `return_date` date DEFAULT NULL,
  `total_rent` double DEFAULT NULL,
  `customer_name` varchar(45) DEFAULT NULL,
  `customer_nid` int DEFAULT NULL,
  `customer_mobile_no` int DEFAULT NULL,
  `total_days` int DEFAULT NULL,
  `advance_payment` double DEFAULT NULL,
  PRIMARY KEY (`serial_no`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `car_transaction_table`
--

LOCK TABLES `car_transaction_table` WRITE;
/*!40000 ALTER TABLE `car_transaction_table` DISABLE KEYS */;
INSERT INTO `car_transaction_table` VALUES (1,'Toyota','5454','Dhaka','Chittagong',NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL),(2,'Volvo','54650','Dhaka','Chittagong',NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL);
/*!40000 ALTER TABLE `car_transaction_table` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `carbooking`
--

DROP TABLE IF EXISTS `carbooking`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `carbooking` (
  `nid` int NOT NULL,
  `name` varchar(45) DEFAULT NULL,
  `m_number` varchar(45) DEFAULT NULL,
  `from` varchar(45) DEFAULT NULL,
  `to` varchar(45) DEFAULT NULL,
  `car_name` varchar(45) DEFAULT NULL,
  `car_number` varchar(45) DEFAULT NULL,
  `car_seating` int DEFAULT NULL,
  `rent_per_day` int DEFAULT NULL,
  `total_day` int DEFAULT NULL,
  `amount` int DEFAULT NULL,
  `booking_date` date DEFAULT NULL,
  `return_date` date DEFAULT NULL,
  `advance_payment` int DEFAULT NULL,
  `due` int DEFAULT NULL,
  PRIMARY KEY (`nid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `carbooking`
--

LOCK TABLES `carbooking` WRITE;
/*!40000 ALTER TABLE `carbooking` DISABLE KEYS */;
INSERT INTO `carbooking` VALUES (0,NULL,NULL,NULL,NULL,'Toyota','MH-1425',5,5000,0,0,'2024-06-27','2024-06-27',0,0),(666,'Rahim','123456','Dhaka','Chittagong','Toyota','MH-1425',5,5000,5,25000,'2024-06-27','2024-06-27',10000,15000),(789,'Md Rahad','789456','Dhaka','Cumillah','Toyota-Hiace','NH-1478',10,8000,4,32000,'2024-06-27','2024-06-27',25000,7000),(1234,'Faisal`','4444','Dhaka','Chittagong','Toyota-Hiace','NH-1478',10,8000,4,32000,'2024-06-27','2024-06-27',20000,12000);
/*!40000 ALTER TABLE `carbooking` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `user`
--

DROP TABLE IF EXISTS `user`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `user` (
  `a_number` int NOT NULL AUTO_INCREMENT,
  `name` varchar(45) DEFAULT NULL,
  `gender` varchar(45) DEFAULT NULL,
  `email` varchar(45) DEFAULT NULL,
  `password` varchar(45) DEFAULT NULL,
  `phone` varchar(45) DEFAULT NULL,
  `balance` double DEFAULT NULL,
  PRIMARY KEY (`a_number`)
) ENGINE=InnoDB AUTO_INCREMENT=64557 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `user`
--

LOCK TABLES `user` WRITE;
/*!40000 ALTER TABLE `user` DISABLE KEYS */;
INSERT INTO `user` VALUES (111,'Sakib','male','sakib@gmail.com','123','54548674',5000),(112,'Md.Rahad','male','rahad@gmail.com','444','65465485',2000),(113,'Faisal Hossain','male','faisal@gmail.com','147','01967923083',10000);
/*!40000 ALTER TABLE `user` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2024-07-14 14:00:49
