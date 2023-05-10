DROP TABLE IF EXISTS person;

CREATE TABLE person(
	person_id SERIAL,
	person_name varchar(50) not null,
	age varchar(3),
	phone varchar(15),
	height varchar(3),
	email varchar(30),
	cpf varchar(11) not null unique,
	date_of_birth varchar(8),
	id_address SERIAL not null,
	
	constraint person_pk primary key (person_id)
);

DROP TABLE IF EXISTS address;

CREATE TABLE address(
	address_id SERIAL,
	zip_code varchar(8) not null,
	address varchar (30),
	complement varchar (20),
	neighborhood varchar (20),
	city varchar (20),
	state varchar (30),
	country varchar (30),
	
	constraint address_pk primary key (address_id)
);

ALTER TABLE person ADD
	constraint person_address_fk foreign key (id_address)
		references address (address_id)
