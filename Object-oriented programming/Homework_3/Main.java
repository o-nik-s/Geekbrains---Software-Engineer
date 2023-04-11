package geekbrains_course.Homework_3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Cat> cats = new ArrayList<>();
        List<Cat> catList = List.of(new Cat("Barsik", 5, 5.5), new Cat("Murzik", 7, 2.5), new Cat("Murka", 3, 7));
        for (int i=0; i<catList.size(); i++) {
            cats.add(catList.get(i));
        }
        System.out.println(cats);
        System.out.println("--------------------------------------");
        printCats(cats);
        System.out.println("--------------------------------------");
        Collections.sort(cats);
        printCats(cats);
        System.out.println("--------------------------------------");
        Collections.sort(cats, new CatComporator());
        printCats(cats);
        System.out.println("--------------------------------------");
        cats.sort(new CatComporator());
        printCats(cats);
    }

    public static void printCats(List<Cat> cats) {
        Iterator<Cat> catIterator = cats.iterator();
        while (catIterator.hasNext()) {
            Cat cat = catIterator.next();
            System.out.println(cat.getName() + " " + cat.getAge() + " " + cat.getWeight());
        }
    }
}
