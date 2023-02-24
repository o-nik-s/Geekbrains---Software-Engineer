// Дана последовательность целых чисел, оканчивающаяся нулем.
// Найти сумму положительных чисел, после которых следует отрицательное число.

package geekbrains_course.Homework_1;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        System.out.println("Введите последовательность целых чисел. Окончание ввода - ноль.");
        Scanner scanner = new Scanner(System.in);
        int sum = 0, prev_num = 0;
        int num = scanner.nextInt();
        while (num!=0) {
            if (num<0 && prev_num>0) {
                sum += prev_num;
            }
            prev_num = num;
            num = scanner.nextInt();
        }
        System.out.println(sum);
    }
}