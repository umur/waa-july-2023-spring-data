-- Inserting data into the 'address' table
INSERT INTO address (city, state, street, zip_code)
VALUES ('New York', 'NY', '123 Main Street', '10001'),
       ('Los Angeles', 'CA', '456 Elm Street', '90001'),
       ('Chicago', 'IL', '789 Oak Avenue', '60601');

-- Inserting data into the 'categories' table
INSERT INTO categories (name)
VALUES ('Electronics'),
       ('Clothing'),
       ('Books');

-- Inserting data into the 'products' table
INSERT INTO products (price, category_id, name, rating)
VALUES (19.99, 1, 'Smartphone', '4.5'),
       (39.99, 1, 'Headphones', '4.2'),
       (29.99, 2, 'T-Shirt', '4.8'),
       (12.99, 3, 'Novel', '4.1');

-- Inserting data into the 'users' table
INSERT INTO users (address_id, email, first_name, lastname, password)
VALUES (1, 'john@example.com', 'John', 'Doe', 'password123'),
       (2, 'jane@example.com', 'Jane', 'Smith', 'letmein'),
       (3, 'mike@example.com', 'Mike', 'Johnson', 'securepass');

--Inserting data into the 'reviews' table
INSERT INTO reviews (product_id, user_id, comment)
VALUES (1, 1, 'Great smartphone!'),
       (2, 2, 'Good sound quality.'),
       (3, 3, 'Comfortable and stylish.');
