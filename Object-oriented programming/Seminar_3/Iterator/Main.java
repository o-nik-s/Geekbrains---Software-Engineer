package geekbrains_course.Seminar_3.Iterator;

import java.util.Iterator;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        ListOfCats cats = new ListOfCats();
        cats.setCatList(List.of(new Cat("Barsik"), new Cat("Murzik")));
        cats.iterator().next(); // Т.е. обращение к коллекции идет не напрямую через цикл, а через итератор
        System.out.println(cats.iterator().next());

        ListOfDogs dogs = new ListOfDogs();
        dogs.setDogList(List.of(new Dog("Sharik"), new Dog("Bobik"), new Dog("Polkan")));
        Iterator<Dog> dogIterator = dogs.iterator();
        while (dogIterator.hasNext()) {
            System.out.println(dogIterator.next().getName());
        }
    }
}
