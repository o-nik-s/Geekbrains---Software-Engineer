// Напишите программу замена элементов массива: положительные элементы замените 
// на соответствующие отрицательные, и наоборот. [-4, -8, 8, 2] -> [4, 8, -8, -2].

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

int[] ArrayReplace(int[] arr)
{
    for (int i = 0; i < arr.Length; i++)
    {
        arr[i] = -arr[i];
    }
    return arr;
}

const int size = 10;
const int min = -10, max = 10;
int[] array = GetArray(size, min, max);
PrintArray(array);
array = ArrayReplace(array);
PrintArray(array);