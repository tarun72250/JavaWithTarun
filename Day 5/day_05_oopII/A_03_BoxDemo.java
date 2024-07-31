package day_05_oopII;

public class A_03_BoxDemo {
	
	public static void main(String[]args)
	{
		//calling default cons
		A_03_Box b = new A_03_Box();
		System.out.println("b object");
		b.calVolume();
		
		//calling parametrized cons
		A_03_Box b1 = new A_03_Box(2,2,2);
		b1.calVolume();
		
		A_03_Box b2 = new A_03_Box();
	System.out.println(b2.showVolume(2,3,4));
		
		A_03_Box b3 = new A_03_Box();
	System.out.println(b3.showFloatVolume(2.4f,3.7f,4.6f));
		
		//copying state of b1 object ,
		A_03_Box b4 = b1;
		
		
		//Check refrence equality
		if(b == b1)
		System.out.println("Same");
		else
		System.out.println("Different");
		
		
		if(b1 == b2)
		System.out.println("Same");
		else
		System.out.println("Different");
	
		
	}

}
