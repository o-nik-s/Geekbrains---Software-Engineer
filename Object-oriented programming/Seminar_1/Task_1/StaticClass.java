package geekbrains_course.Seminar_1.Task_1;

public class StaticClass {
    public static String text;
    public String nonStatic;

    public static void setText(String text) {
        StaticClass.text = text; // Для статического метода мы обращаемся через класс: StaticClass.text
    }

    public StaticClass() {
        this.nonStatic = nonStatic; // В обычных полях мы обращаемся через this
        nonStatic = nonStatic; // Или просто имя переменной
    }
}
