package edu.fra.uas.generics;

public class Store<T> {

    T item;

    public void store(T item) {
        this.item = item;
    }

    public T retrieve() {
        return item;
    }

}
