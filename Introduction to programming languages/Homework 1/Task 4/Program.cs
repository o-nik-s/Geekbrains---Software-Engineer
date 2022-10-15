// Напишите программу, которая на вход принимает число (N), 
// а на выходе показывает все чётные числа от 1 до N.
// 5 -> 2, 4
// 8 -> 2, 4, 6, 8

Console.WriteLine("Введите натуральное число");
int N = int.Parse(Console.ReadLine());
int i = 2;
while (i<N-1) {Console.Write($"{i}, "); i+=2;}
if (N>1) Console.Write(i);