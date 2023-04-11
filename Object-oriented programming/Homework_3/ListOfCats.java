package geekbrains_course.Homework_3;

import java.util.Iterator;
import java.util.List;
/** Хранит список всех котиков - приют для котиков */
public class ListOfCats implements Iterable<Cat> {
    private List<Cat> catList;

    public List<Cat> getCatList() {
        return catList;
    }

    public void setCatList(List<Cat> catList) {
        this.catList = catList;
    }

    @Override
    public Iterator<Cat> iterator() {
        return new ListOfCatIterator(catList);
    }

}
