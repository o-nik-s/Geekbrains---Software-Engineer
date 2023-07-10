package Homework2;

import java.util.Scanner;

/*
Напишите программу, которая запрашивает у пользователя число и проверяет,
является ли оно положительным. Если число отрицательное или равно нулю,
программа должна выбрасывать исключение InvalidNumberException с сообщением "Некорректное число".
В противном случае программа должна выводить сообщение "Число корректно".
 */
public class Task1 {
    public static void main(String[] args) throws InvalidNumberException {
        System.out.println("Введите число:");
        Scanner scanner = new Scanner(System.in);
        float number = scanner.nextFloat();
        if (number <= 0) {
            throw new InvalidNumberException("Некорректное число");
        } else {
            System.out.println("Число корректно");
        }
    }
}
