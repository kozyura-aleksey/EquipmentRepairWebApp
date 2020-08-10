/*==============================================================*/
/* Создание таблицы "Items"                                               */
/*==============================================================*/
create table "Items" 
(
   ID_ITEMS             INTEGER              not null,
   ITEM                 VARCHAR2(20)
);

--Добавление первичного ключа ID_ITEMS
alter table "Items"
   add constraint PK_ITEMS primary key (ID_ITEMS);

/*==============================================================*/
/* Создание таблицы "Order"                                               */
/*==============================================================*/
create table "Order" 
(
   ID_ITEMS             INTEGER,
   ID_USERS             INTEGER,
   ID_REPAIR            INTEGER,
   ID_WORK_MARK         INTEGER,
   ORDER_NUMBER         INTEGER,
   STATUSREQUEST        VARCHAR2(5),
   DESCRIPTION          VARCHAR2(50)
);

/*==============================================================*/
/* Создание таблицы "Repair"                                              */
/*==============================================================*/
create table "Repair" 
(
   ID_REPAIR            INTEGER              not null,
   REPAIR               VARCHAR2(20),
   PRICE                INTEGER
);

--Добавление первичного ключа ID_REPAIR
alter table "Repair"
   add constraint PK_REPAIR primary key (ID_REPAIR);

/*==============================================================*/
/* Создание таблицы "Type_Repair"                                         */
/*==============================================================*/
create table "Type_Repair" 
(
   ID_TYPE_REPAIRS      INTEGER              not null,
   TYPE_REPAIR          VARCHAR2(20)
);

--Добавление первичного ключа ID_TYPE_REPAIRS
alter table "Type_Repair"
   add constraint PK_TYPE_REPAIR primary key (ID_TYPE_REPAIRS);

/*==============================================================*/
/* Table: "Type_Users"                                          */
/*==============================================================*/
create table "Type_Users" 
(
   ID_TYPE_USERS        INTEGER              not null,
   TYPE                 VARCHAR2(20)
);

--Добавление первичного ключа ID_TYPE_USERS
alter table "Type_Users"
   add constraint PK_TYPE_USERS primary key (ID_TYPE_USERS);

/*==============================================================*/
/* Создание таблицы "Users"                                               */
/*==============================================================*/
create table "Users" 
(
   ID_USERS             INTEGER              not null,
   ID_TYPE_USERS        INTEGER,
   NAME                 VARCHAR2(20),
   SURNAME              VARCHAR2(20),
   LOGIN                VARCHAR2(20),
   PASSWORD             VARCHAR2(20),
   PHONE                VARCHAR2(20),
   "COMMENT"            VARCHAR2(20),
   REWIEW               VARCHAR2(150),
   STATUS               VARCHAR2(5),
   BLOCK_STATUS         VARCHAR2(5)
);

--Добавление первичного ключа ID_USERS
alter table "Users"
   add constraint PK_USERS primary key (ID_USERS);

/*==============================================================*/
/* Создание таблицы "Work_Mark"                                           */
/*==============================================================*/
create table "Work_Mark" 
(
   ID_WORK_MARK         INTEGER              not null,
   MARK                 INTEGER
);

--Добавление первичного ключа ID_WORK_MARK
alter table "Work_Mark"
   add constraint PK_WORK_MARK primary key (ID_WORK_MARK);

--Добавление внешнего ключа ID_USERS
alter table "Order"
   add constraint FK_ORDER_ORDER_USERS foreign key (ID_USERS)
      references "Users" (ID_USERS);

--Добавление внешнего ключа ID_ITEMS
alter table "Order"
   add constraint FK_ORDER_ORDER_ITE_ITEMS foreign key (ID_ITEMS)
      references "Items" (ID_ITEMS);

--Добавление внешнего ключа ID_REPAIR
alter table "Order"
   add constraint FK_ORDER_REPAIR_REPAIR foreign key (ID_REPAIR)
      references "Repair" (ID_REPAIR);

--Добавление внешнего ключа ID_REPAIR
alter table "Order"
   add constraint FK_ORDER_TYPE_REPA_TYPE_REP foreign key (ID_REPAIR)
      references "Type_Repair" (ID_TYPE_REPAIRS);

--Добавление внешнего ключа ID_WORK_MARK
alter table "Order"
   add constraint FK_ORDER_WORK_MARK_WORK_MAR foreign key (ID_WORK_MARK)
      references "Work_Mark" (ID_WORK_MARK);

--Добавление внешнего ключа ID_TYPE_USERS
alter table "Users"
   add constraint FK_USERS_TYPE_TYPE_USE foreign key (ID_TYPE_USERS)
      references "Type_Users" (ID_TYPE_USERS);
      
--Удаление внешнего ключа FK_ORDER_ORDER_USERS
alter table "Order"
   drop constraint FK_ORDER_ORDER_USERS;

--Удаление внешнего ключа FK_ORDER_ORDER_ITE_ITEMS
alter table "Order"
   drop constraint FK_ORDER_ORDER_ITE_ITEMS;

--Удаление внешнего ключа FK_ORDER_ORDER_USERS
alter table "Order"
   drop constraint FK_ORDER_ORDER_USERS;

--Удаление внешнего ключа FK_ORDER_TYPE_REPA_TYPE_REP
alter table "Order"
   drop constraint FK_ORDER_TYPE_REPA_TYPE_REP;

--Удаление внешнего ключа FK_ORDER_WORK_MARK_WORK_MAR
alter table "Order"
   drop constraint FK_ORDER_WORK_MARK_WORK_MAR;

--Удаление внешнего ключа FK_USERS_TYPE_TYPE_USE
alter table "Users"
   drop constraint FK_USERS_TYPE_TYPE_USE;
