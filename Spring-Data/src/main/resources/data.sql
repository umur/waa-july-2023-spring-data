# Insert dummy data for Address table
INSERT INTO address (id,street, zip, city) VALUES (NULL,'123 Main St', 12345, 'City1'),
       (NULL,'456 Elm St', 67890, 'City2'),
       (NULL,'789 Oak St', 54321, 'City3');

# Insert dummy data for Category table
INSERT INTO Category (id,name) VALUES (NULL,'Category1'),
       (NULL,'Category2'),
       (NULL,'Category3');

-- Insert dummy data for Product table
INSERT INTO Product (id,name, price, rating, category_id) VALUES (NULL,'Product1', 10.99, 4, 1),
       (NULL,'Product2', 19.99, 3, 2),
       (NULL,'Product3', 9.99, 5, 3);


-- Insert dummy data for User table
INSERT INTO User (id,email, first_Name, last_Name, password, address_id) VALUES (NULL,'user1@example.com', 'John', 'Doe', 'password1', 1),
       (NULL,'user2@example.com', 'Jane', 'Smith', 'password2', 2);

-- Insert dummy data for Review table
INSERT INTO Review (id,comment, product_id, user_id) VALUES (NULL,'Review1', 1, 1),
                                                            (NULL,'Review2', 2, 1),
                                                            (NULL,'Review3', 3, 2);
