package day_04_objectAndClasses;

public class DateDemo {

	public static void main(String [] args) 
	{
		Date d ;//refrence variable
		d = new Date();//object creation using new operator 
		//new does 2 thing :- Allocate memory on heap 
						// :- Calling Constructor
		d.showDate();
	}
}
