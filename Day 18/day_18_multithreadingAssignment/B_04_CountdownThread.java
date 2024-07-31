package day_18_multithreadingAssignment;
//4. Create a thread for counting down from a particular number to zero. 
//Create 3 instances and make the main thread wait for their completion.

public class B_04_CountdownThread extends Thread {
    private int startNumber;

    public B_04_CountdownThread(int startNumber) {
        this.startNumber = startNumber;
    }

    public void run() {
        for (int i = startNumber; i >= 0; i--) {
            System.out.println(Thread.currentThread().getName() + ": " + i);
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                System.err.println("Thread interrupted: " + e.getMessage());
            }
        }
    }
}
