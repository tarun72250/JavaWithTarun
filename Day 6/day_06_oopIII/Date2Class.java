package day_06_oopIII;

public class Date2Class {
	
	private int dd;
	private int mm;
	private int yy;
	
	static int count;
	
	static
	{
		count=0;
	}
	
	public Date2Class()
	{
		count++;
		dd=10;
		mm=1;
		yy=2023;
	}
	
	public Date2Class(int dd,int mm,int yy)
	{
		count++;
		this.dd=dd;
		this.mm=mm;
		this.yy=yy;
	}
	
	public void ShowDate()
	{
		System.out.println("Count of Dates : "+count +"---"+dd+"/"+mm+"/"+yy);
	}
		
	public void display()
	{
		System.out.println(dd+"/"+mm+"/"+yy);
	}

}
