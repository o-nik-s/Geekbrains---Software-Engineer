// Напишите программу, которая принимает на вход число (N) 
// и выдаёт таблицу кубов чисел от 1 до N.
// 3 -> 1, 8, 27
// 5 -> 1, 8, 27, 64, 125

Console.WriteLine("Введите натуральное число:");
int N = int.Parse(Console.ReadLine());
for (int i = 1; i < N; i++){Console.Write($"{Math.Pow(i, 3)}, ");}
Console.Write(Math.Pow(N, 3));