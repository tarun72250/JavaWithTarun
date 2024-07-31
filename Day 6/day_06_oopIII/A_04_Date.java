package day_06_oopIII;

public class A_04_Date {
	
	private int dd; // data members
	private int mm; // object level info
	private int yy;
	int a;
	private static int count; //static data members// class level info
	
	
	static // static block
	{
		count=0;
	}
	
	
	public A_04_Date() //default constructor
	{
		count++;
		a=count;
		dd=00;
		mm=00;
		yy=00;
	}
	
	
	public A_04_Date(int dd,int mm,int yy) // parametrized constructor
	{
		count++;
		a=count;
		this.dd=dd;
		this.mm=mm;
		this.yy=yy;
	}
	
	
	public A_04_Date(Date d) // copy constructor
	{
		count++;
		a=count;
		this.dd=d.dd;
		this.mm=d.mm;
		this.yy=d.yy;	
	}
	
	
	public void showDate(char ch) // method
	{
		System.out.println("Count"+a);
		System.out.println(dd+""+ch+mm+""+ch+yy);
	}
	
	public void showDate()
	{
		System.out.println("Count"+a);
		System.out.println(dd+"/"+mm+"/"+yy);
	}
	
	
	public boolean isLeapYear()
	{
		if(yy%4==0 && yy%100!= 0)
		{
			return true;
		}
		else
		{
			return false;
		}

	}

}
