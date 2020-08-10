--Заполнение таблицы "Предметы"
INSERT INTO "Items" (ID_ITEMS, ITEM) values (1,'computer');
INSERT INTO "Items" (ID_ITEMS, ITEM) values (2,'smartphone');
INSERT INTO "Items" (ID_ITEMS, ITEM) values (3,'monitor');
INSERT INTO "Items" (ID_ITEMS, ITEM) values (4,'notebook');
INSERT INTO "Items" (ID_ITEMS, ITEM) values (6,'freezer');
INSERT INTO "Items" (ID_ITEMS, ITEM) values (7,'dishwasher');
INSERT INTO "Items" (ID_ITEMS, ITEM) values (8,'conditioner');
INSERT INTO "Items" (ID_ITEMS, ITEM) values (9,'oven');
INSERT INTO "Items" (ID_ITEMS, ITEM) values (10,'microwave');

--Заполнение таблицы "Ремонт"
INSERT INTO "Repair" (ID_REPAIR, REPAIR, PRICE) values (1,'Diagnostics',1000);
INSERT INTO "Repair" (ID_REPAIR, REPAIR, PRICE) values (2,'Preventive Work',2000);
INSERT INTO "Repair" (ID_REPAIR, REPAIR, PRICE) values (3,'Repair Work',3000);

--Заполнение таблицы тип ремонта
INSERT INTO "Type_Repair" (ID_TYPE_REPAIRS, TYPE_REPAIR) values (1, 'Diagnostics');
INSERT INTO "Type_Repair" (ID_TYPE_REPAIRS, TYPE_REPAIR) values (2, 'Preventive Work');
INSERT INTO "Type_Repair" (ID_TYPE_REPAIRS, TYPE_REPAIR) values (3, 'Repair Work');

--Заполнение таблицы тип пользователя
INSERT INTO "Type_Users" (ID_TYPE_USERS, TYPE) values (1,'master');
INSERT INTO "Type_Users" (ID_TYPE_USERS, TYPE) values (2,'user');
INSERT INTO "Type_Users" (ID_TYPE_USERS, TYPE) values (3,'moderator');
INSERT INTO "Type_Users" (ID_TYPE_USERS, TYPE) values (4,'admin');

--Заполнение таблицы оценка ремонта
INSERT INTO "Work_Mark" (ID_WORK_MARK, MARK) values (1,10);
INSERT INTO "Work_Mark" (ID_WORK_MARK, MARK) values (2, 9);
INSERT INTO "Work_Mark" (ID_WORK_MARK, MARK) values (3, 8);
INSERT INTO "Work_Mark" (ID_WORK_MARK, MARK) values (4, 7);
INSERT INTO "Work_Mark" (ID_WORK_MARK, MARK) values (5, 6);
INSERT INTO "Work_Mark" (ID_WORK_MARK, MARK) values (6, 5);
INSERT INTO "Work_Mark" (ID_WORK_MARK, MARK) values (7, 4);
INSERT INTO "Work_Mark" (ID_WORK_MARK, MARK) values (8, 3);
INSERT INTO "Work_Mark" (ID_WORK_MARK, MARK) values (9, 2);
INSERT INTO "Work_Mark" (ID_WORK_MARK, MARK) values (10, 1);
	
--Заполнение таблицы пользователи
INSERT INTO "Users" (ID_USERS, ID_TYPE_USERS, NAME, SURNAME, LOGIN, PASSWORD, PHONE, STATUS, BLOCK_STATUS) VALUES (7, 1, 'Ryan', 'Evans','ryanEvans', 'ryan1', '89189541082' ,'OFF', 'No');
INSERT INTO "Users" (ID_USERS, ID_TYPE_USERS, NAME, SURNAME, LOGIN, PASSWORD, PHONE, STATUS, BLOCK_STATUS) VALUES (5, 2, 'kate', 'romanova','kateromanova', 'kateON', '89327891200' ,'OFF', 'No');
INSERT INTO "Users" (ID_USERS, ID_TYPE_USERS, NAME, SURNAME, LOGIN, PASSWORD, PHONE, STATUS, BLOCK_STATUS) VALUES (1, 2, 'Tom', 'Johson','tomJohson', 'tom123', '89208882244' ,'OFF', 'No');
INSERT INTO "Users" (ID_USERS, ID_TYPE_USERS, NAME, SURNAME, LOGIN, PASSWORD, PHONE, STATUS, BLOCK_STATUS) VALUES (2, 3, 'John', 'Jones','johnJones', 'john456', '89304567812' ,'OFF', 'No');
INSERT INTO "Users" (ID_USERS, ID_TYPE_USERS, NAME, SURNAME, LOGIN, PASSWORD, PHONE, STATUS, BLOCK_STATUS) VALUES (3, 4, 'Wilson', 'Brown','wilsonBrown', 'wilson789', '89155672309' ,'OFF', 'No');

--Заполнение таблицы заказы
INSERT INTO "Order" (ID_ITEMS, ID_USERS, ID_REPAIR, ID_WORK_MARK, order_number, statusRequest) VALUES (1, 2, 2, 5, 100, 'No');
INSERT INTO "Order" (ID_ITEMS, ID_USERS, ID_REPAIR, ID_WORK_MARK, order_number, statusRequest) VALUES (2, 2, 1, 10, 200, 'No');
INSERT INTO "Order" (ID_ITEMS, ID_USERS, ID_REPAIR, ID_WORK_MARK, order_number, statusRequest) VALUES (3, 2, 1, 10, 300, 'No');
INSERT INTO "Order" (ID_ITEMS, ID_USERS, ID_REPAIR, ID_WORK_MARK, order_number, statusRequest) VALUES (2, 2, 1, 1, 41, 'No');
INSERT INTO "Order" (ID_ITEMS, ID_USERS, ID_REPAIR, ID_WORK_MARK, order_number, statusRequest) VALUES (10, 2, 1, 1, 42, 'No');





