package geekbrains_course.Seminar_3.Iterator;

import java.util.Iterator;
import java.util.List;

public class ListOfCatIterator implements Iterator<Cat> {
    private List<Cat> catListIterator;
    private int counter;
    public ListOfCatIterator(List<Cat> catList) {
        catListIterator = catList;
        counter = 0;
    };
    @Override
    public boolean hasNext() {
        // Здесь делаем проверку: если есть следующий элемент в листе, то true, иначе false
        return counter < catListIterator.size();
    }

    @Override
    public Cat next() {
        // Выхватываем из листа с котиками очередного кота и его возвращаем
        return catListIterator.get(counter++);
    }
}
