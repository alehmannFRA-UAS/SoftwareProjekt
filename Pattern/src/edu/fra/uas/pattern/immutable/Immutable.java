package edu.fra.uas.pattern.immutable;

// public final class Immutable { // final class cannot be extended 
public class Immutable implements Cloneable {

    private int value;
    private Object object;
    private String[] strings;

    public Immutable(int value, Object object, String[] strings) {
        this.value = value;
        this.object = object;
        // clone arrays! otherwise the original array can be changed from outside
        this.strings = strings;
        //this.strings = strings.clone();
    }

    public int getValue() {
        return value;
    }

    public Object getObject() {
        return object;
    }

    public String[] getStrings() {
        return strings.clone();
    }

}
