// Задайте значения M и N. Напишите программу, которая найдёт 
// сумму натуральных элементов в промежутке от M до N.
// M = 1; N = 15 -> 120
// M = 4; N = 8. -> 30

int SumNumbers(int m, int n)
{
    if (m == n) return m;
    return m + SumNumbers(m + 1, n);
}

void Main()
{
    System.Console.WriteLine("Введите M:");
    int m = int.Parse(Console.ReadLine());
    System.Console.WriteLine("Введите N:");
    int n = int.Parse(Console.ReadLine());
    if (m > n) (m, n) = (n, m);
    int sum = SumNumbers(m, n);
    Console.WriteLine($"Сумма натуральных чисел в промежутке от {m} до {n} равна {sum}");
}

Main();