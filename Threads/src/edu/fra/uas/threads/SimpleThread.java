package edu.fra.uas.threads;

public class SimpleThread extends Thread {

    @Override
    public void run() {
        int counter = 0;
        while(true) {
            counter++;
            System.out.println(
                "Thread: " 
                + Thread.currentThread().getName() 
                + " - " 
                + counter
            );
        }
    }

}
