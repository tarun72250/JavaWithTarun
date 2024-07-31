package day_03_B_operators;

public class A_06_LogicalOperatorExample {

	public static void main(String[] args) {
		
		int a,b,c;
		a=5;
		b=6;
		c=7;
		
		//or
		int z;
		int y;
		int x;
		
		//Logical and operator (&&)
		//:- if one of them false return false;
		System.out.println(a>b || b>c);//false
		System.out.println(a<b && b<c);//true
		System.out.println(a>b && b<c);//false
		
		//Logical or operator (&&)
		//:- if one of them true return true;
		System.out.println(a>b || b>c);//false
		System.out.println(a<b || b<c);//true
		System.out.println(a>b || b<c);//true
		
		
		
			
		
	}
}
