CREATE DATABASE hnkjs;

DROP TABLE IF EXISTS `banner`;
CREATE TABLE `banner` (
  `id` INT(11) NOT NULL AUTO_INCREMENT,
  `b_imgurl` VARCHAR(100) DEFAULT NULL,
  `b_txt1` VARCHAR(50) DEFAULT NULL,
  `b_txtlink1` VARCHAR(50) DEFAULT NULL,
  `b_txt2` VARCHAR(50) DEFAULT NULL,
  `b_txtlink2` VARCHAR(50) DEFAULT NULL,
  `b_imglink` VARCHAR(100) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=INNODB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8


/*角色表*/
DROP TABLE IF EXISTS `sys_role`;
CREATE TABLE `sys_role` (
  `role_id` INT(11) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `role_key` VARCHAR(30) DEFAULT NULL COMMENT '角色编码',
  `create_time` VARCHAR(30) DEFAULT NULL COMMENT '创建时间',
  `description` VARCHAR(200) DEFAULT NULL COMMENT '描述',
  `role_name` VARCHAR(40) NOT NULL COMMENT '角色名称',
  `company_id` BIGINT(20) DEFAULT NULL COMMENT '部门id',
  PRIMARY KEY (`role_id`)
) ENGINE=INNODB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8 COMMENT='角色表';

/*部门表*/
DROP TABLE IF EXISTS `sys_department`;
CREATE TABLE `sys_department` (
  `id` BIGINT(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `department_key` VARCHAR(20)  NULL COMMENT '部门编码,唯一',
  `department_value` VARCHAR(40)  NULL COMMENT '部门名称',
  `parent_departmentkey_id` INT(11) DEFAULT  NULL COMMENT '上级部门id',
  `description` VARCHAR(200) DEFAULT NULL COMMENT '描述',
  `create_time` VARCHAR(30) DEFAULT NULL COMMENT '创建时间',
  PRIMARY KEY (`id`),
  UNIQUE KEY `uk_sys_department_department_key` (`department_key`)
) ENGINE=INNODB DEFAULT CHARSET=utf8 COMMENT='部门表';

/*菜单表*/
DROP TABLE IF EXISTS `sys_authority`;
CREATE TABLE `sys_authority` (
  `id` BIGINT(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `data_url` VARCHAR(100)  NULL COMMENT '连接路径或方法',
  `menu_class` VARCHAR(50) NULL COMMENT '菜单样式',
  `menu_code` VARCHAR(50)  NULL COMMENT '菜单编码',
  `menu_name` VARCHAR(50)  NULL COMMENT '菜单名称',
  `parent_menucode_id` INT(11) DEFAULT '0' NULL COMMENT '上级菜单id',
  `sequence` BIGINT(20) DEFAULT '0' COMMENT '排序',
  `menu_type` VARCHAR(2) DEFAULT '1' COMMENT '菜单类型(1是左导航菜单 2是按钮权限)',
  `create_time` VARCHAR(30) NOT NULL COMMENT '创建时间',
  PRIMARY KEY (`id`),
  UNIQUE KEY `uk_sys_authority_menu_code` (`menu_code`)
) ENGINE=INNODB DEFAULT CHARSET=utf8 COMMENT='菜单表';

/*插入一条角色数据*/
INSERT INTO `hnkjs`.`sys_role` (
  
  `role_key`,
  `create_time`,
  `description`,
  `role_name`,
  `company_id`
) 
VALUES
  (
    'ROLE_ADMIN',
     '2017-12-20',
     '网站运维，发布文章等', 
     '网站运维',
     '1'
);

/*角色菜单表*/
DROP TABLE IF EXISTS `sys_role_authority`;
CREATE TABLE `sys_role_authority` (
  `id` BIGINT(20) NOT NULL AUTO_INCREMENT COMMENT '主键编号自增长',
  `menu_code` VARCHAR(50) NOT NULL COMMENT '菜单编码',
  `role_key` VARCHAR(40) NOT NULL COMMENT '角色编码',
  `menu_type` INT(11) DEFAULT NULL COMMENT '菜单类型 1 导航 2 按钮',
  PRIMARY KEY (`id`)  
) ENGINE=INNODB DEFAULT CHARSET=utf8 COMMENT='角色菜单表';

/*角色按钮权限表*/
DROP TABLE IF EXISTS `sys_role_permission`;
CREATE TABLE `sys_role_permission` (
  `role_id` INT(11) NOT NULL COMMENT '角色主键编号',
  `permissions` VARCHAR(1000) DEFAULT NULL COMMENT '按钮权限',
  KEY `FK9q28ewrhntqeipl1t04kh1be7` (`role_id`),
  CONSTRAINT `FK9q28ewrhntqeipl1t04kh1be7` FOREIGN KEY (`role_id`) REFERENCES `sys_role` (`role_id`),
  CONSTRAINT `fk_sys_role_permission_role_id` FOREIGN KEY (`role_id`) REFERENCES `sys_role` (`role_id`)
) ENGINE=INNODB DEFAULT CHARSET=utf8 COMMENT='角色按钮权限表';

DROP TABLE IF EXISTS `sys_user`;
CREATE TABLE `sys_user` (
  `user_id` BIGINT(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `login_account` VARCHAR(30) NOT NULL COMMENT '登录账号',
  `login_pass` VARCHAR(65) NOT NULL COMMENT '登录密码',
  `user_name` VARCHAR(20) DEFAULT NULL COMMENT '昵称',
  `user_head` VARCHAR(30) DEFAULT NULL COMMENT '头像',
  `user_phone` VARCHAR(20) DEFAULT NULL COMMENT '手机',
  `user_email` VARCHAR(30) DEFAULT NULL COMMENT '邮箱',
  `user_sex` INT(11) DEFAULT NULL COMMENT '性别',
  `user_birthday` VARCHAR(30) DEFAULT NULL COMMENT '生日',
  `register_time` VARCHAR(30) NOT NULL COMMENT '注册时间',
  `department_key` VARCHAR(20) DEFAULT NULL COMMENT '部门编码',
  PRIMARY KEY (`user_id`),
  UNIQUE KEY `uk_sys_user_login_account` (`login_account`)
) ENGINE=INNODB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8 COMMENT='用户表';


DROP TABLE IF EXISTS `sys_user_role`;
CREATE TABLE `sys_user_role` (
  `user_id` BIGINT(20) NOT NULL COMMENT '用户编号',
  `role_id` INT(20) NOT NULL COMMENT '角色编号',
  PRIMARY KEY (`user_id`,`role_id`),
  KEY `FKhh52n8vd4ny9ff4x9fb8v65qx` (`role_id`),
  CONSTRAINT `FKb40xxfch70f5qnyfw8yme1n1s` FOREIGN KEY (`user_id`) REFERENCES `sys_user` (`user_id`),
  CONSTRAINT `FKhh52n8vd4ny9ff4x9fb8v65qx` FOREIGN KEY (`role_id`) REFERENCES `sys_role` (`role_id`),
  CONSTRAINT `fk_sys_user_role_role_id` FOREIGN KEY (`role_id`) REFERENCES `sys_role` (`role_id`),
  CONSTRAINT `fk_sys_user_role_user_id` FOREIGN KEY (`user_id`) REFERENCES `sys_user` (`user_id`)
) ENGINE=INNODB DEFAULT CHARSET=utf8 COMMENT='用户角色映射表';
