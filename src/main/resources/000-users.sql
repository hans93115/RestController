create table users
(
	id integer not null
		constraint users_pkey
			primary key,
	json_column jsonb
);

alter table users owner to root;

