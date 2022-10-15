// Напишите программу, которая принимает на вход трёхзначное число 
// и на выходе показывает последнюю цифру этого числа.
// 456 -> 6
// 782 -> 2
// 918 -> 8

Console.WriteLine("Введите трехзначное число");
int number = int.Parse(Console.ReadLine());
if (number/10)
{
    
}
Console.WriteLine($"Последняя цифра в числе равна {Math.Abs(number - number/10*10)}");
Console.WriteLine($"Последняя цифра в числе равна {Math.Abs(number%10)}");