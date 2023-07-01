
--
--INSERT INTO category (id, name) VALUES
--(1, 'Electronics'),
--(2, 'Clothing'),
--(3, 'Home'),
--(4, 'Beauty'),
--(5, 'Sports');
--
--INSERT INTO product (id, name, price, category_id) VALUES
--(1, 'Laptop', 999.99, 1),
--(2, 'T-shirt', 19.99, 2),
--(3, 'Sofa', 499.99, 3),
--(4, 'Shampoo', 9.99, 4),
--(5, 'Football', 24.99, 5),
--(6, 'Smartphone', 799.99, 1),
--(7, 'Jeans', 39.99, 2),
--(8, 'Bed', 599.99, 3),
--(9, 'Perfume', 49.99, 4),
--(10, 'Basketball', 19.99, 5);

INSERT INTO address (id, street, zip, city) VALUES (1, '123 Main Street', '12345', 'New York');
INSERT INTO address (id, street, zip, city) VALUES (2, '456 Elm Avenue', '67890', 'Los Angeles');
INSERT INTO address (id, street, zip, city) VALUES (3, '789 Oak Drive', '54321', 'Chicago');
INSERT INTO address (id, street, zip, city) VALUES (4, '321 Pine Lane', '98765', 'Houston');
INSERT INTO address (id, street, zip, city) VALUES (5, '987 Maple Road', '54321', 'San Francisco');

INSERT INTO user (id, email, password, first_name, lastname, address_id) VALUES (1, 'user1@example.com', 'password123', 'John', 'Doe', 1);
INSERT INTO user (id, email, password, first_name, lastname, address_id) VALUES (1, 'user1@example.com', 'password123', 'John', 'Doe', 1);
INSERT INTO user (id, email, password, first_name, lastname, address_id) VALUES (2, 'user2@example.com', 'securepassword', 'Jane', 'Smith', 2);
INSERT INTO user (id, email, password, first_name, lastname, address_id) VALUES (3, 'user3@example.com', 'pass1234', 'Michael', 'Johnson', 3);
INSERT INTO user (id, email, password, first_name, lastname, address_id) VALUES (4, 'user4@example.com', 'mysecretpass', 'Emily', 'Brown', 4);
INSERT INTO user (id, email, password, first_name, lastname, address_id) VALUES (5, 'user5@example.com', 'letmein', 'Daniel', 'Wilson', 5);

INSERT INTO review (content, user_id, product_id)
VALUES ('Excellent product! Highly recommended.', 1, 1);
INSERT INTO review (content, user_id, product_id)
VALUES ('Great quality and value for money.', 2, 1);

INSERT INTO review (content, user_id, product_id)
VALUES ('Impressive features and performance.', 3, 1);

INSERT INTO review (content, user_id, product_id)
VALUES ('Satisfied with the purchase, meets my expectations.', 4, 4);

INSERT INTO review (content, user_id, product_id)
VALUES ('Top-notch product, exceeded my expectations.', 5, 5);
