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



CREATE TABLE IF NOT EXISTS Employee
	(Id SERIAL PRIMARY KEY,
    Name CHAR(15) NOT NULL,
    Surname CHAR(25) NOT NULL,
    Specialty CHAR(25),
    Seniority INT,
    Salary INT,
    Age INT);


INSERT INTO `db_geekbrains`.`Employee` (`Id`, `Name`, `Surname`, `Specialty`, `Seniority`, `Salary`, `Age`) VALUES (1, 'Вася', 'Васькин', 'начальник', 40, 100000, 60);
INSERT INTO `db_geekbrains`.`Employee` (`Id`, `Name`, `Surname`, `Specialty`, `Seniority`, `Salary`, `Age`) VALUES (2, 'Петя', 'Петькин', 'начальник', 8, 70000, 30);
INSERT INTO `db_geekbrains`.`Employee` (`Id`, `Name`, `Surname`, `Specialty`, `Seniority`, `Salary`, `Age`) VALUES (3, 'Катя', 'Катькина', 'инженер', 2, 70000, 25);
INSERT INTO `db_geekbrains`.`Employee` (`Id`, `Name`, `Surname`, `Specialty`, `Seniority`, `Salary`, `Age`) VALUES (4, 'Саша', 'Сашкин', 'инженер', 12, 50000, 35);
INSERT INTO `db_geekbrains`.`Employee` (`Id`, `Name`, `Surname`, `Specialty`, `Seniority`, `Salary`, `Age`) VALUES (5, 'Иван', 'Иванов', 'рабочий', 40, 30000, 59);
INSERT INTO `db_geekbrains`.`Employee` (`Id`, `Name`, `Surname`, `Specialty`, `Seniority`, `Salary`, `Age`) VALUES (6, 'Петр', 'Петров', 'рабочий', 20, 25000, 40);
INSERT INTO `db_geekbrains`.`Employee` (`Id`, `Name`, `Surname`, `Specialty`, `Seniority`, `Salary`, `Age`) VALUES (7, 'Сидор', 'Сидоров', 'рабочий', 10, 20000, 35);
INSERT INTO `db_geekbrains`.`Employee` (`Id`, `Name`, `Surname`, `Specialty`, `Seniority`, `Salary`, `Age`) VALUES (8, 'Антон', 'Антонов', 'рабочий', 8, 19000, 28);
INSERT INTO `db_geekbrains`.`Employee` (`Id`, `Name`, `Surname`, `Specialty`, `Seniority`, `Salary`, `Age`) VALUES (9, 'Юра', 'Юркин', 'рабочий', 5, 15000, 25);
INSERT INTO `db_geekbrains`.`Employee` (`Id`, `Name`, `Surname`, `Specialty`, `Seniority`, `Salary`, `Age`) VALUES (10, 'Максим', 'Воронин', 'рабочий', 2, 11000, 22);
INSERT INTO `db_geekbrains`.`Employee` (`Id`, `Name`, `Surname`, `Specialty`, `Seniority`, `Salary`, `Age`) VALUES (11, 'Юра', 'Галкин', 'рабочий', 3, 12000, 24);
INSERT INTO `db_geekbrains`.`Employee` (`Id`, `Name`, `Surname`, `Specialty`, `Seniority`, `Salary`, `Age`) VALUES (12, 'Люся', 'Люськина', 'уборщик', 10, 10000, 60);
