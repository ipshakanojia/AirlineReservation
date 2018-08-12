DROP TABLE IF EXISTS `flight_details`;

CREATE TABLE `flight_details` (
  `flight_number` varchar(45) NOT NULL DEFAULT '',
  `source` varchar(45) DEFAULT NULL,
  `destination` varchar(45) DEFAULT NULL,
  `fare` int(10) unsigned DEFAULT NULL,
  `flight_name` varchar(45) DEFAULT NULL,
  `date` datetime DEFAULT NULL,
  `arrival_time` varchar(45) DEFAULT NULL,
  `departure_time` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`flight_number`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
