-- ddl.sql
CREATE DATABASE IF NOT EXISTS `mydb1` CHARACTER SET utf8;
use `mydb1`;
 
DROP TABLE IF EXISTS `contacts`;
CREATE TABLE `contacts` (
  `form_id` int unsigned NOT NULL,
  `field_name` varchar(127) CHARACTER SET utf8 DEFAULT NULL,
  `field_value` longtext CHARACTER SET utf8
) ENGINE=InnoDB CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;
 