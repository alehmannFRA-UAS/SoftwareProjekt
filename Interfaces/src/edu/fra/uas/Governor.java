package edu.fra.uas;

public class Governor {

    private String name;
    private String state;

    public Governor(String name, String state) {
        this.name = name;
        this.state = state;
    }

    public String getName() {
        return name;
    }

    public String getState() {
        return state;
    }

    @Override
    public String toString() {
        return "Governor [name=" + name + ", state=" + state + "]";
    }
    
}
