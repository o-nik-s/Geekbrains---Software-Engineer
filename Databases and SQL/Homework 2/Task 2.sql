-- Сгруппируйте значений количества в 3 сегмента — меньше 100, 100-300 и больше 300.
SET SQL_SAFE_UPDATES = 0;

alter table Sales add column Class varchar(25);
update Sales set Class =
	case when Bucket<100 then "Маленький заказ"
		 when 100<=Bucket and Bucket<=300 then "Средний заказ"
		 when 300<Bucket then "Большой заказ"
    end;