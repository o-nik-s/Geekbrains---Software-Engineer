package geekbrains_course.Seminar_3.Iterator;

import java.util.Iterator;
import java.util.List;

public class ListOfDogIterator implements Iterator<Dog> {
    private List<Dog> dogListIterator;
    private int counter;
    public ListOfDogIterator(List<Dog> dogList) {
        dogListIterator = dogList;
        counter = 0;
    };
    @Override
    public boolean hasNext() {
        // Здесь делаем проверку: если есть следующий элемент в листе, то true, иначе false
        return counter < dogListIterator.size();
    }

    @Override
    public Dog next() {
        // Выхватываем из листа с собаками очередную собаку и возвращаем ее
        return dogListIterator.get(counter++);
    }

}
