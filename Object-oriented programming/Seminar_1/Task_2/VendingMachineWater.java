package geekbrains_course.Seminar_1.Task_2;

import java.util.ArrayList;
import java.util.List;

public class VendingMachineWater extends VendingMachine{
//    List <Product> products = new ArrayList<>();
    List <BottleOfWater> bottleOfWaters = new ArrayList<>();

    void initProduct() {
        initProduct(null);
    }

    void initProduct(List<BottleOfWater> bottle) {
        this.bottleOfWaters = bottle;
    }

    //    по имени ищем машины
    @Override
    Product getProduct(String name) {
        for (BottleOfWater bottle :
                bottleOfWaters) {
            if (bottle.getName().contains(name)) return bottle;
        }
        return new BottleOfWater("Не найдено", 0);
    }
}
