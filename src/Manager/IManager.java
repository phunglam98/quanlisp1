package Manager;

import java.util.ArrayList;

public interface IManager<E> {
    void add(E e);
    void delete(int id);
    void edit(int id,E e);
    ArrayList<E> showAll();
}