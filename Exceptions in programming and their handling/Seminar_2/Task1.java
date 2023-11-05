package Seminar2;

public class Task1 {
    public static void main(String[] args) {
        try {
            MyInput(1);
            int test = 10/0;
        } catch (MyException e) {
            System.out.println("Ошибка: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Ошибка: " + e.getMessage());
        }
    }

    public static void MyInput(int value) throws MyException {
        if (value<0) {
            throw new MyException("Значение не может быть отрицательным."); // Создает новый объект исключения, выбрасываем
        }
        System.out.println("Обработка значения: " + value);
    }
}

class MyException extends Exception {
    public MyException(String message) { // Переопределяем конструктор класса, чтобы передать сообщение родительскому классу
        super(message); // Инициализация сообщения об ошибке в исключении
    }

}