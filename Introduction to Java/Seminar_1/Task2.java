// Дана последовательность N целых чисел. Найти количество положительных чисел,
// после которых следует отрицательное число.

package geekbrains_course.Seminar_1;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int num1 = scanner.nextInt();
        int cnt = 0;
        for (int i = 1; i < n; i++) {
            int num2 = scanner.nextInt();
            if (num1 > 0 && num2 < 0) {
                cnt++;
            }
            num1 = num2;
        }
        System.out.println(cnt);
    }

}