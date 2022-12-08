CREATE TABLE IF NOT EXISTS "user"
(
    id SERIAL PRIMARY KEY,
    first_name varchar,
    last_name varchar
);


CREATE TABLE IF NOT EXISTS device
(
    id SERIAL PRIMARY KEY,
    brand varchar,
    "name" varchar,
    "type" varchar,
    os varchar,
    color varchar
);

CREATE TABLE IF NOT EXISTS notification
(
    id SERIAL PRIMARY KEY,
    first_name varchar,
    last_name varchar,
    created_on date default now()
);

CREATE TABLE IF NOT EXISTS email_notification
(
    id SERIAL PRIMARY KEY,
    email_address varchar
);

CREATE TABLE IF NOT EXISTS sms_notification
(
    id SERIAL PRIMARY KEY,
    phone_number varchar
);

CREATE TABLE IF NOT EXISTS book
(
    id SERIAL PRIMARY KEY,
    title varchar,
    created_date date default now(),
    pages int
);

CREATE TABLE IF NOT EXISTS blog_post
(
    id SERIAL PRIMARY KEY,
    title varchar,
    created_date date default now(),
    url varchar
);

CREATE TABLE IF NOT EXISTS publication
(
    id SERIAL PRIMARY KEY,
    title varchar,
    created_date date default now()
);