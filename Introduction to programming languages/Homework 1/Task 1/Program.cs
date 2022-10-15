// Напишите программу, которая на вход принимает два числа и выдаёт, 
// какое число большее, а какое меньшее.
// a = 5; b = 7 -> max = 7
// a = 2 b = 10 -> max = 10
// a = -9 b = -3 -> max = -3

Console.WriteLine("Введите два числа:");
int a = int.Parse(Console.ReadLine());
int b = int.Parse(Console.ReadLine());
// int max = Math.Max(a, b);
int max = a;
if (a<b) {max = b;}
Console.WriteLine($"Максимальное из двух чисел равно {max}.");