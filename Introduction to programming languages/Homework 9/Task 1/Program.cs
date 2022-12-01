// Задайте значение N. Напишите программу, 
// которая выведет все чётные числа в промежутке от N до 1. Выполнить с помощью рекурсии.
// N = 5 -> "4, 2"
// N = 8 -> "8, 6, 4, 2,"

const int div = 2;

void WriteDivNumbers(int n)
{
    Console.Write($"{n}, ");
    if (n > div) WriteDivNumbers(n - div);
}

void Main()
{
    System.Console.WriteLine("Введите N:");
    int n = int.Parse(Console.ReadLine());
    if (n >= div) WriteDivNumbers(n / div * div);
}

Main();