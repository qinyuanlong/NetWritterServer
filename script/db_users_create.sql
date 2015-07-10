

DROP TABLE if EXISTS users;
CREATE TABLE users(
  id VARCHAR(50) PRIMARY KEY ,
  user_name VARCHAR(30),
  password  VARCHAR(30),
  nick      VARCHAR(30),
  create_at TIMESTAMP,
  update_at TIMESTAMP
);


INSERT INTO users VALUE ('aaa','jack','123','jaca lee','2015-01-01 11:11:11','2015-01-01 11:11:11');
INSERT INTO users VALUE ('bbbb','jack1','123','jaca lee111','2015-01-01 11:11:11','2015-01-01 11:11:11');