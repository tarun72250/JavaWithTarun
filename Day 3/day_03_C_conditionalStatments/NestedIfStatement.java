package day_03_C_conditionalStatments;

public class NestedIfStatement {

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
		

	}

}
