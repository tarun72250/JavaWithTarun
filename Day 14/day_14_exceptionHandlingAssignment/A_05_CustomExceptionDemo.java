package day_14_exceptionHandlingAssignment;

import java.util.Scanner;

import day_14_exceptionHandling_customException.A_05_NameException;


public class A_05_CustomExceptionDemo 
{
	public static void inputname(String fname , String lname)
	{
		try 
		{
			char ch = fname.charAt(0);
			if(ch >='A' && ch <='Z')
			{
				System.out.println("Welcome "+fname +" "+ lname);
			}
			else
			{
				throw new A_05_NameException(fname ,lname);
			}
		}
		catch(A_05_NameException e)
		{
			System.out.println(e.tostring());
		}
	}
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter First name :");
		String firstn = sc.next();
		
		System.out.println("Enter Last name :");
		String lastn = sc.next();
		
		inputname(firstn,lastn);
	}

}
/*
public static void inputname(String firstn,String lastn) 
	{
		try 
		{
			char ch = firstn.charAt(0);
			if (ch>='A' && ch<='Z') 
			{
				System.out.println("Welcome "+firstn+" "+lastn);
			} 
			else 
			{
				throw new A_05_NameException(firstn,lastn);
			}
		}
		catch (A_05_NameException e) 
		{
			System.out.println(e.tostring());
		}    
		
	}
	
	public static void main(String [] args)
	{
		
		Scanner sc=new Scanner (System.in);
		
		System.out.println("Enter first name");
		String firstn =sc.next();
		
		System.out.println("Enter last name");
		String lastn =sc.next();
		
		inputname(firstn,lastn);
	}
*/