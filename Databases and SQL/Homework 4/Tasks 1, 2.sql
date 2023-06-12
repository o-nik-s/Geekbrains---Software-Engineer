-- 1. Вывести на экран сколько машин каждого цвета для машин марок BMW и LADA
Select Mark, Color, Count(*) 
from Auto
where Mark in ('BMW', 'LADA')
group by Mark, Color
order by Mark, Color;

-- 2. Вывести на экран марку авто и количество AUTO не этой марки
Select Mark, (Select Count(*) from Auto)-Count(*) as OtherMarkCount
from Auto
group by Mark
order by Mark