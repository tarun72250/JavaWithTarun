package day_10_inheritanceAssignment.demos;

import day_10_inheritanceAssignment.shapes.ColorPoint;
import day_10_inheritanceAssignment.shapes.Point;

public class PointDemo {

	public static void main(String[] args) {
			 Point p = new ColorPoint(10,20,"red");
			 p.display();
			 //which class method is call...?
			 //ColorPoint() get called
			 System.out.println("_--_--_--_--_--_--_--_--_");
			 System.out.println(p);//toString() called directly
			 
			 
			 Point p1 = new ColorPoint(10,20,"qwer");
			 p1.display();
			 //which class method is call...?
			 //ColorPoint() get called
			 System.out.println("_--_--_--_--_--_--_--_--_");
			 System.out.println(p1);//toString() called directly
	}

}
