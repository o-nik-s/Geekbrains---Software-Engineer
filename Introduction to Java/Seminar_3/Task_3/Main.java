// Даны следующие сведения о кубиках: размер каждого кубика (длина ребра в целых сантиметрах), его цвет (красный, желтый, зеленый тд) и материал (деревянный, металлический, картонный и тд.). Найти:
// - количество кубиков желтого цвета и их суммарный объем;
// - количество деревянных кубиков с ребром 3 см


package geekbrains_course.Seminar_3.Task_3;

import geekbrains_course.Seminar_3.Task_3.entity.Cub;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Cub> cubList = defineCubList();

        Integer countYellow = 0;
        Integer sumVolume = 0;
        Integer countWood3 = 0;
        for (Cub cub:
             cubList) {
            if (cub.getColour()=="yellow"){
                countYellow++;
                sumVolume += cub.getSize() * cub.getSize() * cub.getSize();
            }
            if (cub.getMaterial()=="wood" && cub.getSize()==3){
                countWood3++;
            }
        }
        System.out.println("Количество кубов желтого цвета равно: " + countYellow);
        System.out.println("Их суммарный объек равен: " + sumVolume);
        System.out.println("Количество деревянных кубов с ребром 3 равно: " + countWood3);

    }

    public static List<Cub> defineCubList() {

        List<Cub> cubList = new ArrayList<>();
        Cub cub1 = new Cub(2, "red", "wood");
        Cub cub2 = new Cub(2, "yellow", "metal");
        Cub cub3 = new Cub(3, "green", "wood");
        Cub cub4 = new Cub(4, "red", "carton");
        Cub cub5 = new Cub(3, "yellow", "metal");
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

        return cubList;
    }

}
