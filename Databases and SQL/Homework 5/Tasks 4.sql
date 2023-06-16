/**
Есть таблица анализов Analysis:
an_id — ID анализа;
an_name — название анализа;
an_cost — себестоимость анализа;
an_price — розничная цена анализа;
an_group — группа анализов.
Есть таблица групп анализов Groups:
gr_id — ID группы;
gr_name — название группы;
gr_temp — температурный режим хранения.
Есть таблица заказов Orders:
ord_id — ID заказа;
ord_datetime — дата и время заказа;
ord_an — ID анализа.
**/

-- 4. Вывести название и цену для всех анализов, которые продавались 5 февраля 2020 и всю следующую неделю.
Select * 
from Analysis a
join Orders o on a.an_id = o.ord_an
where '2020-02-05' <= ord_datetime and ord_datetime <= '2020-02-11'