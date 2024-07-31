package day_10_inheritanceAssignment;

public class A_05_Point {

	  	int x, y;

	    A_05_Point(int x, int y) {
	        this.x = x;
	        this.y = y;
	    }

	    @Override
	    public String toString() {
	        return "(" + x + ", " + y + ")";
	    }
}
