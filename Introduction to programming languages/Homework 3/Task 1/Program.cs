// Напишите программу, которая принимает на вход пятизначное число и проверяет, 
// является ли оно палиндромом.
// 14212 -> нет
// 12821 -> да
// 23432 -> да

bool palindrom = true;
Console.WriteLine("Введите число:");
string input = Console.ReadLine();
int number = int.Parse(input);
int length = input.Length;
int[] digits = new int[length];
for (int i = 0; i < length; i++) digits[i] = number % (int)(Math.Pow(10, i + 1)) / (int)(Math.Pow(10, i));
for (int i = 0; i < length / 2; i++) if (digits[i] != digits[length - 1 - i]) palindrom = false;
Console.WriteLine($"Число {(palindrom ? "" : "не ")}является палиндромом.");