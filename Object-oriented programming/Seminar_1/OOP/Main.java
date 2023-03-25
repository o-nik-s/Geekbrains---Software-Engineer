package geekbrains_course.Seminar_1.OOP;

public class Main {
    public static void main(String[] args) {
        Animal animal1 = new Cat(); // Нашему родителю присвоили класс наследник
        animal1.voice("Шарик");
        Animal animal2 = new Dog();
        animal2.voice("Барсик"); // Вызов метода один и тот же, но в зависимости от реализации поведение разное - это полиморфизм
        // Т.е. наши методы voice - это по сути просто Геттер
        // Т.е. у нас есть поле, но доступ к нему только на наших условиях
    }
}