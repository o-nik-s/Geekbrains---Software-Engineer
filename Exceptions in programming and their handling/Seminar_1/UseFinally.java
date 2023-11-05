package Seminar1;

public class UseFinally {
    public static void genException (int w) {
        int t;
        int [] nums = new int[2];
        System.out.println("Получено " + w);
        try {
            switch (w) {
                case 0:
                    t = 10 / 2; // Генерируем ошибку деления на ноль
                    break;
                case 1:
                    nums[4] = 4; // Гененируем ошибку обращения к массиву
                    break;
                case 2:
                    return; // Возвратиться из блока try
            }
        }
        catch (ArithmeticException e) {
            System.out.println("Попытка деления на ноль");
        }
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Выход за пределы массива");
        }
        finally {
            System.out.println("Выход из блока try");
        }
    }

    public static void main(String[] args) {
        for (int i = 0; i < 3; i++) {
            genException(i);
            System.out.println();
        }
    }
}
