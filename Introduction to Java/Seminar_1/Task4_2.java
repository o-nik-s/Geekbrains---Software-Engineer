package geekbrains_course.Seminar_1;


import java.util.Scanner;

public class Task4_2 {

    static String a, b;
    public static void input_data() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите два числа в бинарном формате.");
        System.out.print("Введите a: ");
        a = scanner.nextLine();
        System.out.print("Введите b: ");
        b = scanner.nextLine();
    }

    public static String addBinary(String a, String b) {

        if (a.length()<b.length()) {
            return addBinary(b, a);
        }

        String result = "";
        int k = 0;
        int j = b.length()-1;
        for (int i = a.length()-1; i >= 0; i--) {
            if (a.charAt(i)=='1') {
                k++;
            }
            if (j>=0 && b.charAt(j) == '1') {
                k++;
            }
//      Двоичная система счисления, поэтому используем mod 2
            result = k%2 + result;
            k /= 2;
            j--;
        }
        if (k>0) {
            result = k + result;
        }
        return result;

    }

    public static void main(String[] args) {
        input_data();
        System.out.println(addBinary(a, b));
    }


}
