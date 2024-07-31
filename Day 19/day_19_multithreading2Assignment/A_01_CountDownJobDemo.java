package day_19_multithreading2Assignment;

public class A_01_CountDownJobDemo {

<<<<<<< HEAD
	public static void main(String[] args)
	{
=======
	public static void main(String[] args) {
>>>>>>> b1affeeedf5b320f66b7032471a5395449274ec1
		//newly created
		A_01_CountDownJob j1 = new A_01_CountDownJob("first",400);
		A_01_CountDownJob j2 = new A_01_CountDownJob("second",750);
		A_01_CountDownJob j3 = new A_01_CountDownJob("third",900);
		
		System.out.println("Couting down begins.....");
<<<<<<< HEAD
		//ready to run  
=======
		//ready to run
>>>>>>> b1affeeedf5b320f66b7032471a5395449274ec1
		j1.getT().start();
		j2.getT().start();
		j3.getT().start();
		
<<<<<<< HEAD
		
=======
>>>>>>> b1affeeedf5b320f66b7032471a5395449274ec1
		//Thread.sleep();   //time is not known
		System.out.println("j1 alive : "+j1.getT().isAlive());
		System.out.println("j2 alive : "+j2.getT().isAlive());
		System.out.println("j3 alive : "+j3.getT().isAlive());
<<<<<<< HEAD
		
=======
>>>>>>> b1affeeedf5b320f66b7032471a5395449274ec1
		try
		{
			j1.getT().join();//non-static method in Thread class
			j2.getT().join();//called on Thread instance
			j3.getT().join();//no input is needed
<<<<<<< HEAD
			//both .sleep() and .join() are use for making interuption  which thrown InterupptedException
=======
			//both .sleep() and .join() are interuption method which thrown InterupptedException
>>>>>>> b1affeeedf5b320f66b7032471a5395449274ec1
		}
		catch(InterruptedException e)
		{
			e.printStackTrace();
		}
		System.out.println("j1 alive : "+j1.getT().isAlive());
		System.out.println("j2 alive : "+j2.getT().isAlive());
		System.out.println("j3 alive : "+j3.getT().isAlive());
		
		System.out.println("Couting down ends.....");

	}
}
