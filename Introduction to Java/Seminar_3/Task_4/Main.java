// Напишите метод, который на вход получает коллекцию объектов,
// а возвращает коллекцию уже без дубликатов.

package geekbrains_course.Seminar_3.Task_4.entity;

import geekbrains_course.Seminar_3.Task_3.entity.Cub;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Cub> cubList = defineCubList();
        System.out.println("Исходный список: " + cubList);
        System.out.println("Уникальный список: " + unicumCollection(cubList));
    }

    private static Collection unicumCollection(Collection collect) {
        return new HashSet(collect);
    }

    public static List<Cub> defineCubList() {

        List<Cub> cubList = new ArrayList<>();
        Cub cub1 = new Cub(2, "red", "wood");
        Cub cub11 = new Cub(2, "red", "wood");
        Cub cub2 = new Cub(2, "yellow", "metal");
        Cub cub12 = new Cub(2, "yellow", "metal");
        Cub cub3 = new Cub(3, "green", "wood");
        Cub cub13 = new Cub(3, "green", "wood");
        Cub cub4 = new Cub(4, "red", "carton");
        Cub cub14 = new Cub(4, "red", "carton");
        Cub cub5 = new Cub(3, "yellow", "metal");
        Cub cub15 = new Cub(3, "yellow", "metal");
        Cub cub6 = new Cub(4, "red", "wood");
        Cub cub7 = new Cub(3, "yellow", "metal");
        Cub cub8 = new Cub(2, "red", "carton");
        Cub cub9 = new Cub(4, "yellow", "metal");
        Cub cub10 = new Cub(3, "red", "wood");

        cubList.add(cub1);
        cubList.add(cub2);
        cubList.add(cub3);
        cubList.add(cub4);
        cubList.add(cub5);
        cubList.add(cub6);
        cubList.add(cub7);
        cubList.add(cub8);
        cubList.add(cub9);
        cubList.add(cub10);
        cubList.add(cub11);
        cubList.add(cub12);
        cubList.add(cub13);
        cubList.add(cub14);
        cubList.add(cub15);

        return cubList;

    }

}
