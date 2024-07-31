package day_03_F_Array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class B_03_2DArrayAcceputInputFromUser {

	public static void main(String[] args) throws IOException {
		
		//I will take input from user 
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter rows :");
		int rows = sc.nextInt();
		
		System.out.println("Enter columns :");
		int columns = sc.nextInt();
				
		
		int [][] arr;
		arr = new int[rows][columns];
		
		
		System.out.println("Enter "+(rows*columns)+" values");
		for(int i =0 ; i<arr.length ; i++)
		{
			for(int j =0 ; j<arr[i].length ; j++)
			{
				arr[i][j]=sc.nextInt();
			}
		}
			
		for(int i =0 ; i<arr.length ; i++)
		{
			for(int j =0 ; j<arr[i].length ; j++)
			{
				System.out.print(" "+arr[i][j]);
			}
			System.out.println();
		}
				
	}
}

