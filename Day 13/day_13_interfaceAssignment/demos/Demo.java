//package day_13_interfaceAssignment.demos;
//
//import day_13_interfaceAssignment.shapes.Circle;
//import day_13_interfaceAssignment.shapes.Rectangle;
//import day_13_interfaceAssignment.utils.Drawable;
//
//public class Demo {
//public static void main(String[] args) {
//		
//		
//		Drawable [] shapes = new Drawable[2];
//		shapes [0]= new Rectangle(12f,4f);//typecasting we did
//		shapes [1]= new Circle(2.33f);
//		
//		//lets apply polymorphism
////		for(int i=0 ; i<shapes.length ;i++)
////		{
////			shapes[i].drawshape();
////		}
//		
//		//Advanced for loop 
//		//iterating to 1st element to last element automatically 
//		//
//		for(Drawable d  : shapes)//automatic increment , d reprresent one element in array iteration
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
//		
//	}
//
//}
