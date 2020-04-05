DROP TABLE IF EXISTS `student`;
CREATE TABLE `student` (
  `id` BIGINT(11) NOT NULL AUTO_INCREMENT COMMENT '自增id',
  `name` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci DEFAULT NULL COMMENT '姓名',
  `email` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci DEFAULT NULL COMMENT 'email',
  `age` int(11) DEFAULT '0' COMMENT '年龄',
  `is_deleted` int(1) DEFAULT '0' COMMENT '删除标志(0未删除,1删除)',
  `gtc_time` timestamp NULL DEFAULT NULL COMMENT '年龄',
  `gtu_time` timestamp NULL DEFAULT NULL COMMENT '年龄',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci ROW_FORMAT=DYNAMIC COMMENT='学习->学生表';
