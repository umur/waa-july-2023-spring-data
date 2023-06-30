INSERT INTO address (id, city, street, zip)
VALUES
    (1, 'City 1', 'Street 1', '12345'),
    (2, 'City 2', 'Street 2', '23456'),
    (3, 'City 3', 'Street 3', '34567'),
    (4, 'City 4', 'Street 4', '45678'),
    (5, 'City 5', 'Street 5', '56789');

UPDATE address_seq SET next_val = 6;

INSERT INTO user (address_id, id, email, first_name, last_name, password)
VALUES
    (1, 1, 'john@example.com', 'John', 'Doe', 'password1'),
    (2, 2, 'jane@example.com', 'Jane', 'Smith', 'password2'),
    (3, 3, 'mark@example.com', 'Mark', 'Johnson', 'password3'),
    (4, 4, 'sarah@example.com', 'Sarah', 'Williams', 'password4'),
    (5, 5, 'michael@example.com', 'Michael', 'Brown', 'password5');

UPDATE user_seq SET next_val = 6;

INSERT INTO category (id, name)
VALUES
    (1, 'Category 1'),
    (2, 'Category 2'),
    (3, 'Category 3'),
    (4, 'Category 4'),
    (5, 'Category 5');

UPDATE category_seq SET next_val = 6;

INSERT INTO product (price, rating, category_id, id, name)
VALUES
    (19.99, 4, 1, 1, 'Product 1'),
    (29.99, 3, 2, 2, 'Product 2'),
    (9.99, 5, 3, 3, 'Product 3'),
    (39.99, 4, 4, 4, 'Product 4'),
    (14.99, 2, 5, 5, 'Product 5');

UPDATE product_seq SET next_val = 6;

INSERT INTO review (id, product_id, user_id, comment)
VALUES
    (1, 1, 1, 'Great product! Highly recommended.'),
    (2, 2, 2, 'Average product. Could be better.'),
    (3, 3, 3, 'Excellent quality. Worth the price.'),
    (4, 4, 4, 'Disappointed with the product.'),
    (5, 5, 5, 'Good value for money.'),
    (6, 1, 2, 'Fast shipping and good packaging.'),
    (7, 2, 3, 'Not satisfied with the performance.'),
    (8, 3, 4, 'Best product Ive ever used!'),
    (9, 4, 5, 'Product arrived damaged.'),
    (10, 5, 1, 'Could use some improvements.');

UPDATE product_seq SET next_val = 11;

