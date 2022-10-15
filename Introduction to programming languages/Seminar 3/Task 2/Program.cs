// Напишите программу, которая по заданному номеру четверти 
// показывает диапазон возможных координат точек в этой четверти (x и y).
using System;
Console.OutputEncoding = System.Text.Encoding.UTF8;

Console.WriteLine("Введите номер четверти:");
int number = int.Parse(Console.ReadLine());

string msg = "", inf = double.PositiveInfinity.ToString();
switch (number)
{
    case 1: msg = $"x: [0; +{inf}]; y: [0; +{inf}]"; break;
    case 2: msg = $"x: [-{inf}, 0]; y: [0; +{inf}]"; break;
    case 3: msg = $"x: [-{inf}, 0]; y: [-{inf}, 0]"; break;
    case 4: msg = $"x: [0; +{inf}]; y: [-{inf}, 0]"; break;
}
Console.WriteLine(msg);