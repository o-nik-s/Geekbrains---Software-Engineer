// Напишите программу, которая принимает на вход число 
// и выдаёт количество цифр в числе.
// 456 -> 3
// 78 -> 2
// 89126 -> 5

double DigitCount(int n)
{
    if (n==0) return 1;
    return Math.Round(Math.Log10(n), MidpointRounding.ToPositiveInfinity);
}

Console.WriteLine("Введите целое число: ");
int number = Math.Abs(int.Parse(Console.ReadLine()));

Console.WriteLine(DigitCount(number));