public class CurrentDate implements Runnable{

    @Override
    public void run() {
        while(true){
            if(Thread.currentThread().isInterrupted()){
                System.out.println( Thread.currentThread().getName() + " -> Interrupted!");
                return;
            }
            System.out.println( Thread.currentThread().getName() + " -> Date: " + new java.util.Date());
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                System.out.println( Thread.currentThread().getName() + " -> Interrupted!");
                return;
            }
        }
    }

}
