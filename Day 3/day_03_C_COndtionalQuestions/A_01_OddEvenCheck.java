package day_03_C_COndtionalQuestions;

//1.Write a Java program that reads an integer and prints "Even" if the number is even and "Odd" if the number is odd.

public class A_01_OddEvenCheck {
	
	public static void main(String[] args) {
		
		int num = 221;
		
		if(num % 2 == 0)//221%2(1)==0
		{
			System.out.println("Number is even...!");
		}
		else
		{
			System.out.println("Number is odd....!");
		}
		
		
	}

}
