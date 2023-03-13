// Вывести список на экран в перевернутом виде (без массивов и ArrayList)
// Пример:
// 1 -> 2->3->4
// Вывод:
// 4->3->2->1

package geekbrains_course.Homework_4.Task_1;

import geekbrains_course.Seminar_4.Task_1.ListNode;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        LinkedList<Integer> linkedList = new LinkedList<>();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите количество элементов в списке: ");
        int n = scanner.nextInt();
        for (int i = 0; i < n; i++) {
            linkedList.add(i);
        }
        scanner.close();

        System.out.println("Исходный список:");
        System.out.println(linkedList);

        System.out.println("Печать перевернутого списка:");
        while (!linkedList.isEmpty()) {
            System.out.print(linkedList.pollLast() + " ");
        }

    }
}