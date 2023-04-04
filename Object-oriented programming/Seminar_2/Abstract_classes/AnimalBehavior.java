package geekbrains_course.Seminar_2.Abstract_classes;

public interface AnimalBehavior {
    /** Достаточно указать тип возвращаемого значения */
    void doSomething();
    /** default - это обычно тот же самый метод, но с реализацией */
     default void defaultMethod() {
        System.out.println();
    }
}
