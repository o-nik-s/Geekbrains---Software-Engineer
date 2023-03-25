package geekbrains_course.Homework_1;

public interface VendingMachine {
    HotDrink getProduct(String name);

    HotDrink getProduct(String name, int volume, int temperature);
}
