package edu.fra.uas.pattern.singleton;

public class Singleton {

    private static Singleton instance = null;

    private Singleton() {
        System.out.println("Singleton instance created.");
    }

    public static Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }

    public void doSomething() {
        System.out.println("Singleton instance " + this + " does something.");
    }

}
