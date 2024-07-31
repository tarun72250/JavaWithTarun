package day_04_objectAndClasses;

public class DateDemo1 {

	public static void main(String[]args)
	{
		Date1 d; //refrence variable 
		d = new Date1();
		d.showDate();
		
		Date1 d1 = new Date1(12,13,2024);
		d1.showDate();
		
		Date1 d2 = new Date1(12,13);
		d2.showDate();
		
		Date1 d3 = new Date1(12);
		d3.showDate();
		
		Date1 d4 = new Date1(18,05,1999);
		d4.showDate('-');
		
		Date1 d5;
		d5=d4;
		d5.showDate('-');
		
		Date1 d6;
		d6 = new Date1(d4);
		d6.showDate('-');
		
		//Refrence Equality
		if(d4 == d5)
		System.out.println("Same");
		else
		System.out.println("Different");
		
		if(d4 == d6)
		System.out.println("Same");
		else
		System.out.println("Different");
		
		//Value Equality
		int x,y;
		x=10;y=15;
		if(x == y)
		System.out.println("Same");
		else
		System.out.println("Different");
			
	}
}
