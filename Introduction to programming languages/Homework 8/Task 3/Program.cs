// Задайте две матрицы. Напишите программу, 
// которая будет находить произведение двух матриц.
// (Посмотрите как реализуется произведение матриц, 
// там не просто перемножение элемент на элемент.)
// Например, даны 2 матрицы:
// 2 4 | 3 4
// 3 2 | 3 3
// Результирующая матрица будет:
// 18 20
// 15 18

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

int[,] ProductArrays(int[,] arr1, int[,] arr2)
{
    int[,] prodArr = new int[arr1.GetLength(0), arr2.GetLength(1)];
    for (int i = 0; i < prodArr.GetLength(0); i++)
        for (int j = 0; j < prodArr.GetLength(1); j++)
        {
            int sum = 0;
            for (int k = 0; k < arr1.GetLength(1); k++)
               sum += arr1[i, k] * arr2[k, j];
            prodArr[i, j] = sum;
        }
    return prodArr;
}

void Main()
{
    const int minValue = 0, maxValue = 10;
    System.Console.WriteLine("Введите количество строк первой матрицы:");
    int l = int.Parse(Console.ReadLine());
    System.Console.WriteLine("Введите количество столбцов первой / строк второй матрицы:");
    int m = int.Parse(Console.ReadLine());
    System.Console.WriteLine("Введите количество столбцов второй матрицы:");
    int n = int.Parse(Console.ReadLine());
    int[,] array1 = CreateArray(l, m, minValue, maxValue);
    System.Console.WriteLine("Матрица 1:");
    PrintArray(array1);
    int[,] array2 = CreateArray(m, n, minValue, maxValue);
    System.Console.WriteLine("Матрица 2:");
    PrintArray(array2);
    int[,] prodArr = ProductArrays(array1, array2);
    System.Console.WriteLine("Произведение матриц равно:");
    PrintArray(prodArr);
}

Main();