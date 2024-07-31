package day_04_objectAndClasses;

public class Date1 {

	
	private int dd;//instance dm 
	private int mm;//abstracted state
	private int yy;
	
	//Default cons
	public Date1()
	{
		this.dd=12;
		this.mm=13;
		this.yy=2002;
	}
	
	//Fully Parametrized cons
	public Date1(int dd, int mm, int yy) 
	{
		this.dd = dd;
		this.mm = mm;
		this.yy = yy;
	}
	
	//Partially Para cons 
	public Date1(int dd, int mm) 
	{
		this.dd = dd;
		this.mm = mm;
		
	}
	
	
	//copy cons
	public Date1(Date1 d)
	{
		this.dd= d.dd;
		this.mm=d.mm;
		this.yy=d.yy;
	}
	
	public Date1(int dd) 
	{
		this.dd = dd;
	}
	
	public void showDate()
	{
		System.out.println(dd+"/"+mm+"/"+yy);
	}

	public void showDate(char ch)
	{
		System.out.println(dd+" "+ch+" "+mm+" "+ch+" "+yy);
	}
	
	//System.out.println(); this will not write here always Syso write in ()
	
}
