package day_06_oopIII;

public class WrapperClassExample {

	public static void main(String[] args) {

		
		int i = 100;
		Integer iobj = Integer.valueOf(i);
		Integer iobj1 = i;
		System.out.println(iobj+iobj1);
		
		Integer iobj2 = new Integer(200);
		int j = iobj2.intValue();
		int k = iobj2;
		System.out.println(j+k);
;	}

}
