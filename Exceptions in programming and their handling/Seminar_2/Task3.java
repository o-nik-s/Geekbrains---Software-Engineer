package Seminar2;

import java.util.Scanner;

/**
 * Если пользователь не вводит имя или оно содержит только пробельные символы,
 * программа должна выбрасывать собственное исключение InvalidNameException с сообщением "Некорректное имя пользователя".
 * Если пользователь не вводит возраст или вводит некорректное значение возраста (отрицательное число или нечисловые символы),
 * программа должна выбрасывать собственное исключение InvalidAgeException с сообщением "Некорректный возраст пользователя".
 * Если пользователь успешно ввел имя и возраст, программа должна выводить сообщение "Регистрация успешна!".
 */
public class Task3 {
    public static void main(String[] args) {

    }
}

class UserRegistrationExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите имя: ");
        String name = scanner.nextLine();

        System.out.print("Введите возраст: ");
        String ageString = scanner.nextLine();

        try {
            registerUser(name, ageString);
            System.out.println("Регистрация успешна!");
        } catch (InvalidAgeException | InvalidNameException e) {
            System.out.println("Ошибка: " + e.getMessage());
        }
    }

    public static void registerUser(String name, String ageString) throws InvalidNameException, InvalidAgeException {
        if (name.trim().isEmpty()) {
            throw new InvalidNameException("Некорректное имя пользователя");
        }

        int age;
        try {
            age = Integer.parseInt(ageString);
        } catch (NumberFormatException e) {
            throw new InvalidAgeException("Некорректный возраст пользователя");
        }

        if (age < 0) {
            throw new InvalidAgeException("Некорректный возраст пользователя");
        }

        // Другой код регистрации пользователя
    }
}

class InvalidNameException extends Exception {
    public InvalidNameException(String message) {
        super(message);
    }
}

class InvalidAgeException extends Exception {
    public InvalidAgeException(String message) {
        super(message);
    }
}

/**
 * В данной программе представлен пример регистрации пользователя. Мы запрашиваем у пользователя имя и возраст,
 * а затем вызываем метод registerUser, который проверяет введенные данные.
 * Если имя пользователя является пустой строкой или содержит только пробельные символы,
 * выбрасывается исключение InvalidNameException с сообщением "Некорректное имя пользователя".
 * Возраст пользователя проверяется на корректность с помощью блока try-catch. Если возраст не может быть преобразован
 * в целое число, выбрасывается исключение NumberFormatException, и мы перехватываем его и выбрасываем собственное
 * исключение InvalidAgeException с сообщением "Некорректный возраст пользователя".
 * Если возраст пользователя отрицательный, выбрасывается исключение InvalidAgeException с сообщением
 * "Некорректный возраст пользователя".
 * В случае успешной регистрации выводится сообщение "Регистрация успешна!". В противном случае перехватываем
 * соответствующие исключения и выводим сообщения об ошибке.
 *
 * Если два разных исключения, то для этого требуется создать два разных класса.
 */