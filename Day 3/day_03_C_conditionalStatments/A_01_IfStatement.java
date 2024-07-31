package day_03_C_conditionalStatments;

public class A_01_IfStatement {

	public static void main(String[] args) {
		
		//1.
		int a = 20;
		int b = 40;
		
		if(a < b)
		{
			System.out.println("a is bigger");
		}
		
		//2
		String str = "Sourabh";
		String str1 = "Gautam";
		
		if(str == str1)
		{
			System.out.println("Names are same");
		}

		//3.
		boolean var = true;
		boolean var1 = true;
		
		if(var == var1)
		{
			System.out.println("Same");
		}
	}

}
