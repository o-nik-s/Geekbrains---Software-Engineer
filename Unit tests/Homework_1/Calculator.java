package Homework1;

/**
 * В классе Calculator создайте метод calculateDiscount, который принимает сумму покупки и процент скидки
 * и возвращает сумму с учетом скидки. Ваша задача - проверить этот метод с использованием библиотеки AssertJ.
 * Если метод calculateDiscount получает недопустимые аргументы, он должен выбрасывать исключение ArithmeticException.
 * Не забудьте написать тесты для проверки этого поведения.
 */

public class Calculator {
    public static double calculateDiscount(double purchaseAmount, int discountPercent) {
        if (purchaseAmount < 0 || discountPercent < 0 || discountPercent > 100) {
            throw new ArithmeticException("Некорректные аргументы");
        }
        return purchaseAmount - purchaseAmount * discountPercent / 100;
    }

    public static void main(String[] args) {
        System.out.println(calculateDiscount(1000,20));
    }

}
