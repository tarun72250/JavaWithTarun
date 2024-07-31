package day_13_interfaceAssignment.entities;

import day_13_interfaceAssignment.utils.A_01_Drawable;

public class A_01_Triangle implements A_01_Drawable {

	private int base , height;
	
	public A_01_Triangle()
	{
		
	}
	
	public A_01_Triangle(int base , int height)
	{
		this.base= base;
		this.height=height;
	}
	
	
	public void display()
	{
		
	}
	
	public void drawshape() 
	{
		System.out.println("In drawShape() of Triangle");
	}

	public double calArea() {
	
		return 1/2 * base * height;
	}

	
	//----------> implements 
	//_____________extends
	
}
