// Напишите программу, которая принимает на вход координаты двух точек 
// и находит расстояние между ними в 3D пространстве.
// A (3,6,8); B (2,1,-7), -> 15.84
// A (7,-5, 0); B (1,-1,9) -> 11.53

Console.WriteLine("Введите координаты первой точки: ");
int A1 = int.Parse(Console.ReadLine());
int B1 = int.Parse(Console.ReadLine());
int C1 = int.Parse(Console.ReadLine());
Console.WriteLine("Введите координаты второй точки: ");
int A2 = int.Parse(Console.ReadLine());
int B2 = int.Parse(Console.ReadLine());
int C2 = int.Parse(Console.ReadLine());
double distance = Math.Round(Math.Sqrt(Math.Pow(A1-A2, 2) + Math.Pow(B1-B2, 2) + Math.Pow(C1-C2, 2)), 2);
Console.WriteLine($"{distance}");