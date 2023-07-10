package Homework1;

import java.util.Scanner;
/*
    Проверка деления на ноль.
    Напишите программу, которая запрашивает у пользователя два целых числа и выполняет их деление.
    Если второе число равно нулю, выбросите исключение ArithmeticException с сообщением
    "Деление на ноль недопустимо". Иначе выведите результат деления на экран.
 */
public class Task1 {
    public static void main(String[] args) {
        System.out.println("Введите два числа:");
        Scanner scanner = new Scanner(System.in);
        float number1 = scanner.nextFloat();
        float number2 = scanner.nextFloat();
        if (number2 == 0) {
            throw new ArithmeticException("Деление на ноль недопустимо");
        } else {
            System.out.println(number1 + " / " + number2 + " = " + number1/number2);
        }
    }
}
