package day_04_objectAndClasses;

public class A_03_Point {

	private int x , y;
	
	//default cons
	public A_03_Point() {
	}


	//para cons
	public A_03_Point(int x, int y) {
		this.x = x;
		this.y = y;
	}


	//instance method
	public void display(int a, int b)
	{
		System.out.println("["+a+","+b+"]");
	}
	
}
