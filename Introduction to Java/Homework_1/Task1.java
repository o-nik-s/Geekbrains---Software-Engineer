// Given an input string s, reverse the order of the words.
// A word is defined as a sequence of non-space characters.
// The words in s will be separated by at least one space.
// Return a string of the words in reverse order concatenated by a single space.
// Note that s may contain leading or trailing spaces or multiple spaces between two words.
// The returned string should only have a single space separating the words.
// Do not include any extra spaces.

package geekbrains_course.Homework_1;

import java.util.Scanner;
public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите строку: ");
        String inputString = scanner.nextLine();
        String[] spltStr = inputString.split(" ");
        String newStr = "";
        for (int i = spltStr.length-1; i >= 0; i--) {
            if (spltStr[i].length()>0) {
                newStr += spltStr[i] + " ";
            }
        }
        System.out.println(newStr.strip());
    }
}