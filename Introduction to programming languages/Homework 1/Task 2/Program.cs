// Напишите программу, которая принимает на вход три числа 
// и выдаёт максимальное из этих чисел.
// 2, 3, 7 -> 7
// 44 5 78 -> 78
// 22 3 9 -> 22

Console.WriteLine("Введите три числа:");
int a = int.Parse(Console.ReadLine());
int b = int.Parse(Console.ReadLine());
int c = int.Parse(Console.ReadLine());
// int max = Math.Max(a, Math.Max(b, c));
int max = a;
if (b>max) {max=b;}
if (c>max) {max=c;}
Console.WriteLine($"Максимальное из трех чисел равно {max}.");
