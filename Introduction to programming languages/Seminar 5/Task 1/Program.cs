/* Задайте массив из 12 элементов, заполненный случайными числами
 из промежутка [-9, 9]. Найдите сумму отрицательных и положительных элементов массива.
Например, в массиве [3,9,-8,1,0,-7,2,-1,8,-3,-1,6] сумма положительных чисел равна 29, 
сумма отрицательных равна -20. */


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
    System.Console.Write($"{arr[arr.Length-1]}]");
}

(int, int) DigitSum(int[] array)
{
    (int, int) sum = (0, 0);
    foreach (int el in array)
    {
        if (el>0) sum.Item1+=el;
        else sum.Item2+=el;
    }
    return sum;
}

const int size = 12;
const int board = 9;
int[] array = GetArray(size, -board, board);
(int, int) summ = DigitSum(array);
Console.Write("В массиве ");
PrintArray(array);
Console.Write($" сумма положительных чисел равна {summ.Item1}, сумма отрицательных равна {summ.Item2}.");