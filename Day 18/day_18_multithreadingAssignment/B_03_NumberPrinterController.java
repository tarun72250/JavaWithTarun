package day_18_multithreadingAssignment;
//3. Repeat above assignment with Thread controller within the class implementing Runnable.

public class B_03_NumberPrinterController implements Runnable {
    private Thread thread;

    public B_03_NumberPrinterController() {
        thread = new Thread(this);
    }

    public void start() {
        thread.start();
    }

    @Override
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println(i);
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                System.err.println("Thread interrupted: " + e.getMessage());
            }
        }
    }

   
}
