package day_05_oopII;

public class A_03_Box {
	
	//instance data member
	int height;
	int width;
	int depth;
	
	//default constructor
	public A_03_Box()
	{
		this.height=this.width=this.depth=0;
	}
	
	//parametrized constructor 
	public A_03_Box(int h , int w , int d)
	{
		this.height=h;
		this.width=w;
		this.depth=d;
	}
	
	//copy cons for copying state of another object
	public A_03_Box(A_03_Box b)
	{
		this.height=b.height;
		this.width=b.width;
		this.depth=b.depth;
	}
	
	//instance member method
	public void calVolume()
	{
		int volume= height*width*depth;
		System.out.println("volume of box: "+volume);
	}
	
	public int showVolume(int h , int w , int d)
	{
		int volume= h*w*d;
		return volume;
	}
	
	//Note:-return type not consider in method overloading
	public float showFloatVolume(float h , float w , float d)
	{
		//int volume= (int) (h*w*d);//typecasting 
		int volume =(int) (h*w*d);
		return volume;
	}
	
	
}
