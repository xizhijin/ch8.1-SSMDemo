/*
Navicat MySQL Data Transfer

Source Server         : MySQL5.5
Source Server Version : 50528
Source Host           : 127.0.0.1:3306
Source Database       : mybatis

Target Server Type    : MYSQL
Target Server Version : 50528
File Encoding         : 65001

Date: 2016-12-05 14:27:56
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for t_users
-- ----------------------------
DROP TABLE IF EXISTS `t_users`;
CREATE TABLE `t_users` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `user_name` varchar(60) NOT NULL,
  `birthday` date NOT NULL,
  `sex` varchar(2) NOT NULL,
  `mobile` varchar(20) NOT NULL,
  `email` varchar(60) DEFAULT NULL,
  `note` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of t_users
-- ----------------------------
SET FOREIGN_KEY_CHECKS=1;
