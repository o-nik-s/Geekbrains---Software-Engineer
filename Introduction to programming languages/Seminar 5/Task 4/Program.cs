// Задайте одномерный массив из 123 случайных чисел. 
// Найдите количество элементов массива, значения которых лежат в отрезке [10, 99].  
// Пример для массива из 5, а не 123 элементов. 
// В своём решении сделайте для 123 
// [5, 18, 123, 6, 2] -> 1 
// [1, 2, 3, 6, 2] -> 0 
// [10, 11, 12, 13, 14] -> 5 

int[] GetArray(int size, int MinValue, int MaxValue)
{
    int[] array = new int[size];
    for (int i = 0; i < size; i++)
    {
        array[i] = new Random().Next(MinValue, MaxValue+1);        
    }
    return array;
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

int NumberBelongCount(int[] array, int min, int max)
{
    int count = 0;
    foreach (int el in array)
    {
        count += Convert.ToInt32(min <= el & el <= max);
    }
    return count;
}

const int size = 123;
const int minArray = -1000, maxArray = 1000;
const int minInt = 10, maxInt = 99;
int[] array = GetArray(size, minArray, maxArray);
PrintArray(array);
System.Console.WriteLine($"Количество чисел массива, попадающих в диапазон {minInt} - {maxInt}, равно {NumberBelongCount(array, minInt, maxInt)}");