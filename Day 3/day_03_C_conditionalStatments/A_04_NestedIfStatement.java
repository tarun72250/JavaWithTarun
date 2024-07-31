package day_03_C_conditionalStatments;

public class A_04_NestedIfStatement {

	public static void main(String[] args) {
		
		int a = 2;
		int b = 3;
		int c = 4;
		
		if(a > b)
			System.out.println("a is bigger");
		if(b > a)
			System.out.println("b is greater");
		if(b > c)
			System.out.println("b is bigger");
		if(c > b)
			System.out.println("c is greater");
		
		
		String s1="A";
		String s2="B";
		String s3="A";
		
		if(s1 == s2)
			System.out.println("S1 and s2 are same");
		if(s2 == s3)
			System.out.println("s2 and s3 are same");
		if(s3 == s1)
			System.out.println("s3 and s1 are same");

		
	}

}
