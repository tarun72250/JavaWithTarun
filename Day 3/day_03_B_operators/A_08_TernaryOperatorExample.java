package day_03_B_operators;

public class A_08_TernaryOperatorExample {

	public static void main(String[] args) {
		

		int a = 5 ;
		int b= 6 ;
		
		String result = (a<b)?"Apple":"Mango";
		System.out.println(result);
		
		int x = 10;
		int y = 20;
		
	   boolean var =(x<y)?true:false;
		System.out.println(var);
		
		String str = "A";
		String str1 = "A";
		
		String res =(str==str1)?"String Matches":"String not matches";
		System.out.println(res);
		
		
		char ch = 'A';
		char ch1 ='A';
		
		String result1=(ch==ch1)?"Matches":"Not matches";
		System.out.println(result1);
	}
}
