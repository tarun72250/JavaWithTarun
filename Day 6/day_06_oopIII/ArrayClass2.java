package day_06_oopIII;

import java.util.Scanner;

public class ArrayClass2 {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter no :");
		int n=sc.nextInt();
		
		//Declaration of array with 5 size
				int [] arr = new int [n];
				int sum=0;
				
				//initiliazation of array values
				arr[0]=1;
				arr[1]=2;
				arr[2]=3;
				arr[3]=4;
				arr[4]=5;
				//If i want ot sum of all array elements
				for(int i=0 ; i<arr.length ; i++)
				{
					sum = sum+arr[i];
					
				}
				System.out.println(sum);


	}

}
