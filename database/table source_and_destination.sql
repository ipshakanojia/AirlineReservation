DROP TABLE IF EXISTS `source_and_destination`;

CREATE TABLE `source_and_destination` (
  `source` varchar(45) NOT NULL DEFAULT '',
  `destination` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`source`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
