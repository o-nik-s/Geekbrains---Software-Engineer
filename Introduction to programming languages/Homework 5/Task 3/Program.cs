// Задайте массив вещественных чисел. 
// Найдите разницу между максимальным и минимальным элементов массива.
// [3 7 22 2 78] -> 76


decimal[] NewArray(int size, int MinValue, int MaxValue)
{
    var rand = new Random();
    decimal[] arr = new decimal[size];
    for (int i = 0; i < size; i++)
    {
        arr[i] = new decimal(MinValue + 2 * rand.NextDouble() * MaxValue);
    }
    return arr;
}

void PrintArray(decimal[] arr)
{
    System.Console.Write("[");
    for (int i = 0; i < arr.Length-1; i++)
    {
        System.Console.Write($"{arr[i]}, ");
    }
    System.Console.WriteLine($"{arr[arr.Length-1]}]");
}

decimal FindMax(decimal[] arr)
{
    decimal max = arr[0];
    foreach (decimal el in arr) if (max<el) max = el;
    return max;
}

decimal FindMin(decimal[] arr)
{
    decimal min = arr[0];
    foreach (decimal el in arr) if (min>el) min = el;
    return min;
}

void Main()
{
    const int min = -100, max = 100;

    System.Console.WriteLine("Введите размер массива:");
    int size = int.Parse(Console.ReadLine());
    decimal[] array = NewArray(size, min, max);
    PrintArray(array);
    
    System.Console.WriteLine($"Разность между максимальным и минимальным элементами массива равна {FindMax(array) - FindMin(array)}");
}

Main();