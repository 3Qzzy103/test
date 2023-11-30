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

 Date: 30/11/2023 15:40:37
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for employee
-- ----------------------------
DROP TABLE IF EXISTS `employee`;
CREATE TABLE `employee`  (
  `id` int(0) NOT NULL AUTO_INCREMENT COMMENT 'id',
  `emp_name` varchar(20) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL COMMENT '职员姓名',
  `sex` varchar(20) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL COMMENT '可选范围[男，女]',
  `age` int(0) NULL DEFAULT NULL COMMENT '年龄',
  `dept_name` varchar(20) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL COMMENT '可选范围[业务部，后勤部，人事部]',
  `emp_degree_name` varchar(20) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL COMMENT '可选范围[大专，本科，研究生]',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 1037 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_0900_ai_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of employee
-- ----------------------------
INSERT INTO `employee` VALUES (1001, '张一', '男', 25, '业务部', '本科');
INSERT INTO `employee` VALUES (1002, '张二', '女', 26, '人事部', '本科');
INSERT INTO `employee` VALUES (1003, '张三', '男', 27, '后勤部', '大专');
INSERT INTO `employee` VALUES (1004, '张四', '女', 28, '人事部', '大专');
INSERT INTO `employee` VALUES (1005, '张五', '男', 29, '后勤部', '大专');
INSERT INTO `employee` VALUES (1006, '张六', '女', 29, '后勤部', '本科');
INSERT INTO `employee` VALUES (1007, '张七', '男', 33, '业务部', '研究生');
INSERT INTO `employee` VALUES (1008, '张八', '男', 32, '业务部', '本科');
INSERT INTO `employee` VALUES (1009, '张九', '女', 33, '业务部', '大专');
INSERT INTO `employee` VALUES (1010, '李一', '女', 45, '业务部', '研究生');
INSERT INTO `employee` VALUES (1011, '李二', '女', 19, '人事部', '本科');
INSERT INTO `employee` VALUES (1012, '李三', '男', 28, '业务部', '研究生');
INSERT INTO `employee` VALUES (1013, '李四', '女', 46, '后勤部', '研究生');
INSERT INTO `employee` VALUES (1014, '李五', '男', 58, '业务部', '大专');
INSERT INTO `employee` VALUES (1015, '李六', '女', 22, '人事部', '研究生');
INSERT INTO `employee` VALUES (1016, '李七', '男', 26, '后勤部', '大专');
INSERT INTO `employee` VALUES (1017, '李八', '男', 25, '人事部', '研究生');
INSERT INTO `employee` VALUES (1018, '李九', '女', 29, '后勤部', '研究生');
INSERT INTO `employee` VALUES (1019, '王一', '男', 45, '后勤部', '本科');
INSERT INTO `employee` VALUES (1020, '王二', '女', 21, '业务部', '本科');
INSERT INTO `employee` VALUES (1021, '王三', '男', 21, '业务部', '大专');
INSERT INTO `employee` VALUES (1022, '王四', '男', 23, '业务部', '大专');
INSERT INTO `employee` VALUES (1023, '王五', '女', 33, '业务部', '大专');
INSERT INTO `employee` VALUES (1024, '王六', '男', 45, '人事部', '本科');
INSERT INTO `employee` VALUES (1025, '王七', '男', 35, '业务部', '研究生');
INSERT INTO `employee` VALUES (1026, '王八', '男', 41, '后勤部', '本科');
INSERT INTO `employee` VALUES (1027, '王九', '女', 25, '业务部', '大专');
INSERT INTO `employee` VALUES (1028, '赵一', '男', 26, '人事部', '研究生');
INSERT INTO `employee` VALUES (1029, '赵二', '男', 20, '后勤部', '本科');
INSERT INTO `employee` VALUES (1030, '赵三', '女', 21, '人事部', '研究生');
INSERT INTO `employee` VALUES (1031, '赵四', '男', 19, '后勤部', '研究生');
INSERT INTO `employee` VALUES (1032, '赵五', '女', 35, '后勤部', '大专');
INSERT INTO `employee` VALUES (1033, '赵六', '男', 24, '业务部', '研究生');
INSERT INTO `employee` VALUES (1034, '赵七', '男', 29, '业务部', '大专');

SET FOREIGN_KEY_CHECKS = 1;
