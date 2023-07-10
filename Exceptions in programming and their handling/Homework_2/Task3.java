package Homework2;

import java.util.Scanner;
/*
Напишите программу, которая запрашивает у пользователя три числа и выполняет следующие проверки:

Если первое число больше 100, выбросить исключение NumberOutOfRangeException с сообщением
"Первое число вне допустимого диапазона".
Если второе число меньше 0, выбросить исключение NumberOutOfRangeException с сообщением
"Второе число вне допустимого диапазона".
Если сумма первого и второго чисел меньше 10, выбросить исключение NumberSumException с сообщением
"Сумма первого и второго чисел слишком мала".
Если третье число равно 0, выбросить исключение DivisionByZeroException с сообщением
"Деление на ноль недопустимо".
В противном случае программа должна выводить сообщение "Проверка пройдена успешно".
- необходимо создать 3 класса собственных исключений
 */
public class Task3 {
    public static void main(String[] args) throws NumberOutOfRangeException, NumberSumException, DivisionByZeroException {
        System.out.println("Введите три числа:");
        Scanner scanner = new Scanner(System.in);
        float number1 = scanner.nextFloat();
        float number2 = scanner.nextFloat();
        float number3 = scanner.nextFloat();
        if (number1 > 100) {
            throw new NumberOutOfRangeException("Первое число вне допустимого диапазона");
        }
        if (number2 < 0) {
            throw new NumberOutOfRangeException("Второе число вне допустимого диапазона");
        }
        if (number1 + number2 < 10) {
            throw new NumberSumException("Сумма первого и второго чисел слишком мала");
        }
        if (number3 == 0) {
            throw new DivisionByZeroException("Деление на ноль недопустимо");
        }
        System.out.println("Проверка пройдена успешно");
    }
}
