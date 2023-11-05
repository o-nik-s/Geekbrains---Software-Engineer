package Seminar1;

public class Task3 {
    public static void main(String[] args) {
        try {
            // Код, который может вызвать ошибку
            throw new Exception("Ошибка: файл не найден");
        }
        catch (Exception e) {
            String errorMessage = e.getMessage();
            System.out.println(errorMessage);
        }
    }
}
