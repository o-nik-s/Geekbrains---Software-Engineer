package Seminar3;

/**
 * В этом примере у нас есть два статических метода: divideNumbers и performCalculation.
 * Метод divideNumbers(a, b) выполняет деление двух чисел a и b. Он перехватывает исключение ArithmeticException,
 * которое возникает при делении на ноль, и обрабатывает его на текущем уровне абстракции путем вывода сообщения об ошибке.
 * Метод performCalculation(x, y) вызывает метод divideNumbers для выполнения деления чисел x и y.
 * Если результат не является NaN (не число), то он обрабатывается на этом же уровне, например, выводится на экран.
 * Если возникает любое другое исключение, оно перехватывается на более высоком уровне в блоке catch (Exception e),
 * где выводится соответствующее сообщение об ошибке.
 * Таким образом, этот пример также следует принципу одного уровня абстракции, где исключения обрабатываются на том уровне,
 * где есть достаточно информации для их корректной обработки.
 */
public class ExceptionExampleCorrect {
    public static double divideNumbers(double a, double b) {
        try {
            double result = a / b;
            return result;
        } catch (ArithmeticException e) {
            // Перехватываем исключение ArithmeticException
            // и обрабатываем его на текущем уровне абстракции
            System.out.println("Ошибка: Деление на ноль недопустимо");
            return Double.NaN; // Возвращаем NaN (Not a Number) в случае ошибки
        }
    }

    public static void performCalculation(double x, double y) {
        try {
            double result = divideNumbers(x, y);
            if (!Double.isNaN(result)) {
                // Обрабатываем результат вычисления
                System.out.println("Результат: " + result);
            }
        } catch (Exception e) {
            // Перехватываем исключение на более высоком уровне
            System.out.println("Ошибка: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        // Вызываем метод performCalculation с разными аргументами
        performCalculation(10, 2);
        performCalculation(10, 0);
    }
}