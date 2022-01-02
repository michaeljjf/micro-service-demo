CREATE TABLE `order_info` (
  `oid` int(11) NOT NULL AUTO_INCREMENT,
  `onumber` varchar(255) DEFAULT NULL,
  `oprice` decimal(18,4) DEFAULT NULL,
  PRIMARY KEY (`oid`)
) ENGINE=InnoDB AUTO_INCREMENT=42 DEFAULT CHARSET=utf8mb4;

CREATE TABLE `goods_info` (
  `gid` int(11) NOT NULL AUTO_INCREMENT,
  `gname` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`gid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;