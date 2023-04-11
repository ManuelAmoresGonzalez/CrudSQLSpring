create database books_system;

\connect books_system;

create table books (
  id bigint primary key generated always as identity,
  name character varying(255) not null,

  CONSTRAINT os_name_uniq UNIQUE (name)
);

insert into books (name) values ('The little Prince'), ('Flow'), ('7 Habits'), ('keeping memories');