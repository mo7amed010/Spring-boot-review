create table profiles
(
    id             bigint PRIMARY KEY ,
    bio            varchar(255)  null,
    phone_number   varchar(15)  null,
    date_of_birth  date  null,
    loyalty_points INT UNSIGNED DEFAULT 0,
    FOREIGN KEY (id) REFERENCES users(id)
);