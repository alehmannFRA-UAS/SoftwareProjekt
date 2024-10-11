package edu.fra.uas.interfaces;

public interface Overview {

    // implicit public abstract methods (methods without a body)
    boolean method1();
    boolean method2();

    // implicit public static final variables
    int CONSTANT = 42;

    // implicit public abstract methods
    default boolean method3() {
        return true;
    }

    static boolean method4() {
        return true;
    }

}
