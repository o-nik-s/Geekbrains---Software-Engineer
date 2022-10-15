// Напишите программу, которая выводит третью цифру заданного числа 
// или сообщает, что третьей цифры нет.
// 645 -> 5
// 78 -> третьей цифры нет
// 32679 -> 6

Console.WriteLine("Введите целое число:");
int number = Math.Abs(int.Parse(Console.ReadLine()));
if (number < 100)
{
    Console.WriteLine("Третьей цифры нет");
}
else
{
    Console.WriteLine(number / Convert.ToInt32(Math.Pow(10, Convert.ToString(number).Length - 3)) % 10);
}