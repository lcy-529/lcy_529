/*
Navicat MySQL Data Transfer

Source Server         : localhost_3306
Source Server Version : 50716
Source Host           : localhost:3306
Source Database       : db_competiton

Target Server Type    : MYSQL
Target Server Version : 50716
File Encoding         : 65001

Date: 2019-12-18 16:07:05
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for competiton_info
-- ----------------------------
DROP TABLE IF EXISTS `competiton_info`;
CREATE TABLE `competiton_info` (
  `compName` varchar(40) COLLATE utf8mb4_unicode_ci NOT NULL,
  `compLevel` varchar(40) COLLATE utf8mb4_unicode_ci DEFAULT NULL,
  `teacId` int(11) DEFAULT NULL,
  `stuId` int(11) DEFAULT NULL,
  `awardCert` varchar(64) COLLATE utf8mb4_unicode_ci DEFAULT NULL COMMENT '获奖证书',
  `guideCert` varchar(64) COLLATE utf8mb4_unicode_ci DEFAULT NULL COMMENT '指导证书',
  `gameCert` varchar(64) COLLATE utf8mb4_unicode_ci DEFAULT NULL COMMENT '比赛证书',
  `subTime` timestamp NULL DEFAULT NULL ON UPDATE CURRENT_TIMESTAMP,
  PRIMARY KEY (`compName`),
  KEY `stuId` (`stuId`),
  KEY `teacId` (`teacId`),
  KEY `compLevel` (`compLevel`),
  CONSTRAINT `compLevel` FOREIGN KEY (`compLevel`) REFERENCES `comp_para` (`compLevel`),
  CONSTRAINT `stuId` FOREIGN KEY (`stuId`) REFERENCES `student` (`stuId`),
  CONSTRAINT `teacId` FOREIGN KEY (`teacId`) REFERENCES `user` (`teacId`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

-- ----------------------------
-- Records of competiton_info
-- ----------------------------
INSERT INTO `competiton_info` VALUES ('国家A比赛', '一等奖', '200201', '2019020402', '', null, null, '2019-12-18 15:50:28');

-- ----------------------------
-- Table structure for comp_para
-- ----------------------------
DROP TABLE IF EXISTS `comp_para`;
CREATE TABLE `comp_para` (
  `compType` int(11) NOT NULL,
  `compLevel` varchar(255) COLLATE utf8mb4_unicode_ci NOT NULL,
  `parameter` float DEFAULT NULL,
  `base` float DEFAULT NULL,
  PRIMARY KEY (`compType`,`compLevel`),
  KEY `compLevel` (`compLevel`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

-- ----------------------------
-- Records of comp_para
-- ----------------------------
INSERT INTO `comp_para` VALUES ('1', '一等奖', '2', '0.119');

-- ----------------------------
-- Table structure for comp_type
-- ----------------------------
DROP TABLE IF EXISTS `comp_type`;
CREATE TABLE `comp_type` (
  `compName` varchar(255) COLLATE utf8mb4_unicode_ci NOT NULL,
  `compType` int(11) NOT NULL,
  PRIMARY KEY (`compName`),
  KEY `compType` (`compType`),
  CONSTRAINT `compType` FOREIGN KEY (`compType`) REFERENCES `comp_para` (`compType`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

-- ----------------------------
-- Records of comp_type
-- ----------------------------
INSERT INTO `comp_type` VALUES ('国家A比赛', '1');

-- ----------------------------
-- Table structure for student
-- ----------------------------
DROP TABLE IF EXISTS `student`;
CREATE TABLE `student` (
  `stuId` int(11) NOT NULL,
  `stuName` varchar(20) COLLATE utf8mb4_unicode_ci DEFAULT NULL,
  `class` varchar(20) COLLATE utf8mb4_unicode_ci DEFAULT NULL,
  PRIMARY KEY (`stuId`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

-- ----------------------------
-- Records of student
-- ----------------------------
INSERT INTO `student` VALUES ('2019020402', '小郎', '计研1902');

-- ----------------------------
-- Table structure for user
-- ----------------------------
DROP TABLE IF EXISTS `user`;
CREATE TABLE `user` (
  `teacId` int(11) NOT NULL,
  `password` varchar(20) COLLATE utf8mb4_unicode_ci NOT NULL,
  `name` varchar(20) COLLATE utf8mb4_unicode_ci DEFAULT NULL,
  `role` varchar(10) COLLATE utf8mb4_unicode_ci DEFAULT NULL,
  `status` int(11) DEFAULT NULL,
  PRIMARY KEY (`teacId`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

-- ----------------------------
-- Records of user
-- ----------------------------
INSERT INTO `user` VALUES ('200201', '123456', '李老师', '教师', '1');
