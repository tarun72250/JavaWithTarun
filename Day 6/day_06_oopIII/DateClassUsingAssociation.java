package day_06_oopIII;

public class DateClassUsingAssociation {
	
	//instance data member
	int dd,mm,yy;
	
	//Default cons
	public DateClassUsingAssociation()
	{
		
	}
	
	//Paramterized cons
	public DateClassUsingAssociation(int d , int m , int y)
	{
		this.dd=d;
		this.mm=m;
		this.yy=y;
	}
	
	public void showDate()
	{
		System.out.println(dd+"/"+mm+"/"+yy);
	}
	
	

}
