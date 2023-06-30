-- Insert dummy data for Address table
INSERT INTO Address (street, zip, city) VALUES ('123 Main St', 12345, 'City1'),
       ('456 Elm St', 67890, 'City2'),
       ('789 Oak St', 54321, 'City3');

-- Insert dummy data for Category table
INSERT INTO Category (name) VALUES ('Category1'),
       ('Category2'),
       ('Category3');

-- Insert dummy data for Product table
INSERT INTO Product (name, price, rating, category_id) VALUES ('Product1', 10.99, 4, 1),
       ('Product2', 19.99, 3, 2),
       ('Product3', 9.99, 5, 3);

-- Insert dummy data for Review table
INSERT INTO Review (comment, product_id, user_id) VALUES ('Review1', 1, 1),
       ('Review2', 2, 1),
       ('Review3', 3, 2);

-- Insert dummy data for User table
INSERT INTO User (email, firstName, lastName, password, address_id) VALUES ('user1@example.com', 'John', 'Doe', 'password1', 1),
       ('user2@example.com', 'Jane', 'Smith', 'password2', 2);
