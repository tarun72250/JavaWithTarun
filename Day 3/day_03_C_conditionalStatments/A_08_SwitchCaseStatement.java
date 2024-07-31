package day_03_C_conditionalStatments;

import java.util.Scanner;

public class A_08_SwitchCaseStatement {

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Day in Integer :-");
		int n = sc.nextInt();
		
		switch(n)
		{
		case 1:
			System.out.println("Monday...!");
			break;
		case 2:
			System.out.println("Tuesday...!");
			break;
		case 3:
		    System.out.println("Wednesday");
		    break;
		  case 4:
		    System.out.println("Thursday");
		    break;
		  case 5:
		    System.out.println("Friday");
		    break;
		  case 6:
		    System.out.println("Saturday");
		    break;
		  case 7:
		    System.out.println("Sunday");
		    break;
		}
		
		System.out.println("Enter number in two digit or tens place :-");
		int no= sc.nextInt();
		
		switch(no)
		{
		case 10:System.out.println("10");break;
		case 20:System.out.println("20");break;
		case 30:System.out.println("30");break;
		default:System.out.println("no not in 10 , 20 , 30 something else");break;
		}

	}

}
/*
Scanner sc = new Scanner(System.in);
		System.out.println("Enter day in integer :- ");
		
		int day = sc.nextInt();
		switch (day) 
		{
		  case 1:
		    System.out.println("Monday");
		    break;
		  case 2:
		    System.out.println("Tuesday");
		    break;
		  case 3:
		    System.out.println("Wednesday");
		    break;
		  case 4:
		    System.out.println("Thursday");
		    break;
		  case 5:
		    System.out.println("Friday");
		    break;
		  case 6:
		    System.out.println("Saturday");
		    break;
		  case 7:
		    System.out.println("Sunday");
		    break;
		}
		
		System.out.println("Enter No to match :- ");
		int no=sc.nextInt();
		
		switch(no)
		{
			case 10:System.out.println("10"); 
			break;
			case 20:System.out.println("20");
			break;
			case 30:System.out.println("30");
			break;
			default:System.out.println("Not in 10, 20 or 30");  
		}
*/