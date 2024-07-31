package day_06_oopIII;

import java.util.Scanner;

public class ArrayClass3 {

	public static void main(String[] args) {

		//initialized array
		int [] arr = new int[5];
		//inbuilt class for accepting input from user
		Scanner sc=new Scanner(System.in);
		
		//for loop for rendering value in each index
		for(int i=0 ; i<arr.length ; i++)
		{
			System.out.println("Enter value of index "+i+" :");
			arr[i]=sc.nextInt();
		}
		
		//for loop for accessing each index value
		System.out.println("Array element is :");
		for(int i=0 ; i<arr.length ; i++)
		{
			System.out.println(arr[i]);
			
		}
		

	}

}
