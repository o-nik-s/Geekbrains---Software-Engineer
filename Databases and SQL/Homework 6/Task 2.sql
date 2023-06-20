-- 2. Выведите только четные числа от 1 до 10. Пример: 2,4,6,8,10 
Drop procedure if exists print_even;
DELIMITER // 
CREATE PROCEDURE print_even (IN max_value INT) 
BEGIN 
    DECLARE i INT DEFAULT 1;
    DECLARE res VARCHAR(100) DEFAULT "";
    WHILE i <= max_value DO
		IF mod(i, 2) = 0 THEN SET res = CONCAT(res, ' ', i); END IF; 
        SET i = i + 1; 
    END WHILE;
    SELECT res;
END // 

Call print_even(10);