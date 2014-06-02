# --- Created by Ebean DDL
# To stop Ebean DDL generation, remove this comment and start using Evolutions

# --- !Ups

create table search (
  id                        bigint auto_increment not null,
  ip                        varchar(255),
  term                      varchar(255),
  date                      datetime,
  constraint pk_search primary key (id))
;




# --- !Downs

SET FOREIGN_KEY_CHECKS=0;

drop table search;

SET FOREIGN_KEY_CHECKS=1;

