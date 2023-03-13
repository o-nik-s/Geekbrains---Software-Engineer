//Дан массив записей: наименование товара, цена, сорт.
// Найти наибольшую цену товаров 1го или 2го сорта среди товаров,
// название которых содержит «высший».

package geekbrains_course.Homework_3.Task_1;

import geekbrains_course.Homework_3.Task_1.model.Item;

import java.util.ArrayList;
import java.util.List;

public class main {

    public static void main(String[] args) {

        List<Item> itemList = defineItemList();
        System.out.println(itemList);

        Integer maxPrise = 0;
        for (int i = 0; i < itemList.size(); i++) {
            if (itemList.get(i).getName().toLowerCase().contains("высший")
                    && ((itemList.get(i).getGrade().equals(1)) || itemList.get(i).getGrade().equals(2)))  {
                if (itemList.get(i).getPrice()>maxPrise) {
                    maxPrise = itemList.get(i).getPrice();
                }
            }
        }
        System.out.println("Максимальная цена товаров, удовлетворяющих условиям, равна: " + maxPrise);
    }
    public static List<Item> defineItemList() {
        Item item1 = new Item("Высший товар 1", 27,1);
        Item item2 = new Item("Обычный товар 2", 47,2);
        Item item3 = new Item("Хороший товар 3", 53,3);
        Item item4 = new Item("Высший сорт 4", 37,1);
        Item item5 = new Item("Высший 5", 17,2);
        Item item6 = new Item("Разный 6", 15,3);
        Item item7 = new Item("Разный 7", 20,1);

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
