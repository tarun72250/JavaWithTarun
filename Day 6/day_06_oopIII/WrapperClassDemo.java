package day_06_oopIII;

public class WrapperClassDemo {

	public static void main(String[] args) {
	
		int n =10;
		Integer int_obj =n;//here we boxed int value  //Auto-boxing
		System.out.println(int_obj);
		
		int i = int_obj;
		System.out.println(i);//here value convert into primtve datatype // Auto-unboxing
		
		
	}

}
