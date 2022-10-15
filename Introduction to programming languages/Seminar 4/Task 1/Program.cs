// Напишите программу, которая принимает на вход число (А) 
// и выдаёт сумму чисел от 1 до А.
// 7 -> 28
// 4 -> 10
// 8 -> 36

int GetSumNums(int number)
{   
    int sum = 0;
    for (int i = 0; i <= number; i++) sum += i;
    return sum;
}

Console.WriteLine("Введите натуральное число: ");
int A = int.Parse(Console.ReadLine());

Console.WriteLine($"Сумма чисел равна: {GetSumNums(A)}");