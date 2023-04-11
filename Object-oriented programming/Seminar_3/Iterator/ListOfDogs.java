package geekbrains_course.Seminar_3.Iterator;

import java.util.Iterator;
import java.util.List;

public class ListOfDogs implements Iterable<Dog>{
    private List<Dog> dogList;

    public List<Dog> getDogList() {
        return dogList;
    }

    public void setDogList(List<Dog> dogList) {
        this.dogList = dogList;
    }

    @Override
    public Iterator<Dog> iterator() {
        return new ListOfDogIterator(dogList);
    }
}
