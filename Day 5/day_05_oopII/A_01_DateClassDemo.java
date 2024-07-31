package day_05_oopII;
public class A_01_DateClassDemo {
	
	public static void main(String []args)
	{
		A_01_DateClass d;    //refrence variable
		d=new A_01_DateClass();   //alocating memory on heap
		d.showDate();
		
		
		A_01_DateClass d1=new A_01_DateClass(31,01,2023);
		d1.showDate();
		
	}

}
