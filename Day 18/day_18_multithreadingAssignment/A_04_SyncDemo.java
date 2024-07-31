package day_18_multithreadingAssignment;

public class A_04_SyncDemo {

	public static void main(String[] args) {
		
		
		A_04_Printer p = new A_04_Printer();
		
		A_04_PrintingJob j1 = new A_04_PrintingJob(p , "{","Sumit java ","}");

		A_04_PrintingJob j2 = new A_04_PrintingJob(p , "[","Niteh java ","]");

		A_04_PrintingJob j3 = new A_04_PrintingJob(p , "(","Prakash java ",")");
		
		
		System.out.println("Printing Task Begins:-");
		
		
		j1.getT().start();
		j2.getT().start();
		j3.getT().start();
		
		try 
		{
			j1.getT().join();

			j2.getT().join();

			j3.getT().join();
		
		}
		catch(InterruptedException e)
		{
			e.printStackTrace();
		}
		
		System.out.println("Prinitng Task ends");
		
	}
}
