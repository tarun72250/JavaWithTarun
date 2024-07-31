package day_10_inheritanceAssignment;

public class A_05_ColorPointDemo {

	public static void main(String[] args) {
		
		
			A_05_ColorPoint cp1 = new A_05_ColorPoint(10, 20, "red");
	        A_05_ColorPoint cp2 = new A_05_ColorPoint(30, 40, "green");
	        A_05_ColorPoint cp3 = new A_05_ColorPoint(50, 60, "purple");

	        System.out.println("ColorPoint 1: " + cp1.toString());
	        System.out.println("ColorPoint 2: " + cp2);
	        System.out.println("ColorPoint 3: " + cp3);
	}

}
