// Задайте массив заполненный случайными положительными трёхзначными числами. 
// Напишите программу, которая покажет количество чётных чисел в массиве.
// [345, 897, 568, 234] -> 2

int[] NewArray(int size, int MinValue, int MaxValue)
{
    int[] arr = new int[size];
    for (int i = 0; i < size; i++)
    {
        arr[i] = new Random().Next(MinValue, MaxValue + 1);
    }
    return arr;
}

void PrintArray(int[] arr)
{
    System.Console.Write("[");
    for (int i = 0; i < arr.Length-1; i++)
    {
        System.Console.Write($"{arr[i]}, ");
    }
    System.Console.WriteLine($"{arr[arr.Length-1]}]");
}

int EvenCount(int[] arr)
{
    int count = 0;
    foreach (int el in arr) if (el % 2 == 0) count ++;
    return count;
}

void Main()
{
    const int min = 100, max = 1000;

    System.Console.WriteLine("Введите размер массива:");
    int size = int.Parse(Console.ReadLine());
    int[] array = NewArray(size, min, max);
    PrintArray(array);

    System.Console.WriteLine($"Количество четных элементов в массиве равно {EvenCount(array)}");
}

Main();