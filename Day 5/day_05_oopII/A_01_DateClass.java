package day_05_oopII;
//Access specifier ,Class is a keyword , Class_Name
public class A_01_DateClass {

	int dd;   //Data members
	int mm;   //Data members
	int yy;   //Data members
	
	//Default cons
	public A_01_DateClass()
	{
		this.dd=18;
		this.mm=05;
		this.yy=2000;
	}
	
	
	
	//Constructor
	public A_01_DateClass(int dd, int mm ,int yy)
	{
		this.dd=dd;
		this.mm=mm;
		this.yy=yy;
	}
	
	public void showDate()
	{
		System.out.println(dd+":"+mm+":"+yy);
	}	
}