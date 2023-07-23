-- Insert dummy data for User table
INSERT INTO user (email, password, firstname, lastname)
VALUES ('user1@example.com', 'password1', 'John', 'Doe'),
       ('user2@example.com', 'password2', 'Jane', 'Smith'),
       ('user3@example.com', 'password3', 'Alice', 'Johnson'),
       ('user4@example.com', 'password4', 'Bob', 'Williams'),
       ('user5@example.com', 'password5', 'Emily', 'Brown'),
       ('user6@example.com', 'password6', 'Michael', 'Davis'),
       ('user7@example.com', 'password7', 'Sophia', 'Miller'),
       ('user8@example.com', 'password8', 'Daniel', 'Wilson'),
       ('user9@example.com', 'password9', 'Olivia', 'Taylor'),
       ('user10@example.com', 'password10', 'William', 'Anderson');

-- Insert dummy data for Category table
INSERT INTO category (name)
VALUES
    ('Category 1'),
    ('Category 2'),
    ('Category 3'),
    ('Category 4'),
    ('Category 5'),
    ('Category 6'),
    ('Category 7'),
    ('Category 8'),
    ('Category 9'),
    ('Category 10');

-- Insert dummy data for Product table
insert into product (name, price, rating, category_id) values ('proin leo', 30411, 8, 3);
insert into product (name, price, rating, category_id) values ('consequat', 85416, 9, 10);
insert into product (name, price, rating, category_id) values ('tincidunt ante vel', 19745, 2, 3);
insert into product (name, price, rating, category_id) values ('placerat ante nulla', 10075, 4, 8);
insert into product (name, price, rating, category_id) values ('luctus', 17089, 9, 2);
insert into product (name, price, rating, category_id) values ('sapien placerat ante', 9343, 5, 1);
insert into product (name, price, rating, category_id) values ('nec condimentum neque', 76545, 9, 4);
insert into product (name, price, rating, category_id) values ('augue vel accumsan', 65053, 7, 1);
insert into product (name, price, rating, category_id) values ('volutpat sapien arcu', 41881, 10, 3);
insert into product (name, price, rating, category_id) values ('id pretium', 8606, 2, 5);
insert into product (name, price, rating, category_id) values ('congue diam', 46692, 1, 1);
insert into product (name, price, rating, category_id) values ('parturient', 34072, 0, 5);
insert into product (name, price, rating, category_id) values ('lobortis', 39523, 5, 6);
insert into product (name, price, rating, category_id) values ('leo odio', 29099, 4, 5);
insert into product (name, price, rating, category_id) values ('id', 8126, 5, 5);
insert into product (name, price, rating, category_id) values ('a nibh in', 12585, 9, 1);
insert into product (name, price, rating, category_id) values ('lacus', 67866, 8, 8);
insert into product (name, price, rating, category_id) values ('est lacinia', 68173, 7, 6);
insert into product (name, price, rating, category_id) values ('nisl nunc nisl', 76949, 10, 4);
insert into product (name, price, rating, category_id) values ('erat tortor sollicitudin', 27746, 5, 9);