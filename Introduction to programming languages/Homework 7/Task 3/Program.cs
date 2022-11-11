// Задайте двумерный массив из целых чисел. 
// Найдите среднее арифметическое элементов в каждом столбце.
// Например, задан массив:
// 1 4 7 2
// 5 9 2 3
// 8 4 2 4
// Среднее арифметическое каждого столбца: 4,6; 5,6; 3,6; 3.

int[,] CreateArray(int m, int n, int minValue, int maxValue)
{
    int[,] arr = new int[m, n];
    for (int i = 0; i < m; i++)
    {
        for (int j = 0; j < n; j++)
        {
            arr[i, j] = new Random().Next(minValue, maxValue + 1);
        }
    }
    return arr;
}

void PrintArray(int[,] arr)
{
    for (int i = 0; i < arr.GetLength(0); i++)
    {
        for (int j = 0; j < arr.GetLength(1); j++)
        {
            Console.Write($"{arr[i, j]} ");
        }
        System.Console.WriteLine();
    }
}

void SumColumns(int [,] arr)
{
    for (int i = 0; i < arr.GetLength(1); i++)
    {
        int sum = 0;
        for (int j = 0; j < arr.GetLength(0); j++)
        {
            sum += arr[j, i];
        }
        Console.Write($"{sum}; "); 
    }
}

void Main()
{
    const int minValue = 0, maxValue = 100;
    System.Console.WriteLine("Введите количество строк массива:");
    int rows = int.Parse(Console.ReadLine());
    System.Console.WriteLine("Введите количество столбцов массива:");
    int columns = int.Parse(Console.ReadLine());
    int[,] array = CreateArray(rows, columns, minValue, maxValue);
    System.Console.WriteLine("Массив:");
    PrintArray(array);
    Console.WriteLine("Сумма элементов массива по столбцам равна:");
    SumColumns(array);
}

Main();