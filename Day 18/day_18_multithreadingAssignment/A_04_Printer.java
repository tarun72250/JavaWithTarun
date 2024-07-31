package day_18_multithreadingAssignment;

public class A_04_Printer 
{

	//method 
	public  synchronized void print(String header , String body , String footer)
	{
		try
		{
			System.out.println(header);
			Thread.sleep(500);
			System.out.println(body);
			Thread.sleep(500);
			System.out.println(footer);
			Thread.sleep(500);
			
		}
		catch(InterruptedException e)
		{
			e.printStackTrace();
		}
	}
	
	
}
