/*
 Navicat Premium Data Transfer

 Source Server         : ETmysql
 Source Server Type    : MySQL
 Source Server Version : 80029
 Source Host           : localhost:3306
 Source Schema         : et2209

 Target Server Type    : MySQL
 Target Server Version : 80029
 File Encoding         : 65001

 Date: 30/11/2023 15:40:30
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for sys_user
-- ----------------------------
DROP TABLE IF EXISTS `sys_user`;
CREATE TABLE `sys_user`  (
  `id` bigint(0) NOT NULL AUTO_INCREMENT COMMENT 'id',
  `username` varchar(64) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '用户名',
  `password` varchar(128) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '密码',
  `email` varchar(64) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '邮箱',
  `age` int(0) NULL DEFAULT NULL COMMENT '年龄',
  `state` int(0) NULL DEFAULT 1 COMMENT '状态: 1激活, 0 未激活',
  `visit` bigint(0) NULL DEFAULT 0 COMMENT '访问量， Spring AOP测试',
  `money` int(0) NULL DEFAULT 1000 COMMENT '余额, Spring事务中测试',
  `create_time` datetime(0) NULL DEFAULT NULL,
  PRIMARY KEY (`id`) USING BTREE,
  UNIQUE INDEX `idx_unique_username`(`username`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 19 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of sys_user
-- ----------------------------
INSERT INTO `sys_user` VALUES (1, 'zs', 'e10adc3949ba59abbe56e057f20f883e', NULL, 1, 1, 21, 1000, '2023-01-04 17:46:10');
INSERT INTO `sys_user` VALUES (2, 'lisi', 'e10adc3949ba59abbe56e057f20f883e', NULL, 1, 1, 0, 1000, '2023-01-04 17:46:13');
INSERT INTO `sys_user` VALUES (3, 'wanghu', 'e10adc3949ba59abbe56e057f20f883e', NULL, 1, 1, 0, 1000, '2023-01-04 17:46:13');
INSERT INTO `sys_user` VALUES (5, 'zs22222', 'e10adc3949ba59abbe56e057f20f883e', 'zs@qq.com', 20, 1, 0, 1000, '2023-01-31 17:06:19');
INSERT INTO `sys_user` VALUES (7, 'zs222222', 'e10adc3949ba59abbe56e057f20f883e', '431103832@qq.com', 20, 1, 0, 1000, '2023-01-31 17:39:20');
INSERT INTO `sys_user` VALUES (8, 'zzy', 'e10adc3949ba59abbe56e057f20f883e', '431103832@qq.com', 20, 1, 0, 1000, '2023-02-01 09:56:40');
INSERT INTO `sys_user` VALUES (9, 'zzy123', NULL, '1037219406', 100, 1, 0, 1000, '2023-02-07 15:54:56');
INSERT INTO `sys_user` VALUES (10, 'lll', NULL, '1234156', 33, 1, 0, 1000, '2023-02-07 15:55:43');
INSERT INTO `sys_user` VALUES (11, 'formUser', NULL, NULL, NULL, 1, 0, 1000, '2023-02-07 16:58:39');
INSERT INTO `sys_user` VALUES (12, 'jsonUser', NULL, NULL, NULL, 1, 0, 1000, '2023-02-07 16:58:56');
INSERT INTO `sys_user` VALUES (13, 'restUser2', NULL, NULL, NULL, 1, 0, 1000, '2023-02-07 17:38:04');
INSERT INTO `sys_user` VALUES (14, 'restForm', NULL, '', NULL, 1, 0, 1000, '2023-02-07 17:44:08');
INSERT INTO `sys_user` VALUES (16, 'restForm2', NULL, '', NULL, 1, 0, 1000, '2023-02-07 17:44:20');
INSERT INTO `sys_user` VALUES (17, 'restUserx', NULL, NULL, NULL, 1, 0, 1000, '2023-02-08 00:09:04');
INSERT INTO `sys_user` VALUES (18, 'restFormx', NULL, '', NULL, 1, 0, 1000, '2023-02-08 00:11:05');

SET FOREIGN_KEY_CHECKS = 1;
