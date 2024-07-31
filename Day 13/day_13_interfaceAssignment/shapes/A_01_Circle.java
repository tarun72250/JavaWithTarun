package day_13_interfaceAssignment.shapes;

import day_13_interfaceAssignment.utils.A_01_Drawable;

public class A_01_Circle implements A_01_Drawable {

	//instance dm
	private double radius;
	
	//default cons
	public A_01_Circle() {
		super();
	}

	//para cons
	public A_01_Circle(double radius) {
		super();
		this.radius = radius;
	}
	
	//instance member method
	public void display()
	{
		
	}

	
	public void drawshape() {
		System.out.println("In draw shape of Circle");
	}

	public double calArea() {
		return PI*radius*radius;
	}

}
