package Seminar1;

public class Task2 {
    public static void main(String[] args) {
        task1();
    }
    public static void task1() {
        int[] arr1 = {4, 8, 16, 32, 64, 128, 256, 512, 1024};
        int[] arr2 = {2, 0, 2, 0, 4, 4, 0, 8};
        for (int i = 0; i < arr1.length; i++) {
            try {
                System.out.println(arr1[i] + " / " + arr2[i] + " = " + arr1[i] / arr2[i]);
            } catch (ArithmeticException e) {
                System.out.println("Попытка деления на ноль");
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Выход за пределы массива");
            }
        }
    }

    public static void task2() {
        int[] arr1 = {4, 8, 16, 32, 64, 128, 256, 512, 1024};
        int[] arr2 = {2, 0, 2, 0, 4, 4, 0, 8};
        for (int i = 0; i < arr1.length; i++) {
            try {
                System.out.println(arr1[i] + " / " + arr2[i] + " = " + arr1[i] / arr2[i]);
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Соответствущий элемент не найден");
            } catch (Throwable e) {
                System.out.println("Все другие ошибки");
            }
        }
    }
}
