// Напишите программу, которая принимает на вход координаты точки (X и Y), 
// причём X ≠ 0 и Y ≠ 0 и выдаёт номер четверти плоскости, в которой находится эта точка.

Console.WriteLine("Введите X:");
int X = int.Parse(Console.ReadLine());
Console.WriteLine("Введите Y:");
int Y = int.Parse(Console.ReadLine());

int number = 0;
if (X > 0 & Y > 0) number = 1;
else if (X < 0 & Y > 0) number = 2;
else if (X < 0 & Y < 0) number = 3;
else if (X > 0 & Y < 0) number = 4;
if (number > 0) Console.WriteLine($"Это {number} четверть.");
else Console.WriteLine($"Это ось.");