package geekbrains_course.Seminar_1.OOP;

public class Dog extends Animal { // extends - показатель, что наследник

    @Override
    public void voice(String name) { // переопределяем
        System.out.println("meow" + " : " + name);
    }
}
