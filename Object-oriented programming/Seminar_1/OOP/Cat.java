package geekbrains_course.Seminar_1.OOP;

public class Cat extends Animal implements AnimalInterface, OtherlInterface { // extends - показатель, что наследник
    // Т.е. в Java нельзя наследоваться от двух классов сразу, но от интерфейсов мы так можем делать
    @Override
    public void voice(String name) { // переопределяем
        // Т.е. наши методы voice - это по сути просто Геттер
        // Т.е. у нас есть поле, но доступ к нему только на наших условиях
        System.out.println("bark" + " : " + name);
    }
}
