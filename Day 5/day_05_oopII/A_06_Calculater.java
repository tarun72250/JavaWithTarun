package day_05_oopII;


//This is used for method overloading
public class A_06_Calculater {
	
	//instance data member
	int a,b;
	
	//Default cons
	public A_06_Calculater()
	{
		this.a=1;
		this.b=2;
	}
	
	//Parametrized cons
	public A_06_Calculater(int aa, int bb)
	{
		this.a=aa;
		this.b=bb;
	}
	
	//Addition Method
	public void addition()
	{
	  System.out.println("Calling two variable declared addition method");
	  System.out.println(a+" + "+b+" = " +(a + b));
	}
	
	public void addition1( int c)
	{
		System.out.println("Calling three variable declared method");
		System.out.println(a+" + "+b+" + "+c+" = " +( a + b + c));
	}
	
	public void subtraction()
	{
	  System.out.println("Calling two variable declared subtraction method");
	  System.out.println(a+" - "+b+" = " +(a - b));
	}
	
	public void multiplication()
	{
	  System.out.println("Calling two variable declared multiplication method");
	  System.out.println(a+" * "+b+" = " +(a * b));
	}
	
	public void division()
	{
	  System.out.println("Calling two variable declared division method");
	  System.out.println(a+" / "+b+" = " +(a / b));
	}
	

}
