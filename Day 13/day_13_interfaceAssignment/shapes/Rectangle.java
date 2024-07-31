package day_13_interfaceAssignment.shapes;

import day_13_interfaceAssignment.utils.Drawable;

public class Rectangle implements Drawable {
	
	private double length,breadth;
	
	
	
	public Rectangle() {
		super();
	}

	public Rectangle(double length, double breadth) {
		super();
		this.length = length;
		this.breadth = breadth;
	}
	
	public void display()
	{
		System.out.println("Length :"+length+"\nBreadth : "+breadth);
	}
	@Override
	public void drawshape() {
		System.out.println("In Drwa shape Of Rectangle");
	}

	@Override
	public double calArea() {
		
		return length * breadth;
	}

}
