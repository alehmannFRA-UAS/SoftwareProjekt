package edu.fra.uas;

import edu.fra.uas.generics.GenericFunction;

public class AppGenerics {
    public static void main(String[] args) throws Exception {
        storeAndRetrieveNonGeneric();
        //storeAndRetrieveGeneric();
        //storeAndRetrieveGenericNumeric();
        //genericFunction();
        //genericFunction2();
    }

    public static void storeAndRetrieveNonGeneric() {
        edu.fra.uas.nogenerics.Store store = new edu.fra.uas.nogenerics.Store();
        store.store("Hello");
        String s = (String) store.retrieve();
        Integer i = (Integer) store.retrieve();
    }

    public static void storeAndRetrieveGeneric() {
        edu.fra.uas.generics.Store<String> store = new edu.fra.uas.generics.Store<>();
        store.store("Hello");
        String s = store.retrieve();
        //Integer i = store.retrieve();
    }

    public static void storeAndRetrieveGenericNumeric() {
        edu.fra.uas.generics.Store<Number> store = new edu.fra.uas.generics.Store<>();
        store.store(42);
        Number n = store.retrieve();
        System.out.println(n);

        store.store(3.14);
        n = store.retrieve();
        System.out.println(n);

        store.store(Long.MAX_VALUE);
        n = store.retrieve();
        System.out.println(n);
    }

    public static void genericFunction() {
        GenericFunction.run();
    }

    public static void genericFunction2() {
        Integer[] intField = new Integer[10];
        GenericFunction.fillField(5, intField);
        for (Integer i : intField) {
            System.out.print(i + "\t");
        }
    }

}
