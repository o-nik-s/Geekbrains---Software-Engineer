package Seminar3;

import java.util.InputMismatchException;
import java.util.Scanner;

public class DivisionCalculator {
    public static double divideNumbers(double a, double b) throws DivisionByZeroException {
        if (b == 0) {
            throw new DivisionByZeroException("Деление на ноль недопустимо");
        }
        return a / b;
    }

    public static void main(String[] args) {
        try {
            double a = getInputNumber("Введите первое число: ");
            double b = getInputNumber("Введите второе число: ");

            double result = divideNumbers(a, b);
            System.out.println("Результат деления: " + result);
        } catch (InputMismatchException e) {
            System.out.println("Ошибка: Введено некорректное число");
        } catch (DivisionByZeroException e) {
            handleDivisionByZeroException(e);
        }
    }

    private static double getInputNumber(String prompt) throws InputMismatchException {
        Scanner scanner = new Scanner(System.in);
        System.out.print(prompt);
        return scanner.nextDouble();
    }

    private static void handleDivisionByZeroException(DivisionByZeroException e) {
        System.out.println("Ошибка: " + e.getMessage());
        // Дополнительная обработка исключения на более высоком уровне абстракции
        // Например, запись лога, уведомление пользователя или выбор альтернативного пути выполнения программы
        // ...
    }

    static class DivisionByZeroException extends Exception {
        public DivisionByZeroException(String message) {
            super(message);
        }
    }
}

/**
 * В этом примере класс DivisionCalculator содержит метод divideNumbers(), который выполняет деление двух чисел
 * и выбрасывает исключение DivisionByZeroException при делении на ноль. В методе main() мы используем этот метод
 * для ввода чисел с клавиатуры, выполнения деления и обработки возможных исключений.
 * В случае некорректного ввода чисел, будет перехвачено исключение NumberFormatException
 * и выведено соответствующее сообщение об ошибке. Если возникнет исключение DivisionByZeroException,
 * оно будет перехвачено в блоке catch и обработано методом handleDivisionByZeroException().
 * В этом методе можно выполнить дополнительные действия по обработке исключения на более высоком уровне абстракции.
 * Таким образом, пример демонстрирует применение принципа одного уровня абстракции при обработке исключений.
 */