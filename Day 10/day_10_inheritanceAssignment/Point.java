package day_10_inheritanceAssignment;

public class Point {

	private int x,y;//instance dm
	
	//Default cons
	public Point()
	{
		
	}
	
	//Para cons
	public Point(int x , int y)
	{
		this.x=x;
		this.y=y;
	}
	
	//instance method
	public void display()
	{
		System.out.println("x :"+x);
		System.out.println("y :"+y);
	}
	
}
