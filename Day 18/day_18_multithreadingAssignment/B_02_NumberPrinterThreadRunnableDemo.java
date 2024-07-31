package day_18_multithreadingAssignment;

public class B_02_NumberPrinterThreadRunnableDemo {

	 	public static void main(String[] args) 
	 	{
	        Thread thread = new Thread(new B_02_NumberPrinterThreadRunnable());
	        thread.start();
	    }
}
