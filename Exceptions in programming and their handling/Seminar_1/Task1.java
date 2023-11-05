package Seminar1;

public class Task1 {
    public static void main(String[] args) {
        task1();
        task2();
    }
    public static void task1() {
        int [] nums = new int[4];
        try {
            System.out.println("До генерации исключения");
            nums[6] = 10;
            System.out.println("До сюда код не доходит");
        }
        catch (ArithmeticException | ArrayStoreException e) {
            System.out.println("Это исключение не будет отработано");
        }
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Выход за границы массива");
        }
        System.out.println("После оператора catch");
    }

    public static void task2() {
        int [] nums = new int[4];
        System.out.println("До генерации исключения");
        nums[6] = 10;
    }

}
