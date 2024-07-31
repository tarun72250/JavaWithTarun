package day_06_oopIII;

import java.util.Scanner;

public class Array2DClass8 
{

	public static void main(String[] args)
	{
		
		Scanner sc= new Scanner(System.in);
		System.out.println ("Enter a rows");
		int rows=sc.nextInt();
		System.err.println("Enter a column");
		int column =sc.nextInt();
		
		int[][]arr=new int[rows][column];
		
		System.out.println("Enter array values:"+(rows*column));
		for(int i=0;i<arr.length;i++) 
		{
			for(int j=0;j<arr[i].length;j++) 
			{
				arr[i][j]=sc.nextInt();
			}
		}
		
		for(int i=0;i<arr.length;i++) 
		{
			for(int j=0;j<arr[i].length;j++) 
			{
				System.out.print(arr[i][j] +"  ");
			}
			System.out.println();
		}

		
	}
}
