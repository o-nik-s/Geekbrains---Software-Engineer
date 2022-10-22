// Найдите произведение пар чисел в одномерном массиве. 
// Парой считаем первый и последний элемент, второй и предпоследний и т.д. 
// Результат запишите в новом массиве. 
// [1 2 3 4 5] -> 5 8 3 
// [6 7 3 6] -> 36 21

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

int[] ProductArray(int[] arr)
{
    int[] prodArray = new int[(arr.Length+1)/2];
    for (int i = 0; i <= arr.Length/2-1; i++)
    {
        prodArray[i] = arr[i] * arr[arr.Length - 1 - i];
    }
    if (arr.Length % 2 != 0) prodArray[arr.Length/2] = arr[arr.Length/2];
    return prodArray;
}

const int size = 7;
const int min = -10, max = 10;
int[] array = GetArray(size, min, max);
PrintArray(array);
int[] prodArray = ProductArray(array);
PrintArray(prodArray);