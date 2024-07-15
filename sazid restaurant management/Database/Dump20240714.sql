CREATE DATABASE  IF NOT EXISTS `restaurant` /*!40100 DEFAULT CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci */ /*!80016 DEFAULT ENCRYPTION='N' */;
USE `restaurant`;
-- MySQL dump 10.13  Distrib 8.0.30, for macos12 (x86_64)
--
-- Host: localhost    Database: restaurant
-- ------------------------------------------------------
-- Server version	8.3.0

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
-- Table structure for table `bill`
--

DROP TABLE IF EXISTS `bill`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `bill` (
  `billId` int NOT NULL AUTO_INCREMENT,
  `customerId` int DEFAULT NULL,
  `date` date DEFAULT NULL,
  `totalBill` int DEFAULT NULL,
  `paid` int DEFAULT NULL,
  `due` int DEFAULT NULL,
  `billStatus` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`billId`)
) ENGINE=InnoDB AUTO_INCREMENT=69 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `bill`
--

LOCK TABLES `bill` WRITE;
/*!40000 ALTER TABLE `bill` DISABLE KEYS */;
INSERT INTO `bill` VALUES (1,0,'2024-05-30',100,0,0,'due'),(2,0,'2024-05-30',120,0,0,'due'),(3,0,'2024-05-30',100,0,0,'due'),(4,0,'2024-05-30',100,0,0,'due'),(5,0,'2024-05-30',100,0,0,'due'),(6,0,'2024-05-30',100,0,0,'due'),(7,0,'2024-05-30',100,0,0,'due'),(8,0,'2024-05-30',100,0,0,'due'),(9,0,'2024-05-30',100,0,0,'due'),(10,0,'2024-05-30',100,0,0,'due'),(11,0,'2024-05-30',100,0,0,'due'),(12,0,'2024-05-30',100,0,0,'due'),(13,0,'2024-05-31',120,0,0,'due'),(14,0,'2024-05-31',120,0,0,'due'),(15,0,'2024-05-31',120,0,0,'due'),(16,0,'2024-05-31',120,0,0,'due'),(17,0,'2024-05-31',120,0,0,'due'),(18,0,'2024-05-31',120,0,0,'due'),(19,0,'2024-05-31',120,0,0,'due'),(20,0,'2024-05-31',120,120,0,'paid'),(21,2,'2024-05-31',120,0,0,'due'),(22,2,'2024-05-31',120,0,0,'due'),(23,2,'2024-05-31',960,960,0,'paid'),(24,11,'2024-05-31',120,120,0,'paid'),(25,4,'2024-05-30',80,0,0,'due'),(26,2,'2024-05-30',100,0,0,'due'),(27,0,NULL,0,0,0,NULL),(28,2,'2024-05-30',100,0,0,'due'),(29,2,'2024-05-30',100,0,0,'due'),(30,2,'2024-05-30',100,0,0,'due'),(31,2,'2024-05-30',2460,0,2460,'due'),(32,12,NULL,100,0,0,'due'),(33,13,'2024-05-31',890,890,0,'paid'),(34,2,'2024-06-06',120,0,0,'due'),(35,2,'2024-06-06',0,0,0,'paid'),(36,14,'2024-06-01',1290,1290,0,'paid'),(37,15,'2024-06-02',540,0,540,'due'),(38,16,'2024-06-02',150,150,0,'paid'),(39,2,'2024-06-02',1050,1050,0,'paid'),(40,17,'2024-06-01',1290,1290,0,'paid'),(41,2,'2024-05-30',820,820,0,'paid'),(42,14,'2024-06-01',770,770,0,'paid'),(43,12,'2024-06-01',880,880,0,'paid'),(44,18,'2024-06-01',1000,1000,0,'paid'),(45,19,'2024-06-01',5390,5390,0,'paid'),(46,20,'2024-06-01',490,490,0,'paid'),(47,2,'2024-06-01',1870,1870,0,'paid'),(48,21,'2024-06-01',5080,5080,0,'paid'),(49,22,'2024-06-04',32320,32320,0,'paid'),(50,23,'2024-06-06',100,0,0,'due'),(51,24,'2024-06-01',500,500,0,'paid'),(52,24,'2024-06-04',80,0,0,'due'),(53,25,'2024-06-02',450,450,0,'paid'),(54,26,'2024-06-04',2200,0,2200,'paid'),(55,2,'2024-06-04',100,0,0,'due'),(56,27,'2024-06-05',1920,0,1920,'due'),(57,28,NULL,150,0,0,'due'),(58,28,'2024-06-03',630,630,0,'paid'),(59,2,'2024-06-05',100,0,0,'due'),(60,3,'2024-06-05',150,0,0,'due'),(61,2,NULL,150,0,0,'due'),(62,3,'2024-06-06',930,930,0,'paid'),(63,0,'2024-06-06',120,0,0,'due'),(64,2,'2024-06-05',470,470,0,'paid'),(65,2,'2024-06-07',50,0,0,'due'),(66,30,'2024-06-07',660,660,0,'paid'),(67,31,'2024-06-05',400,0,400,'due'),(68,32,'2024-06-06',1000,1000,0,'paid');
/*!40000 ALTER TABLE `bill` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `bill_des`
--

DROP TABLE IF EXISTS `bill_des`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `bill_des` (
  `desId` int NOT NULL AUTO_INCREMENT,
  `billId` int DEFAULT NULL,
  `tableNumber` int DEFAULT NULL,
  `foodId` int DEFAULT NULL,
  `orderQuantity` int DEFAULT NULL,
  `amount` int DEFAULT NULL,
  `totalprice` int DEFAULT NULL,
  PRIMARY KEY (`desId`)
) ENGINE=InnoDB AUTO_INCREMENT=138 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `bill_des`
--

LOCK TABLES `bill_des` WRITE;
/*!40000 ALTER TABLE `bill_des` DISABLE KEYS */;
INSERT INTO `bill_des` VALUES (1,0,102,NULL,1,100,0),(2,0,101,NULL,1,100,100),(3,29,101,NULL,1,100,100),(4,30,101,NULL,1,100,100),(5,0,101,NULL,1,100,100),(6,0,104,NULL,1,150,150),(7,0,103,NULL,1,120,120),(8,34,109,NULL,1,80,80),(9,31,101,NULL,0,150,0),(10,31,101,NULL,0,110,0),(11,31,101,NULL,0,170,0),(12,31,101,NULL,0,150,0),(13,31,101,NULL,0,110,0),(14,31,101,NULL,0,170,0),(15,31,101,NULL,0,150,0),(16,31,101,NULL,0,110,0),(17,31,101,NULL,0,170,0),(18,31,101,NULL,0,150,0),(19,31,101,NULL,0,170,0),(20,31,101,NULL,0,110,0),(21,31,101,NULL,0,150,0),(22,31,101,NULL,0,170,0),(23,31,101,NULL,0,140,0),(24,33,104,1,1,150,150),(25,33,104,2,1,110,110),(26,31,101,2,3,110,330),(27,31,101,4,3,170,510),(28,31,101,3,2,140,280),(29,36,105,NULL,1,150,150),(30,36,105,2,2,110,220),(31,36,105,4,3,170,510),(32,36,105,1,1,150,150),(33,36,105,1,1,150,150),(34,36,105,2,1,110,110),(35,37,106,NULL,1,150,150),(36,37,105,2,1,110,110),(37,37,105,3,2,140,280),(38,0,107,NULL,1,150,150),(39,39,108,NULL,1,80,80),(40,39,108,2,3,110,330),(41,39,108,4,2,170,340),(42,39,108,1,2,150,300),(43,40,108,NULL,1,80,80),(44,40,108,1,2,150,300),(45,40,108,2,4,110,440),(46,40,108,3,3,140,420),(47,40,108,1,2,150,300),(48,40,108,2,3,110,330),(49,40,108,1,1,150,150),(50,40,108,2,1,110,110),(51,40,108,1,1,150,150),(52,40,108,4,1,170,170),(53,23,103,2,3,110,330),(54,23,103,4,3,170,510),(55,41,105,NULL,1,150,150),(56,41,105,1,3,150,450),(57,41,105,2,2,110,220),(58,42,102,NULL,1,100,100),(59,42,102,1,3,150,450),(60,42,102,2,2,110,220),(61,43,101,NULL,1,100,100),(62,43,101,1,2,150,300),(63,43,101,4,2,170,340),(64,43,101,3,1,140,140),(65,44,101,NULL,1,100,100),(66,44,101,1,3,150,450),(67,44,101,3,2,140,280),(68,44,101,4,1,170,170),(69,45,102,NULL,1,100,100),(70,45,102,1,9,150,1350),(71,45,102,2,12,110,1320),(72,45,102,3,9,140,1260),(73,45,102,4,8,170,1360),(74,46,103,NULL,1,120,120),(75,46,103,1,1,150,150),(76,46,103,2,2,110,220),(77,47,104,NULL,1,150,150),(78,47,104,1,4,150,600),(79,47,104,4,4,170,680),(80,47,104,2,4,110,440),(81,48,105,NULL,1,150,150),(82,48,105,1,13,150,1950),(83,48,105,4,13,170,2210),(84,48,105,2,7,110,770),(85,49,106,NULL,1,150,150),(86,49,106,1,3,150,450),(87,49,106,2,3,110,330),(88,49,106,3,3,140,420),(89,49,106,4,30,170,5100),(90,50,101,NULL,1,100,100),(91,35,103,1,2,150,300),(92,35,103,2,1,110,110),(93,51,102,NULL,1,100,100),(94,52,109,NULL,1,80,80),(95,51,102,1,1,150,150),(96,51,102,2,1,110,110),(97,51,102,3,1,140,140),(98,49,106,1,3,150,450),(99,49,106,2,2,110,220),(100,53,108,NULL,1,80,80),(101,53,108,1,1,150,150),(102,53,108,2,2,110,220),(103,54,109,NULL,1,80,80),(104,54,109,1,3,150,450),(105,54,109,2,5,110,550),(106,54,109,3,5,140,700),(107,54,109,3,3,140,420),(108,55,102,NULL,1,100,100),(109,56,108,NULL,1,80,80),(110,56,108,1,3,150,450),(111,56,108,2,3,110,330),(112,56,108,4,1,170,170),(113,56,108,1,3,150,450),(114,56,108,2,4,110,440),(115,57,107,NULL,1,150,150),(116,58,107,NULL,1,150,150),(117,58,107,1,1,150,150),(118,58,107,2,3,110,330),(119,59,101,NULL,1,100,100),(120,60,106,NULL,1,150,150),(121,61,105,NULL,1,150,150),(122,62,104,NULL,1,150,150),(123,62,104,3,2,140,280),(124,62,104,6,2,250,500),(125,63,103,NULL,1,120,120),(126,64,109,NULL,1,80,80),(127,64,109,2,2,110,220),(128,64,109,4,1,170,170),(129,65,109,NULL,1,50,50),(130,66,108,NULL,1,80,80),(131,66,108,1,2,150,300),(132,66,108,3,2,140,280),(133,67,101,NULL,1,100,100),(134,67,101,1,2,150,300),(135,68,101,NULL,1,100,100),(136,68,101,2,2,110,220),(137,68,101,4,4,170,680);
/*!40000 ALTER TABLE `bill_des` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `booking`
--

DROP TABLE IF EXISTS `booking`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `booking` (
  `bookingId` int NOT NULL AUTO_INCREMENT,
  `tableNo` int DEFAULT NULL,
  `customerId` int DEFAULT NULL,
  `bookingTime` varchar(45) DEFAULT NULL,
  `bookingStatus` varchar(45) DEFAULT NULL,
  `date` date DEFAULT NULL,
  `orderId` int DEFAULT NULL,
  PRIMARY KEY (`bookingId`)
) ENGINE=InnoDB AUTO_INCREMENT=73 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `booking`
--

LOCK TABLES `booking` WRITE;
/*!40000 ALTER TABLE `booking` DISABLE KEYS */;
INSERT INTO `booking` VALUES (1,101,0,'breakfast','booked','2024-05-22',0),(2,101,2,'breakfast','booked','2024-05-30',0),(3,102,3,'lunch','booked','2024-05-30',0),(4,101,4,'breakfast','booked','2024-05-30',0),(5,101,0,'breakfast','booked','2024-05-30',0),(6,102,0,'lunch','booked','2024-05-30',0),(7,103,0,'breakfast','booked','2024-05-30',0),(8,101,0,'breakfast','booked','2024-05-30',0),(9,101,0,'breakfast','booked','2024-05-30',0),(10,101,0,'breakfast','booked','2024-05-30',0),(11,101,0,'breakfast','booked','2024-05-30',0),(12,101,0,'breakfast','booked','2024-05-30',0),(13,101,0,'breakfast','booked','2024-05-30',0),(14,101,0,'breakfast','booked','2024-05-30',0),(15,101,0,'breakfast','booked','2024-05-30',0),(16,101,0,'breakfast','booked','2024-05-30',0),(17,101,0,'breakfast','booked','2024-05-30',0),(18,103,0,'breakfast','check out','2024-05-31',0),(19,103,0,'breakfast','check out','2024-05-31',0),(20,103,0,'breakfast','booked','2024-05-31',0),(21,103,0,'breakfast','booked','2024-05-31',0),(22,103,0,'breakfast','booked','2024-05-31',0),(23,103,0,'breakfast','booked','2024-05-31',0),(24,103,0,'breakfast','booked','2024-05-31',0),(25,103,0,'breakfast','booked','2024-05-31',0),(26,103,2,'breakfast','check out','2024-05-31',0),(27,103,2,'breakfast','booked','2024-05-31',0),(28,103,2,'breakfast','booked','2024-05-31',0),(29,103,11,'breakfast','check out','2024-05-31',0),(30,109,4,'breakfast','booked','2024-05-30',0),(31,102,2,'breakfast','booked','2024-05-30',0),(32,102,2,'breakfast','booked','2024-05-30',0),(33,101,2,'breakfast','booked','2024-05-30',0),(34,101,2,'breakfast','booked','2024-05-30',0),(35,101,2,'breakfast','booked','2024-05-30',0),(36,101,12,'Select Time','booked',NULL,0),(37,104,13,'lunch','check out','2024-05-31',0),(38,103,2,'breakfast','check out','2024-06-06',0),(39,109,2,'breakfast','booked','2024-06-06',0),(40,105,14,'breakfast','check out','2024-06-01',0),(41,106,15,'breakfast','booked','2024-06-02',0),(42,107,16,'lunch','booked','2024-06-02',0),(43,108,2,'lunch','check out','2024-06-02',0),(44,108,17,'breakfast','check out','2024-06-01',0),(45,105,2,'lunch','check out','2024-05-30',0),(46,102,14,'lunch','check out','2024-06-01',0),(47,101,12,'lunch','check out','2024-06-01',0),(48,101,18,'breakfast','check out','2024-06-01',0),(49,102,19,'lunch','check out','2024-06-01',0),(50,103,20,'breakfast','check out','2024-06-01',0),(51,104,2,'breakfast','check out','2024-06-01',0),(52,105,21,'breakfast','check out','2024-06-01',0),(53,106,22,'lunch','check out','2024-06-04',0),(54,101,23,'dinner','booked','2024-06-06',0),(55,102,24,'breakfast','check out','2024-06-01',0),(56,109,24,'breakfast','booked','2024-06-04',0),(57,108,25,'dinner','check out','2024-06-02',0),(58,109,26,'lunch','check out','2024-06-04',0),(59,102,2,'lunch','booked','2024-06-04',0),(60,108,27,'breakfast','booked','2024-06-05',0),(61,107,28,'breakfast','booked',NULL,0),(62,107,28,'breakfast','check out','2024-06-03',0),(63,101,2,'lunch','booked','2024-06-05',0),(64,106,3,'breakfast','booked','2024-06-05',0),(65,105,2,'Select Time','booked',NULL,0),(66,104,3,'breakfast','check out','2024-06-06',0),(67,103,0,'breakfast','booked','2024-06-06',0),(68,109,2,'lunch','check out','2024-06-05',0),(69,109,2,'breakfast','booked','2024-06-07',0),(70,108,30,'lunch','check out','2024-06-07',0),(71,101,31,'lunch','booked','2024-06-05',0),(72,101,32,'lunch','check out','2024-06-06',0);
/*!40000 ALTER TABLE `booking` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `customer`
--

DROP TABLE IF EXISTS `customer`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `customer` (
  `customerId` int NOT NULL AUTO_INCREMENT,
  `customerName` varchar(45) DEFAULT NULL,
  `customerPhone` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`customerId`),
  UNIQUE KEY `customerPhone_UNIQUE` (`customerPhone`)
) ENGINE=InnoDB AUTO_INCREMENT=33 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `customer`
--

LOCK TABLES `customer` WRITE;
/*!40000 ALTER TABLE `customer` DISABLE KEYS */;
INSERT INTO `customer` VALUES (1,NULL,NULL),(2,'Sazid','01516789896'),(3,'Abu Hossain','01796485178'),(4,'Farzana','01742098790'),(11,'Shamim','01300000001'),(12,'Farzana bolod','01742098444'),(13,'Farzana bolod','017425445'),(14,'Sumon','01302456585'),(15,'rasel','015167456123'),(16,'Khokababu','01402142365'),(17,'aronno','01300000000'),(18,'ema','01516784456'),(19,'sajib','017964855555'),(20,'Faisal','015734263224'),(21,'Aziz','01723456790'),(22,'shamim','015167895678'),(23,'shamim','015167898934'),(24,'Sumon','01516789844'),(25,'Aziz','01742098732'),(26,'rahat','015167844565'),(27,'Sazid','453784538943'),(28,'pranto','0151678345678'),(29,NULL,NULL),(30,'Sazid','01516789833'),(31,'jahir','015167894566'),(32,'Sazid','015167898956');
/*!40000 ALTER TABLE `customer` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `food_item`
--

DROP TABLE IF EXISTS `food_item`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `food_item` (
  `foodId` int NOT NULL AUTO_INCREMENT,
  `foodName` varchar(45) DEFAULT NULL,
  `foodPrice` int DEFAULT NULL,
  `foodQty` int DEFAULT NULL,
  PRIMARY KEY (`foodId`)
) ENGINE=InnoDB AUTO_INCREMENT=11 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `food_item`
--

LOCK TABLES `food_item` WRITE;
/*!40000 ALTER TABLE `food_item` DISABLE KEYS */;
INSERT INTO `food_item` VALUES (1,'burger',150,50),(2,'Juice',110,200),(3,'Chicken Fry Breast',140,30),(4,'Chicken Fry Leg Piece',170,60),(5,'WAFFLE FRIES CHICK-FIL-A',220,40),(6,'CHICKEN POPEYES',250,50),(7,'CURLY FRIES ARBY\'S',300,50),(8,'SOFT COOKIES SUBWAY',180,55),(9,'CHICKEN KFC',600,70),(10,'BLIZZARD DAIRY QUEEN',130,20);
/*!40000 ALTER TABLE `food_item` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `food_order`
--

DROP TABLE IF EXISTS `food_order`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `food_order` (
  `orderId` int NOT NULL AUTO_INCREMENT,
  `tableNumber` int DEFAULT NULL,
  `customerId` int DEFAULT NULL,
  `processSchedule` varchar(45) DEFAULT NULL,
  `date` date DEFAULT NULL,
  `orderStatus` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`orderId`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `food_order`
--

LOCK TABLES `food_order` WRITE;
/*!40000 ALTER TABLE `food_order` DISABLE KEYS */;
/*!40000 ALTER TABLE `food_order` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `order_des`
--

DROP TABLE IF EXISTS `order_des`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `order_des` (
  `desId` int NOT NULL AUTO_INCREMENT,
  `orderId` int DEFAULT NULL,
  `foodId` int DEFAULT NULL,
  PRIMARY KEY (`desId`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `order_des`
--

LOCK TABLES `order_des` WRITE;
/*!40000 ALTER TABLE `order_des` DISABLE KEYS */;
/*!40000 ALTER TABLE `order_des` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `payment`
--

DROP TABLE IF EXISTS `payment`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `payment` (
  `paymentId` int NOT NULL AUTO_INCREMENT,
  `date` date DEFAULT NULL,
  `billId` int DEFAULT NULL,
  `customerId` int DEFAULT NULL,
  `amount` int DEFAULT NULL,
  `paymentType` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`paymentId`)
) ENGINE=InnoDB AUTO_INCREMENT=38 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `payment`
--

LOCK TABLES `payment` WRITE;
/*!40000 ALTER TABLE `payment` DISABLE KEYS */;
INSERT INTO `payment` VALUES (1,'2024-06-01',36,14,1290,'cash payment'),(2,'2024-06-02',39,2,1050,'cash payment'),(3,NULL,0,0,0,'cash payment'),(4,NULL,0,0,0,'cash payment'),(5,'2024-06-02',38,16,150,'cash payment'),(6,'2024-06-01',36,14,1290,'cash payment'),(7,NULL,0,0,0,'cash payment'),(8,NULL,0,0,0,'cash payment'),(9,NULL,0,0,0,'cash payment'),(10,NULL,0,0,0,'cash payment'),(11,NULL,0,0,0,'cash payment'),(12,NULL,0,0,0,'cash payment'),(13,NULL,0,0,0,'cash payment'),(14,'2024-06-01',40,17,1290,'cash payment'),(15,'2024-05-31',23,2,960,'cash payment'),(16,'2024-05-30',41,2,820,'cash payment'),(17,'2024-05-31',33,13,890,'cash payment'),(18,'2024-05-31',24,11,120,'cash payment'),(19,'2024-05-31',20,0,120,'cash payment'),(20,'2024-06-01',42,14,770,'cash payment'),(21,'2024-05-31',20,0,120,'cash payment'),(22,'2024-06-01',43,12,880,'cash payment'),(23,'2024-06-01',44,18,1000,'cash payment'),(24,'2024-06-01',45,19,5390,'cash payment'),(25,'2024-06-01',46,20,490,'cash payment'),(26,'2024-06-01',47,2,1870,'cash payment'),(27,'2024-06-01',48,21,5080,'cash payment'),(28,'2024-06-06',35,2,0,'cash payment'),(29,'2024-06-01',51,24,500,'cash payment'),(30,'2024-06-04',49,22,32320,'cash payment'),(31,'2024-06-02',53,25,450,'cash payment'),(32,'2024-06-04',54,26,1780,'cash payment'),(33,'2024-06-03',58,28,630,'cash payment'),(34,'2024-06-06',62,3,930,'cash payment'),(35,'2024-06-05',64,2,470,'cash payment'),(36,'2024-06-07',66,30,660,'cash payment'),(37,'2024-06-06',68,32,1000,'cash payment');
/*!40000 ALTER TABLE `payment` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `stock`
--

DROP TABLE IF EXISTS `stock`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `stock` (
  `stockId` int NOT NULL AUTO_INCREMENT,
  `productName` varchar(45) DEFAULT NULL,
  `size` int DEFAULT NULL,
  `sizeType` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`stockId`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `stock`
--

LOCK TABLES `stock` WRITE;
/*!40000 ALTER TABLE `stock` DISABLE KEYS */;
/*!40000 ALTER TABLE `stock` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `stock_tnx`
--

DROP TABLE IF EXISTS `stock_tnx`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `stock_tnx` (
  `sTnxId` int NOT NULL AUTO_INCREMENT,
  `productName` varchar(45) DEFAULT NULL,
  `purchaseDate` date DEFAULT NULL,
  `amount` int DEFAULT NULL,
  `stockId` int DEFAULT NULL,
  `size` int DEFAULT NULL,
  PRIMARY KEY (`sTnxId`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `stock_tnx`
--

LOCK TABLES `stock_tnx` WRITE;
/*!40000 ALTER TABLE `stock_tnx` DISABLE KEYS */;
/*!40000 ALTER TABLE `stock_tnx` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `table_info`
--

DROP TABLE IF EXISTS `table_info`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `table_info` (
  `tableId` int NOT NULL AUTO_INCREMENT,
  `tableNumber` int DEFAULT NULL,
  `tableSit` int DEFAULT NULL,
  `tablePosition` varchar(45) DEFAULT NULL,
  `tableService` varchar(45) DEFAULT NULL,
  `fph` int DEFAULT NULL,
  `status` varchar(45) DEFAULT 'available',
  PRIMARY KEY (`tableId`),
  UNIQUE KEY `tableNumber_UNIQUE` (`tableNumber`)
) ENGINE=InnoDB AUTO_INCREMENT=13 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `table_info`
--

LOCK TABLES `table_info` WRITE;
/*!40000 ALTER TABLE `table_info` DISABLE KEYS */;
INSERT INTO `table_info` VALUES (1,101,2,'Front',NULL,100,'Booked'),(2,102,2,'Front',NULL,100,'available'),(3,103,3,'Front Right',NULL,120,'available'),(4,104,4,'Front Left',NULL,150,'available'),(5,105,4,'Middle Left',NULL,150,'available'),(6,106,4,'Middle Right',NULL,150,'available'),(7,107,4,'Middle Left Corner',NULL,150,'available'),(8,108,3,'middle',NULL,80,'Booked'),(9,109,2,'Back',NULL,50,'available'),(11,110,3,'Back Corner',NULL,40,'available'),(12,111,4,'Front Right',NULL,30,'available');
/*!40000 ALTER TABLE `table_info` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `user`
--

DROP TABLE IF EXISTS `user`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `user` (
  `admin_id` int NOT NULL,
  `admin_name` varchar(45) DEFAULT NULL,
  `admin_email` varchar(45) DEFAULT NULL,
  `admin_pass` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`admin_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `user`
--

LOCK TABLES `user` WRITE;
/*!40000 ALTER TABLE `user` DISABLE KEYS */;
INSERT INTO `user` VALUES (101,'Sazid','sazid@gmail.com','1234'),(102,'Mahmud','mahmud@gmail.com','1234'),(103,'joy','joy@gmail.com','12345'),(104,'pranto','pranto@gmail.com','12345'),(105,'rasel','rasel@gmail.com','123'),(106,'sajib','sajib@gmail.com','12345'),(107,'alamin','alamin@gmail.com','54321'),(108,'Omayer','omayer@gmail.com','12345'),(109,'amit','amit@gmail.com','12345'),(110,'nazrul','nazrul@gmail.com','1234');
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

-- Dump completed on 2024-07-14  9:51:33
