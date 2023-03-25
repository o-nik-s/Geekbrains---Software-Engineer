package geekbrains_course.Seminar_1.OOP;

// Абстрактный - потому что родитель
public abstract class Animal { // Animal - это класс без реализации
    private String name;
//    Инкапсуляция
//    Закрываем реализацию от пользователя;
//    Т.е. в самом классе мы можем оперировать этой переменной, а в других классах, даже в классах-наследниках - не сможем
    public abstract void voice(String name); // voice - это набросок, чертеж; у него нет конкретной реализации
}
