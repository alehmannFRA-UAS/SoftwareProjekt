package edu.fra.uas.threads;

public class PrintDemo {

    public void printCount() {
        try {
            for(int i = 200; i > 0; i--) {
                System.out.println("Counter --- "  + i );
            }
        } catch (Exception e) {
            System.out.println("printCount() interrupted");
        }
    }

}
