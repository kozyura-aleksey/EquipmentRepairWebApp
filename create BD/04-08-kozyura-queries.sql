/*«апрос на получение id пользовател€*/
SELECT ID_USERS FROM "Users" WHERE login = ?

/*«апрос на получение статуса пользовател€*/
SELECT BLOCK_STATUS FROM "Users" WHERE login = ?

/*«апрос на получение типа пользовател€*/
SELECT ID_TYPE_USERS FROM "Users" WHERE login = ? AND password = ?

/*«апрос на вывод списка пользователей*/
SELECT ID_USERS, ID_TYPE_USERS, NAME, SURNAME, LOGIN, PASSWORD,  PHONE, "COMMENT", rewiew, STATUS, BLOCK_STATUS FROM "Users"

/*«апрос на вывод за€вки по конкретному номеру заказ*/
SELECT REPAIR, ITEM, NAME, SURNAME, PHONE, MARK, ORDER_NUMBER, statusRequest, "Order".DESCRIPTION FROM "Order" INNER JOIN "Items" ON "Order".ID_ITEMS = "Items".ID_ITEMS INNER JOIN "Users" ON "Order".ID_USERS = "Users".ID_USERS INNER JOIN "Repair" ON "Order".ID_REPAIR = "Repair".ID_REPAIR INNER JOIN "Work_Mark" ON "Order".ID_WORK_MARK = "Work_Mark".ID_WORK_MARK WHERE ORDER_NUMBER = ?

/*«апрос на вывод списка за€вок*/
SELECT REPAIR, ITEM, NAME, SURNAME, PHONE, MARK, ORDER_NUMBER, statusRequest, "Order".DESCRIPTION FROM "Order" INNER JOIN "Items" ON "Order".ID_ITEMS = "Items".ID_ITEMS INNER JOIN "Users" ON "Order".ID_USERS = "Users".ID_USERS INNER JOIN "Repair" ON "Order".ID_REPAIR = "Repair".ID_REPAIR INNER JOIN "Work_Mark" ON "Order".ID_WORK_MARK = "Work_Mark".ID_WORK_MARK

/*«апрос на удаление пользовател€*/
DELETE FROM "Users" WHERE ID_USERS = ?

/*«апрос на установление нового статуса за€вки*/
UPDATE "Order" SET statusRequest = 'Yes' WHERE ORDER_NUMBER = ?

/*«апрос на установление блок статуса*/
UPDATE "Users" SET BLOCK_STATUS = 'Yes' WHERE ID_USERS = ?

/*«апрос на установление статуса пользовател€*/
UPDATE "Users" SET STATUS = ? WHERE ID_USERS = ?