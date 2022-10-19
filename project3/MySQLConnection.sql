use javacon;

create table test2(
	name varchar(50), age int(100)
);

insert into test2(name, age) values("Son Goku", 30);
insert into test2(name, age) values("Vegeta", 30);
insert into test2(name, age) values("Son Gohan", 30);

select * from test2;