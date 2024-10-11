public class Main {

    public static void main(String[] args) {
        CurrentDate currentDate = new CurrentDate();
        Thread thread0 = new Thread(currentDate);
        Thread thread1 = new Thread(currentDate);
        Thread thread2 = new Thread(currentDate);

        thread0.start();
        thread1.start();
        thread2.start();

        try {
            Thread.sleep(1000);
            thread0.interrupt();
            Thread.sleep(1000);
            thread1.interrupt();
            Thread.sleep(1000);
            thread2.interrupt();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("All threads are done!");
    }

}
