// Дана строка. Поменять местами ее половины.

package geekbrains_course.Seminar_1;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        System.out.print("Введите строку: ");
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        StringBuilder newStr = new StringBuilder();
        newStr.append(str.substring(str.length() / 2, str.length()));
        newStr.append(str.substring(0, str.length() / 2));
        System.out.println(newStr);
    }
}