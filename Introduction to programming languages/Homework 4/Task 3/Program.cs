// Напишите программу, которая задаёт массив из 8 элементов и выводит их на экран.
// 1, 2, 5, 7, 19, 2, 4, 9 -> [1, 2, 5, 7, 19, 2, 4, 9 ]
// 6, 1, 33, 2, 93, 15, 424, 0-> [6, 1, 33, 2, 93, 15, 424, 0]

int[] ArrayFill(int count, int max)
{
    int[] array = new int[count];
    for (int i = 0; i < count; i++)
    {
        array[i] = new Random().Next(0, max);
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

const int count = 8;
const int len = 3;
int[] array = ArrayFill(count, (int)Math.Pow(10, len));
ArrayPrint(array);