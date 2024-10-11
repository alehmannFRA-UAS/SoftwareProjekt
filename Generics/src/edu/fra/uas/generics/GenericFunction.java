package edu.fra.uas.generics;

public class GenericFunction {

    public static <T> void fillField(T value, T[] field) {
        for (int i = 0; i < field.length; i++) {
            field[i] = value;
        }
    }

    public static void run() {
        Integer[] intField = new Integer[10];
        fillField(42, intField);
        for (Integer i : intField) {
            System.out.print(i + "\t");
        }
        System.out.println();
    }

}
