package day_13_interfaceAssignment.entities;

import day_13_interfaceAssignment.utils.A_01_Drawable;

public class A_01_Rectangle implements A_01_Drawable {
	
	//instance dm
	private double length,breadth;
	
	//default cons
	public A_01_Rectangle() {
		super();
	}

	//para cons
	public A_01_Rectangle(double length, double breadth) {
		super();
		this.length = length;
		this.breadth = breadth;
	}
	
	//instance member method
	public void display()
	{
		System.out.println("Length :"+length+"\nBreadth : "+breadth);
	}
	
	
	public void drawshape() {
		System.out.println("In Drwa shape Of Rectangle");
	}

	public double calArea() {
		
		return length * breadth;
	}

}
