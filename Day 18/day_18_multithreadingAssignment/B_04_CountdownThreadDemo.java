package day_18_multithreadingAssignment;

public class B_04_CountdownThreadDemo {

	 public static void main(String[] args)
	    {
	    	B_04_CountdownThread t1 = new B_04_CountdownThread(10);
	    	B_04_CountdownThread t2 = new B_04_CountdownThread(5);
	    	B_04_CountdownThread t3 = new B_04_CountdownThread(7);

	        t1.start();
	        t2.start();
	        t3.start();

	        try {
	            t1.join();
	            t2.join();
	            t3.join();
	        } catch (InterruptedException e) {
	            System.err.println("Main thread interrupted: " + e.getMessage());
	        }

	        System.out.println("All threads have completed execution.");
	    }
}
