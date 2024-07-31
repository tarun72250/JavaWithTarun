package day_14_exceptionHandlingAssignment;

import java.util.Scanner;

import day_14_exceptionHandling_customException.A_07_InvalidCountryExcep;

public class A_07_UserRegrestion {


	public static void regestierUser(String username,String usercountry) {
		try 
		{
			if(usercountry.equals("India" )) 
			{
			   System.out.println("User registered");	
			}
			else 
			{
				throw new A_07_InvalidCountryExcep(usercountry);
			}
		}
		catch (A_07_InvalidCountryExcep e) 
		{
			System.out.println(e.toString());
		}
	}
	
	public static void main(String [] args) {
		Scanner sc=new Scanner (System.in);
		String username;
		String usercountry;
		
		System.out.println("Enter user name\n");
		username=sc.next();
		
		System.out.println("Enter user country");
		usercountry=sc.next();
		
		regestierUser(username,usercountry);
	}

	

}
