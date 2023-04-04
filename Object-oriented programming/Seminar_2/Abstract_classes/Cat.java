package geekbrains_course.Seminar_2.Abstract_classes;

/**
 * И потом в классе, который поясняет, расширяет исходный класс, можно задать нужную реализацию
 * Релизация задается в наследниках. Они extends, т.е. расширяют родительский класс
 * public class Cat extends Animal - публичный класс Cat расширяет класс Animal
 * В наследнике перееопределяем метод и задаем нужную реализацию
 */
public class Cat extends Animal implements AnimalBehavior {
    private final Integer age_ = this.age;
    @Override
    public void voice() {
        System.out.println("meow");
    }

    @Override
    public void doSomething() {
        System.out.println("Я ловлю мышей.");
    }
}
