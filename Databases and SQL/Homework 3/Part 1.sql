-- 1. Напишите запрос, который вывел бы таблицу со столбцами в следующем порядке: city, sname, snum, comm (к первой или второй таблице, используя SELECT).
Select City, SName, SNum, Comm from SalesPeople;

-- 2. Напишите команду SELECT, которая вывела бы оценку (rating), сопровождаемую именем каждого заказчика в городе San Jose (“заказчики”).
Select Cname, Rating from Customers
where City = 'SanJose';

-- 3. Напишите запрос, который вывел бы значения snum всех продавцов из таблицы заказов без каких бы то ни было повторений (уникальные значения в “snum“ “Продавцы”).
Select distinct SNum from Customers;

-- 4. Напишите запрос, который бы выбирал заказчиков, чьи имена начинаются с буквы G. Используется оператор "LIKE" (“заказчики”).
-- https://dev.mysql.com/doc/refman/8.0/en/string-comparison-functions.html
Select Cname, Rating from Customers
where Cname like "G%";

-- 5. Напишите запрос, который может дать вам все заказы со значениями суммы выше чем $1,000 (“Заказы”, “amt” - сумма).
Select ONum, Amt, ODate from Orders where Amt>'1000';

-- 6. Напишите запрос который выбрал бы наименьшую сумму заказа. (Из поля “amt” - сумма в таблице “Заказы” выбрать наименьшее значение).
Select min(Amt) as Amt from Orders;

-- 7. Напишите запрос к таблице “Заказчики”, который может показать всех заказчиков, у которых рейтинг больше 100 и они находятся не в Риме.
Select CName, City, Rating from Customers
where Rating > 100 and City != 'Rome';