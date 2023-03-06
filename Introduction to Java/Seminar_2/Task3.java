// Дан массив целых чисел. Найти количество пар соседних элементов,
// где первый элемент вдвое больше второго.

package geekbrains_course.Seminar_2;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];
        int count = 0;
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] == 2 * arr[i + 1]) {
                count++;
            }
        }
        scanner.close();
        System.out.println(count);
    }
}
