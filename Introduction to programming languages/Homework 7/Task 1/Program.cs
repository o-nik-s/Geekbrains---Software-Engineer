// Задайте двумерный массив размером m×n, заполненный случайными целыми числами.
// m = 3, n = 4.
// 1 4 8 19
// 5 -2 33 -2
// 77 3 8 1


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

void Main()
{
    const int minValue = 0, maxValue = 100;
    System.Console.WriteLine("Введите количество строк массива:");
    int rows = int.Parse(Console.ReadLine());
    System.Console.WriteLine("Введите количество столбцов массива:");
    int columns = int.Parse(Console.ReadLine());
    int[,] array = CreateArray(rows, columns, minValue, maxValue);
    PrintArray(array);
}

Main();