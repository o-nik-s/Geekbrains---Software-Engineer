create table Cars
(
    Id    int auto_increment primary key,
    Name varchar(255) not null,
    Cost  int not null
);

INSERT INTO Cars (Id, Name, Cost) VALUES (1, 'Audi', 52642);
INSERT INTO Cars (Id, Name, Cost) VALUES (2, 'Mercedes', 57127);
INSERT INTO Cars (Id, Name, Cost) VALUES (3, 'Skoda', 9000);
INSERT INTO Cars (Id, Name, Cost) VALUES (4, 'Volvo', 29000);
INSERT INTO Cars (Id, Name, Cost) VALUES (5, 'Bentley', 350000);
INSERT INTO Cars (Id, Name, Cost) VALUES (6, 'Citroen', 21000);
INSERT INTO Cars (Id, Name, Cost) VALUES (7, 'Hummer', 41400);
INSERT INTO Cars (Id, Name, Cost) VALUES (8, 'Volkswagen', 21600);


-- 1. Создайте представление, в которое попадут автомобили стоимостью до 25 000 долларов
CREATE VIEW CheapCars AS SELECT Name FROM Cars WHERE Cost<25000;

-- 2. Изменить в существующем представлении порог для стоимости: пусть цена будет до 30 000 долларов (используя оператор ALTER VIEW) 
ALTER VIEW CheapCars AS SELECT Name FROM Cars WHERE Cost<30000;

-- 3. Создайте представление, в котором будут только автомобили марки “Шкода” и “Ауди”
CREATE VIEW SelectCars AS SELECT Name FROM Cars WHERE Name in ('Skoda', 'Audi');