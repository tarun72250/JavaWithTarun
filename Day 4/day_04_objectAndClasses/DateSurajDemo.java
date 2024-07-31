package day_04_objectAndClasses;

public class DateSurajDemo 
{
	public static void main(String[] args) 
	{
		DateSuraj d ;//refrence variable (DateSuraj is my custome class)
		d = new DateSuraj();//d named object of DateSuraj
		d.showDate();
		
		DateSuraj d1;//refrence var
		d1 = new DateSuraj(12,02,2000);
		d1.showDate();
		
		DateSuraj d2 ;//refrence variable
		d2 = new DateSuraj(12,03);
		d2.showDate();
		
		DateSuraj d3 ;//refrence variable
		d3 = new DateSuraj(d2);
		d3.showDate();
		
		DateSuraj d4 = new DateSuraj(12,03,2024);
		d4.showDate('-');
	}
}
