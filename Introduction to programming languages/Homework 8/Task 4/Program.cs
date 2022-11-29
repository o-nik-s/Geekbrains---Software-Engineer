// Сформируйте трёхмерный массив из неповторяющихся двузначных чисел. 
// Напишите программу, которая будет построчно выводить массив, добавляя индексы каждого элемента.
// Массив размером 2 x 2 x 2
// 66(0,0,0) 25(0,1,0)
// 34(1,0,0) 41(1,1,0)
// 27(0,0,1) 90(0,1,1)
// 26(1,0,1) 55(1,1,1)

int[,,] CreateArray(int l, int m, int n, int minValue, int maxValue)
{
    int[,,] arr = new int[l, m, n];
    List<int> elArr = new List<int>(l * m * n);
    int newEl = new Random().Next(minValue, maxValue + 1);
    for (int i = 0; i < l; i++)
        for (int j = 0; j < m; j++)
            for (int k = 0; k < n; k++)
                {
                    while (elArr.Contains(newEl))
                        newEl = new Random().Next(minValue, maxValue + 1);
                    arr[i, j, k] = newEl;
                    elArr.Add(arr[i, j, k]);
                }
    return arr;
}

void PrintArray(int[,,] arr)
{
    for (int i = 0; i < arr.GetLength(0); i++)
        for (int j = 0; j < arr.GetLength(1); j++)
            {
                for (int k = 0; k < arr.GetLength(2); k++)
                    Console.Write($"{arr[i, j, k]}({i},{j},{k}) ");
                System.Console.WriteLine();
            }
}

void Main()
{
    const int minValue = 10, maxValue = 99;
    System.Console.WriteLine("Введите размеры массива.");
    System.Console.WriteLine("Введите первую размерность:");
    int l = int.Parse(Console.ReadLine());
    System.Console.WriteLine("Введите вторую размерность:");
    int m = int.Parse(Console.ReadLine());
    System.Console.WriteLine("Введите третью размерность:");
    int n = int.Parse(Console.ReadLine());
    int[,,] array = CreateArray(l, m, n, minValue, maxValue);
    System.Console.WriteLine("Массив:");
    PrintArray(array);
}

Main();