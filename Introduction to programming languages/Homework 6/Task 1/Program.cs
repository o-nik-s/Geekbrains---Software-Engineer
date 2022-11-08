// Задача 41: Пользователь вводит с клавиатуры M чисел. 
// Посчитайте, сколько чисел больше 0 ввёл пользователь.
// 0, 7, 8, -2, -2 -> 2
// -1, -7, 567, 89, 223-> 3

int[] GetArray(int count)
{
    int[] array = new int[count];
    for (int i = 0; i < count; i++) array[i] = int.Parse(Console.ReadLine());
    return array;
}

void PrintArray(int[] arr)
{
    System.Console.Write("Вы ввели: ");
    foreach (var el in arr) Console.Write($"{el} ");
    Console.WriteLine();
}


int PositiveCount(int[] arr)
{
    int count = 0;
    foreach (var el in arr) count += el > 0 ? 1 : 0;
    return count;
}

void Main()
{
    Console.WriteLine($"Какое количество чисел Вы хотите ввести?");
    int count = int.Parse(Console.ReadLine());
    Console.WriteLine($"Введите числа через Enter:");
    int[] array = GetArray(count);
    PrintArray(array);
    Console.WriteLine($"Количество позитивных чисел равно {PositiveCount(array)}");
}

Main();