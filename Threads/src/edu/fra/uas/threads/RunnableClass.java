package edu.fra.uas.threads;

public class RunnableClass extends Counter implements Runnable {

    public RunnableClass(int maxCount) {
        super(maxCount);
    }

    @Override
    public void run() {
        while (value() < maxCount()) {
            if (Thread.currentThread().isInterrupted()) {
                System.out.println(Thread.currentThread().getName() + " interrupted.");
                return;
            }
            increment();
            System.out.println(Thread.currentThread().getName() + " " + value());
        }
    }

}
