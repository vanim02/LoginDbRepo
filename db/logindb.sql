-- --------------------------------------------------------
-- Host:                         127.0.0.1
-- Server version:               5.7.15-log - MySQL Community Server (GPL)
-- Server OS:                    Win64
-- HeidiSQL Version:             9.3.0.4984
-- --------------------------------------------------------

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET NAMES utf8mb4 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;

-- Dumping database structure for logindb
CREATE DATABASE IF NOT EXISTS `logindb` /*!40100 DEFAULT CHARACTER SET utf8 */;
USE `logindb`;


-- Dumping structure for table logindb.candidate
CREATE TABLE IF NOT EXISTS `candidate` (
  `username` varchar(20) NOT NULL,
  `firstname` varchar(30) DEFAULT NULL,
  `lastname` varchar(30) DEFAULT NULL,
  `dateofbirth` date DEFAULT NULL,
  `gender` varchar(10) DEFAULT NULL,
  `password` varchar(30) DEFAULT NULL,
  `parentuser` varchar(10) DEFAULT NULL,
  `role` varchar(10) DEFAULT NULL,
  PRIMARY KEY (`username`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- Dumping data for table logindb.candidate: ~10 rows (approximately)
/*!40000 ALTER TABLE `candidate` DISABLE KEYS */;
INSERT INTO `candidate` (`username`, `firstname`, `lastname`, `dateofbirth`, `gender`, `password`, `parentuser`, `role`) VALUES
	('child1', 'c1f1', 'c1l1', '1981-01-19', 'female', 'pass', 'parent1', 'child'),
	('child2', 'c2f2', 'c2l2', '1983-03-03', 'male', 'pass', 'parent2', 'child'),
	('child3', 'c3f3', 'c3l3', '1980-02-04', 'female', 'pass', 'parent1', 'child'),
	('child4', 'c4f4', 'c4l4', '1983-01-19', 'female', 'pass', 'parent2', 'child'),
	('child5', 'c5f5', 'c5l5', '1980-05-19', 'male', 'pass', 'parent1', 'child'),
	('child6', 'c6f6', 'c6l6', '1988-02-04', 'female', 'pass', 'parent2', 'child'),
	('parent1', 'p1f1', 'p1l1', '1962-05-29', 'male', 'pass', NULL, 'parent'),
	('parent2', 'p2f2', 'p2l2', '1960-05-29', 'male', 'pass', NULL, 'parent'),
	('teacher1', 't1f1', 't1l1', '1966-06-09', 'female', 'pass', NULL, 'teacher'),
	('teacher2', 't2f2', 't2l2', '1964-05-29', 'female', 'pass', NULL, 'teacher');
/*!40000 ALTER TABLE `candidate` ENABLE KEYS */;


-- Dumping structure for table logindb.classifierscore
CREATE TABLE IF NOT EXISTS `classifierscore` (
  `violence` decimal(1,1) DEFAULT NULL,
  `sexualAbuse` decimal(1,1) DEFAULT NULL,
  `racism` decimal(1,1) DEFAULT NULL,
  `postid` int(11) NOT NULL,
  PRIMARY KEY (`postid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- Dumping data for table logindb.classifierscore: ~11 rows (approximately)
/*!40000 ALTER TABLE `classifierscore` DISABLE KEYS */;
INSERT INTO `classifierscore` (`violence`, `sexualAbuse`, `racism`, `postid`) VALUES
	(0.0, 0.4, 0.0, 1001),
	(0.0, 0.0, 0.4, 1002),
	(0.4, 0.0, 0.0, 1003),
	(0.0, 0.4, 0.0, 1004),
	(0.4, 0.9, 0.0, 1005),
	(0.0, 0.8, 0.4, 1006),
	(0.9, 0.9, 0.7, 1007),
	(0.3, 0.9, 0.9, 1008),
	(0.3, 0.9, 0.9, 1009),
	(0.9, 0.9, 0.7, 1010),
	(0.4, 0.9, 0.2, 1011);
/*!40000 ALTER TABLE `classifierscore` ENABLE KEYS */;


-- Dumping structure for table logindb.posts
CREATE TABLE IF NOT EXISTS `posts` (
  `postid` int(11) NOT NULL,
  `postType` varchar(20) DEFAULT NULL,
  `content` varchar(100) DEFAULT NULL,
  `postedTime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  `childUsername` varchar(20) DEFAULT NULL,
  PRIMARY KEY (`postid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- Dumping data for table logindb.posts: ~11 rows (approximately)
/*!40000 ALTER TABLE `posts` DISABLE KEYS */;
INSERT INTO `posts` (`postid`, `postType`, `content`, `postedTime`, `childUsername`) VALUES
	(1001, 'text', 'this is a happy post in happy', '2016-11-01 10:31:12', 'child5'),
	(1002, 'text', 'this is a happy post in happy', '2016-11-01 10:30:52', 'child2'),
	(1003, 'text', 'i kill you', '2016-11-01 10:30:59', 'child3'),
	(1004, 'text', 'this is a happy post in happy for hapy hapy happy people', '2016-11-01 10:31:07', 'child4'),
	(1005, 'text', 'this fd is hgo ahfpd onojfa', '2016-11-06 19:35:04', 'child6'),
	(1006, 'text', 'this kfdo fhoad  jcmoa jfods', '2016-11-06 19:34:18', 'child1'),
	(1007, 'text', 'fdsah uytr terw hefgh', '2016-11-05 19:34:18', 'child1'),
	(1008, 'text', 'hapy happy happy happyt happt', '2016-11-06 19:35:04', 'child6'),
	(1009, 'text', 'dsafrywe trtw', '2016-11-05 20:13:04', 'child6'),
	(1010, 'text', 'u urewir opiuewur upofdj', '2016-11-06 21:39:26', 'child1'),
	(1011, 'text', 'fda ioiop ewr knln  pu', '2016-11-06 21:39:48', 'child6');
/*!40000 ALTER TABLE `posts` ENABLE KEYS */;


-- Dumping structure for table logindb.signupdetails
CREATE TABLE IF NOT EXISTS `signupdetails` (
  `username` varchar(20) NOT NULL,
  `firstname` varchar(30) DEFAULT NULL,
  `lastname` varchar(30) DEFAULT NULL,
  `dateofbirth` date DEFAULT NULL,
  `gender` varchar(10) DEFAULT NULL,
  `password` varchar(30) DEFAULT NULL,
  `decision` varchar(10) DEFAULT NULL,
  PRIMARY KEY (`username`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- Dumping data for table logindb.signupdetails: ~11 rows (approximately)
/*!40000 ALTER TABLE `signupdetails` DISABLE KEYS */;
INSERT INTO `signupdetails` (`username`, `firstname`, `lastname`, `dateofbirth`, `gender`, `password`, `decision`) VALUES
	('child1', 'c1f1', 'c1l1', '1981-01-19', 'female', 'pass', 'A'),
	('child2', 'c2f2', 'c2l2', '1983-03-03', 'male', 'pass', 'A'),
	('child3', 'c3f3', 'c3l3', '1980-02-04', 'female', 'pass', 'A'),
	('child4', 'c4f4', 'c4l4', '1983-01-19', 'male', 'pass', 'A'),
	('child5', 'c5f5', 'c5l5', '1980-05-19', 'male', 'pass', 'A'),
	('child6', 'c6f6', 'c6l6', '1988-02-04', 'female', 'pass', 'A'),
	('child7', 'c7f7', 'c7l7', '1981-01-19', 'female', 'pass', 'D'),
	('parent1', 'p1f1', 'p1l1', '1962-05-29', 'male', 'pass', 'A'),
	('parent2', 'p2f2', 'p2l2', '1960-05-29', 'female', 'pass', 'A'),
	('teacher1', 't1f1', 't1l1', '1966-06-09', 'female', 'pass', 'A'),
	('teacher2', 't2f2', 't2l2', '1964-05-29', 'male', 'pass', 'A');
/*!40000 ALTER TABLE `signupdetails` ENABLE KEYS */;


-- Dumping structure for table logindb.threshold
CREATE TABLE IF NOT EXISTS `threshold` (
  `violence` decimal(2,2) DEFAULT NULL,
  `sexualabuse` decimal(2,2) DEFAULT NULL,
  `racism` decimal(2,2) DEFAULT NULL,
  `parentusername` varchar(20) DEFAULT NULL,
  `childusername` varchar(20) NOT NULL,
  PRIMARY KEY (`childusername`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- Dumping data for table logindb.threshold: ~6 rows (approximately)
/*!40000 ALTER TABLE `threshold` DISABLE KEYS */;
INSERT INTO `threshold` (`violence`, `sexualabuse`, `racism`, `parentusername`, `childusername`) VALUES
	(0.90, 0.70, 0.20, 'parent1', 'child1'),
	(0.20, 0.40, 0.60, 'parent2', 'child2'),
	(0.80, 0.80, 0.00, 'parent1', 'child3'),
	(0.70, 0.80, 0.70, 'parent2', 'child4'),
	(0.90, 0.80, 0.70, 'parent1', 'child5'),
	(0.10, 0.80, 0.90, 'parent2', 'child6');
/*!40000 ALTER TABLE `threshold` ENABLE KEYS */;
/*!40101 SET SQL_MODE=IFNULL(@OLD_SQL_MODE, '') */;
/*!40014 SET FOREIGN_KEY_CHECKS=IF(@OLD_FOREIGN_KEY_CHECKS IS NULL, 1, @OLD_FOREIGN_KEY_CHECKS) */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
