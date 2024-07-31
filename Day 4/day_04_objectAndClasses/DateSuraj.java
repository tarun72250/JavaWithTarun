package day_04_objectAndClasses;

public class DateSuraj 
{
	private int dd, mm, yy; // instance dm

	//default cons
	public DateSuraj()
	{
		this.dd=00;
		this.mm=00;
		this.yy=00;
	}
	
	//parametrized cons
	public DateSuraj(int dd ,int mm ,int yy)
	{
		this.dd=dd;
		this.mm=mm;
		this.yy=yy;
	}
	//this keyword is used for differentaiting the local variable and instance data memebr
//self assignment
	
	//partially parametized cons
	public DateSuraj(int dd, int mm) 
	{
		this.dd = dd;//The assignment to variable dd has no effect int n =10 , n=n;
		this.mm = mm;
	}
	
	//copy constructor
	public DateSuraj(DateSuraj d) 
	{
		this.dd=d.dd;
		this.mm=d.mm;
		this.yy=d.yy;
	}
	
	
	public void showDate() //instance member method
	{
		System.out.println(dd + " " + mm + " " + yy);
	}

	public void showDate(char ch)
	{
		System.out.println(dd+" "+ch+mm+ch+" "+yy);
	}
	
}
