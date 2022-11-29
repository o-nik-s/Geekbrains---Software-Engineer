// Задайте прямоугольный двумерный массив. Напишите программу, 
// которая будет находить строку с наименьшей суммой элементов.
// Например, задан массив:
// 1 4 7 2
// 5 9 2 3
// 8 4 2 4
// 5 2 6 7
// Программа считает сумму элементов в каждой строке 
// и выдаёт номер строки с наименьшей суммой элементов: 1 строка

int[,] CreateArray(int m, int n, int minValue, int maxValue)
{
    int[,] arr = new int[m, n];
    for (int i = 0; i < m; i++)
        for (int j = 0; j < n; j++)
            {arr[i, j] = new Random().Next(minValue, maxValue + 1);}
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

int MinRow(int[,] arr)
{
    int minRow = 0, minSumRow = 0;
    for (int row = 0; row < arr.GetLength(0); row++)
    {
        int sumColumns = 0;
        for (int column = 0; column < arr.GetLength(1); column++)
            {sumColumns += arr[row, column];}
        if ((row == 0) || (minSumRow>sumColumns)) 
            {
                minRow = row;
                minSumRow = sumColumns;
            }
        }
    return minRow + 1;
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
    int minRow = MinRow(array);
    Console.WriteLine($"Строка с минимальной суммой элементов: {minRow}");
}

Main();