// Дана последовательность из N целых чисел. Найти сумму чисел, оканчивающихся на 5,
// перед которыми идет четное число.

package geekbrains_course.Seminar_2;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int sum = 0;
        int prev_num = 1;
        int num;
        for (int i = 0; i < n; i++) {
            num = scanner.nextInt();
            if (prev_num % 2 == 0 && num % 10 == 5) {
                sum += num;
            }
            prev_num = num;
        }
        scanner.close();
        System.out.println(sum);
    }
}