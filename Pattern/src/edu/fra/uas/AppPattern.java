package edu.fra.uas;

import edu.fra.uas.pattern.singleton.Singleton;
import edu.fra.uas.pattern.immutable.Immutable;
import edu.fra.uas.pattern.iterator.Strings;
import edu.fra.uas.pattern.observer.NewsAgency;
import edu.fra.uas.pattern.observer.NewsChannel;
import edu.fra.uas.pattern.iterator.StringIterator;
import edu.fra.uas.pattern.builder.Post;
import edu.fra.uas.pattern.composite.Menu;
import edu.fra.uas.pattern.composite.MenuItemType;

public class AppPattern {
    public static void main(String[] args) throws Exception {
        singleton();
        //immutable();
        //iterator();
        //builder();
        //composite();
        //observer();
    }

    public static void singleton() {
        Singleton s1 = Singleton.getInstance();
        Singleton s2 = Singleton.getInstance();
        s1.doSomething();
        s2.doSomething();
    }

    public static void immutable() {
        int value = 42;
        Object object = new Object();
        String[] strings = { "a", "b", "c" };

        Immutable i = new Immutable(value, object, strings);
        
        System.out.println(i.getValue());
        System.out.println(i.getObject());
        String[] tmp = i.getStrings();
        for (String s : tmp) {
            System.out.println(s);
        }
        System.out.println("---- change value, object and strings ----");
        value = 43;
        object = new Object();
        strings[0] = "x";

        System.out.println(i.getValue());
        System.out.println(i.getObject());
        tmp = i.getStrings();
        for (String s : tmp) {
            System.out.println(s);
        }
    }

    public static void iterator() {
        String[] data = { "How", "are", "you" };
        Strings strings = new Strings(data);
        StringIterator it = strings.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }
    }

    public static void builder() {
        Post post = new Post.Builder()
                            .title("Java Builder Pattern")
                            .text("Explaining how to implement the Builder Pattern in Java")
                            .category("Programming")
                    .build();

        System.out.println(post.getTitle());
        System.out.println(post.getText());
        System.out.println(post.getCategory());
    }

    public static void composite() {
        Menu menu = new Menu(1, "File");
        menu.addItem(new MenuItemType(1, "New"));
        menu.addItem(new MenuItemType(2, "Load"));
        menu.addItem(new MenuItemType(3, "Store"));
        Menu submenu = new Menu(4, "Config");
        submenu.addItem(new MenuItemType(5, "Window"));
        submenu.addItem(new MenuItemType(6, "Path"));
        menu.addItem(submenu);
        menu.addItem(new MenuItemType(7, "Exit"));
        menu.print();
    }

    public static void observer() {
        NewsAgency observable = new NewsAgency();
        NewsChannel observer1 = new NewsChannel();
        NewsChannel observer2 = new NewsChannel();

        observable.addObserver(observer1);
        observable.setNews("news");

        System.out.println(observer1.getNews());
        System.out.println(observer2.getNews());

        observable.addObserver(observer2);
        observable.setNews("news2");

        System.out.println(observer1.getNews());
        System.out.println(observer2.getNews());
    }

}
