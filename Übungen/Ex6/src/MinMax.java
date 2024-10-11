import java.util.List;
import java.util.ArrayList;
import java.util.NoSuchElementException;
import java.util.Collections;

public class MinMax<E extends Comparable<E>> {

    List<E> elements = new ArrayList<E>();

    public void push(E value) {
        elements.add(value);
    }

    public void reset() {
        elements.clear();
    }

    public E getMin() {
        if (elements.isEmpty()) {
            throw new NoSuchElementException("No elements in list");
        }
        return Collections.min(elements);
    }

    public E getMax() {
        if (elements.isEmpty()) {
            throw new NoSuchElementException("No elements in list");
        }
        return Collections.max(elements);
    }
    
}
