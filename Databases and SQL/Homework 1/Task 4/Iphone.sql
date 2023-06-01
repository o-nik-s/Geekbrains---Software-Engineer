-- Товары, в наименовании которых есть упоминание "Samsung"
Select ProductName, Manufacturer, ProductCount, Price
FROM db_geekbrains.mobilephones
where ProductName like '%Iphone%'