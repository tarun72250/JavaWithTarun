package day_18_multithreadingAssignment;

public class A_03_MyJobDemo {

	public static void main(String[] args) 
	{
		A_03_MyJob j = new A_03_MyJob(); //newly created
<<<<<<< HEAD
		
=======
>>>>>>> b1affeeedf5b320f66b7032471a5395449274ec1
		j.getT().start();   //ready to run (thread pool)
		
		for(int i=1;i<=5;i++)
		{
			System.out.println("Main thread : "+i);
			try 
			{
				Thread.sleep(200);//static method
			} 
			catch (InterruptedException e) 
			{
				e.printStackTrace();
			}
		}

	}
}
/*
 Main thread : 1
Child thread : 1
Child thread : 2
Main thread : 2
Child thread : 3
Main thread : 3
Main thread : 4
Child thread : 4
Child thread : 5
Main thread : 5
Here one task atleast completed like main or child , else their timing will changed 
*/