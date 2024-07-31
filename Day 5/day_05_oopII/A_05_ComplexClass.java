package day_05_oopII;

public class A_05_ComplexClass {
	
	
	//instance data member
	int real;
	int imaginary;
	
	
	//constructor - for initialize the object
	//Default constructor 
	public A_05_ComplexClass()
	{
		this.real=3;
		this.imaginary=5;
	}
	
	//Parametrized costructor
	public A_05_ComplexClass(int r , int i)
	{
		this.real=r;
		this.imaginary=i;
	}
	
	//instance member method
	public void display()
	{
		if( imaginary > 0 )
		{
			System.out.println(real+" + "+imaginary+"i");
		}
		else
		{
			System.out.println(real+" + "+(-(imaginary))+"i");
		}
	}
	
	

}
