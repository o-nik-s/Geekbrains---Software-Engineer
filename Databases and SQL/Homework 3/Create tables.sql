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

INSERT INTO `db_geekbrains`.`SalesPeople` (`CNum`, `CName`, `City`, `Rating`, `SNum`) VALUES ('2001', 'Hoffman', 'London', 100, 1001);
INSERT INTO `db_geekbrains`.`SalesPeople` (`CNum`, `CName`, `City`, `Rating`, `SNum`) VALUES ('2002', 'Giovanni', 'Rome', 200, 1003);
INSERT INTO `db_geekbrains`.`SalesPeople` (`CNum`, `CName`, `City`, `Rating`, `SNum`) VALUES ('2003', 'Liu', 'SanJose', 200, 1002);
INSERT INTO `db_geekbrains`.`SalesPeople` (`CNum`, `CName`, `City`, `Rating`, `SNum`) VALUES ('2004', 'Grass', 'Berlin', 300, 1002);
INSERT INTO `db_geekbrains`.`SalesPeople` (`CNum`, `CName`, `City`, `Rating`, `SNum`) VALUES ('2006', 'Clemens', 'London', 100, 1001);
INSERT INTO `db_geekbrains`.`SalesPeople` (`CNum`, `CName`, `City`, `Rating`, `SNum`) VALUES ('2008', 'Cisneros', 'SanJose', 300, 1007);
INSERT INTO `db_geekbrains`.`SalesPeople` (`CNum`, `CName`, `City`, `Rating`, `SNum`) VALUES ('2007', 'Pereira', 'Rome', 100, 1004);