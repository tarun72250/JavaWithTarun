package day_03_C_conditionalStatments;


//If-else if Ladder
public class A_03_IfElseIfStatement {

	public static void main(String[] args) {
		
		int time =13;
		
		if (time <= 12 && time >=0) 
		{
		  System.out.println("Good morning. AM");
		} 
		else if (time <= 16  && time >= 12) 
		{
		  System.out.println("Good afternoon.PM");
		} 
		else if (time <= 20 && time >= 16)
		{
			System.out.println("Good evening");
		}
		else
		{
		  System.out.println("Good night.");
		}

	}

}
