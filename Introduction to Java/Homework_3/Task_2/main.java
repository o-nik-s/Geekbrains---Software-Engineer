// Сведения о товаре состоят из наименования, страны-производителя,
// веса, цены, сорта. Получить наименования товаров заданного сорта с наименьшей ценой.

package geekbrains_course.Homework_3.Task_2;

import geekbrains_course.Homework_3.Task_2.model.Item;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class main {

    public static void main(String[] args) {

        List<Item> itemList = defineItemList();
        System.out.println(itemList);

        System.out.println("Введите номер сорта: ");
        Scanner scanner = new Scanner(System.in);
        int grade = scanner.nextInt();
        scanner.close();

        List<String> choiceItemNameList = new ArrayList<>();
        Integer minPrise = -1;
        for (Item item:
             itemList) {
            if (item.getGrade().equals(grade) && item.getPrice()<minPrise || minPrise<0)  {
                minPrise = item.getPrice();
            }
        }
        for (Item item:
                itemList) {
            if (item.getGrade().equals(grade) && item.getPrice()==minPrise) {
                choiceItemNameList.add(item.getName());
            }
        }
        System.out.println("Названия товаров " + grade + " сорта с минимальной ценой " + minPrise + ": " + choiceItemNameList);
    }
    public static List<Item> defineItemList() {
        Item item1 = new Item("Высший товар 1", "Country1",12, 35, 2);
        Item item2 = new Item("Нормальный товар 2", "Country1",15, 25, 1);
        Item item3 = new Item("Разный товар 1", "Country2",12, 69, 1);
        Item item4 = new Item("Обычный товар 2", "Country3",16, 55, 3);
        Item item5 = new Item("Нормальный товар 3", "Country2",15, 25, 2);
        Item item6 = new Item("Хороший товар 1", "Country2",17, 25, 1);
        Item item7 = new Item("Отличный товар 1", "Country1",10, 25, 1);

        List<Item> itemList= new ArrayList<>();
        itemList.add(item1);
        itemList.add(item2);
        itemList.add(item3);
        itemList.add(item4);
        itemList.add(item5);
        itemList.add(item6);
        itemList.add(item7);

        return itemList;
    }
}
