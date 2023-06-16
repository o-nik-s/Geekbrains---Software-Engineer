-- 1. Создайте представление, в которое попадут автомобили стоимостью до 25 000 долларов
CREATE VIEW CheapCars AS SELECT Name FROM Cars WHERE Cost<25000;

-- 2. Изменить в существующем представлении порог для стоимости: пусть цена будет до 30 000 долларов (используя оператор ALTER VIEW) 
ALTER VIEW CheapCars AS SELECT Name FROM Cars WHERE Cost<30000;

-- 3. Создайте представление, в котором будут только автомобили марки “Шкода” и “Ауди”
CREATE VIEW SelectCars AS SELECT Name FROM Cars WHERE Name in ('Skoda', 'Audi');