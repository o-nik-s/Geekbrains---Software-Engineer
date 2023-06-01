-- Выведите весь ассортимент товаров марки “Samsung”
Select ProductName, ProductCount, Price
FROM db_geekbrains.mobilephones
where Manufacturer = 'Samsung'