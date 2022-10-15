// Напишите программу, которая выводит массив из 8 элементов, 
// заполненный нулями и единицами в случайном порядке.
// [1,0,1,1,0,1,0,0]

int[] ArrayFill(int count)
{
    int[] array = new int[count];
    for (int i = 0; i < count; i++)
    {
        array[i] = new Random().Next(0, 2);
    }
    return array;
}

void ArrayPrint(int[] arr)
{
    System.Console.Write("[");
    for (int i = 0; i < arr.Length-1; i++)
    {
        System.Console.Write($"{arr[i]}, ");
    }
    System.Console.WriteLine($"{arr[arr.Length-1]}]");
}

Console.WriteLine("Введите количество элементов в массиве: ");
int N = int.Parse(Console.ReadLine());
int[] array = ArrayFill(N);
ArrayPrint(array);