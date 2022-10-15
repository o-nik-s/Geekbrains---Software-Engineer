// Напишите программу, которая будет выдавать название дня недели по заданному номеру.
// 3 -> Среда
// 5 -> Пятница

// // Решение 1
// Console.WriteLine("Введите номер дня недели: ");
// int dayOfWeek = int.Parse(Console.ReadLine());
// string nameDayOfWeek = String.Empty;
// switch (dayOfWeek)
// { 
//     case 1:
//         nameDayOfWeek = "Понедельник"; break;
//     case 2:
//         nameDayOfWeek = "Вторник"; break;
//     case 3:
//         nameDayOfWeek = "Среда"; break;
//     case 4:
//         nameDayOfWeek = "Четверг"; break;
//     case 5:
//         nameDayOfWeek = "Пятница"; break;
//     case 6:
//         nameDayOfWeek = "Суббота"; break;
//     case 7:
//         nameDayOfWeek = "Воскресенье"; break;
//     default:
//          break;
// }
// Console.WriteLine($"{dayOfWeek} день недели - это {nameDayOfWeek}");

// Решение 2
Console.WriteLine("Введите номер дня недели: ");
int dayOfWeek = int.Parse(Console.ReadLine());
string[] weekDays = new string[] {"Понедельник", "Вторник", "Среда", "Четверг", "Пятница", "Суббота", "Воскресенье"};
Console.WriteLine($"{dayOfWeek} день недели - это {weekDays[dayOfWeek-1]}");