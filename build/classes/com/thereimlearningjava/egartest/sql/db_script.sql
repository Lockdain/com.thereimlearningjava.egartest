DROP DATABASE IF EXISTS CurrOrders;
CREATE DATABASE CurrOrders;
USE CurrOrders;

CREATE TABLE orders (id INT(5), customer_name VARCHAR(20), 
customer_address VARCHAR(30), order_amount FLOAT, order_date DATETIME, PRIMARY KEY (id)); 

CREATE TABLE order_details (id_string INT(5) AUTO_INCREMENT, serial_number VARCHAR(20), 
quantity INT, order_id INT, PRIMARY KEY (id_string));

CREATE TABLE item_description (serial_number VARCHAR(20), 
item_name VARCHAR(20), item_description VARCHAR(20), item_madeon DATETIME, PRIMARY KEY (serial_number));

ALTER TABLE order_details
ADD FOREIGN KEY (serial_number)
REFERENCES item_description (serial_number);

ALTER TABLE order_details
ADD FOREIGN KEY (order_id)
REFERENCES orders (id);

INSERT INTO orders
(id, customer_name, customer_address, order_amount, order_date)
VALUES
(1, 'Ivan Grozny', 'Fleet St. 32', 432.5, '2004-10-29 00:00:00'), 
(2, 'Vitaly Grechkin', '42 Avnue', 200.5, '2008-11-29 02:00:00'),
(3, 'Yury Volkov', 'Romanova St. 28', 112.2, '2009-10-12 00:00:00'),
(4, 'Georgy Grechko', 'Lenina St. 82-12', 100.22, '2012-10-27 00:00:00'),
(5, 'Michael Jackson', 'Disneyland', 2432.21, '2007-08-14 00:00:00'),
(6, 'Peter Jackson', 'Middleup Rd. 122-1', 212.12, '2015-10-29 00:00:00'),
(7, 'Peter the First', 'Royal Palace', 88732.32, '1999-06-12 00:00:00');

INSERT INTO item_description
(serial_number, item_name, item_description, item_madeon)
VALUES
('ERK22-05', 'A car', 'Really nice', '1998-06-12 00:00:00'),
('ERKC-SB', 'A toycar', 'Made of steel', '1995-03-12 00:00:00'),
('SBSS', 'Simple pen', 'Red', '2012-06-12 00:00:00'),
('KLK-4', 'Red paint', 'Glossy', '1994-06-12 00:00:00'),
('MDM', 'Green paint', 'Car paint', '1992-06-12 00:00:00'),
('MDL', 'Beige paint', 'Matte', '1994-06-12 00:00:00'),
('MDF', 'Collar paint', 'Glossy', '2012-06-12 00:00:00'),
('Tilda', 'Blue paint', 'Matte', '2011-02-11 00:00:00'),
('Zik', 'Yellow paint', 'Glossy', '2010-08-11 00:00:00'),
('MaI', 'A cellphone', 'Black', '2012-06-12 00:00:00'),
('Cal', 'A toothbrush', 'Soft', '2016-11-12 00:00:00'),
('MaL', 'A key', 'For the Kingdom', '2012-06-12 00:00:00');


INSERT INTO order_details
(serial_number, quantity, order_id)
VALUES
('ERK22-05', 2, 1),
('ERKC-SB', 5, 2),
('SBSS', 2, 2),
('KLK-4', 2, 3),
('MDM', 1, 4),
('MDL', 1, 4),
('MDF', 2, 4),
('Tilda', 1, 5),
('Zik', 2, 5),
('MaI', 1, 6),
('Cal', 2, 7),
('MaL', 3, 7);
  


