//Дана последовательность N целых чисел. Найти сумму простых чисел.

package geekbrains_course.Homework_2;

import java.util.Scanner;

import static java.lang.Math.sqrt;

public class Task1 {
    private static boolean isSimple(int n) {
        if (n == 1) {
            return false;
        } else if (n == 2) {
            return true;
        }
        for (int i = 2; i < sqrt(n) + 1; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите количество чисел в последовательности: ");
        int n = scanner.nextInt();
        System.out.println("Введите последовательность целых чисел:");
        int sum = 0;
        for (int i = 0; i < n; i++) {
            int num = scanner.nextInt();
            sum += (isSimple(num)) ? num : 0;
            System.out.println(sum);
        }
        scanner.close();
        System.out.println("Сумма простых чисел из них равна: " + sum);
    }
}