-- -----------------------------------------------------
-- Table `t_account_user`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `t_account_user` (
  `id` INT NOT NULL AUTO_INCREMENT COMMENT '',
  `type` TINYINT(4) NOT NULL COMMENT '用户类型。0：x 1：xx 2：xxx',
  `name` VARCHAR(32) NOT NULL COMMENT '用户名',
  `password` VARCHAR(100) NOT NULL COMMENT '密码',
  `nickName` VARCHAR(20) NOT NULL COMMENT '昵称',
  `thumbnail` VARCHAR(255) NULL COMMENT '头像URL',
  `created` TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '',
  `updated` TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '',
  `deleted` TINYINT(1) NOT NULL DEFAULT 0 COMMENT '',
  PRIMARY KEY (`id`)  COMMENT '')
  COMMENT = '用户';