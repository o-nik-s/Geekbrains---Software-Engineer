// Напишите программу вычисления функции Аккермана с помощью рекурсии. 
// Даны два неотрицательных числа m и n.
// m = 2, n = 3 -> A(m, n) = 9
// m = 3, n = 2 -> A(m, n) = 29
//
// A(m, n) = n + 1, m = 0; 
// A(m, n) = A(m - 1, 1), m > 0, n = 0;
// A(m, n) = A(m - 1, A(m, n - 1)), m > 0, n > 0;


int Akkerman(int m, int n)
{
    if (m == 0) return n + 1;
    if (n == 0) return Akkerman(m - 1, 1);
    return Akkerman(m - 1, Akkerman(m, n - 1));
}

void Main()
{
    System.Console.WriteLine("Введите m:");
    int m = int.Parse(Console.ReadLine());
    System.Console.WriteLine("Введите n:");
    int n = int.Parse(Console.ReadLine());
    int sum = Akkerman(m, n);
    Console.WriteLine($"Функция Аккермана для m = {m} и n = {n} равна {sum}");
}

Main();