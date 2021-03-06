CREATE TABLE `customer_info` (
  `no` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `name` varchar(45) NOT NULL DEFAULT '',
  `name_last` varchar(45) DEFAULT NULL,
  `title` varchar(45) DEFAULT NULL,
  `email` varchar(45) DEFAULT NULL,
  `password` varchar(45) DEFAULT NULL,
  `Date` datetime DEFAULT NULL,
  `mobile` int(10) NOT NULL DEFAULT '0',
  `address1` varchar(45) DEFAULT NULL,
  `address2` varchar(45) DEFAULT NULL,
  `city` varchar(45) DEFAULT NULL,
  `state` varchar(45) DEFAULT NULL,
  `country` varchar(45) DEFAULT NULL,
  `pincode` int(10) unsigned DEFAULT NULL,
  `credit_no` int(10) unsigned DEFAULT NULL,
  `credit_validity` datetime DEFAULT NULL,
  `Credit_type` varchar(45) DEFAULT NULL,
  `passport` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`no`,`mobile`,`name`) USING BTREE
) ENGINE=InnoDB AUTO_INCREMENT=10 DEFAULT CHARSET=latin1;
