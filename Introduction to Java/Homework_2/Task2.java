//Дана последовательность из N целых чисел. Верно ли, что последовательность является возрастающей.

package geekbrains_course.Homework_2;

import java.util.Scanner;
public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите количество чисел в последовательности: ");
        int n = scanner.nextInt();
        System.out.println("Введите последовательность целых чисел:");
        boolean flag = true;
        int prev_num = scanner.nextInt();
        for (int i = 1; i < n; i++) {
            int num = scanner.nextInt();
            if (num<prev_num) {
                System.out.println("Последовательность чисел не является возрастающей");
                flag = false;
                break;
            }
            prev_num = num;
        }
        scanner.close();
        if (flag) {System.out.println("Последовательность чисел является возрастающей");}
    }
}