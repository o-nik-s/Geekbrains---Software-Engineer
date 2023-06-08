-- 1. Отсортируйте поле “зарплата” в порядке убывания и возрастания
Select * from Employee order by Salary desc;
Select * from Employee order by Salary;

-- 2. Отсортируйте по возрастанию поле “Зарплата” и выведите 5 строк с наибольшей заработной платой (возможен подзапрос)
Select * from Employee order by Salary desc limit 5;

-- 3. Выполните группировку всех сотрудников по специальности , суммарная зарплата которых превышает 100000
Select Specialty, sum(Salary) as Salary from Employee 
group by Specialty
having sum(Salary)>100000;