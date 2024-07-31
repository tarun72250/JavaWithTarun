package day_05_oopII;

public class A_02_DateClass2 {
	
	//Data members
	private int dd , mm , yy ;
	
	//No-args Constructor , default constructor
	public A_02_DateClass2()
	{
		this.dd=10;
		this.mm=10;
		this.yy=2023;
	}
	
	
	//Note: if we not specify any constructor default constructor is present.
	//Actual parameter
	public A_02_DateClass2(int date , int month , int year)
	{
		this.dd=date;
		this.mm=month;
		this.yy=year;
	}
	
	//Copy cons
	public A_02_DateClass2(A_02_DateClass2 d)
	{
		this.dd=d.dd;
		this.mm=d.mm;
		this.yy=d.yy;
	}
	
	//instance method
	public void display()
	{
		System.out.println(dd+"-"+mm+"-"+yy);
	}
	
	//this is the example of method overloading
	//Internally char datatype stored in the form of asciee value
	public void display(char ch)
	{
		//this is problematic condition bcoz char datatype internally stored as asccie value 
		//there is addition in that which is a problem.
		//System.out.println(dd+ch+mm+ch+yy);
		System.out.println(dd+" "+ch+" "+mm+" "+ch+" "+yy);
	}
}
