package geekbrains_course.Seminar_1.Task_1;

import java.util.ArrayList;
import java.util.List;

public class VendingMachine {
    private List<Product> products = new ArrayList<>();
    public void intProduct(List<Product> products) {
        this.products = products;
    }
    public Product getProduct(String name) {
        for (Product p :
                products) {
            if (p.getName().contains(name)) {
                return p;
            };
        }
        return new Product("Продукт не найден", 0);
    }
}
