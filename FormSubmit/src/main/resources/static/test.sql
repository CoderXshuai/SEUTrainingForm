/*
 Navicat Premium Data Transfer

 Source Server         : localhost_3306
 Source Server Type    : MySQL
 Source Server Version : 80028
 Source Host           : localhost:3306
 Source Schema         : test

 Target Server Type    : MySQL
 Target Server Version : 80028
 File Encoding         : 65001

 Date: 16/02/2023 17:23:12
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for user
-- ----------------------------
DROP TABLE IF EXISTS `user`;
CREATE TABLE `user`  (
  `id` bigint NOT NULL AUTO_INCREMENT,
  `name` varchar(255)  NULL DEFAULT NULL,
  `num` int NULL DEFAULT NULL,
  `age` int NULL DEFAULT NULL,
  `birthday` date NULL DEFAULT NULL,
  `sex` varchar(255)  NULL DEFAULT NULL,
  `province` varchar(255)  NULL DEFAULT NULL,
  `city` varchar(255)  NULL DEFAULT NULL,
  `intro` varchar(255)  NULL DEFAULT NULL,
  `hobby` json NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of user
-- ----------------------------
INSERT INTO `user` VALUES (2, 'd', 2, 2, '2023-02-08', '0', '天津市', '河东区', 'dede', '[\"read\", \"movie\", \"write\"]');

SET FOREIGN_KEY_CHECKS = 1;
