-- Создайте таблицу “orders”, заполните ее значениями. Покажите “полный” статус заказа, используя оператор CASE

CREATE TABLE IF NOT EXISTS Orders
	(OrderId SERIAL PRIMARY KEY, 
    EmployeeID CHAR(3) NOT NULL, 
    Amount FLOAT,
    OrderStatus CHAR(15));

INSERT INTO `db_geekbrains`.`Orders` (`OrderId`, `EmployeeID`, `Amount`, `OrderStatus`) VALUES ('1', 'e03', 15.00, 'OPEN');
INSERT INTO `db_geekbrains`.`Orders` (`OrderId`, `EmployeeID`, `Amount`, `OrderStatus`) VALUES ('2', 'e01', 25.50, 'OPEN');
INSERT INTO `db_geekbrains`.`Orders` (`OrderId`, `EmployeeID`, `Amount`, `OrderStatus`) VALUES ('3', 'e05', 100.70, 'CLOSED');
INSERT INTO `db_geekbrains`.`Orders` (`OrderId`, `EmployeeID`, `Amount`, `OrderStatus`) VALUES ('4', 'e02', 22.18, 'OPEN');
INSERT INTO `db_geekbrains`.`Orders` (`OrderId`, `EmployeeID`, `Amount`, `OrderStatus`) VALUES ('5', 'e04', 9.50, 'CANCELLED');
INSERT INTO `db_geekbrains`.`Orders` (`OrderId`, `EmployeeID`, `Amount`, `OrderStatus`) VALUES ('6', 'e04', 99.99, 'OPEN');

Select OrderId, OrderStatus,
	case when OrderStatus='OPEN' then 'Order is in open state.'
	     when OrderStatus='CLOSED' then 'Order is closed.'
	     when OrderStatus='CANCELLED' then 'Order is cancelled.'
	end as Order_Summary
from Orders