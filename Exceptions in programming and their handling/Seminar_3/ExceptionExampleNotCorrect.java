package Seminar3;

/**
 * В этом примере метод divideNumbers перехватывает общее исключение Exception, что не рекомендуется.
 * Вместо того, чтобы перехватывать конкретное исключение ArithmeticException, которое возникает при делении на ноль,
 * мы перехватываем общее исключение Exception, что включает в себя и другие виды исключений, не относящиеся к делению на ноль.
 * Это нарушает принцип одного уровня абстракции.
 * В методе performCalculation также происходит перехват общего исключения Exception на том же уровне,
 * где нет достаточной информации для его корректной обработки. Такое перехватывание исключения на одном уровне абстракции
 * не позволяет использовать более специфическую обработку исключений и может затруднить понимание причины ошибки.
 * Правильный подход состоит в том, чтобы перехватывать конкретные исключения на соответствующих уровнях абстракции
 * и обрабатывать их с учетом контекста и состояния программы.
 */
public class ExceptionExampleNotCorrect {
    public static double divideNumbers(double a, double b) {
        try {
            double result = a / b;
            return result;
        } catch (Exception e) {
            // Перехватываем общее исключение Exception
            // и обрабатываем его на низком уровне абстракции
            System.out.println("Ошибка: " + e.getMessage());
            return 0; // Возвращаем некорректное значение в случае ошибки
        }
    }

    public static void performCalculation(double x, double y) {
        try {
            double result = divideNumbers(x, y);
            // Обрабатываем результат вычисления
            System.out.println("Результат: " + result);
        } catch (Exception e) {
            // Перехватываем общее исключение Exception на том же уровне
            System.out.println("Ошибка: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        // Вызываем метод performCalculation с разными аргументами
        performCalculation(10, 2);
        performCalculation(10, 0);
    }
}
