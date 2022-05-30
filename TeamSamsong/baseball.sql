create table player_info(
p_id varchar2(20), 
constraint pi_pid_pk primary key(p_id), 
p_pw varchar2(20) not null, 
p_nickname varchar2(20) not null,
constraint p_n_uk unique (p_nickname));

create table lanking(victory number(20), 
l_nickname varchar2(20),
constraint l_v_pk primary key(victory),
constraint l_n_pk foreign key(l_nickname)
references player_info(p_nickname));

insert into PLAYER_INFO values('dsong','1234','das');
select * from player_info;


drop table player_info;