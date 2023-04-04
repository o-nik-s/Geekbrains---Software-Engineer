package geekbrains_course.Seminar_2.Abstract_classes;

public class Dog extends Animal implements AnimalBehavior {
    @Override
    public void voice() {
        System.out.println("bark");
    }

    @Override
    public void doSomething() {
        System.out.println("Я грызу косточку.");
    }
}
