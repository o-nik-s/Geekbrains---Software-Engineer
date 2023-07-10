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
        try {
            System.out.println(number1 + " / " + number2 + " = " + number1/number2);
        } catch (ArithmeticException e) {
            System.out.println("Деление на ноль недопустимо");
        }
        scanner.nextLine();
    }
}
