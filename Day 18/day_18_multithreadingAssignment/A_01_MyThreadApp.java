package day_18_multithreadingAssignment;

<<<<<<< HEAD
public class A_01_MyThreadApp 
{

	public static void main(String[] args) 
	{
		
		
		A_01_MyThread a = new A_01_MyThread();
		a.start();
		 
		for(int i=0;i<=5;i++)
		{
			System.out.println("main Thread...!"+i);
			
			try 
			{
				Thread.sleep(500);
			} 
			catch (InterruptedException e) 
			{
				e.printStackTrace();
			}
			
		}
		
	}
	
	

}
/*
public static void main(String[] args) 
	{
=======
public class A_01_MyThreadApp extends Thread{

	public static void main(String[] args) 
	{
>>>>>>> b1affeeedf5b320f66b7032471a5395449274ec1
		//main thread
		A_01_MyThread t = new A_01_MyThread();
		t.start();
		for(int i=1;i<=5;i++)
		{
			System.out.println("Main thread : "+i);
			try {
				Thread.sleep(500);//static method
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
<<<<<<< HEAD
*/
=======

}
>>>>>>> b1affeeedf5b320f66b7032471a5395449274ec1
