package day_06_oopIII;

public class DateDemo {

	public static void main(String[] args) {    
		//local variable 
		//int n;
		Date d1;   //reference variable
		d1 = new Date();   //memory allocation on heap
	    			   //call constructor
		d1.showDate();     //  1/1/1970
	        //System.out.println(n);   //can not access without initialization

		Date d2= new Date(12,12,2000);
		d2.showDate();    // 12/0/2000

		Date d3 = new Date(d2);
		d3.showDate();     //  12/0/2000 

//		if(d1.isLeapYear())
//		   System.out.println("d1 is leapyear");
//		else
//		   System.out.println("d1 is not leapyear");
//
//		if(d2.isLeapYear())//if it return true statement 1 execute
//		   System.out.println("d2 is leapyear");
//		else//if it false execute this
//		   System.out.println("d2 is not leapyear");
	}

}
