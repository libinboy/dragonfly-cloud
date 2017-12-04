/*
Navicat MySQL Data Transfer

Source Server         : localhost
Source Server Version : 50717
Source Host           : localhost:3306
Source Database       : dragonfly

Target Server Type    : MYSQL
Target Server Version : 50717
File Encoding         : 65001

Date: 2017-12-04 19:36:20
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for `t_joke`
-- ----------------------------
DROP TABLE IF EXISTS `t_joke`;
CREATE TABLE `t_joke` (
  `joke_id` int(12) NOT NULL AUTO_INCREMENT,
  `joke_content` varchar(512) DEFAULT NULL,
  PRIMARY KEY (`joke_id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of t_joke
-- ----------------------------
INSERT INTO `t_joke` VALUES ('1', '如果你得罪了老板，失去的只是一份工作；如果你得罪了客户，失去的不过是一份订单；是的，世上只有一个人可以得罪：你给她脸色看，你冲她发牢骚，你大声顶撞她，甚至当 着她的面摔碗，她都不会记恨你，原因很简单，因为她是你的母亲。');
INSERT INTO `t_joke` VALUES ('2', '悟空和唐僧一起上某卫视非诚勿扰,悟空上台,24盏灯全灭。理由:1.没房没车只有一根破棍. 2.保镖职业危险.3.动不动打妖精,对女生不温柔. 4.坐过牢,曾被压五指山下500年。唐僧上台，哗!灯全亮。 理由:1.公务员； 2.皇上兄弟，后台最硬 3.精通梵文等外语 4.长得帅 5.最关键一点：有宝马！');
INSERT INTO `t_joke` VALUES ('3', '一年奔波，尘缘遇了谁；一句珍重，天涯别了谁；一点灵犀，凭栏忆了谁；一种相思，闲愁予了谁；一江明月，豪情酬了谁；一场冬雪，烟波忘了谁；一壶浊酒，相逢醉了谁；一世浮生，轻狂撩了谁；一封短信，才情念了谁；一番思量，谁是谁的谁 ；一枚围脖，转发回复谁.....');

-- ----------------------------
-- Table structure for `t_user`
-- ----------------------------
DROP TABLE IF EXISTS `t_user`;
CREATE TABLE `t_user` (
  `user_id` int(20) NOT NULL AUTO_INCREMENT,
  `account` varchar(50) DEFAULT NULL COMMENT '鐧婚檰甯愭埛',
  `password` varchar(256) DEFAULT NULL COMMENT '瀵嗙爜',
  `user_name` varchar(128) DEFAULT NULL COMMENT '濮撳悕',
  PRIMARY KEY (`user_id`),
  UNIQUE KEY `user_account` (`account`)
) ENGINE=InnoDB AUTO_INCREMENT=23 DEFAULT CHARSET=utf8 COMMENT='鐢ㄦ埛绠＄悊';

-- ----------------------------
-- Records of t_user
-- ----------------------------
INSERT INTO `t_user` VALUES ('1', 'libin', '123', '李彬');
INSERT INTO `t_user` VALUES ('2', 'libin2', '123', '李彬');
INSERT INTO `t_user` VALUES ('3', 'libin3', '123', '李彬');
INSERT INTO `t_user` VALUES ('4', 'libin4', '123', '李彬');
INSERT INTO `t_user` VALUES ('5', 'libin5', '123', '李彬');
INSERT INTO `t_user` VALUES ('6', 'libin6', '123', '李彬');
INSERT INTO `t_user` VALUES ('7', 'libin7', '123', '李彬');
INSERT INTO `t_user` VALUES ('8', 'libin8', '123', '李彬');
INSERT INTO `t_user` VALUES ('9', 'libin9', '123', '李彬');
INSERT INTO `t_user` VALUES ('10', 'libin10', '123', '李彬');
INSERT INTO `t_user` VALUES ('11', 'libin11', '123', '李彬');
INSERT INTO `t_user` VALUES ('12', 'libin12', '123', '李彬');
INSERT INTO `t_user` VALUES ('13', 'libin13', '123', '李彬');
INSERT INTO `t_user` VALUES ('14', '1', '2', '3');
INSERT INTO `t_user` VALUES ('16', 'admin', '123', 'admin');
INSERT INTO `t_user` VALUES ('17', 'aaa', 'aaa', 'aaa');
INSERT INTO `t_user` VALUES ('18', 'bbb', 'bbb', 'bbb');
INSERT INTO `t_user` VALUES ('19', 'ccc', 'ccc', 'ccc');
INSERT INTO `t_user` VALUES ('20', 'ddd', 'ddd', 'ddd');
INSERT INTO `t_user` VALUES ('21', 'eee', 'eee', 'eee');
INSERT INTO `t_user` VALUES ('22', 'fff', 'fff', 'fff');
