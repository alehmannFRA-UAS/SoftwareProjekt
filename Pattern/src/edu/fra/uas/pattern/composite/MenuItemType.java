package edu.fra.uas.pattern.composite;

public class MenuItemType implements MenuItem {

    private Integer id;
    private String name;

    public MenuItemType(Integer id, String name) {
        this.name = name;
        this.id = id;
    }

    @Override
    public void print() {
        System.out.println(getClass().getSimpleName() + ": " + name);
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
