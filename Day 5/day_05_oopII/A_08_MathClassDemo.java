package day_05_oopII;

public class A_08_MathClassDemo {
	
	public static void main(String[]args)
	{
		A_08_MathClass m; //refrence variable 
		int n ;// insance variable 
		
		System.out.println("\n1 Object Calling :");
		m = new A_08_MathClass();
		m.addOfTwoInteger(2,3);
		
		System.out.println("\n2 Object Calling :");
		A_08_MathClass m1 = new A_08_MathClass();
		m1.addOfThreeInteger(2,3,4);
		
		System.out.println("\n3 Object Calling :");
		A_08_MathClass m3 = new A_08_MathClass();
		m3.addOfTwoFloat(2.3f,3.2f);
		
		System.out.println("\n4 Object Calling :");
		A_08_MathClass m4 = new A_08_MathClass();
		m4.addOfIntFloatDouble(2,3.2f,3.9);
		
	}

}
