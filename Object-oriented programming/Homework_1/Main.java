package geekbrains_course.Homework_1;


import geekbrains_course.Seminar_1.Task_1.Product;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 Создать наследника реализованного класса ГорячийНапиток с дополнительным полем int температура.
 Создать класс ГорячихНапитковАвтомат реализующий интерфейс ТорговыйАвтомат
 и реализовать перегруженный метод getProduct(int name, int volume, int temperature)
 выдающий продукт соответствующий имени, объему и температуре
 В main проинициализировать несколько ГорячихНапитков и ГорячихНапитковАвтомат
 и воспроизвести логику заложенную в программе
 Все вышеуказанное создать согласно принципам ООП пройдённым на семинаре
 */
public class Main {
    public static void main(String[] args) {

        HotDrinkMachine hotDrinkMachineGreenField = new HotDrinkMachine();
        List<Tea> cups = new ArrayList<>(Arrays.asList(
                new Tea("GreeField Черный", 250, 50),
                new Tea("GreeField Зеленый", 250, 100),
                new Tea("GreeField Травяной", 250, 75),
                new Tea("GreeField Травяной", 500, 69),
                new Tea("GreeField Ягодный", 250, 100)
              ));
        hotDrinkMachineGreenField.initHotDrink(cups);

        HotDrinkMachine hotDrinkMachineAssand = new HotDrinkMachine();
        cups = new ArrayList<>(Arrays.asList(
                new Tea("Assand Черный", 300, 90),
                new Tea("Assand Зеленый", 200, 67),
                new Tea("Assand Травяной", 250, 75),
                new Tea("Assand Травяной", 500, 75),
                new Tea("Assand Ягодный", 300, 100)
        ));
        hotDrinkMachineAssand.initHotDrink(cups);

        drinkCup(hotDrinkMachineGreenField.getProduct("GreeField Травяной", 250, 75));
        drinkCup(hotDrinkMachineGreenField.getProduct("GreeField Зеленый", 250, 100));
        drinkCup(hotDrinkMachineGreenField.getProduct("Assand Ягодный", 250, 75));
        drinkCup(hotDrinkMachineGreenField.getProduct("GreeField Травяной", 250, 75));
        drinkCup(hotDrinkMachineAssand.getProduct("Assand Ягодный", 300, 100));
        drinkCup(hotDrinkMachineAssand.getProduct("Assand", 600, 75));
        drinkCup(hotDrinkMachineAssand.getProduct("Assand Травяной", 500, 75));
        drinkCup(hotDrinkMachineAssand.getProduct("GreeField Травяной", 250, 75));
        drinkCup(hotDrinkMachineAssand.getProduct("Assand Черный", 300, 90));
    }
    public static void drinkCup(HotDrink cup) {
        if (cup!=null) cup.Drink();
        else System.out.println("Found nothing");
    }

}
