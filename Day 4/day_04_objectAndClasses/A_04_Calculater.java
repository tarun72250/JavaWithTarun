package day_04_objectAndClasses;

public class A_04_Calculater {

	private int n1, n2;
	
	//default cons
	public A_04_Calculater()
	{
		
	}
	
	//para cons
	public A_04_Calculater(int n1 , int n2)
	{
		this.n1= n1;
		this.n2= n2;
	}
	
	//instance method 
	public void add()
	{
		System.out.println("Addition : "+(n1+n2));
	}
	
	public void sub()
	{
		System.out.println("Sub : "+(n1-n2));

	}
	
	public void mul()
	{
		System.out.println("Mul : "+(n1*n2));
	}
	public void div()
	{
		System.out.println("Div : "+(n1/n2));
	}
}
