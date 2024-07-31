package day_14_exceptionHandlingAssignment;

import java.util.InputMismatchException;
import java.util.Scanner;

public class A_09_ArrayExpc {
	
	 public static void main(String [] args)
	  {
		 Scanner sc=new Scanner(System.in);
		 try
		  {
				System.out.println("Enter the size of array");
				int n=sc.nextInt();
				int [] arr=new int[n];
		 
				for(int i=0;i<arr.length;i++) 
		 		{
					System.out.println("Enter the elemnts"+(i+1));
					arr[i]=sc.nextInt();
				}

				System.out.println("Enter the index no");
				int d=sc.nextInt();
				System.out.println("The elemnt at index "+d+" is "+arr[d-1]);
		}
		 
		catch (ArrayIndexOutOfBoundsException e) 
		{
			 	System.out.println(e);
		}
		 
		catch (NumberFormatException e)
		{
				System.out.println(e);
		}
		catch(InputMismatchException e)
		{
			System.out.println("only integer type arguements is provided");
		}
	}
}
