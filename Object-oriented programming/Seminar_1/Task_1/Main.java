package geekbrains_course.Seminar_1.Task_1;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        StaticClass staticClass = new StaticClass();
//        staticClass.te - не можем вызвать, поскольку поле статическое, даже несмотря на то, что поле public
        StaticClass.setText("Некоторый текст");

        VendingMachine vendingMachine = new VendingMachine();
        List<Product> products = new ArrayList<>(Arrays.asList(
                new Product("pepsi", 42),
                new Product("coca-cola", 47),
                new Product("chocolate", 70),
                new Product("fanta", 52),
                new Product("water", 50)
        ));
        vendingMachine.intProduct(products);
        System.out.println(vendingMachine.getProduct("coca-cola"));
    }
}
