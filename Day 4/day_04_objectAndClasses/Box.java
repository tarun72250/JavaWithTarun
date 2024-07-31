package day_04_objectAndClasses;

public class Box {
	
	//instance variable
	private int height , width , depth;
	
	//default cons
	public Box()
	{
		
	}
	
	//parametrized cons
	public Box(int height , int width , int depth)
	{
		this.height=height;
		this.width=width;
		this.depth=depth;
	}
	
	//copy cons
	public Box(Box b)
	{
		this.height=b.height;
		this.width=b.width;
		this.depth=b.depth;
	}
	
	//instance member method
	public void calVolume()
	{
		System.out.println(height*width*depth);
	}
}
