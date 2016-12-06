/*
Navicat MySQL Data Transfer

Source Server         : MySQL5.5
Source Server Version : 50528
Source Host           : 127.0.0.1:3306
Source Database       : mybatis

Target Server Type    : MYSQL
Target Server Version : 50528
File Encoding         : 65001

Date: 2016-12-05 14:27:27
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for t_roles
-- ----------------------------
DROP TABLE IF EXISTS `t_roles`;
CREATE TABLE `t_roles` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `role_name` varchar(60) NOT NULL,
  `create_date` datetime NOT NULL,
  `note` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of t_roles
-- ----------------------------
INSERT INTO `t_roles` VALUES ('1', 'zhangsan', '2016-12-01 20:48:29', 'test data');
SET FOREIGN_KEY_CHECKS=1;
