CREATE DATABASE IF NOT EXISTS `demo`;
USE demo;

CREATE TABLE IF NOT EXISTS `user`
(
    `id`   BIGINT UNSIGNED AUTO_INCREMENT PRIMARY KEY NOT NULL COMMENT '主键',
    `name` VARCHAR(20)                                NOT NULL COMMENT '名称',
    INDEX `idx_user_name` (`name`) USING BTREE
) ENGINE = INNODB
  DEFAULT CHARSET = UTF8MB4
  COLLATE UTF8MB4_bin COMMENT = '用户';