package edu.fra.uas.threads;

public class StopThread extends Thread {

    private volatile boolean running = true;

    public void run() {
        int counter = 0;
        while (running) {
            counter++;
            System.out.println(
                "Thread: " 
                + Thread.currentThread().getName() 
                + " - " 
                + counter
            );
        }
    }

    public void stopThread() {
        running = false;
    }

}
