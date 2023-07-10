package Homework1;

import Homework2.InvalidNumberException;

import java.util.Scanner;

/*
    Обработка некорректного ввода
    Напишите программу, которая запрашивает у пользователя его возраст.
    Если введенное значение не является числом, выбросите исключение NumberFormatException
    с сообщением "Некорректный ввод". Иначе выведите возраст на экран.
 */
public class Task2 {
    public static void main(String[] args) {
        System.out.println("Введите возраст:");
        Scanner scanner = new Scanner(System.in);
        if (scanner.hasNextInt()) {
            int age = scanner.nextInt();
            if (age>=0 & age<=120) {
                System.out.println("Возраст: " + age);
            } else {
                System.out.println("Возраст вне допустимого диапазона");
            }
        } else {
            throw new NumberFormatException("Некорректный ввод");
        }
    }
}
