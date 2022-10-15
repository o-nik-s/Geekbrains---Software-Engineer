// Напишите цикл, который принимает на вход два числа (A и B) 
// и возводит число A в натуральную степень B.
// 3, 5 -> 243 (3⁵)
// 2, 4 -> 16

int Power(int a, int b)
{
    return (int)Math.Pow(a, b);
}

System.Console.WriteLine("Введите два целых числа: ");
int A = int.Parse(Console.ReadLine());
int B = int.Parse(Console.ReadLine());
System.Console.WriteLine(Power(A, B));

