// Напишите программу, которая принимает на вход число N 
// и выдаёт произведение чисел от 1 до N.
// 4 -> 24
// 5 -> 120

Console.WriteLine("Введите целое число: ");
int N = Math.Abs(int.Parse(Console.ReadLine()));

int DigitPower(int n)
{
    int power = 1;
    for (int i = 1; i <= n; i++) power *= i;
    return power;
}

Console.WriteLine($"Произведение цифр от 1 до {N} равно {DigitPower(N)}");