// Напишите программу, которая заполнит спирально массив 4 на 4.
// Например, на выходе получается вот такой массив:
// 01 02 03 04
// 12 13 14 05
// 11 16 15 06
// 10 09 08 07

int num = 0;

int[,] CreateArray(int m, int n)
{
    int[,] arr = new int[m, n];
    for (int i = 0; i < m; i++)
    {
        for (int j = 0; j < n; j++)
        { arr[i, j] = 0; }
    }
    return arr;
}

void FillArray(int[,] arr, int n, int row, int col)
{
    if (((0 <= row) & (row < n)) & (0 <= col) & (col < n)) if (arr[row, col] == 0)
        try
            {
                num += 1;
                arr[row, col] = num;
                if (row < n - 1) if (arr[row + 1, col] == 0) 
                FillArray(arr, n, row, col + 1);
                FillArray(arr, n, row + 1, col);
                FillArray(arr, n, row, col - 1);
                FillArray(arr, n, row - 1, col);
                FillArray(arr, n, row, col + 1);
            }
            catch (Exception e)
            {
                Console.WriteLine($"{row}, {col}");
                Console.WriteLine("{0} Exception caught.", e);
            }
}

void PrintArray(int[,] arr)
{
    for (int i = 0; i < arr.GetLength(0); i++)
    {
        for (int j = 0; j < arr.GetLength(1); j++)
            Console.Write($"{string.Format("{0:d2}", arr[i, j])} ");
        System.Console.WriteLine();
    }
}

void Main()
{
    System.Console.WriteLine("Введите размер массива:");
    int n = int.Parse(Console.ReadLine());
    int[,] array = CreateArray(n, n);
    FillArray(array, n, 0, 0);
    System.Console.WriteLine("Массив:");
    PrintArray(array);
}

Main();