package geekbrains_course.Seminar_2.Abstract_classes;

public class Main {
    public static void main(String[] args) {
        /**
         * Мы вызываем один и тот же метод, но получаем различную реализацию
         */
        Animal animal = new Cat();
        animal.voice();
        Animal anotherAnimal = new Dog();
        anotherAnimal.voice();

        Cat cat = new Cat();
        cat.doSomething();
        Dog dog = new Dog();
        dog.doSomething();
    }
}
