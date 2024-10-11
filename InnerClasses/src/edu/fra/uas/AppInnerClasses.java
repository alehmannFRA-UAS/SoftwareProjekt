package edu.fra.uas;

import edu.fra.uas.inner.anonymous.AnonymousClass;
import edu.fra.uas.inner.anonymous.Function;

public class AppInnerClasses {
    public static void main(String[] args) throws Exception {
        //innerClassTest();
        //innerMethodTest();
        //anonymousClassTest();
        staticClassTest();
    }

    public static void innerClassTest() {
        edu.fra.uas.inner.classes.Outside outside = new edu.fra.uas.inner.classes.Outside("outside", 42);
        //edu.fra.uas.inner.classes.Outside.Inside inside = outside.new Inside();
        outside.outputInner("inside");
    }

    public static void innerMethodTest() {
        edu.fra.uas.inner.method.Outside outside = new edu.fra.uas.inner.method.Outside("outside", 42);
        outside.print();
    }

    public static void anonymousClassTest() {
        AnonymousClass.printTable(
            new Function() {
                public double compute(double x) {
                    return x * x;
                }
            }
        );
        System.out.println("---- compute with different function ----");
        AnonymousClass.printTable(
            new Function() {
                public double compute(double x) {
                    return x * x * x;
                }
            }
        );
    }

    public static void staticClassTest() {
        edu.fra.uas.inner.statics.Outside.Inside inside = new edu.fra.uas.inner.statics.Outside.Inside();
        inside.print();
    }

}
