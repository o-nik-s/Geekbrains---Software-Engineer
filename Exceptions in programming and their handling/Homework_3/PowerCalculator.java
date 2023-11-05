package Homework3;

import java.util.InputMismatchException;
import java.util.Scanner;

import static java.lang.Math.pow;

/**
 * Напишите программу-калькулятор, которая запрашивает у пользователя два числа и выполняет операцию
 * возведения первого числа в степень второго числа. Если введены некорректные числа или происходит деление на ноль,
 * необходимо обработать соответствующие исключения и вывести информативное сообщение об ошибке.
 *
 * Важно! С использованием принципа одного уровня абстракции!
 * **В этой задаче мы создаем класс PowerCalculator, который содержит метод calculatePower(),
 * выполняющий операцию возведения числа в степень. Если введено некорректное основание (ноль)
 * и отрицательная степень, выбрасывается исключение InvalidInputException.
 * В методе main() мы запрашиваем у пользователя основание и показатель степени, вызываем метод calculatePower()
 * и выводим результат. Если введены некорректные числа или происходит ошибка ввода, соответствующие исключения
 * перехватываются и выводится информативное сообщение об ошибке.
 *
 * Обратите внимание, что в этой задаче мы использовали собственное исключение InvalidInputException,
 * чтобы явно указать на некорректный ввод. Это помогает разделить обработку ошибок на соответствующие уровни абстракции.**
 */

public class PowerCalculator {
    public static void main(String[] args) {
        try {
            double a = getInputNumber("Введите основание: ");
            double b = getInputNumber("Введите степень: ");
            double result = calculatePower(a, b);
            System.out.println("Результат возведения в степень: " + result);
        } catch (InputMismatchException e) {
            System.out.println("Ошибка: Число не распознано");
        } catch (InvalidInputException e) {
            handleInvalidInputException(e);
        }
    }
    public static double calculatePower(double a, double b) throws InvalidInputException {
        if (a == 0) {
            throw new InvalidInputException("Некорректное основание!");
        }
        else if (b < 0) {
            throw new InvalidInputException("Отрицательная степень!");
        }
        return pow(a, b);
    }
    private static double getInputNumber(String prompt) throws InputMismatchException {
        Scanner scanner = new Scanner(System.in);
        System.out.print(prompt);
        return scanner.nextDouble();
    }

    private static void handleInvalidInputException(InvalidInputException e) {
        System.out.println("Ошибка: " + e.getMessage());
        // Дополнительная обработка исключения на более высоком уровне абстракции
        // Например, запись лога, уведомление пользователя или выбор альтернативного пути выполнения программы
        // ...
    }

    static class InvalidInputException extends Exception {
        public InvalidInputException(String message) {
            super(message);
        }
    }
}