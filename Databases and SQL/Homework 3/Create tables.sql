CREATE TABLE IF NOT EXISTS SalesPeople
	(SNum SERIAL PRIMARY KEY,
    SName CHAR(25) NOT NULL,
    City CHAR(15),
    Comm Float);
    
INSERT INTO `db_geekbrains`.`SalesPeople` (`SNum`, `SName`, `City`, `Comm`) VALUES ('1001', 'Peel', 'London', .12);
INSERT INTO `db_geekbrains`.`SalesPeople` (`SNum`, `SName`, `City`, `Comm`) VALUES ('1002', 'Serres', 'San Jose', .13);
INSERT INTO `db_geekbrains`.`SalesPeople` (`SNum`, `SName`, `City`, `Comm`) VALUES ('1004', 'Motika', 'London', .11);
INSERT INTO `db_geekbrains`.`SalesPeople` (`SNum`, `SName`, `City`, `Comm`) VALUES ('1007', 'Rifkin', 'Barcelona', .15);
INSERT INTO `db_geekbrains`.`SalesPeople` (`SNum`, `SName`, `City`, `Comm`) VALUES ('1003', 'Axelrod', 'New York', .10);


CREATE TABLE IF NOT EXISTS Customers
	(CNum SERIAL PRIMARY KEY,
    CName CHAR(25) NOT NULL,
    City CHAR(15),
    Rating INT,
    SNum INT);

INSERT INTO `db_geekbrains`.`Customers` (`CNum`, `CName`, `City`, `Rating`, `SNum`) VALUES ('2001', 'Hoffman', 'London', 100, 1001);
INSERT INTO `db_geekbrains`.`Customers` (`CNum`, `CName`, `City`, `Rating`, `SNum`) VALUES ('2002', 'Giovanni', 'Rome', 200, 1003);
INSERT INTO `db_geekbrains`.`Customers` (`CNum`, `CName`, `City`, `Rating`, `SNum`) VALUES ('2003', 'Liu', 'SanJose', 200, 1002);
INSERT INTO `db_geekbrains`.`Customers` (`CNum`, `CName`, `City`, `Rating`, `SNum`) VALUES ('2004', 'Grass', 'Berlin', 300, 1002);
INSERT INTO `db_geekbrains`.`Customers` (`CNum`, `CName`, `City`, `Rating`, `SNum`) VALUES ('2006', 'Clemens', 'London', 100, 1001);
INSERT INTO `db_geekbrains`.`Customers` (`CNum`, `CName`, `City`, `Rating`, `SNum`) VALUES ('2008', 'Cisneros', 'SanJose', 300, 1007);
INSERT INTO `db_geekbrains`.`Customers` (`CNum`, `CName`, `City`, `Rating`, `SNum`) VALUES ('2007', 'Pereira', 'Rome', 100, 1004);


CREATE TABLE IF NOT EXISTS Orders
	(ONum SERIAL PRIMARY KEY,
    Amt DECIMAL(9,2),
    ODate DATE NOT NULL,
    CNum INT NOT NULL,
    SNum INT);

INSERT INTO `db_geekbrains`.`Orders` (`ONum`, `Amt`, `ODate`, `CNum`, `SNum`) VALUES ('3001', 18.69, '1990/03/10', 2008, 1007);
INSERT INTO `db_geekbrains`.`Orders` (`ONum`, `Amt`, `ODate`, `CNum`, `SNum`) VALUES ('3003', 767.19, '1990/03/10', 2001, 1001);
INSERT INTO `db_geekbrains`.`Orders` (`ONum`, `Amt`, `ODate`, `CNum`, `SNum`) VALUES ('3002', 1900.10, '1990/03/10', 2007, 1004);
INSERT INTO `db_geekbrains`.`Orders` (`ONum`, `Amt`, `ODate`, `CNum`, `SNum`) VALUES ('3005', 5160.15, '1990/03/10', 2003, 1002);
INSERT INTO `db_geekbrains`.`Orders` (`ONum`, `Amt`, `ODate`, `CNum`, `SNum`) VALUES ('3006', 1098.16, '1990/03/10', 2008, 1007);
INSERT INTO `db_geekbrains`.`Orders` (`ONum`, `Amt`, `ODate`, `CNum`, `SNum`) VALUES ('3009', 1713.23, '1990/04/10', 2002, 1003);
INSERT INTO `db_geekbrains`.`Orders` (`ONum`, `Amt`, `ODate`, `CNum`, `SNum`) VALUES ('3007', 75.75, '1990/04/10', 2004, 1002);
INSERT INTO `db_geekbrains`.`Orders` (`ONum`, `Amt`, `ODate`, `CNum`, `SNum`) VALUES ('3008', 4723.00, '1990/05/10', 2006, 1001);
INSERT INTO `db_geekbrains`.`Orders` (`ONum`, `Amt`, `ODate`, `CNum`, `SNum`) VALUES ('3010', 1309.95, '1990/06/10', 2004, 1002);
INSERT INTO `db_geekbrains`.`Orders` (`ONum`, `Amt`, `ODate`, `CNum`, `SNum`) VALUES ('3011', 9891.88, '1990/06/10', 2006, 1001);
