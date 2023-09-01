create database addCustomerDetails;
use addCustomerDetails;
drop  database addCustomerDetails;
describe  customer;
select * from customer;
CREATE TABLE customer (
    user_id INT NOT NULL PRIMARY KEY AUTO_INCREMENT,
    username VARCHAR(20) NOT NULL,
    user_mail VARCHAR(20) NOT NULL UNIQUE,
    user_phone VARCHAR(25) NOT NULL,
    user_address VARCHAR(30) NOT NULL,
    date_updated DATETIME(6) NOT NULL,
    user_profile_img LONGBLOB);
INSERT INTO customer (username, user_mail, user_phone, user_address, date_updated)
VALUES ('JohnDoe', 'john@example.com', '9865432170,8765432190', 'UttarPradesh', NOW());
INSERT INTO customer (username, user_mail, user_phone, user_address, date_updated,user_profile_img)
VALUES ('Dhamotharan', 'dhamu2552@gmail.com', '9753124680', 'Madurai,Tamilnadu', NOW(),load_file("C:/ProgramData/MySQL/MySQL Server 8.0/Uploads/image7.jpg"));
INSERT INTO customer (username, user_mail, user_phone, user_address, date_updated)
VALUES ('Aravindth', 'aravindth@gmail.com', '7908654321', 'Coimbatore,Tamilnadu', NOW());
INSERT INTO customer (username, user_mail, user_phone, user_address, date_updated,user_profile_img)
VALUES ('Selvamani', 'selvamani@gmail.com', '6445666737,9078563412', 'Gujarat', NOW(),load_file("C:/ProgramData/MySQL/MySQL Server 8.0/Uploads/image6.jpg"));
INSERT INTO customer (username, user_mail, user_phone, user_address, date_updated,user_profile_img)
VALUES ('Priya', 'priya@gmail.com', '9876543210,8765432190', 'Tirunelveli,Tamilnadu', NOW(),load_file("C:/ProgramData/MySQL/MySQL Server 8.0/Uploads/image2.jpg"));
INSERT INTO customer (username, user_mail, user_phone, user_address, date_updated)
VALUES ('Preethi', 'preethi@example.com', '9865432173', 'Chennai,Tamilnadu', NOW());
INSERT INTO customer (username, user_mail, user_phone, user_address, date_updated,user_profile_img)
VALUES ('YuvaSri', 'yuvasri@gmail.com', '7890654321,6789054321', 'Tirunelveli,Tamilnadu', NOW(),load_file("C:/ProgramData/MySQL/MySQL Server 8.0/Uploads/image1.png"));
delete from customers where user_id=11;