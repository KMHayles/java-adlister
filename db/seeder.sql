USE adlister_db;

INSERT INTO users (username, email, password) VALUES ('bob123', 'bob@gmail.com','password');

INSERT INTO ads (user_id, title, description) VALUES
(1, 'TEST AD 1', 'THIS IS A TEST 1'),
(1, 'TEST AD 2', 'THIS IS A TEST 2'),
(1, 'TEST AD 3', 'THIS IS A TEST 3'),
(1, 'TEST AD 4', 'THIS IS A TEST 4')