CREATE TABLE `card_info` (
	`id` INT(11) NOT NULL AUTO_INCREMENT COMMENT 'id',
	`card_no` VARCHAR(19) NOT NULL DEFAULT '0000000000000000000' COMMENT '卡号',
	`card_type` CHAR(1) NOT NULL DEFAULT '0' COMMENT '卡类型',
	`id_no` VARCHAR(20) NOT NULL DEFAULT '00000000000000000' COMMENT '证件号',
	`id_type` CHAR(1) NOT NULL DEFAULT '1' COMMENT '证件类型',
	`user_zh_name` VARCHAR(30) NULL DEFAULT NULL COMMENT '持卡人中文名',
	`user_en_name` VARCHAR(30) NULL DEFAULT NULL COMMENT '持卡人英文名',
	`mobile_phone` VARCHAR(11) NULL DEFAULT NULL COMMENT '手机号码',
	`telephone` VARCHAR(11) NULL DEFAULT NULL,
	`home_address` VARCHAR(120) NULL DEFAULT NULL COMMENT '家庭地址',
	`company_address` VARCHAR(120) NULL DEFAULT NULL COMMENT '公司地址',
	`validity_date` DATE NULL DEFAULT NULL COMMENT '有效期',
	`open_time` DATETIME NULL DEFAULT NULL COMMENT '开卡日期',
	`act_time` DATETIME NULL DEFAULT NULL COMMENT '激活日期',
	`card_status` CHAR(1) NOT NULL DEFAULT '0' COMMENT '卡状态',
	`create_time` DATETIME NULL DEFAULT NULL COMMENT '创建时间',
	`create_oper` VARCHAR(30) NULL DEFAULT NULL COMMENT '创建人',
	`modify_time` DATETIME NULL DEFAULT NULL COMMENT '修改时间',
	`modify_oper` VARCHAR(30) NULL DEFAULT NULL COMMENT '修改人',
	PRIMARY KEY (`id`)
)
COMMENT='用户卡号信息表'
COLLATE='utf8_general_ci'
ENGINE=InnoDB
AUTO_INCREMENT=2;

INSERT INTO `card_info` (`id`, `card_no`, `card_type`, `id_no`, `id_type`, `user_zh_name`, `user_en_name`, `mobile_phone`, `telephone`, `home_address`, `company_address`, `validity_date`, `open_time`, `act_time`, `card_status`, `create_time`, `create_oper`, `modify_time`, `modify_oper`) VALUES (1, '6228123443217890', '1', '441224188010103221', '1', NULL, NULL, '1824752895', NULL, '广东', NULL, NULL, NULL, NULL, '1', NULL, NULL, NULL, NULL);
