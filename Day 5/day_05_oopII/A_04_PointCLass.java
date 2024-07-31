package day_05_oopII;

public class A_04_PointCLass {
	
	//instance data member 
	int x;
	int y;
	
	public A_04_PointCLass()
	{
		this.x=0;
		this.y=0;
	}
	//parametrized constructor
	public A_04_PointCLass(int x , int y)
	{
		this.x=x;
		this.y=y;
	}
	
	//instance member method
	public void display()
	{
		System.out.println("["+x+","+y+"]");
	}

	
}
