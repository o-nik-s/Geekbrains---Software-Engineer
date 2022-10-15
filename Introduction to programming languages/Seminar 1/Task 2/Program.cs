// 2. Напишите программу, которая на вход принимает два числа и проверяет, 
// является ли первое число квадратом второго.
// a = 25, b = 5 -> да
// a = 2, b = 10 -> нет
// a = 9, b = -3 -> да
// a = -3 b = 9 -> нет

// See https://aka.ms/new-console-template for more information
Console.WriteLine("Введите два числа: ");
int a = int.Parse(Console.ReadLine());
int b = int.Parse(Console.ReadLine());
if (b == Math.Pow(a, 2))
{
    Console.WriteLine("Первое число является квадратом второго");
}
else
{
    Console.WriteLine("Первое число не является квадратом второго");
}