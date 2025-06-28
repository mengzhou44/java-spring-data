create table products
(
    id       int auto_increment
        primary key,
    name     varchar(100)   not null,
    category varchar(40)    not null,
    price    decimal(10, 2) not null
);
