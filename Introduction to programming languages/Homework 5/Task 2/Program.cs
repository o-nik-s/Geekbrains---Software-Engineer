// Задайте одномерный массив, заполненный случайными числами. 
// Найдите сумму элементов, стоящих на нечётных позициях.
// [3, 7, 23, 12] -> 19
// [-4, -6, 89, 6] -> 0

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

int OddPositionDigitSum(int[] arr)
{
    int sum = 0;
    for (int i = 1; i < arr.Length; i+=2) sum+=arr[i];
    return sum;
}

void Main()
{
    const int min = -100, max = 100;

    System.Console.WriteLine("Введите размер массива:");
    int size = int.Parse(Console.ReadLine());
    int[] array = NewArray(size, min, max);
    PrintArray(array);

    System.Console.WriteLine($"Сумма элементов на четных позициях равна {OddPositionDigitSum(array)}");
}

Main();