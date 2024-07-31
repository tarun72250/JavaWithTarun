package day_06_oopIII;

public class StaticClassDemo {

	public static void main(String[] args) {
		
		StaticClass s = new StaticClass();
		s.displayAccDetails();
		
		
		StaticClass s1 = new StaticClass();
		s1.calulateInterest(23412345,4.5f);
		
		
		System.out.println("Using static method");
		StaticClass.updateInterest(234, 123.f);
		
		
		//Static in built method in java
		System.out.println(Math.abs(-2));
		System.out.println(Math.pow(2, 3));
	
	}

}
