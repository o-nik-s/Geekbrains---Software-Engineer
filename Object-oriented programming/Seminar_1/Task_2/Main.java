package geekbrains_course.Seminar_1.Task_2;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        VendingMachineWater vendingMachineWater = new VendingMachineWater();
        List<BottleOfWater> bottleOfWaters = new ArrayList<>(Arrays.asList(
                new BottleOfWater("pepsi", 42),
                new BottleOfWater("coca-cola", 47),
                new BottleOfWater("chocolate", 70),
                new BottleOfWater("fanta", 52),
                new BottleOfWater("water", 50)
        ));
        vendingMachineWater.initProduct(bottleOfWaters);
        System.out.println(vendingMachineWater.getProduct("coca-cola").toString());
    }
}
