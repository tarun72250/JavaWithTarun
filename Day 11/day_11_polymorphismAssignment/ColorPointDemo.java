package day_11_polymorphismAssignment;

public class ColorPointDemo {

	public static void main(String[] args) {

		ColorPoint cp1 = new ColorPoint(10, 20, "red");
        ColorPoint cp2 = new ColorPoint(30, 40, "green");
        ColorPoint cp3 = new ColorPoint(50, 60, "purple");

        System.out.println("ColorPoint 1: " + cp1);
        System.out.println("ColorPoint 2: " + cp2);
        System.out.println("ColorPoint 3: " + cp3);
	}

}
