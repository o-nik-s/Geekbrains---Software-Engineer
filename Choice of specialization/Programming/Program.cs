string[] ReadStrings(int n)
{
    Console.WriteLine($"Введите {n} строк - элементов массива:");
    string[] array = new string[n];
    for (int i = 0; i < n; i++) 
        array[i] = Console.ReadLine();
    return array;
}

string[] ShortStrings(string[] array, int n)
{
    return array.Where(p => p.Length <= n).ToArray();
}


string[] ShortStrings2(string[] array, int n)
{
    string[] newArray = new string[array.Length];
    int count = 0;
    for (int i = 0; i < array.Length; i++)
        if (array[i].Length <= n) 
            {
                newArray[count] = array[i];
                count++;
            }
    Array.Resize(ref newArray, count);
    return newArray;
}

void PrintArray(string[] arr)
{
    Console.Write("[");
    for (int i = 0; i < arr.Length-1; i++) 
        Console.Write($"{arr[i]}, ");
    if (arr.Length>0) 
        Console.Write($"{arr[arr.Length-1]}"); 
    Console.WriteLine("]");;
}

void Main()
{   const int maxLength = 3;
    Console.WriteLine("Введите количество строк в исходном массиве:");
    int stringCount = int.Parse(Console.ReadLine());
    string[] array = ReadStrings(stringCount);
    Console.WriteLine("Вы ввели:");
    PrintArray(array);
    string[] shortWords = ShortStrings(array, maxLength);
    Console.WriteLine($"Новый массив из строк с длиной не более {maxLength}:");
    PrintArray(shortWords);
    Console.WriteLine($"Другой метод подсчета:");
    PrintArray(ShortStrings2(array, maxLength));
}

Main();