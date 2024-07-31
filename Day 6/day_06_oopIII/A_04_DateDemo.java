package day_06_oopIII;

public class A_04_DateDemo {

	public static void main(String[] args) {
		
		Date d1=new Date();//default cons calling
		d1.showDate();
		
		Date d2=new Date(22,4,1999); //para cons calling
		Date d3=new Date(d2); //param cons calling
		
		d2.showDate(); //22/4/1999
		//System.out.println(d2.isLeapYear());//returnfalse
		d2.showDate('-'); // 22-04-1999
		d3.showDate(); // 22/04/1999
		//d2.showDate(); it is not workable 
		
		
		
		
//		System.out.println(d3.isLeapYear());  //false
//		if(d2.isLeapYear())
//			System.out.println("Leap year");
//		else
//			System.out.println("Not Leap year");

	}

}
