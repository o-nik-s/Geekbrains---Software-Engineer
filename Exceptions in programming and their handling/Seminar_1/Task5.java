package Seminar1;

public class Task5 {
    public static void main(String[] args) {
        task1();
    }
    public static void task1() {
        int[] arr1 = {4, 8, 16, 32, 64, 128, 256, 512, 1024, 2048};
        int[] arr2 = {2, 0, 2, 0, 4, 4, 0, 8};
        for (int i = 0; i < arr1.length; i++) {
            try {
                System.out.println(arr1[i] + " / " + arr2[i] + " = " + arr1[i] / arr2[i]);
            } catch (ArithmeticException e) {
                System.out.println("Попытка деления на ноль");
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Выход за пределы массива");
                System.out.println(e.getMessage()); // Возвращает сообщение об ошибке, которое было передано при создании исключения
                e.printStackTrace(); // Метод выводит трассировку стека исключения, которая содержит информацию, где и как произошло исключения; позволяет определить последовательность вызова методов
                System.out.println(e.getCause()); // Метод возвращает причину исключения или исключение, вызвавшее это исключение; если причина не указана, то null
                System.out.println(e);
            }
        }
    }
}
