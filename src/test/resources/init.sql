CREATE TABLE user (
                                 id INT NOT NULL,
                                 name VARCHAR(255) UNIQUE ,
                                 PRIMARY KEY (id));

INSERT INTO user (id, name) VALUES (1, "test");
-- show tables;