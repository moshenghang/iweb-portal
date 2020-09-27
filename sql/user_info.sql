CREATE TABLE `user_info` (
	`user_id` BIGINT(20) NOT NULL AUTO_INCREMENT,
	`user_name` VARCHAR(30) NOT NULL DEFAULT '0',
	`login_account` VARCHAR(20) NOT NULL DEFAULT '0',
	`login_password` VARCHAR(30) NOT NULL DEFAULT '0',
	PRIMARY KEY (`user_id`)
)
COMMENT='用户信息表'
COLLATE='utf8_general_ci'
ENGINE=InnoDB
AUTO_INCREMENT=2;

INSERT INTO `user_info` (`user_id`, `user_name`, `login_account`, `login_password`) VALUES (1, 'moshenghang', 'msh', '123');
