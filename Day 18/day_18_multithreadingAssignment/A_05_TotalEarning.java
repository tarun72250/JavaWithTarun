package day_18_multithreadingAssignment;

public class A_05_TotalEarning extends Thread{

	int total =0;
	
	
	
	public void run()
	{
		synchronized (this) {
			
			for(int i =1 ; i<=10 ; i++)
			{
				total = total + 100;
			}
			this.notify();
		}
		
	}
}
