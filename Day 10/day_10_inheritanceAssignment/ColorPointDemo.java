package day_10_inheritanceAssignment;

public class ColorPointDemo {

	public static void main(String[] args) {
		
		ColorPoint c = new ColorPoint();//default cons calling
		c.display();
		
		ColorPoint c1 = new ColorPoint(2,3,"red");//para cons calling
		c1.display();
		
		ColorPoint c2 = new ColorPoint(4,5,"violet");//para cons calling
		c2.display();			
	}
}
