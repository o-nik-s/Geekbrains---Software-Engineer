/* Напишите программу, которая будет принимать на вход два числа и выводить, 
является ли второе число кратным первому. Если число 2 не кратно числу 1, 
то программа выводит остаток от деления.
5, 34 -> не кратно, остаток 4
4, 16 -> кратно */

Console.WriteLine("Введите два числа:");
int a = int.Parse(Console.ReadLine());
int b = int.Parse(Console.ReadLine());
if (a == 0) { Console.WriteLine("Некорректный ввод."); return; }
string msg = String.Empty;
if (b % a == 0) { msg = "кратно"; }
else { msg = $"не кратно, остаток {b % a}"; }
Console.WriteLine(msg);