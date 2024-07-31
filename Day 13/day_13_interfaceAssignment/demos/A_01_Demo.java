package day_13_interfaceAssignment.demos;

import day_13_interfaceAssignment.entities.A_01_Circle;
import day_13_interfaceAssignment.entities.A_01_Rectangle;
import day_13_interfaceAssignment.entities.A_01_Triangle;
import day_13_interfaceAssignment.utils.A_01_Drawable;

public class A_01_Demo
	{
	public static void main(String[] args)
	{
		
		A_01_Drawable [] shapes = new A_01_Drawable[3];
		shapes [0]= new A_01_Rectangle(12f,4f);//typecasting we did
		shapes [1]= new A_01_Circle(2.33f);
		shapes [2]= new A_01_Triangle(3,4);
		
		//lets apply polymorphism
//		for(int i=0;i<shapes.length;i++)
//		{
//			shapes[i].drawshape();
//		}
		
		
		//Advanced for loop
		for(A_01_Drawable a :shapes)
		{
			a.drawshape();
			System.out.println(a.calArea());
		}
		
		
		
		
		
		
		
		
		
		
//		//Advanced for loop 
//		//iterating to 1st element to last element automatically 
//		//
//		for(A_01_Drawable d  : shapes)//automatic increment , d reprresent one element in array iteration
//		{
//			d.drawshape();
//			System.out.println(d.calArea());
//			//for this again we achieve polymorphism
//		}
//		
//		int []arr = {15,2,44,23,11};
//		for(int a :arr)
//		{
//			System.out.println(a);
//		}
		
	}

}
