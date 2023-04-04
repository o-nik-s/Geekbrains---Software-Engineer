package geekbrains_course.Seminar_2.Abstract_classes;

/**
 * В абстрактном классе обычно не пишем реализацию
 * Мы просто намечаем будущее поведение - это просто как чертеж
 */
public abstract class Animal implements AnimalBehavior {
    /**
     * voice - это просто план того, как мы будем строить наше приложение
     */
    private String name; /** в наследнике вызывать нельзя */
    protected Integer age; /** в наследнике можно использовать */
    public abstract void voice();

    @Override
    public void doSomething() {
        System.out.println("Я абстрактный.");
    }
}
