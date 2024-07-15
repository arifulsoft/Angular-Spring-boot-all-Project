CREATE DATABASE  IF NOT EXISTS `rahat` /*!40100 DEFAULT CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci */ /*!80016 DEFAULT ENCRYPTION='N' */;
USE `rahat`;
-- MySQL dump 10.13  Distrib 8.0.17, for Win64 (x86_64)
--
-- Host: localhost    Database: rahat
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
-- Table structure for table `blog`
--

DROP TABLE IF EXISTS `blog`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `blog` (
  `blog_id` int(11) NOT NULL AUTO_INCREMENT,
  `writer` varchar(200) DEFAULT NULL,
  `title` varchar(2000) DEFAULT NULL,
  `description` varchar(4000) DEFAULT NULL,
  `publ_date` varchar(40) DEFAULT NULL,
  `image` varchar(1000) DEFAULT NULL,
  `category` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`blog_id`)
) ENGINE=InnoDB AUTO_INCREMENT=50 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `blog`
--

LOCK TABLES `blog` WRITE;
/*!40000 ALTER TABLE `blog` DISABLE KEYS */;
INSERT INTO `blog` VALUES (5,'MEM report','New UIS data show that the share of women in STEM graduates stagnant for 10 years','Globally, women make up over half of all students who have enrolled in tertiary education, but they remain considerably less likely to choose STEM fields. In 2018–23, new UIS data released for the 2024 GEM Gender Report show that women made up only 35% of STEM graduates, showing no progress over the past ten years.','20/1/2024','https://images.unsplash.com/reserve/bOvf94dPRxWu0u3QsPjF_tree.jpg?ixid=M3wxMjA3fDB8MXxzZWFyY2h8M3x8bmF0dXJhbHxlbnwwfHx8fDE3MjA3NDA4MDd8MA&ixlib=rb-4.0.3','Features'),(9,'Md Iqbal Hossain','Benefits of fruit juice in Iftar','There’s no alternative to fruit juice or smoothies to relieve fatigue at any time, not only while fasting. Usually we start our Iftar with some beverage. Drinking lemonade or tang drink right at the beginning of Iftar is not healthy at all.  Rather fruit juice can be included in Iftar as the beverage, which is healthy. Papaya, wood apple, pineapple, watermelon and strawberry juice are more beneficial among them.  Instead of drinking fruit juice directly, you can drink lassi or milkshake by mixing the juice with yoghurt or milk. In that case, the health benefits of this drink will increase even more. Don’t add sugar or jaggery though.  Pexels An analysis of the components of fruit shows that it contains all the vitamins and minerals including carbohydrate, little bit of protein and fat. For example, there is 8 per cent carbohydrate in papaya, 14 per cent in pineapple, 13 per cent in watermelon and strawberry with 30 per cent carbohydrate in wood apple. So, there’s no need for added sugar.  Fiber and anti-oxidants are crucial components of fruits. The most important component of fruit is water. On average, there’s 75 per cent water in all fruits.  Reasons behind benefits of fruit juice The body experiences a drop in the sugar level for staying without food for a long time. The sugar component of the fruit gradually increases the glucose level in blood and reenergises the body.  Fruit juice refreshes the muscles, tired from the lack of electrolytes. Plus, it has an excellent combination of potassium, sodium, chloride and bicarbonate in it.  The water content of the fruit relieves the body of dehydration and maintains the balance of body temperature.  Anti-oxidant restricts the formation of free radicals in the body and removes the dead cells. As a result, it increases the immunity of cells.  The fiber in the fruit keeps you free from urinary tract infections and constipation. In addition to that it acts as a probiotic, which improves digestion.  The beta carotene in the fruit protects the eyes, hair and the skin.  The Vitamin C in the fruit helps prevent anemia by increasing the absorption of iron.  The iron, vitamin B-12 and folic acid in the fruit help with the formation of red blood cells.  Precaution Those who suffer from IBS or lactose intolerance shouldn’t drink the milkshake.  Kidney patients must consult a specialist before consuming fruit juice.  * Md Iqbal Hossain is a senior nutrition officer at Chittagong Diabetic General Hospital','2024-05-16','assets\\Benefits of fruit juice in Iftar.webp','education'),(10,'ANI','Children with healthier eating habits have better cognitive development','Reasoning is an important talent for learning, academic performance, and problem-solving in everyday life. A recent study from the University of Eastern Finland discovered that a better overall diet, less red meat consumption, more time spent reading, and participation in organised sports improved children\'s reasoning skills over the first two years of school.  “Children with healthier eating habits showed greater cognitive development than other children. Specifically, better overall diet quality, lower red meat consumption, and higher low-fat dairy product intake were linked to better reasoning skills,” said doctoral researcher Sehrish Naveed of the University of Eastern Finland.  Children who spent more time reading and participating in structured sports performed better in reasoning tests than their peers. Excessive computer uses and unsupervised leisure-time physical activity, on the other hand, were linked to weaker thinking skills. Screen usage, active school transportation, playtime physical activity, and intensity of physical activity were not related to thinking skills.  Over half of the children participated in a two-year family-based and individualised diet and physical activity intervention. However, the intervention did not impact reasoning skills, with the children in the intervention and control groups exhibiting similar cognitive development.  “In the lives of growing children, diet and physical activity intervention is just one factor influencing lifestyle and reasoning skills. Based on our study, investing in a healthy diet and encouraging children to read are beneficial for the development of reasoning skills among children. Additionally, engaging in organised sports appears to support reasoning skills”, Eero Haapala points out.','2024-05-16','assets\\Children.webp',NULL),(11,'ANI','How ketogenic diet improves severe mental illness','The common antipsychotic medication used for severe mental illnesses such as schizophrenia and bipolar disorder might have unintended consequences.  Although these medications aid in the regulation of brain chemistry, they frequently result in metabolic adverse effects, such as obesity and insulin resistance, which are so upsetting that many patients cease taking them.  According to a recent pilot study conducted by doctors at Stanford Medicine, a ketogenic diet helps these individuals\' mental health in addition to restoring their metabolic health while they continue their drug regimen.  The findings, which were released in Psychiatry Research, indicate that nutritional interventions can be quite effective in addressing mental health conditions.  \"It\'s very promising and very encouraging that you can take back control of your illness in some way, aside from the usual standard of care,\" said Shebani Sethi, MD, associate professor of psychiatry and behavioral sciences and the first author of the new paper.  The senior author of the paper is Laura Saslow, PhD, associate professor of health behavior and biological sciences at the University of Michigan.  Sethi, who is board certified in obesity and psychiatry, remembers when she first noticed the connection. As a medical student working in an obesity clinic, she saw a patient with treatment-resistant schizophrenia whose auditory hallucinations quieted on a ketogenic diet.  Ketogenic Diet Pexels That prompted her to dig into the medical literature. There were only a few, decades-old case reports on using the ketogenic diet to treat schizophrenia, but there was a long track record of success in using ketogenic diets to treat epileptic seizures.  \"The ketogenic diet has been proven to be effective for treatment-resistant epileptic seizures by reducing the excitability of neurons in the brain,\" Sethi said. \"We thought it would be worth exploring this treatment in psychiatric conditions.\"  A few years later, Sethi coined the term metabolic psychiatry, a new field that approaches mental health from an energy conversion perspective.  In the four-month pilot trial, Sethi\'s team followed 21 adult participants who were diagnosed with schizophrenia or bipolar disorder, taking antipsychotic medications, and had a metabolic abnormality -- such as weight gain, insulin resistance, hypertriglyceridemia, dyslipidemia or impaired glucose tolerance.  The participants were instructed to follow a ketogenic diet, with approximately 10 per cent of the calories from carbohydrates, 30 per cent from protein and 60 per cent from fat. They were not told to count calories.','2024-05-16','assets\\diet.webp ',NULL),(12,'ANI','Use of acid reflux drugs linked to higher risk of migraine','According to a study, people who take acid-reducing medications may be at a higher risk of migraines and other severe headaches than those who do not. Acid-reducing medications include proton pump inhibitors like omeprazole and esomeprazole, histamine H2-receptor antagonists or H2 blockers like cimetidine and famotidine, and antacids.  The study does not prove that acid-reducing medicines cause migraines; it only indicates a relationship. Findings of the study were published in the online issue of Neurology Clinical Practice, an official journal of the American Academy of Neurology.  Acid reflux is when stomach acid flows into the esophagus, usually after a meal or when lying down. People with acid reflux may experience heartburn and ulcers. People with frequent acid reflux may develop gastroesophageal reflux disease, or GERD, which can lead to cancer of the esophagus.  \"Given the wide usage of acid-reducing drugs and these potential implications with migraine, these results warrant further investigation,\" said study author Margaret Slavin, PhD, RDN, of the University of Maryland in College Park.   \"These drugs are often considered to be overprescribed, and new research has shown other risks tied to long-term use of proton pump inhibitors, such as an increased risk of dementia.\"  For the study, researchers looked at data on 11,818 people who provided information on use of acid-reducing drugs and whether they had migraine or severe headache in the past three months.  A total of 25 per cent of participants taking proton pump inhibitors had migraine or severe headache, compared to 19 per cent of those who were not taking the drugs.   A total of 25 per cent of those taking H2 blockers had severe headache, compared to 20 per cent of those who were not taking those drugs. And 22 per cent of those taking antacid supplements had severe headache, compared to 20 per cent of those not taking antacids.  When researchers adjusted for other factors that could affect the risk of migraine, such as age, sex and use of caffeine and alcohol, they found that people taking proton pump inhibitors were 70 per cent more likely to have migraine than people not taking proton pump inhibitors. Those taking H2 blockers were 40 per cent more likely and those taking antacid supplements were 30 per cent more likely.  \"It\'s important to note that many people do need acid-reducing medications to manage acid reflux or other conditions, and people with migraine or severe headache who are taking these drugs or supplements should talk with their doctors about whether they should continue,\" Slavin said.  Slavin noted that the study looked only at prescription drugs. Some of the drugs became available for over-the-counter use at non-prescription strength during the study period, but use of these over-the-counter drugs was not included in this study.','2024-05-16','assets\\migraine.webp',NULL),(13,'ANI','Intermittent fasting protects against liver inflammation, liver cancer?','Fatty liver disease frequently causes chronic liver inflammation and can possibly result in liver cancer. Scientists at the German Cancer Research Centre (DKFZ) and the University of Tubingen have demonstrated in mice that intermittent fasting on a 5:2 schedule can block this progression.  Fasting lowers the development of liver cancer in mice that already have liver inflammation. The researchers discovered two proteins in liver cells that are both responsible for the beneficial effect of fasting. An approved medication can partially replicate this effect.  Nonalcoholic fatty liver disease is the most prevalent chronic liver disorder. It can have catastrophic consequences: unchecked, it can cause liver inflammation (metabolic dysfunction-associated steatohepatitis, MASH), cirrhosis, and even malignancy. Fatty liver disease is often thought to be a direct result of obesity.  Obesity has become increasingly common in rising countries such as India and China, in addition to Europe and the United States. As a result, the number of cases of liver failure and cancer is increasing rapidly in the afflicted countries.','2024-05-16','assets\\cancer.webp',NULL),(14,'ANI','Study finds link between children sleep problems, psychosis in young adults','According to recent study, children who suffer from chronic sleep deprivation from an early age may be more likely to have psychosis in their early adult years.  A large cohort study of children between the ages of six months and seven years old provided data on the duration of sleep at night that researchers from the University of Birmingham analysed.  Throughout this time, they discovered that children who consistently slept less hours had a roughly four-fold increased risk of experiencing a psychotic episode and a more than two-fold increased risk of developing a psychotic condition in early adulthood.','2024-05-16','assets\\sleep.webp',NULL),(15,'ANI','Enjoying nature helps lower inflammation levels','A recent study from Cornell University links the pleasure of nature to a particular biological condition called inflammation.  The results of the study demonstrated an independent relationship between reduced levels of three distinct inflammatory markers in the bloodstream and increased frequency of good interactions with nature.','2024-05-16','assets\\nature.webp',NULL),(17,'ANI','Childhood sedentariness accelerates premature vascular damage','Increased sedentary time beginning in childhood is related with deteriorating arterial stiffness, a surrogate for premature vascular damage. However, light physical activity may help to minimise the risk, finds a new study.  The research was undertaken in partnership with Oxford University, the Universities of Bristol and Exeter, and the University of Eastern Finland, and the findings were published in Acta Physiologica.  A prior study using the same data found that between childhood and young adulthood, sedentary time increased from around 6 to 9 hours per day, increasing the risk of fat obesity, dyslipidaemia, inflammation, and an enlarged heart. The researchers also identified arterial stiffness as a novel risk factor for childhood and teenage obesity, insulin resistance, hypertension, metabolic syndrome, and early heart.','2024-05-16','assets\\Childhood.webp',NULL),(18,'ANI','Unintended weight loss is warning to see doctor','According to a Dana-Farber Cancer Institute study, unintended weight reduction raises the likelihood of receiving a cancer diagnosis during the next year.  \"If you are losing weight and you aren\'t trying to lose weight by making changes in your exercise routine or diet, people should see their doctor to consider possible causes,\" said lead investigator Brian Wolpin, MD, MPH, Director of the Gastrointestinal Cancer Center at Dana-Farber and Director of the Hale Family Center for Pancreatic Cancer Research.  \"There are many conditions that can result in unexpected weight loss. Your doctor can determine if there is something that needs evaluation.\" The findings were published in the Journal of the American Medical Association.','2024-05-16','assets\\weight.webp','Opinion'),(19,'ANI','Unintended weight loss is warning to see doctor','According to a Dana-Farber Cancer Institute study, unintended weight reduction raises the likelihood of receiving a cancer diagnosis during the next year.  \"If you are losing weight and you aren\'t trying to lose weight by making changes in your exercise routine or diet, people should see their doctor to consider possible causes,\" said lead investigator Brian Wolpin, MD, MPH, Director of the Gastrointestinal Cancer Center at Dana-Farber and Director of the Hale Family Center for Pancreatic Cancer Research.  \"There are many conditions that can result in unexpected weight loss. Your doctor can determine if there is something that needs evaluation.\" The findings were published in the Journal of the American Medical Association.','2024-05-16','assets\\weight.webp',NULL),(42,'dfgdfgd','fgfd','dfgdf','2024-07-11','fdgdffdgdfg','Business'),(43,'dex','Prottoy pension scheme: Quader sits with protesting university teachers','desh University Teachers\' Association\'s Secretary General Prof Nizamul Haque Bhuiyan, and Prof Zeenat Huda, general secretary of Dhaka University Teachers\' Association, joined the meeting.\n\nQuader was accompanied by Kamal Abdul Naser Chowdhury, PM\'s advisor on education and culture; Begum Shamsun Naher, state minister for education; AL joint general secretaries Mahbubul Alam Hanif and AFM Bahauddin Nasim; and Biplab Barua, AL o','2024-07-13',NULL,'Bangladesh'),(44,'fgh','gfh','fgh','2024-07-13',NULL,'Bangladesh'),(45,'dfg','we','dfg','2024-07-13',NULL,'Bangladesh'),(46,'','','','2024-07-13',NULL,'Bangladesh'),(47,'bvvb','bbv','vb','2024-07-14',NULL,'Entertainment'),(48,'sf','dsf','sfd','2024-07-14',NULL,'Business'),(49,'hj','mghj','ghj','2024-07-14','ghjghj','Entertainment');
/*!40000 ALTER TABLE `blog` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `comment`
--

DROP TABLE IF EXISTS `comment`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `comment` (
  `comment_id` int(11) NOT NULL AUTO_INCREMENT,
  `blog_id` int(11) DEFAULT NULL,
  `comments` varchar(2000) DEFAULT NULL,
  `publish` tinyint(4) DEFAULT NULL,
  PRIMARY KEY (`comment_id`)
) ENGINE=InnoDB AUTO_INCREMENT=25 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `comment`
--

LOCK TABLES `comment` WRITE;
/*!40000 ALTER TABLE `comment` DISABLE KEYS */;
INSERT INTO `comment` VALUES (2,5,'comment 1',0),(3,5,'ths is fja f',0),(4,5,'comment 3',0),(5,5,'comments 4',1),(6,5,'hello shamim',0),(7,5,' my new comments',0),(8,6,'another comments',0),(9,5,'dfg',0),(10,7,NULL,0),(11,7,'dffg',1),(12,5,'\'pop',0),(13,5,'',0),(14,5,'kjjhk',0),(15,11,'goog post',0),(16,9,'ffgdg',1),(17,17,'hkjh',1),(18,20,'good',1),(19,10,'rrrr',1),(20,5,'rrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrr',1),(21,5,'rter',0),(22,5,'tttttttttttttttttt',1),(23,18,'vch',0),(24,18,'rrrrrrrrrrr',0);
/*!40000 ALTER TABLE `comment` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `reply`
--

DROP TABLE IF EXISTS `reply`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `reply` (
  `reply_id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(300) DEFAULT NULL,
  `reply_date` varchar(30) DEFAULT NULL,
  PRIMARY KEY (`reply_id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `reply`
--

LOCK TABLES `reply` WRITE;
/*!40000 ALTER TABLE `reply` DISABLE KEYS */;
INSERT INTO `reply` VALUES (1,'shamim','30/5/2024');
/*!40000 ALTER TABLE `reply` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `signup`
--

DROP TABLE IF EXISTS `signup`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `signup` (
  `id` int(11) NOT NULL,
  `email` varchar(255) DEFAULT NULL,
  `image` varchar(255) DEFAULT NULL,
  `name` varchar(255) DEFAULT NULL,
  `password` varchar(255) DEFAULT NULL,
  `role` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `signup`
--

LOCK TABLES `signup` WRITE;
/*!40000 ALTER TABLE `signup` DISABLE KEYS */;
INSERT INTO `signup` VALUES (0,NULL,NULL,NULL,NULL,'Visitor'),(66,'rrr',NULL,'rr','66','Visitor'),(67,'tyt@gmail.com',NULL,'rtretg','kjkj','Admin'),(68,'tyt@gmail.com',NULL,'rtretg','kjkj','admin'),(77,'rahat@gmail.com','jjs','rahat ','rahat','admin'),(88,'h','hj','yu','h','h'),(99,'gdfg',NULL,'rahat','99','Admin'),(120,'sdfdsf',NULL,'rahat','120','Admin'),(474,'ghg','gh','hgh','hgh','gh');
/*!40000 ALTER TABLE `signup` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2024-07-15 10:15:03
