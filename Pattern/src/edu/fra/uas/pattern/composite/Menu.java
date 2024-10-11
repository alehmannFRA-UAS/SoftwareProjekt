package edu.fra.uas.pattern.composite;

import java.util.List;

public class Menu implements MenuItem {

    private Integer id;
    private String name;

    private List<MenuItem> items;

    public Menu(Integer id, String name) {
        this.id = id;
        this.name = name;
        this.items = new java.util.ArrayList<>();
    }

    @Override
    public void print() {
        System.out.println(getClass().getSimpleName() + ": " + name);
        for (MenuItem item : items) {
            item.print();
        }
    }

    public void addItem(MenuItem item) {
        items.add(item);
    }

    public void removeItem(MenuItem item) {
        items.remove(item);
    }

    public Integer getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

}
