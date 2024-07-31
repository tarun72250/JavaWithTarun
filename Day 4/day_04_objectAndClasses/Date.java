package day_04_objectAndClasses;

public class Date {

	private int dd , mm , yy;
	
	
	//default cons
	public Date()
	{
		
	}
	
	//para cons
	public Date(int dd , int mm , int yy)
	{
		this.dd=dd;
		this.mm=mm;
		this.yy=yy;
	}
	
	
	//instance member method
	public void showDate()
	{
		System.out.println(dd+" "+mm+" "+yy);
	}
	
	//instance member method
	public void showDate(char ch)
	{
		System.out.println(dd+" "+ch+mm+ch+" "+yy);
	}
}
