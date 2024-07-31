package day_10_inheritanceAssignment;
import java.util.Arrays;
public class A_05_ColorPoint extends A_05_Point {

	private String color;
    
	private static String[] colors = {"red", "blue", "green", "yellow"};

    public A_05_ColorPoint(int x, int y, String color) {
        super(x, y);
        if (Arrays.asList(colors).contains(color)) {
            this.color = color;
        } else 
        {
            this.color = "white";
        }
    }

    @Override
    public String toString() {
        return super.toString() + " - Color: " + color;
    }

}
