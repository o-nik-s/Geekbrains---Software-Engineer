package Homework2;

import java.util.Scanner;

/*
    Напишите программу, которая запрашивает у пользователя два числа и выполняет их деление.
    Если второе число равно нулю, программа должна выбрасывать исключение DivisionByZeroException
    с сообщением "Деление на ноль недопустимо". В противном случае программа должна выводить результат деления.
 */
public class Task2 {
    public static void main(String[] args) throws DivisionByZeroException {
        System.out.println("Введите два числа:");
        Scanner scanner = new Scanner(System.in);
        float number1 = scanner.nextFloat();
        float number2 = scanner.nextFloat();
        if (number2 == 0) {
            throw new DivisionByZeroException("Деление на ноль недопустимо");
        } else {
            System.out.println(number1 + " / " + number2 + " = " + number1/number2);
        }

    }
}
