-- Используя операторы языка SQL, создайте табличку “sales”. Заполните ее данными 
CREATE TABLE IF NOT EXISTS Sales
	(Id SERIAL PRIMARY KEY, 
    OrderDate DATE NOT NULL, 
    Bucket INT NOT NULL);
    
INSERT INTO `db_geekbrains`.`Sales` (`Id`, `OrderDate`, `Bucket`) VALUES ('1', '2021-01-01', 150);
INSERT INTO `db_geekbrains`.`Sales` (`Id`, `OrderDate`, `Bucket`) VALUES ('2', '2021-01-02', 175);
INSERT INTO `db_geekbrains`.`Sales` (`Id`, `OrderDate`, `Bucket`) VALUES ('3', '2021-01-03', 75);
INSERT INTO `db_geekbrains`.`Sales` (`Id`, `OrderDate`, `Bucket`) VALUES ('4', '2021-01-04', 200);
INSERT INTO `db_geekbrains`.`Sales` (`Id`, `OrderDate`, `Bucket`) VALUES ('5', '2021-01-05', 350);