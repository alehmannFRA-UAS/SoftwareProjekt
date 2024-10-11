package edu.fra.uas.threads;

public class InterruptThread extends Thread {

    public void run() {
        int counter = 0;
        while (!isInterrupted()) {
            counter++;
            System.out.println(
                "Thread: " 
                + Thread.currentThread().getName() 
                + " - " 
                + counter
                + " - isInterrupted: "
                + interrupted()
            );
        }
    }

}
