// Напишите программу, которая принимает на вход число 
// и выдаёт сумму цифр в числе.
// 452 -> 11
// 82 -> 10
// 9012 -> 12

System.Console.WriteLine("Введите целое число: ");
int number = Math.Abs(int.Parse(Console.ReadLine()));

int DigitSum(int num)
{
    int sum = 0;//, i = 0;
    do
    {
        sum += num % 10;
        num /= 10;
    } while (num>0);
    return sum;
}

int digitSum = DigitSum(number);
System.Console.WriteLine(digitSum);