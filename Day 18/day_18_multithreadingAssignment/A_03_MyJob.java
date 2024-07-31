package day_18_multithreadingAssignment;

<<<<<<< HEAD

public class A_03_MyJob implements Runnable //1.
{
	//2.
	private Thread t;
	
	public A_03_MyJob()
	{
		//3.
		t=new Thread(this);
	}
	
	//4.
	public Thread getT() 
	{
		return t;
	}

	@Override
	public void run() 
	{
		for(int i=1;i<=5;i++)
		{
			System.out.println("Child thread : "+i);
			try 
			{
				Thread.sleep(200);
			} 
			catch (InterruptedException e) 
			{
				e.printStackTrace();
			}
		}

	}

}




/*
//if problem not occur like last problem we seen we use Thread instance 
public class A_03_MyJob implements Runnable //1.
{

	

	



//refrence  
	private Thread t;//refrence dm
	
	
	//default cons
	public A_03_MyJob()
	{
		t = new Thread();
	}
	
	
	//getter method
	public Thread getT()
	{
		return t;
	}
	
	
	
	@Override
	public void run() {
		
		for(int i=0;i<=5;i++)
		{
			System.out.println("Child Thread ...!"+i);
			try 
			{
				Thread.sleep(1000);
			} 
			catch (InterruptedException e) 
			{
				e.printStackTrace();
			}
		}
	}
*/
=======
//if problem not occur like last problem we seen we use Thread instance 
public class A_03_MyJob implements Runnable  {

	//1.

		//2.
		private Thread t;
		
		public A_03_MyJob()
		{
			//3.
			t=new Thread(this);
		}
		
		//4.
		public Thread getT() {
			return t;
		}

		@Override
		public void run() {
			for(int i=1;i<=5;i++)
			{
				System.out.println("Child thread : "+i);
				try 
				{
					Thread.sleep(200);
				} catch (InterruptedException e) 
				{
					e.printStackTrace();
				}
			}

		}
}
>>>>>>> b1affeeedf5b320f66b7032471a5395449274ec1
