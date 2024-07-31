package day_05_oopII;

public class A_08_MathClass {
	
	//instance data member
	int a;
	int b;
	int c;
	float d;
	float e;
	
	/*//default cons
	public MathClass()
	{
		
	}
	
	//parametrized constructor
	public MathClass(int as,int bs)
	{
		this.a=as;
		this.b=bs;
	}
	
	//3 int parametrized constructor
	public MathClass(int as , int bs , int cs)
	{
		this.a=as;
		this.b=bs;
		this.c=cs;
	}
	
	//2 double parametrized constructor
	public MathClass(float ds,float es)
	{
		this.d=ds;
		this.e=es;
	}
	
	public MathClass(int a , float f) 
	{
		this.a=a;
		this.d=f;
	}
	
	//instance member methods
	public void addOfTwoInteger()
	{
		System.out.println("Addition of two integer "+a+" + "+b+" = "+(a+b));
	}
	
	
	public void addOfThreeInteger()
	{
		System.out.println("Addition of three integer "+a+" + "+b+" + "+c+" = "+(a+b+c));
	}
	
	public void addOfTwoFloat()
	{
		System.out.println("Addition of two float "+d+" + "+e+" = "+(d+e));
	}
	
	public void addOfIntFloatDouble(double z)
	{
		System.out.println("Addition of int float double value "+a+" + "+d+" + "+z+" ="+(a+d+z));
	}*/
	//instance member methods
		public void addOfTwoInteger(int a , int b)
		{
			System.out.println("Addition of two integer "+a+" + "+b+" = "+(a+b));
		}
		
		
		public void addOfThreeInteger(int a , int b , int c)
		{
			System.out.println("Addition of three integer "+a+" + "+b+" + "+c+" = "+(a+b+c));
		}
		
		public void addOfTwoFloat(float d , float e)
		{
			System.out.println("Addition of two float "+d+" + "+e+" = "+(d+e));
		}
		
		public void addOfIntFloatDouble(int a , float d , double z)
		{
			System.out.println("Addition of int float double value "+a+" + "+d+" + "+z+" ="+(a+d+z));
		
		}
}
