-- 1. Создайте функцию, которая принимает кол-во сек и формат их в кол-во дней часов. 
-- Пример: 123456 ->'1 days 10 hours 17 minutes 36 seconds '
Drop procedure if exists sec_to_time;
DELIMITER // 
CREATE PROCEDURE sec_to_time (IN init_time INT) 
BEGIN
    DECLARE time_from_seconds VARCHAR(100) DEFAULT "";
    SET time_from_seconds = Concat(time_from_seconds, mod(init_time, 60), ' seconds');
    SET init_time = init_time DIV 60;
    SET time_from_seconds = Concat(mod(init_time, 60), ' minutes ', time_from_seconds);
    SET init_time = init_time DIV 60;
    SET time_from_seconds = Concat(mod(init_time, 24), ' hours ', time_from_seconds);
    SET init_time = init_time DIV 24;
    SET time_from_seconds = Concat(init_time, ' days ', time_from_seconds);
    SELECT time_from_seconds;
END // 

Call sec_to_time(123456);