package geekbrains_course.Homework_3;

import java.util.Comparator;

public class CatComporator implements Comparator<Cat>{
    @Override
    public int compare(Cat cat1, Cat cat2) {
        return Integer.compare((int) cat1.weight * 1000, (int) cat2.weight * 1000);
    }

}