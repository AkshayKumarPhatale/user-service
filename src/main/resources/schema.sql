DROP TABLE IF EXISTS USER_TABLE;

CREATE TABLE USER_TABLE (
    id INT PRIMARY KEY,
    name VARCHAR(255),
    email VARCHAR(255),
    dob VARCHAR(10),
    mobileno VARCHAR(20),
    gender VARCHAR(10),
    hno VARCHAR(50),
    town VARCHAR(100),
    city VARCHAR(100),
    state VARCHAR(100),
    pincode VARCHAR(20)
);
