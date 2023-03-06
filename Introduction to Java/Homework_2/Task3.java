// Дан массив целых чисел.
// Заменить отрицательные элементы на сумму индексов двузначных элементов массива.

package geekbrains_course.Homework_2;

import java.util.Scanner;

import static java.lang.Math.abs;

public class Task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите количество чисел в массиве: ");
        int n = scanner.nextInt();
        System.out.println("Введите массив чисел:");
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        scanner.close();
        int sum = 0;
        for (int i = 0; i < n; i++) {
            if (abs(arr[i]) >= 10) {
                sum += i;
            }
        }
        for (int i = 0; i < n; i++) {
            if (arr[i] < 0) {
                arr[i] = sum;
            }
        }
        System.out.println("Новый массив выглядит следующим образом:");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}