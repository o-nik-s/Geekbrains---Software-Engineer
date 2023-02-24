// Given an integer number n, return the difference between the product
// of its digits and the sum of its digits.

package geekbrains_course.Seminar_1;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        System.out.println("Введите целое число: ");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int sum = 0;
        int mult = 1;
        while (n!=0) {
            mult*=n%10; sum+=n%10; n/=10;
        }
        System.out.println(mult-sum);
    }
}