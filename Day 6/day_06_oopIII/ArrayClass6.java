package day_06_oopIII;

import java.util.Scanner;

public class ArrayClass6 {

	public static void main(String[] args) {

		Scanner sumit = new Scanner(System.in);	
		int [] arr;
		arr = new int [5];
		System.out.println("Enter value in array of size 5:- ");
		//this for loop is used for taking input from user and 
		for(int i=0 ; i<arr.length ; i++) //length is an property in Array class we can diff state as data member , or method as showDate()
		{
			arr[i]=sumit.nextInt();
		}
		
		System.out.println("\n Your value in array is :");
		//this is used for printing the array
		for(int i=0 ; i<arr.length ; i++) //length is an property in Array class we can diff state as data member , or method as showDate()
		{
			System.out.println(arr[i]);
		}	
	}
}