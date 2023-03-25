package geekbrains_course.Seminar_1.OOP;

import java.util.Deque;
import java.util.LinkedList;
import java.util.List;

public interface AnimalInterface {
    // Интерфейс - это более абстрактная штука, абстрактный класс
    // И основная ее функция - это реализация проблемы множественного наследования
    // Т.е. в Java нельзя наследоваться от двух классов сразу, но от интерфейсов мы так можем делать
//    Напр., LinkedList наследует интерфейс от Очереди и от Листа (и еще два других)
//    LinkedList - implements List<E>, Deque<E>, Cloneable, java.io.Serializable
}
