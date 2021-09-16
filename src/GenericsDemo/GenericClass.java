package GenericsDemo;

import java.util.Iterator;

public class GenericClass<T> implements Iterable<T> {
    private int count;


    public GenericClass(int count) {
        this.count = count;
    }

    public void add(T item) {

    }

    @Override
    public Iterator<T> iterator() {
        return null;
    }
}