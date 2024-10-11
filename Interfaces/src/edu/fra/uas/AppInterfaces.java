package edu.fra.uas;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;

import edu.fra.uas.histogram.HistogramUI;
import edu.fra.uas.histogram.Person;
import edu.fra.uas.histogram.Util;
import edu.fra.uas.interfaces.Comparable;
import edu.fra.uas.interfaces.OverviewImpl;
import edu.fra.uas.interfaces.Rectangle;

public class AppInterfaces {

    public static void main(String[] args) throws Exception {
        AppInterfaces app = new AppInterfaces();
        app.compare();
        //app.interfaceTest();
        //app.collectionTest();
        //app.iteratorTest();
        //app.listIteratorTest();
        //app.histogramTest();
        //app.histogramUITest();
    }

    public void compare() {
        Comparable rect1 = new Rectangle(10, 20);
        Comparable rect2 = new Rectangle(20, 10);
        Comparable rect3 = new Rectangle(10, 25);

        System.out.println(rect1.isLaterThan(rect2));
        System.out.println(rect1.isLaterThan(rect3));
        System.out.println(rect3.isLaterThan(rect2));
    }

    public void  interfaceTest() {
        OverviewImpl.run();
    }

    public void  collectionTest() {        
        Collection<String> collection = new ArrayList<>();
        System.out.println(collection);
        collection.add("Hello");
        System.out.println(collection);
        boolean b = collection.contains("Hello");
        System.out.println(b);
        collection.remove("Hello");
        System.out.println(collection);
        collection.add("Hello");
        collection.add("World");
        System.out.println(collection);
        collection.clear();
        System.out.println(collection);
        b = collection.isEmpty();
        System.out.println(b);
        collection.add("Hello");
        collection.add("World");
        System.out.println(collection);
        Iterator<String> it = collection.iterator();
        Object[] arr = collection.toArray();
        for (Object o : arr) {
            System.out.println(o);
        }
    }

    public void iteratorTest() {
        List<Governor> list = new ArrayList<>();

        list.add(new Governor("Donald Trump", "USA"));
        list.add(new Governor("Kim Jong-Un", "North Korea"));
        list.add(new Governor("Vladimir Putin", "Russia"));
        list.add(new Governor("Xi Jinping", "China"));
        list.add(new Governor("Viktor Orban", "Hungary"));
        
        Iterator<Governor> iter = list.iterator();
        while (iter.hasNext()) {
            Governor governor = (Governor) iter.next();
            System.out.println(governor.getName());
        }
    }

    public void listIteratorTest() {
        List<Governor> list = new ArrayList<>();

        list.add(new Governor("Donald Trump", "USA"));
        list.add(new Governor("Kim Jong-Un", "North Korea"));
        list.add(new Governor("Vladimir Putin", "Russia"));
        list.add(new Governor("Xi Jinping", "China"));
        list.add(new Governor("Viktor Orban", "Hungary"));
        
        System.out.println("forward -->");
        ListIterator<Governor> iter = list.listIterator();
        while (iter.hasNext()) {
            Governor governor = (Governor) iter.next();
            System.out.println(governor.getName());
        }
        System.out.println("backward <--");
        while (iter.hasPrevious()) {
            Governor governor = (Governor) iter.previous();
            System.out.println(governor.getName());
        }
    }

    public void histogramTest() {
        Collection<Person> collection = new ArrayList<>();
        Person p1 = new Person(10);
        Person p2 = new Person(20);
        Person p3 = new Person(30);
        Person p4 = new Person(40);
        Person p5 = new Person(50);

        collection.add(p1);
        collection.add(p2);
        collection.add(p2);
        collection.add(p3);
        collection.add(p3);
        collection.add(p3);
        collection.add(p4);
        collection.add(p4);
        collection.add(p4);
        collection.add(p4);
        collection.add(p5);
        collection.add(p5);

        Map result = Util.makeHistogram(collection);
        System.out.println(result);
    }

    public void histogramUITest() {
        HistogramUI.run();
    }

}
