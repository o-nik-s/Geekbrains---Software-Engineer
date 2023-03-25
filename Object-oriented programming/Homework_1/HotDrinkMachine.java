package geekbrains_course.Homework_1;

import java.util.ArrayList;
import java.util.List;

public class HotDrinkMachine implements VendingMachine {
    List <Tea> cups = new ArrayList<>();

    void initHotDrink(List<Tea> cups) {
        this.cups = cups;
    }

    @Override
    public HotDrink getProduct(String name) {
        for (Tea cup : cups) {
            if (cup.getName().contains(name)) return cup;
        }
        return null;
    }

    @Override
    public HotDrink getProduct(String name, int volume, int temperature) {
        for (Tea cup : cups) {
            if (cup.getName().contains(name) && cup.getVolume() == volume && cup.getTemperature() == temperature) return cup;
        }
        return null;
    }


//        List<BottleOfWater> bottleOfWaterList = new ArrayList<>();
//        for (BottleOfWater bottle :
//                bottleOfWaters) {
//            if (bottle.getName().contains(name) && bottle.getPrice() <= maxPrice) {
//                bottleOfWaterList.add(bottle);
//            };
//        }
//        if (bottleOfWaterList.size()>0) {
//            return bottleOfWaterList.toString();
//        }
//        else {
//            return new BottleOfWater("Не найдено", 0).toString();
//        }
}
