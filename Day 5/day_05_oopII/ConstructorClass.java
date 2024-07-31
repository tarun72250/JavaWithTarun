package day_05_oopII;

public class ConstructorClass {
	//instace data member
	int a;
	
	//default cons
	public ConstructorClass()
	{
		
	}
	
	//parametrized cons
	public ConstructorClass(int a)
	{
		this.a=a;
	}
	
	//instance member method
	public void show()
	{
		System.out.println("display a "+a);
	}

	//main method
	public static void main(String [] args)
	{
		ConstructorClass c = new ConstructorClass();
		c.show();
		
		ConstructorClass c1 = new ConstructorClass(2);
		c1.show();
	}
}
