package day_03_C_conditionalStatments;

public class IfElseIfStatement {

	public static void main(String[] args) {
		
		int time =22;
		
		if (time < 12) 
		{
		  System.out.println("Good morning.");
		} 
		else if (time < 16) 
		{
		  System.out.println("Good afternoon.");
		} 
		else if (time < 20)
		{
			System.out.println("Good evening");
		}
		else
		{
		  System.out.println("Good night.");
		}

	}

}
