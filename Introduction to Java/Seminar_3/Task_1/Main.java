// 1. Даны сведения об экспортируемых товарах: указывается наименование товара, страна,
// экспортирующая товар, и объем поставляемой партии в штуках. Найти страны,
// которые экспортируют данный товар, и общий объем его экспорта.

package geekbrains_course.Seminar_3.Task_1;

import geekbrains_course.Seminar_3.Task_1.model.Items;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Items items1 = new Items("name1", "country1", 3);
        Items items2 = new Items("name2", "country1", 4);
        Items items3 = new Items("name2", "country1", 7);
        Items items4 = new Items("name2", "country2", 2);
        Items items5 = new Items("name3", "country3", 5);
        List<Items> itemList = new ArrayList<>();
        itemList.add(items1);
        itemList.add(items2);
        itemList.add(items3);
        itemList.add(items4);
        itemList.add(items5);
        System.out.print("Введите название товара: ");
        Scanner scanner = new Scanner(System.in);
        String searchName = scanner.nextLine();
        scanner.close();
        Integer sumVolumes = 0;
        List<String> countries = new ArrayList<>();
        for (int i = 0; i < itemList.size(); i++) {
            if (itemList.get(i).getName().equals(searchName)) {
                sumVolumes += itemList.get(i).getVolume();
                if (!countries.contains(itemList.get(i).getCountry())) {
                    countries.add(itemList.get(i).getCountry());
                }
            }
        }
        System.out.println("Список стран: "+ countries);
        System.out.println("Сумма объемов равна: " + sumVolumes);
    }
}