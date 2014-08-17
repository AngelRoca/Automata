-- MySQL dump 10.13  Distrib 5.5.37, for debian-linux-gnu (x86_64)
--
-- Host: localhost    Database: automata
-- ------------------------------------------------------
-- Server version	5.5.37-1

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `mensajes`
--

DROP TABLE IF EXISTS `mensajes`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `mensajes` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `emisor` varchar(30) DEFAULT '',
  `destinatario` varchar(30) DEFAULT '',
  `asunto` varchar(30) DEFAULT '',
  `mensaje` varchar(100) DEFAULT '',
  `user_id` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=14 DEFAULT CHARSET=latin1 COMMENT='latin1_swedish_ci';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `mensajes`
--

LOCK TABLES `mensajes` WRITE;
/*!40000 ALTER TABLE `mensajes` DISABLE KEYS */;
INSERT INTO `mensajes` VALUES (1,'angel@gmail.com','contacto@empresa.com','quiero comprar cosas','aosidf',1),(2,'angel@gmail.com','contacto@empresa.com','quiero comprar cosas','aosidf',3),(3,'meraly@gmail.com','ventas@empresa.com','compras e informacion por favo','aosjf ojadoifja doifj oiasjdiof aoisjd oi aosidfoiad fo oisjdf oid f',1),(4,'meraly@gmail.com','ventas@empresa.com','compras e informacion por favo','aosjf ojadoifja doifj oiasjdiof aoisjd oi aosidfoiad fo oisjdf oid f',2),(5,'meraly@gmail.com','ventas@empresa.com','compras e informacion por favo','aosjf ojadoifja doifj oiasjdiof aoisjd oi aosidfoiad fo oisjdf oid f',3),(6,'copmrador@gmail.com','informacion@empresa.com','solo informacion','gracias',2),(7,'copmrador@gmail.com','informacion@empresa.com','solo informacion','gracias',3),(8,'unomas@gmail.com','aosdh@empresa.com','solo compras','get mucho ',1),(9,'unomas@gmail.com','aosdh@empresa.com','solo compras','get mucho ',3),(10,'angel@gmail.com','sales@empresa.com','asunto sin asunto','esto solo deberia llegar a contacto',3),(11,'contacto@empresa.com','angel@gmail.com','Empresa.com response','Estimado angel@gmail.com recibimos su mensaje pero tiene poca informacion para ser procesada',4),(12,'contacto@empresa.com','meraly@gmail.com','te amo esposito ','jiji, aqui haciendo una prueba de mensajeria ^^',4),(13,'contacto@empresa.com','meraly@gmail.com','Empresa.com response','Querido meraly@gmail.com su mensaje tiene insuficiente informacion para ser procesado',5);
/*!40000 ALTER TABLE `mensajes` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `usuarios`
--

DROP TABLE IF EXISTS `usuarios`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `usuarios` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `user` varchar(30) DEFAULT '',
  `pass` varchar(8) DEFAULT '',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=latin1 COMMENT='utf8_general_ci';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `usuarios`
--

LOCK TABLES `usuarios` WRITE;
/*!40000 ALTER TABLE `usuarios` DISABLE KEYS */;
INSERT INTO `usuarios` VALUES (1,'sales@empresa.com','upqroo01'),(2,'info@empresa.com','upqroo02'),(3,'contacto@empresa.com','upqroo03'),(4,'angel@gmail.com','12345678'),(5,'meraly@gmail.com','12345678');
/*!40000 ALTER TABLE `usuarios` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2014-08-17  2:50:04
