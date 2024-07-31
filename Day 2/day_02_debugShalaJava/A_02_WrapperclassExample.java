package day_02_debugShalaJava;

public class A_02_WrapperclassExample {

	public static void main(String[] args) {
		
		//Auto-boxing in wrapper class
		int i = 100;
		Integer iobj = Integer.valueOf(i);
		Integer iobj1 =i; //auto-boxing
		System.out.println(iobj+iobj1);
	

		//Auto-unboxing in wrapper class
		Integer iobj2 = new Integer(200);
		int j = iobj2.intValue();
		int k = iobj2;
		System.out.println(j+k);
	
	}
}
