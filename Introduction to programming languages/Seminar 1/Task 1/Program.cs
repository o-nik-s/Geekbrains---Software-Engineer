// Напишите программу, которая на вход принимает число 
// и выдаёт его квадрат (число умноженное на само себя).
// Например:
// 4 -> 16
// -3 -> 9
// -7 -> 49

// See https://aka.ms/new-console-template for more information
Console.WriteLine("Введите число: ");
int number = int.Parse(Console.ReadLine());
int square = number * number;
Console.WriteLine($"Квадрат {number} равен {square}."); 