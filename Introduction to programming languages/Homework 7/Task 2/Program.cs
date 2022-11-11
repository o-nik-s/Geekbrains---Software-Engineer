// Напишите программу, которая на вход принимает позиции элемента в двумерном массиве, 
// и возвращает значение этого элемента или же указание, что такого элемента нет.
// Например, задан массив:
// 1 4 7 2
// 5 9 2 3
// 8 4 2 4
// [1, 7] -> такого числа в массиве нет ([1, 7] это позиция элемента)

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

void CheckElementInArray(int [,] arr, (int row, int column) position)
{
    if (((0 <= position.row) && (position.row <= arr.GetLength(0))) &&
        ((0 <= position.column) && (position.column <= arr.GetLength(1))))
    {
        Console.WriteLine($"Элемент на данной позиции равен {arr[position.row-1, position.column-1]}");
    }
    else
    {
        Console.WriteLine($"Такого элемента нет.");
        
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
    System.Console.WriteLine("Введите координаты элемента:");
    (int row, int column) position = (int.Parse(Console.ReadLine()), int.Parse(Console.ReadLine()));
    CheckElementInArray(array, position);
}

Main();