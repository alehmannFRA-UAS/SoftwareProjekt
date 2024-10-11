package edu.fra.uas.interfaces;

public class OverviewImpl implements Overview {

    @Override
    public boolean method1() {
        return false;
    }

    @Override
    public boolean method2() {
        return false;
    }

    public static void run() {
        OverviewImpl impl = new OverviewImpl();
        System.out.println(impl.method1());
        System.out.println(impl.method2());
        System.out.println(impl.method3());
        System.out.println(Overview.method4());
        System.out.println(Overview.CONSTANT);
    }

}
