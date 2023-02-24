// Given two binary strings a and b, return their sum as a binary string.

package geekbrains_course.Seminar_1;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите два числа в бинарном формате.");
        System.out.print("Введите a: ");
        String a = scanner.nextLine();
        System.out.print("Введите b: ");
        String b = scanner.nextLine();
        String c = "";
        int a_s, b_s, p_s = 0;
        int mx_length = Math.max(a.length(), b.length());
        for (int i = 1; i <= mx_length+1; i++) {
            if (a.length() >= i) {
                a_s = Integer.parseInt(String.valueOf(a.charAt(a.length() - i)));
            }
            else {a_s = 0;}
            if (b.length() >= i) {
                b_s = Integer.parseInt(String.valueOf(b.charAt(b.length() - i)));
            }
            else {b_s = 0;}
            switch (a_s + b_s + p_s) {
                case 0:
                    if (i < mx_length+1) {c = "0" + c;}
                    p_s = 0;
                    break;
                case 1:
                    c = "1" + c;
                    p_s = 0;
                    break;
                case 2:
                    c = "0" + c;
                    p_s = 1;
                    break;
                case 3:
                    c = "1" + c;
                    p_s = 1;
                    break;
            }
        }
        System.out.println(c);
    }
}
