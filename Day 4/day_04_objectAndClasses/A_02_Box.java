package day_04_objectAndClasses;

public class A_02_Box {

	private int height , width , depth;
	
	//default cons
	public A_02_Box()
	{
		//this.height=width=depth=0;
	}
	
	//parametrized cons
	public A_02_Box(int height , int width , int depth)
	{
		this.height=height;
		this.width=width;
		this.depth=depth;
	}
	
	
	//copy cons
	public A_02_Box(A_02_Box b)
	{
		this.height=b.height;
		this.width=b.width;
		this.depth=b.depth;
	}
	
	
	
	public void calVolume()
	{
		int result = height*width*depth;
		System.out.println("Volume is :"+result);
		
	}
	
}
