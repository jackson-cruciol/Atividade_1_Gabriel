-- MariaDB dump 10.19  Distrib 10.4.28-MariaDB, for Win64 (AMD64)
--
-- Host: localhost    Database: Cadastro_Pessoa
-- ------------------------------------------------------
-- Server version	10.4.28-MariaDB

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `pessoa_endereco`
--

DROP TABLE IF EXISTS `pessoa_endereco`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `pessoa_endereco` (
  `id_pessoa` int(11) NOT NULL AUTO_INCREMENT,
  `nome` varchar(50) NOT NULL,
  `data_nascimento` date NOT NULL,
  `genero` varchar(20) NOT NULL,
  `email` varchar(50) NOT NULL,
  `logradouro` varchar(60) NOT NULL,
  `complemento` varchar(50) DEFAULT NULL,
  `bairro` varchar(50) NOT NULL,
  `cidade` varchar(70) NOT NULL,
  `estado` varchar(60) NOT NULL,
  PRIMARY KEY (`id_pessoa`)
) ENGINE=InnoDB AUTO_INCREMENT=20 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `pessoa_endereco`
--

LOCK TABLES `pessoa_endereco` WRITE;
/*!40000 ALTER TABLE `pessoa_endereco` DISABLE KEYS */;
INSERT INTO `pessoa_endereco` VALUES (1,'Jackson Cruciol','2000-01-13','masculino','jacksoncarno157@gmail.com','rua 3 q1 lt 18','centro','vista alegre','Urutai','goias'),(3,'joao marcus','2002-08-06','masculino','joaomarcos123@gmail.com','rua 3 q1 lt 18','centro','vista alegre','Urutai','goias'),(4,'Jo?o Marcus','2002-08-06','masculino','joaomarcus123@gmail.com','Rua 3, Q1, Lt 18','Centro','Vista Alegre','Uruta?','Goi?s'),(5,'Maria Silva','1995-12-15','feminino','maria.silva@example.com','Av. Principal 123','Apartamento 2A','Bela Vista','S?o Paulo','SP'),(6,'Pedro Rodrigues','1989-07-20','masculino','pedro.rodrigues@example.com','Rua das Flores 45','Casa 3','Centro','Curitiba','PR'),(7,'Ana Souza','2001-12-10','feminino','ana.souza@example.com','Rua da Praia 7','Bloco B','Beira Mar','Fortaleza','CE'),(8,'Rafael Oliveira','1998-09-05','masculino','rafael.oliveira@example.com','Av. Central 89','Apt 10','Centro','Rio de Janeiro','RJ'),(9,'L?cia Santos','2003-01-25','feminino','lucia.santos@example.com','Rua do Sol 55','Bloco C','Vila Nova','Porto Alegre','RS'),(10,'Fernando Carvalho','1992-10-03','masculino','fernando.carvalho@example.com','Av. das Palmeiras 17','Apt 4B','Centro','Belo Horizonte','MG'),(11,'Mariana Lima','2000-04-18','feminino','mariana.lima@example.com','Rua das Flores 78','Apt 12A','Jardins','S?o Paulo','SP'),(12,'Gustavo Ferreira','1995-11-30','masculino','gustavo.ferreira@example.com','Av. Principal 21','Casa 8','Centro','Curitiba','PR'),(13,'Carolina Alves','2002-08-10','feminino','carolina.alves@example.com','Rua das Palmeiras 67','Apt 12A','Centro','S?o Paulo','SP'),(14,'Ricardo Santos','1999-08-22','masculino','ricardo.santos@example.com','Av. da Praia 123','Apartamento 5C','Beira Mar','Fortaleza','CE'),(15,'Juliana Oliveira','2000-01-12','feminino','juliana.oliveira@example.com','Rua das Palmeiras 67','Casa 3','Centro','Rio de Janeiro','RJ'),(16,'Paulo Mendes','1993-05-08','masculino','paulo.mendes@example.com','Av. da Liberdade 32','Apt 7D','Jardim Europa','S?o Paulo','SP'),(17,'Aline Pereira','1996-02-19','feminino','aline.pereira@example.com','Rua do Lago 10','Bloco B','Lagoa Azul','Manaus','AM'),(18,'Lucas Silva','1991-07-27','masculino','lucas.silva@example.com','Av. das Flores 45','Apt 9B','Centro','Belo Horizonte','MG'),(19,'Camila Rodrigues','2004-09-03','feminino','camila.rodrigues@example.com','Rua da Praia 25','Casa 6','Beira Mar','Fortaleza','CE');
/*!40000 ALTER TABLE `pessoa_endereco` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `telefone`
--

DROP TABLE IF EXISTS `telefone`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `telefone` (
  `id_telefone` int(11) NOT NULL AUTO_INCREMENT,
  `ddd` int(11) DEFAULT NULL,
  `numero` int(11) NOT NULL,
  `id_pessoa` int(11) DEFAULT NULL,
  PRIMARY KEY (`id_telefone`),
  KEY `id_pessoa` (`id_pessoa`),
  CONSTRAINT `telefone_ibfk_1` FOREIGN KEY (`id_pessoa`) REFERENCES `pessoa_endereco` (`id_pessoa`)
) ENGINE=InnoDB AUTO_INCREMENT=38 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `telefone`
--

LOCK TABLES `telefone` WRITE;
/*!40000 ALTER TABLE `telefone` DISABLE KEYS */;
INSERT INTO `telefone` VALUES (1,64,992740154,1),(3,52,992998877,3),(4,64,999453676,3),(5,31,993457860,4),(6,31,993457860,4),(7,11,987654321,4),(8,21,987123456,5),(9,41,998877665,5),(10,51,996633225,6),(11,32,992288445,6),(12,22,987654321,7),(13,42,998877665,7),(14,52,996633225,8),(15,33,992288445,8),(16,23,987654321,9),(17,43,998877665,9),(18,53,996633225,10),(19,34,992288445,10),(20,24,987654321,11),(21,44,998877665,11),(22,54,996633225,12),(23,35,992288445,12),(24,25,987654321,13),(25,45,998877665,13),(26,55,996633225,14),(27,36,992288445,14),(28,26,987654321,15),(29,46,998877665,15),(30,56,996633225,16),(31,37,992288445,16),(32,27,987654321,17),(33,47,998877665,17),(34,57,996633225,18),(35,38,992288445,18),(36,28,987654321,19),(37,48,998877665,19);
/*!40000 ALTER TABLE `telefone` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2023-09-08 18:36:59
