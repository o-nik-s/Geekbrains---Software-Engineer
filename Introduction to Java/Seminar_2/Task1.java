//Implement pow(x, n), which calculates x raised to the power n (i.e., xn).

package geekbrains_course.Seminar_2;

import java.util.Scanner;

public class Task1 {
    static double x;
    static int n;
    public static void inputData() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите x: ");
        x = scanner.nextDouble();
        System.out.print("Введите n: ");
        n = scanner.nextInt();
        scanner.close();
    }
    public static void main(String[] args) {
        inputData();
        double pow = 1;
        if (n < 0) {
            x = 1/x;
            n = -n;
        }
        for (int i = 0; i < n; i++) {
            pow *= x;
        }
        System.out.println("Степень числа равна: " + pow);
    }
}
