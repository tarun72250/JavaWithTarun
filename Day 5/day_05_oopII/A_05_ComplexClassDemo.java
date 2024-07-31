package day_05_oopII;

public class A_05_ComplexClassDemo {
	
	public static void main(String [] args)
	{
		//calling default constructor
		A_05_ComplexClass c = new A_05_ComplexClass();
		c.display();
		
		//calling paramterized cons with negative value
		A_05_ComplexClass c1 = new A_05_ComplexClass(2 , -3);
		c1.display();
	}

}
