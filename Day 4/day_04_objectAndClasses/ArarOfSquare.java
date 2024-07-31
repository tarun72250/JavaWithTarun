package day_04_objectAndClasses;

public class ArarOfSquare {
	
	//instance data memebr
	private int area;
	
	//Default cons
	public ArarOfSquare()
	{
		
	}
	
	//Paramterized cons
	public ArarOfSquare(int area)
	{
		this.area=area;
	}
	
	
	//method
	public void display()
	{
		System.out.println("Area of Square : "+area*area);
	}
}
