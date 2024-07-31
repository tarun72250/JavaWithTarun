package day_06_oopIII;

public class A_10_Line {

	private int startpoint;
	private int endpoint;
	
	public A_10_Line()
	{
		this.startpoint=2;
		this.endpoint=3;
	}
	public A_10_Line (int s,int e)
	{
		this.startpoint=s;
		this.endpoint=e;
	}
	
	public void display()
	{
		System.out.println("Starting Point:"+startpoint);
		System.out.println("Ending Point:"+endpoint);
	}

}
