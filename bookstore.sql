/*
SQLyog 企业版 - MySQL GUI v7.14 
MySQL - 5.5.22 : Database - bookstore
*********************************************************************
*/

/*!40101 SET NAMES utf8 */;

/*!40101 SET SQL_MODE=''*/;

/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;

CREATE DATABASE /*!32312 IF NOT EXISTS*/`bookstore` /*!40100 DEFAULT CHARACTER SET latin1 */;

USE `bookstore`;

/*Table structure for table `booktype` */

DROP TABLE IF EXISTS `booktype`;

CREATE TABLE `booktype` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `bookTypeName` varchar(20) CHARACTER SET utf8 DEFAULT NULL,
  `bookTypeDesc` varchar(100) CHARACTER SET utf8 DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=latin1;

/*Data for the table `booktype` */

insert  into `booktype`(`id`,`bookTypeName`,`bookTypeDesc`) values (1,'Literature','so good'),(3,'Science','fantastic'),(4,'Love','forever love'),(5,'Magic',NULL);

/*Table structure for table `buy` */

DROP TABLE IF EXISTS `buy`;

CREATE TABLE `buy` (
  `bookname` varchar(30) DEFAULT NULL,
  `author` varchar(30) DEFAULT NULL,
  `price` float DEFAULT NULL,
  `press` varchar(30) DEFAULT NULL,
  `amount` int(11) DEFAULT NULL,
  `time` varchar(50) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `buy` */

insert  into `buy`(`bookname`,`author`,`price`,`press`,`amount`,`time`) values ('Les Trois Mousquetaires','Dumas',36,'public press',50,'2016-07-14 23:50:49'),('The life and strange ','Daniel Defoe',32,'A press',200,'2016-07-14 23:55:04'),('a','b',30,'c',545,'2016-07-15 09:54:50');

/*Table structure for table `sale` */

DROP TABLE IF EXISTS `sale`;

CREATE TABLE `sale` (
  `bookname` varchar(30) DEFAULT NULL,
  `author` varchar(30) DEFAULT NULL,
  `price` float DEFAULT NULL,
  `press` varchar(30) DEFAULT NULL,
  `amount` int(11) DEFAULT NULL,
  `time` varchar(50) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `sale` */

insert  into `sale`(`bookname`,`author`,`price`,`press`,`amount`,`time`) values ('a','b',30,'c',545,'2016-07-15 09:56:38');

/*Table structure for table `stock` */

DROP TABLE IF EXISTS `stock`;

CREATE TABLE `stock` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `bookname` varchar(50) CHARACTER SET utf8 DEFAULT NULL,
  `author` varchar(20) CHARACTER SET utf8 DEFAULT NULL,
  `price` float DEFAULT NULL,
  `press` varchar(20) CHARACTER SET utf8 DEFAULT NULL,
  `amount` int(11) DEFAULT NULL,
  `bookDesc` varchar(100) CHARACTER SET utf8 DEFAULT NULL,
  `bookTypeId` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `FK_stock` (`bookTypeId`),
  CONSTRAINT `FK_stock` FOREIGN KEY (`bookTypeId`) REFERENCES `booktype` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=13 DEFAULT CHARSET=latin1;

/*Data for the table `stock` */

insert  into `stock`(`id`,`bookname`,`author`,`price`,`press`,`amount`,`bookDesc`,`bookTypeId`) values (1,'Les Trois Mousquetaires','Dumas',36,'public press',50,'good book',1),(3,'Gulliver\'s Travels','Daniel Defoe',21,'B press',66,NULL,3),(10,'The life and strange surprising adventures','Daniel Defoe',25,'A press',200,'fantastic',5),(11,'The life and strange ','Daniel Defoe',32,'A press',200,'',5),(12,'a','b',30,'c',500,'',3);

/*Table structure for table `user` */

DROP TABLE IF EXISTS `user`;

CREATE TABLE `user` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `username` varchar(20) CHARACTER SET utf8 DEFAULT NULL,
  `password` varchar(20) CHARACTER SET utf8 DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=latin1;

/*Data for the table `user` */

insert  into `user`(`id`,`username`,`password`) values (1,'yhx','123456'),(2,'admin','123456'),(3,'b','123'),(4,'rrr','123'),(5,'aaa','123');

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
