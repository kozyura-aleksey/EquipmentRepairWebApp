/*������ �� ��������� id ������������*/
SELECT ID_USERS FROM "Users" WHERE login = ?

/*������ �� ��������� ������� ������������*/
SELECT BLOCK_STATUS FROM "Users" WHERE login = ?

/*������ �� ��������� ���� ������������*/
SELECT ID_TYPE_USERS FROM "Users" WHERE login = ? AND password = ?

/*������ �� ����� ������ �������������*/
SELECT ID_USERS, ID_TYPE_USERS, NAME, SURNAME, LOGIN, PASSWORD,  PHONE, "COMMENT", rewiew, STATUS, BLOCK_STATUS FROM "Users"

/*������ �� ����� ������ �� ����������� ������ �����*/
SELECT REPAIR, ITEM, NAME, SURNAME, PHONE, MARK, ORDER_NUMBER, statusRequest, "Order".DESCRIPTION FROM "Order" INNER JOIN "Items" ON "Order".ID_ITEMS = "Items".ID_ITEMS INNER JOIN "Users" ON "Order".ID_USERS = "Users".ID_USERS INNER JOIN "Repair" ON "Order".ID_REPAIR = "Repair".ID_REPAIR INNER JOIN "Work_Mark" ON "Order".ID_WORK_MARK = "Work_Mark".ID_WORK_MARK WHERE ORDER_NUMBER = ?

/*������ �� ����� ������ ������*/
SELECT REPAIR, ITEM, NAME, SURNAME, PHONE, MARK, ORDER_NUMBER, statusRequest, "Order".DESCRIPTION FROM "Order" INNER JOIN "Items" ON "Order".ID_ITEMS = "Items".ID_ITEMS INNER JOIN "Users" ON "Order".ID_USERS = "Users".ID_USERS INNER JOIN "Repair" ON "Order".ID_REPAIR = "Repair".ID_REPAIR INNER JOIN "Work_Mark" ON "Order".ID_WORK_MARK = "Work_Mark".ID_WORK_MARK

/*������ �� �������� ������������*/
DELETE FROM "Users" WHERE ID_USERS = ?

/*������ �� ������������ ������ ������� ������*/
UPDATE "Order" SET statusRequest = 'Yes' WHERE ORDER_NUMBER = ?

/*������ �� ������������ ���� �������*/
UPDATE "Users" SET BLOCK_STATUS = 'Yes' WHERE ID_USERS = ?

/*������ �� ������������ ������� ������������*/
UPDATE "Users" SET STATUS = ? WHERE ID_USERS = ?