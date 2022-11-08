// Напишите программу, которая найдёт точку пересечения двух прямых, 
// заданных уравнениями y = k1 * x + b1, y = k2 * x + b2; 
// значения b1, k1, b2 и k2 задаются пользователем.
// b1 = 2, k1 = 5, b2 = 4, k2 = 9 -> (-0,5; -0,5)

float[] ReadKoeff(int cnt)
{
    float[] koeff = new float[cnt];
    Console.WriteLine($"Введите коэффициенты прямых (b1, k1), (b2, k2):");
    string[] koeffName = new string[] {"b1", "k1", "b2", "k2"};
    for (var i = 0; i < koeff.Length; i++) 
        {
            System.Console.Write($"{koeffName[i]}: ");
            koeff[i] = float.Parse(Console.ReadLine());
        }
    return koeff;
}

(float, float) Solver(float[] koeff)
{
    float x = (koeff[2] - koeff[0]) / (koeff[1] - koeff[3]);
    float y = koeff[1] * x + koeff[0];
    return (x, y);
}

void Main()
{
    const int cnt = 4;
    float[] koeff = new float[cnt];
    koeff = ReadKoeff(cnt);
    if (koeff[1] == koeff[3]) 
        {
            System.Console.WriteLine("Решения нет / много.");
            return;
        }
    (float, float) decision = Solver(koeff);
    System.Console.WriteLine($"Решение уравнения: ({decision.Item1}, {decision.Item2})");
}

Main();