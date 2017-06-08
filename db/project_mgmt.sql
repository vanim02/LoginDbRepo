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

-- Dumping database structure for project_mgmt
CREATE DATABASE IF NOT EXISTS `project_mgmt` /*!40100 DEFAULT CHARACTER SET utf8 */;
USE `project_mgmt`;


-- Dumping structure for table project_mgmt.client
CREATE TABLE IF NOT EXISTS `client` (
  `client_id` int(11) NOT NULL,
  `name` varchar(25) DEFAULT NULL,
  `description` varchar(20) DEFAULT NULL,
  PRIMARY KEY (`client_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- Dumping data for table project_mgmt.client: ~0 rows (approximately)
/*!40000 ALTER TABLE `client` DISABLE KEYS */;
/*!40000 ALTER TABLE `client` ENABLE KEYS */;


-- Dumping structure for table project_mgmt.department
CREATE TABLE IF NOT EXISTS `department` (
  `dept_id` int(11) NOT NULL,
  `dept_name` varchar(40) DEFAULT NULL,
  PRIMARY KEY (`dept_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- Dumping data for table project_mgmt.department: ~0 rows (approximately)
/*!40000 ALTER TABLE `department` DISABLE KEYS */;
/*!40000 ALTER TABLE `department` ENABLE KEYS */;


-- Dumping structure for table project_mgmt.employee
CREATE TABLE IF NOT EXISTS `employee` (
  `emp_id` int(11) NOT NULL,
  `name` varchar(25) DEFAULT NULL,
  `dob` date DEFAULT NULL,
  `password` varchar(20) DEFAULT NULL,
  `zip_id` int(11) DEFAULT NULL,
  `dept_id` int(11) DEFAULT NULL,
  PRIMARY KEY (`emp_id`),
  KEY `zip_id` (`zip_id`),
  KEY `dept_id` (`dept_id`),
  CONSTRAINT `employee_ibfk_1` FOREIGN KEY (`zip_id`) REFERENCES `zip` (`zip_id`),
  CONSTRAINT `employee_ibfk_2` FOREIGN KEY (`dept_id`) REFERENCES `department` (`dept_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- Dumping data for table project_mgmt.employee: ~0 rows (approximately)
/*!40000 ALTER TABLE `employee` DISABLE KEYS */;
/*!40000 ALTER TABLE `employee` ENABLE KEYS */;


-- Dumping structure for table project_mgmt.project
CREATE TABLE IF NOT EXISTS `project` (
  `project_id` int(5) NOT NULL,
  `name` varchar(25) DEFAULT NULL,
  `description` varchar(25) DEFAULT NULL,
  `client_id` int(11) DEFAULT NULL,
  PRIMARY KEY (`project_id`),
  KEY `client_id` (`client_id`),
  CONSTRAINT `project_ibfk_1` FOREIGN KEY (`client_id`) REFERENCES `client` (`client_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- Dumping data for table project_mgmt.project: ~0 rows (approximately)
/*!40000 ALTER TABLE `project` DISABLE KEYS */;
/*!40000 ALTER TABLE `project` ENABLE KEYS */;


-- Dumping structure for table project_mgmt.task
CREATE TABLE IF NOT EXISTS `task` (
  `task_id` int(5) NOT NULL,
  `name` varchar(25) DEFAULT NULL,
  `description` varchar(25) DEFAULT NULL,
  `project_id` int(11) DEFAULT NULL,
  `status_id` int(11) DEFAULT NULL,
  PRIMARY KEY (`task_id`),
  KEY `project_id` (`project_id`),
  KEY `status_id` (`status_id`),
  CONSTRAINT `task_ibfk_1` FOREIGN KEY (`project_id`) REFERENCES `project` (`project_id`),
  CONSTRAINT `task_ibfk_2` FOREIGN KEY (`status_id`) REFERENCES `taskstatus` (`status_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- Dumping data for table project_mgmt.task: ~0 rows (approximately)
/*!40000 ALTER TABLE `task` DISABLE KEYS */;
/*!40000 ALTER TABLE `task` ENABLE KEYS */;


-- Dumping structure for table project_mgmt.taskassigned
CREATE TABLE IF NOT EXISTS `taskassigned` (
  `task_id` int(5) NOT NULL,
  `emp_id` int(11) NOT NULL,
  `timespent` int(11) DEFAULT NULL,
  `timeestimated` int(11) DEFAULT NULL,
  `assignee` int(11) DEFAULT NULL,
  `status_id` int(11) DEFAULT NULL,
  PRIMARY KEY (`task_id`,`emp_id`),
  KEY `status_id` (`status_id`),
  CONSTRAINT `taskassigned_ibfk_1` FOREIGN KEY (`status_id`) REFERENCES `taskstatus` (`status_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- Dumping data for table project_mgmt.taskassigned: ~0 rows (approximately)
/*!40000 ALTER TABLE `taskassigned` DISABLE KEYS */;
/*!40000 ALTER TABLE `taskassigned` ENABLE KEYS */;


-- Dumping structure for table project_mgmt.taskstatus
CREATE TABLE IF NOT EXISTS `taskstatus` (
  `status_id` int(11) NOT NULL,
  `name` varchar(25) DEFAULT NULL,
  `description` varchar(25) DEFAULT NULL,
  PRIMARY KEY (`status_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- Dumping data for table project_mgmt.taskstatus: ~0 rows (approximately)
/*!40000 ALTER TABLE `taskstatus` DISABLE KEYS */;
/*!40000 ALTER TABLE `taskstatus` ENABLE KEYS */;


-- Dumping structure for table project_mgmt.zip
CREATE TABLE IF NOT EXISTS `zip` (
  `zip_id` int(5) NOT NULL,
  `street` varchar(25) DEFAULT NULL,
  `city` varchar(25) DEFAULT NULL,
  `province` varchar(20) DEFAULT NULL,
  `pin` varchar(6) DEFAULT NULL,
  PRIMARY KEY (`zip_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- Dumping data for table project_mgmt.zip: ~0 rows (approximately)
/*!40000 ALTER TABLE `zip` DISABLE KEYS */;
/*!40000 ALTER TABLE `zip` ENABLE KEYS */;
/*!40101 SET SQL_MODE=IFNULL(@OLD_SQL_MODE, '') */;
/*!40014 SET FOREIGN_KEY_CHECKS=IF(@OLD_FOREIGN_KEY_CHECKS IS NULL, 1, @OLD_FOREIGN_KEY_CHECKS) */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
