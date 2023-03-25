package geekbrains_course.Seminar_1.Task_3;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 1. Попросить вначале переопределить метод toString для Товара, запустить программу,
 * после этого переопределить для наследника этот метод, после запуска обратить внимание на изменение поведения. (10 минут)
 * 2. Попросить создать перегруженный метод выдачи товара ТорговымАвтоматом
 * дополнив дополнительным входным параметром (пример: getProduct(String name)
 * выдающий товар по имени, создать метод возвращающий товар по имени и какому-либо параметру
 * товара getProduct(String name, int volume) (10 минут)
 */
public class Main {
    public static void main(String[] args) {
        VendingMachineWater vendingMachineWater = new VendingMachineWater();
        List<BottleOfWater> bottleOfWaters = new ArrayList<>(Arrays.asList(
                new BottleOfWater("pepsi", 42),
                new BottleOfWater("coca-cola", 47),
                new BottleOfWater("coca-cola", 77),
                new BottleOfWater("chocolate", 70),
                new BottleOfWater("fanta", 52),
                new BottleOfWater("water", 50)
        ));
        vendingMachineWater.initProduct(bottleOfWaters);
        System.out.println(vendingMachineWater.getProduct("coca-cola").toString());
        System.out.println();
        System.out.println(vendingMachineWater.getProduct("coca-cola", 55).toString());
    }
}
