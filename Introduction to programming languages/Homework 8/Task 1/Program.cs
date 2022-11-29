// Задайте двумерный массив. Напишите программу, которая упорядочит по убыванию 
// элементы каждой строки двумерного массива.
// Например, задан массив:
// 1 4 7 2
// 5 9 2 3
// 8 4 2 4
// В итоге получается вот такой массив:
// 7 4 2 1
// 9 5 3 2
// 8 4 4 2


int[,] CreateArray(int m, int n, int minValue, int maxValue)
{
    int[,] arr = new int[m, n];
    for (int i = 0; i < m; i++)
    {
        for (int j = 0; j < n; j++)
            {arr[i, j] = new Random().Next(minValue, maxValue + 1);}
    }
    return arr;
}

void PrintArray(int[,] arr)
{
    for (int i = 0; i < arr.GetLength(0); i++)
    {
        for (int j = 0; j < arr.GetLength(1); j++)
            {Console.Write($"{arr[i, j]} ");}
        System.Console.WriteLine();
    }
}

int[,] SortArray(int[,] arr)
{
    for (int row = 0; row < arr.GetLength(0); row++)
    {
        for (int c = 0; c < arr.GetLength(1); c++)
        {
            for (int d = c + 1; d < arr.GetLength(1); d++)
            {
                if (arr[row, c] < arr[row, d]) 
                    {(arr[row, c], arr[row, d]) = (arr[row, d], arr[row, c]);}
            }
        }
    }
    return arr;
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
    array = SortArray(array);
    System.Console.WriteLine("Отсортированный по строкам массив:");
    PrintArray(array);
}

Main();