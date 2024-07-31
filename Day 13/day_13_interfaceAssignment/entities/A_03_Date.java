package day_13_interfaceAssignment.entities;

public class A_03_Date {

	private int dd; // data members
	private int mm;
	private int yy;
	

	public A_03_Date() //default constructor
	{
		
	}
	public A_03_Date(int dd,int mm,int yy) // parametrized constructor
	{
		
		this.dd=dd;
		this.mm=mm;
		this.yy=yy;
	}
	
	public A_03_Date(A_03_Date d) // para constructor
	{
		this.dd=d.dd;
		this.mm=d.mm;
		this.yy=d.yy;	
	}
	
	public void showDate()
	{
		System.out.println(dd+"/"+mm+"/"+yy);
	}
	
	@Override
	public String toString() {
		return "A_01_Date [dd=" + dd + ", mm=" + mm + ", yy=" + yy + "]";
	}
	
	
	
	
}
