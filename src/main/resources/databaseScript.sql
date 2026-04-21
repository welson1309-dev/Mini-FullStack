DROP DATABASE IF EXISTS miniDB;

CREATE DATABASE miniDB;

USE miniDB;

CREATE TABLE klassecitater(
    id INT AUTO_INCREMENT PRIMARY KEY,
    varchar() text NOT NULL,
    DATE created_at NOT NULL
);