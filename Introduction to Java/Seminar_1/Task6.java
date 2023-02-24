// Given an array nums. We define a running sum of an array as
// runningSum[i] = sum(nums[0]…nums[i]).
// Return the running sum of nums.

package geekbrains_course.Seminar_1;

import java.util.Scanner;
public class Task6 {
    public static void print_array(int[] arr) {
        for (int el:arr) {
            System.out.print(el+" ");
        }
    }
    public static int[] inputArray() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите размер массива: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Введите массив: ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        return arr;
    }
    public static int[] sum_array(int[] arr) {
        int[] sumArr = new int[arr.length];
        sumArr[0] = arr[0];
        for (int i = 1; i < arr.length; i++) {
            sumArr[i] = sumArr[i-1] + arr[i];
        }
        return sumArr;
    }
    public static void main(String[] args) {
        int[] arr = inputArray();
        print_array(sum_array(arr));
    }
}