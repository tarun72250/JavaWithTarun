package day_05_oopII;

public class A_10_DateModifyClassDemo {

	public static void main(String[] args) {
		
		A_10_DateModifyClass d;     				//refrence variable
		d=new A_10_DateModifyClass(12,12,2023);   //alocating memory on heap
		d.showDate();//normal instance method
		d.showModifyDate('-');//char written in single quotes ''
	}

}
