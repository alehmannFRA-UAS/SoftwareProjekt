package edu.fra.uas;

import edu.fra.uas.threads.SimpleThread;
import edu.fra.uas.threads.StopThread;
import edu.fra.uas.threads.InterruptThread;
import edu.fra.uas.threads.RunnableClass;
import edu.fra.uas.threads.PrintDemo;
import edu.fra.uas.threads.TDemo;
import edu.fra.uas.threads.SyncedFuncThread;

public class AppThreads {

    public static void main(String[] args) throws Exception {
        //runSimpleThread();
        //runStopThread();
        //runInterruptThread();
        //runRunnableClass();
        //runThreadDemo();
        runSyncedFuncThread();
    }

    public static void runSimpleThread() {
        SimpleThread thread = new SimpleThread();
        System.out.println("Starting Thread...");
        thread.start();
        try{
            Thread.sleep(10);
        } catch (InterruptedException e) {
            System.out.println(e.getMessage());
        }
        System.out.println("Stopping Thread...");
        thread.stop();
        System.out.println("Thread stopped.");
    }

    public static void runStopThread() {
        StopThread thread = new StopThread();
        System.out.println("Starting Thread...");
        thread.start();
        try{
            Thread.sleep(10);
        } catch (InterruptedException e) {
            System.out.println(e.getMessage());
        }
        System.out.println("Stopping Thread...");
        thread.stopThread();
        System.out.println("Thread stopped.");
        System.out.println("Thread isAlive: " + thread.isAlive());
    }

    public static void runInterruptThread() {
        Thread thread = new InterruptThread();
        System.out.println("Starting Thread...");
        thread.start();
        try{
            Thread.sleep(10);
        } catch (InterruptedException e) {
            System.out.println(e.getMessage());
        }
        System.out.println("Interrupting Thread...");
        thread.interrupt();
        System.out.println("Thread interrupted.");
    }

    public static void runRunnableClass() {
        RunnableClass runnable = new RunnableClass(5000);
        Thread thread = new Thread(runnable, "RunnableClass");
        System.err.println("Starting Thread...");
        thread.start();
        try{
            Thread.sleep(10);
        } catch (InterruptedException e) {
            System.out.println(e.getMessage());
        }
        System.out.println("Interrupting Thread...");
        thread.interrupt();
        System.out.println("Thread interrupted.");
    }

    public static void runThreadDemo() {
        PrintDemo PD = new PrintDemo();
        TDemo T1 = new TDemo( "Thread - 1 ", PD );
        TDemo T2 = new TDemo( "Thread - 2 ", PD );
        T1.start();
        T2.start();
        try {
            T1.join();
            T2.join();
        } catch ( Exception e) {
            System.out.println("Interrupted");
        }
    }

    public static void runSyncedFuncThread() {
        SyncedFuncThread thread1 = new SyncedFuncThread("A");
        SyncedFuncThread thread2 = new SyncedFuncThread("B");
        thread1.start();
        thread2.start();
        try {
            Thread.sleep(20);
        } catch (InterruptedException e) {
            System.out.println(e.getMessage());
        }
        thread1.interrupt();
        thread2.interrupt();
    }

}
