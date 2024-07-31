package day_18_multithreadingAssignment;

public class A_05MainAppln {

	public static void main(String[] args) 
	{
		
		
		A_05_TotalEarning te = new A_05_TotalEarning();
		te.start();
		
		//System.out.println("Total Earning :"+te.total +" Rs.");
		
		
		synchronized (te)
		{
			try
			{
				te.wait();
				System.out.println("Total Earning :"+te.total +" Rs.");
			} 
			catch (InterruptedException e)
			{
				e.printStackTrace();
			}
			
		}
		
		
	}
}
