package geekbrains_course.Homework_6.model;

import java.util.*;

import static java.lang.Math.round;

/**
 * Подумать над структурой класса Ноутбук для магазина техники - выделить поля и методы. Реализовать в java.
 * • Создать множество ноутбуков.
 * • Написать метод, который будет запрашивать у пользователя критерий (или критерии) фильтрации и выведет ноутбуки, отвечающие фильтру. Критерии фильтрации можно хранить в Map. Например:
 * Введите цифру, соответствующую необходимому критерию:
 * 1 - ОЗУ
 * 2 - Объем ЖД
 * 3 - Операционная система
 * 4 - Цвет …
 * • Далее нужно запросить минимальные значения для указанных критериев - сохранить параметры фильтрации можно также в Map.
 * • Отфильтровать ноутбуки их первоначального множества и вывести проходящие по условиям.
 */
public class Main {

    public static void main(String[] args) {

        List<Laptop> laptopList = defineLaptopList();
        HashMap<Integer, ArrayList> filteringСriteriaList = defineFilteringCriteria();

        Laptop laptop = laptopList.get(5);
        useMethods(laptop);
        System.out.println();

        ArrayList<Object> choices = userInterface(filteringСriteriaList);

        filter(laptopList, filteringСriteriaList, choices);




    }

    public static void filter(List<Laptop> laptopList, HashMap<Integer, ArrayList> filteringСriteriaList, ArrayList<Object> choices) {

        List<Laptop> filtredLaptop = new ArrayList<>();

        switch ((Integer) choices.get(0)) {
            case (1):
                if ((Integer) choices.get(1) == 1) {
                    String nameModel = (String) choices.get(2);
                    for (Laptop laptop:
                         laptopList) {
                        if (laptop.getModel().contains(nameModel)) {
                            filtredLaptop.add(laptop);
                        }
                    }
                }
                break;
            case (2):
                switch ((Integer) choices.get(1)) {
                    case (1): {
                        // Указана минимальная цена товара
                    }
                    case (2): {
                        // Указана максимальная цена товара
                    }
                    case (3): {
                        // Указана минимальная и максимальная цена товара
                    }
                }
                break;
        }

    }

    public static ArrayList<Object> userInterface(HashMap<Integer, ArrayList> filteringСriteriaList) {

        ArrayList<Object> choices = new ArrayList<>(3);
        System.out.println("Выберите критерий фильтрации");
        Scanner scanner = new Scanner(System.in);
        for (Integer filter1:
                filteringСriteriaList.keySet()) {
            ArrayList choiceFilter1 = filteringСriteriaList.get(filter1);
            System.out.printf("%d: %s\n", filter1, choiceFilter1.get(0));
        }
        choices.add(scanner.nextInt());

        System.out.println("Выберите фильтр: ");
        Integer crit1 = (Integer) choices.get(0);
        HashMap<Integer, String> filterList = (HashMap<Integer, String>) filteringСriteriaList.get(crit1).get(1);
        for (Integer filter2 :
                filterList.keySet()) {
            System.out.printf("%d: %s\n", filter2, filterList.get(filter2));
        }
        choices.add(scanner.nextInt());
        scanner.nextLine();

        System.out.println("Укажите " + filterList.get(choices.get(1)));
        choices.add(scanner.nextLine());

        return choices;

    }
    public static void useMethods(Laptop laptop) {
        System.out.println(laptop);
        laptop.setNewPrice(round(laptop.getPrice() * 1.1));
        laptop.sell();
        laptop.bringGoodsToWarehouse(25);
        laptop.returnGoods(3);
        laptop.sell();
        laptop.sell();
        System.out.println(laptop);
    }
    public static HashMap<Integer, ArrayList> defineFilteringCriteria() {

        HashMap<Integer, ArrayList> filteringCriteria = new HashMap<>();

        ArrayList<Object> modelDescribe = new ArrayList<>(Arrays.asList("Модель"));
        HashMap<Integer, String> modelHashMap = new HashMap<>();
        modelHashMap.put(1, "Название модели: ");
        modelDescribe.add(modelHashMap);
        filteringCriteria.put(1, modelDescribe);

        ArrayList<Object> priceDescribe = new ArrayList<>(Arrays.asList("Цена"));
        HashMap<Integer, String> priceHashMap = new HashMap<>();
        priceHashMap.put(1, "Минимальная цена: ");
        priceDescribe.add(priceHashMap);
        priceHashMap.put(2, "Максимальная цена: ");
        priceDescribe.add(priceHashMap);
        priceHashMap.put(3, "Минимальная и Максимальная цена: ");
        priceDescribe.add(priceHashMap);
        filteringCriteria.put(2, priceDescribe);

        return filteringCriteria;

    }
    public static List<Laptop> defineLaptopList() {
        Laptop laptop1 = new Laptop("HP", "HP EliteBook", "Germany",
                "grey", 17, "Intel Core i7", 64, 2000, "Windows",
                2500, 105000, 1000);
        Laptop laptop2 = new Laptop("HP", "HP ProBook", "Germany",
                "red", 15, "Intel Core i9", 32, 2200, "Windows",
                2000, 105000, 2050);
        Laptop laptop3 = new Laptop("HP", "HP EliteBook", "English",
                "grey", 14, "Intel Core i5", 16, 500, "Ubuntu",
                3500, 75000, 2500);
        Laptop laptop4 = new Laptop("HP", "HP Essential", "France",
                "blaсk", 19, "AMD Ryzen 7", 8, 1000, "Fedora",
                2700, 90000, 1500);
        Laptop laptop5 = new Laptop("HP", "HP EliteBook", "English",
                "green", 14, "Intel Core i3", 8, 1700, "Windows",
                2300, 70000, 1050);
        Laptop laptop6 = new Laptop("HP", "HP ProBook", "Germany",
                "blaсk", 15, "Intel Core i5", 32, 2500, "Windows",
                2700, 85000, 700);
        Laptop laptop7 = new Laptop("HP", "HP Essential", "France",
                "grey", 14, "AMD Ryzen 7", 8, 2200, "Ubuntu",
                3200, 75000, 500);
        Laptop laptop8 = new Laptop("HP", "HP ProBook", "English",
                "blaсk", 14, "Intel Core i7", 32, 7500, "Chrome OS",
                2500, 70000, 750);
        Laptop laptop9 = new Laptop("HP", "HP EliteBook", "France",
                "blaсk", 17, "AMD Ryzen 9", 16, 500, "Linux",
                4100, 95000, 550);
        Laptop laptop10 = new Laptop("HP", "HP ProBook", "English",
                "blue", 17, "Intel Core i7", 64, 2500, "Fedora",
                4100, 95000, 550);

        List<Laptop> laptopList = new ArrayList<>();
        laptopList.add(laptop1);
        laptopList.add(laptop2);
        laptopList.add(laptop3);
        laptopList.add(laptop4);
        laptopList.add(laptop5);
        laptopList.add(laptop6);
        laptopList.add(laptop7);
        laptopList.add(laptop8);
        laptopList.add(laptop9);
        laptopList.add(laptop10);

        return laptopList;
    }

}