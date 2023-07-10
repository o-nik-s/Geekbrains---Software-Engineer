package Homework1;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

import static java.lang.Float.parseFloat;

/*
    Сложная задача: Чтение файла и подсчет суммы чисел
    Напишите программу, которая считывает содержимое текстового файла,
    в котором каждая строка содержит одно число. Программа должна подсчитать сумму всех чисел в файле.
    Если встретится строка, которая не может быть преобразована в число,
    выбросите исключение NumberFormatException с сообщением "Некорректное значение числа в файле".
 */
public class Task3 {
    public static void main(String[] args) {
        String filePath = "src/main/java/Homework1/file.txt";
        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            float sum = 0;
            String line;
            while ((line = reader.readLine()) != null) {
                try {
                    float num = parseFloat(line);
                    sum += num;
                } catch (NumberFormatException e) {
                    throw new NumberFormatException("Некорректное значение числа в файле");
                }
            }
            System.out.println("Сумма чисел в файле равна " + sum);
        } catch (IOException e) {
            System.out.println("Ошибка при чтении файла: " + e.getMessage());
        }
    }
}
