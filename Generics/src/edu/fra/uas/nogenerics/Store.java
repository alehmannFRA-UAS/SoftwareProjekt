package edu.fra.uas.nogenerics;

public class Store {

    Object item;

    public void store(Object item) {
        this.item = item;
    }

    public Object retrieve() {
        return item;
    }

}
