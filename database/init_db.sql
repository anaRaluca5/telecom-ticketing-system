create database telecom_ticketing;

use telecom_ticketing;

create table tickets (
	id bigint auto_increment primary key,
    title varchar(120) not null,
    description text,
    priority varchar(20) not null,
    status varchar(20) not null,
    created_at timestamp default current_timestamp,
    updated_at timestamp default current_timestamp on update current_timestamp
    );
