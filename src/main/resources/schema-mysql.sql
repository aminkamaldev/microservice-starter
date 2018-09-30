CREATE TABLE IF NOT EXISTS `employee` (
  `id` VARCHAR(32) NOT NULL,
  `username` VARCHAR(32) NOT NULL,
  `password` VARCHAR(32),
  PRIMARY KEY (`id`)
) ENGINE=InnoDB  DEFAULT CHARSET=latin1;