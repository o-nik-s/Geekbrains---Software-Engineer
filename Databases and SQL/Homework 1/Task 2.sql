-- Выведите название, производителя и цену для товаров, количество которых превышает 2
SELECT ProductName, Manufacturer, Price
FROM db_geekbrains.mobilephones
where ProductCount>2;