package edu.fra.uas;

import edu.fra.uas.classes.Customer;
import edu.fra.uas.classes.Fraction;

public class AppClasses {

    public static void main(String[] args) throws Exception {        
        instances();
        //compares();
        //nullReference();
        //testSideEffect();
        //testCustomers();
    }

    public static void instances() {
        Fraction f1 = new Fraction(3, 5);
        Fraction f2 = new Fraction();

        System.out.println("f1: " + f1.getNumerator() + "/" + f1.getDenominator());
        System.out.println("f2: " + f2.getNumerator() + "/" + f2.getDenominator());
    }

    public static void compares() {
        Fraction f1, f2, f3;
        boolean b1, b2, b3;
        f1 = new Fraction(3, 4);
        f2 = new Fraction(3, 4);
        f3 = f1;

        //System.out.println("f1: " + f1);
        //System.out.println("f2: " + f2);
        //System.out.println("f3: " + f3);

        b1 = f1 == f2;
        b2 = f1 == f3;
        b3 = f1.equals(f2);

        System.out.println("b1: " + b1);
        System.out.println("b2: " + b2);
        System.out.println("b3: " + b3);
    }

    public static void nullReference() {
        Fraction f1, f2, f3;
        boolean b1, b2, b3;
        f1 = new Fraction(3, 4);
        f2 = null;
        f3 = f1;

        //System.out.println("f1: " + f1);
        //System.out.println("f2: " + f2); // NullPointerException
        //System.out.println("f3: " + f3);

        b1 = f1 == f2;
        b2 = f1 == f3;
        b3 = f1.equals(f2); // NullPointerException

        System.out.println("b1: " + b1);
        System.out.println("b2: " + b2);
        System.out.println("b3: " + b3);
    }

    public static void testSideEffect() {
        Fraction f1 = new Fraction(1, 2);
        Fraction f2 = new Fraction(1, 5);

        System.out.println("f1: " + f1.getNumerator() + "/" + f1.getDenominator());
        System.out.println("f2: " + f2.getNumerator() + "/" + f2.getDenominator());

        Weird w = new Weird();
        w.doSideEffects(f1, f2); // f1 and f2 are not swapped because of the call by value

        System.out.println("f1: " + f1.getNumerator() + "/" + f1.getDenominator());
        System.out.println("f2: " + f2.getNumerator() + "/" + f2.getDenominator());
    }

    public static void testCustomers() {
        System.out.println("Number of customers: " + Customer.numberOfCustomers);
        Customer c1 = Customer.createCustomer("Alice", "Adamstr. 12");
        System.out.println("Number of customers: " + Customer.numberOfCustomers);
        Customer c2 = Customer.createCustomer("Bob", "Bakerstr. 23");
        System.out.println("Number of customers: " + Customer.numberOfCustomers);
        Customer c3 = Customer.createCustomer("Charlie", "Columbusstr. 34");
        System.out.println("Number of customers: " + Customer.numberOfCustomers);

        Customer c4 = Customer.findCustomer(2);
        System.out.println("Customer 2: " + c4.toString());

        c1.changeAddress("Albertstr. 45");
        System.out.println("Customer 1: " + c1.toString());
    }

}
