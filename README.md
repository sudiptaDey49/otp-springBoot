# otp-springBoot
CREATE database otp_spring;
use otp_spring;


CREATE TABLE IF NOT EXISTS `users` (
  `username` varchar(255) NOT NULL,
  `country` varchar(255) DEFAULT NULL,
  `full_name` varchar(255) DEFAULT NULL,
  `password` varchar(255) DEFAULT NULL,
  `role` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`username`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;


INSERT INTO `users` (`username`, `country`, `full_name`, `password`, `role`) VALUES
('admin', 'India', 'Admin', '$2a$10$Z5F2Elzpnwx6kp0CYLmdo.Tcv8SZWMANvlr/PWr6.IxWWXnAi7KNC', 'ROLE_ADMIN');
