# --- Created by Ebean DDL
# To stop Ebean DDL generation, remove this comment and start using Evolutions

# --- !Ups

create table user (
  id_usuario                    integer auto_increment not null,
  username                      varchar(255),
  password                      varchar(255),
  nombre                        varchar(255),
  telefono                      varchar(12),
  email                         varchar(255),
  activo1                       boolean default 1,
  constraint uq_user_username unique (username),
  constraint pk_user primary key (id_usuario)
);


# --- !Downs

drop table if exists user;

