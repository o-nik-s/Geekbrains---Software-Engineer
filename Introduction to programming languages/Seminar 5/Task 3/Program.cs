// Задайте массив. Напишите программу, которая определяет, 
// присутствует ли заданное число в массиве.
// 4; массив [6, 7, 19, 345, 3] -> нет
// -3; массив [6, 7, 19, 345, 3] -> да

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

bool FindInArray(int[] arr, int num)
{
    foreach (int el in arr)
    {
        if (num == el) return true;
    }
    return false;
}


const int size = 10;
const int min = -10, max = 10;
Console.Clear();
int[] array = GetArray(size, min, max);
PrintArray(array);
System.Console.WriteLine("Введите число для определения попадания в массив:");
int num = int.Parse(Console.ReadLine());
// Console.WriteLine(Array.IndexOf(array, num) != -1? "Да" : "Нет");
Console.WriteLine(FindInArray(array, num)? "Да" : "Нет");