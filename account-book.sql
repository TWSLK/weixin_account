/*
Navicat MySQL Data Transfer

Source Server         : localhost
Source Server Version : 50626
Source Host           : localhost:3306
Source Database       : account-book

Target Server Type    : MYSQL
Target Server Version : 50626
File Encoding         : 65001

Date: 2020-02-24 13:41:39
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for account
-- ----------------------------
DROP TABLE IF EXISTS `account`;
CREATE TABLE `account` (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '主键ID',
  `spendWay` varchar(10) DEFAULT NULL COMMENT '花费方式',
  `date` date DEFAULT NULL COMMENT '日期',
  `remarks` varchar(255) DEFAULT NULL COMMENT '备注',
  `spendMoney` decimal(10,2) DEFAULT NULL COMMENT '花费',
  `spendWayImg` varchar(255) DEFAULT NULL COMMENT '花费类型图片',
  `openId` varchar(50) DEFAULT NULL COMMENT '小程序的openId',
  PRIMARY KEY (`id`),
  KEY `index_openId` (`openId`)
) ENGINE=InnoDB AUTO_INCREMENT=13 DEFAULT CHARSET=utf8mb4;

-- ----------------------------
-- Records of account
-- ----------------------------
INSERT INTO `account` VALUES ('11', '饮食', '2020-02-24', '丸子', '25.00', '../../img/food_p.png', 'oPPFp5M5KJs96Zo3VGKV3QitaIFI');
INSERT INTO `account` VALUES ('12', '交通', '2020-02-24', '旅游', '200.00', '../../img/traffic_p.png', 'oPPFp5M5KJs96Zo3VGKV3QitaIFI');
