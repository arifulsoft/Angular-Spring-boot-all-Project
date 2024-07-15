CREATE DATABASE  IF NOT EXISTS `system` /*!40100 DEFAULT CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci */ /*!80016 DEFAULT ENCRYPTION='N' */;
USE `system`;
-- MySQL dump 10.13  Distrib 8.0.17, for Win64 (x86_64)
--
-- Host: localhost    Database: system
-- ------------------------------------------------------
-- Server version	8.0.17

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
  `id` int(11) NOT NULL,
  `name` varchar(45) DEFAULT NULL,
  `email` varchar(45) DEFAULT NULL,
  `password` varchar(45) DEFAULT NULL,
  `address` varchar(45) DEFAULT NULL,
  `phone` varchar(45) DEFAULT NULL,
  `gender` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `admin`
--

LOCK TABLES `admin` WRITE;
/*!40000 ALTER TABLE `admin` DISABLE KEYS */;
INSERT INTO `admin` VALUES (101,'Meem','abc@gmail.com','17','Banani','01556342678','Female'),(102,'Fatema','ok@gmail.com','19','Tejgaow','01689456595','Female');
/*!40000 ALTER TABLE `admin` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `borrowed_book`
--

DROP TABLE IF EXISTS `borrowed_book`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `borrowed_book` (
  `number` int(11) NOT NULL,
  `name` varchar(45) DEFAULT NULL,
  `writer` varchar(45) DEFAULT NULL,
  `image` varchar(45) DEFAULT NULL,
  `categoryid` varchar(45) DEFAULT NULL,
  `categoryname` varchar(45) DEFAULT NULL,
  `bookshelf` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`number`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `borrowed_book`
--

LOCK TABLES `borrowed_book` WRITE;
/*!40000 ALTER TABLE `borrowed_book` DISABLE KEYS */;
INSERT INTO `borrowed_book` VALUES (7,'Hyperion','Dan Simmons','assets/images/17.jpg','20','Science Fiction','Shelf:2,Row2 '),(8,'Sleeping Murder','Rose Bella','assets/images/18.jpg','10','Mystery','Shelf:1,Row1 ');
/*!40000 ALTER TABLE `borrowed_book` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `categorie`
--

DROP TABLE IF EXISTS `categorie`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `categorie` (
  `id` int(11) NOT NULL,
  `name` varchar(45) DEFAULT NULL,
  `images` varchar(45) DEFAULT NULL,
  `description` varchar(1000) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `categorie`
--

LOCK TABLES `categorie` WRITE;
/*!40000 ALTER TABLE `categorie` DISABLE KEYS */;
INSERT INTO `categorie` VALUES (1,'Mystery','assets/images/a1.jpg','Mystery is a fiction genre where the nature of an event, usually a murder or other crime, remains mysterious until the end of the story.'),(2,'Science fiction','assets/images/a2.jpg','Science fiction is a genre of speculative fiction, which typically deals with imaginative and futuristic concepts such as advanced science and technology,'),(3,'Horror','assets/images/a3.jpg',' Horror is a genre that seeks to provoke fear, terror, shock, and other similar kinds of feelings in readers.'),(4,'Thriller','assets/images/a4.jpg','Thriller is a genre of fiction with numerous, often overlapping, subgenres, including crime, horror, and detective fiction.'),(5,'Classics','assets/images/a5.jpg','Classics are the most read books and are even taught in schools and colleges.'),(6,'History','assets/images/a6.jpg','History is the systematic study and documentation of the human past. The period of events before the invention of writing systems is considered prehistory.'),(7,'Children\'s literature','assets/images/a7.jpg','Children\'s literature or juvenile literature includes stories, books, magazines, and poems that are created for children.'),(8,'Short story','assets/images/a8.jpg','A short story is a piece of prose fiction.'),(9,'Fairy tale','assets/images/a9.jpg','A fairy tale is a short story that belongs to the folklore genre. Such stories typically feature magic, enchantments, and mythical or fanciful beings.'),(10,'Graphic novel','assets/images/a10.jpg','A graphic novel is a long-form work of sequential art.');
/*!40000 ALTER TABLE `categorie` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `loan`
--

DROP TABLE IF EXISTS `loan`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `loan` (
  `number` int(11) NOT NULL AUTO_INCREMENT,
  `username` varchar(45) DEFAULT NULL,
  `userid` varchar(45) DEFAULT NULL,
  `bookname` varchar(45) DEFAULT NULL,
  `booknumber` varchar(45) DEFAULT NULL,
  `image` varchar(45) DEFAULT NULL,
  `categoryname` varchar(45) DEFAULT NULL,
  `bookshelf` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`number`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `loan`
--

LOCK TABLES `loan` WRITE;
/*!40000 ALTER TABLE `loan` DISABLE KEYS */;
/*!40000 ALTER TABLE `loan` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `mystery`
--

DROP TABLE IF EXISTS `mystery`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `mystery` (
  `number` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(45) DEFAULT NULL,
  `writer` varchar(45) DEFAULT NULL,
  `image` varchar(45) DEFAULT NULL,
  `stock` varchar(45) DEFAULT NULL,
  `categoryname` varchar(45) DEFAULT NULL,
  `bookshelf` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`number`)
) ENGINE=InnoDB AUTO_INCREMENT=20 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `mystery`
--

LOCK TABLES `mystery` WRITE;
/*!40000 ALTER TABLE `mystery` DISABLE KEYS */;
INSERT INTO `mystery` VALUES (1,'Gone Girl','Gillian Flynn','assets/images/11.jpg','6','Mystery','Shelf:1,Row2 '),(2,'Sleeping Murder','Agatha Christie','assets/images/12.jpg','4','Mystery','Shelf:1,Row2 '),(3,'The Name of the Rose','Umberto Eco','assets/images/13.jpg','5','Mystery','Shelf:1,Row3 '),(4,'A Study in Scarlet','Arthur Conan Doyle','assets/images/14.jpg','5','Mystery','Shelf:1,Row2 '),(5,'The Girl on the Train','Paula Hawkins','assets/images/15.jpg','5','Mystery','Shelf:1,Row3 '),(6,'The Martian','Andy Weir','assets/images/16.jpg','5','Science Fiction','Shelf:2,Row3 '),(7,'Hyperion','Dan Simmons','assets/images/17.jpg','6','Science Fiction','Shelf:2,Row2 '),(8,'Sleeping Murder','Rose Bella','assets/images/18.jpg','5','Mystery','Shelf:1,Row1 '),(9,'Sleeping Murder','Mina Gomez','assets/images/19.jpg','5','Mystery','Shelf:1,Row1 '),(10,'Ghost Story','Peter Straub','assets/images/20.jpg','5','Horror','Shelf:3,Row1 '),(11,'The Shining','Stephen King','assets/images/21.jpg','5','Horror','Shelf:3,Row2 '),(12,'House of Leaves','Mark Z. Danielewski','assets/images/22.jpg','5','Horror','Shelf:3,Row1 '),(13,'Never Lie','Freida McFadden','assets/images/23.jpg','5','Thriller','Shelf:4,Row2 '),(14,'The Housemaid','Freida McFadden','assets/images/24.jpg','5','Thriller','Shelf:4,Row2 '),(15,'Sharp Objects','Gillian Flynn','assets/images/25.jpg','5','Thriller','Shelf:4,Row3'),(16,'Little Women','Louisa May Alcott','assets/images/26.jpg','5','Classics','Shelf:1,Row3'),(17,'Nineteen Eighty-Four','George Orwell','assets/images/27.jpg','5','Classics','Shelf:3,Row3 '),(18,'The Guns of August','Barbara W. Tuchman','assets/images/28.jpg','5','History','Shelf:4,Row2 '),(19,'The Diary of a Young Girl','Anne Frank','assets/images/29.jpg','5','History','Shelf:3,Row2 ');
/*!40000 ALTER TABLE `mystery` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `user`
--

DROP TABLE IF EXISTS `user`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `user` (
  `id` int(11) NOT NULL,
  `name` varchar(45) DEFAULT NULL,
  `email` varchar(45) DEFAULT NULL,
  `address` varchar(45) DEFAULT NULL,
  `phone` varchar(45) DEFAULT NULL,
  `password` varchar(45) DEFAULT NULL,
  `gender` varchar(45) DEFAULT NULL,
  `borrowedbook` varchar(500) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `user`
--

LOCK TABLES `user` WRITE;
/*!40000 ALTER TABLE `user` DISABLE KEYS */;
INSERT INTO `user` VALUES (200,'Mina','ab@gmail.com','Banani','252265','27','Female','Sleeping Murder,The Martian'),(201,'rose','ab@gmail.com','Gazipur','4565456','123','Female',NULL),(202,'Fatema','abc@gmail.com','Tejgaw','0123647489','123','Female',''),(205,'Tamim','ab@gmail.com','Gazipur','54455966','22','Male','The Girl on the Train'),(206,'Jisan','ab@gmail.com','Gazipur','125456658','123','Male',NULL);
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

-- Dump completed on 2024-07-15 10:16:12
