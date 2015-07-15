

DROP TABLE if EXISTS users;
CREATE TABLE users(
  id VARCHAR(50) PRIMARY KEY ,
  mail VARCHAR(30),
  password  VARCHAR(30),
  nick      VARCHAR(30),
  create_at TIMESTAMP,
  update_at TIMESTAMP
);


INSERT INTO users VALUE ('aaa','jack@me.com','123','jaca lee','2015-01-01 11:11:11','2015-01-01 11:11:11');
INSERT INTO users VALUE ('bbbb','jack1@me.com','123','jaca lee111','2015-01-01 11:11:11','2015-01-01 11:11:11');