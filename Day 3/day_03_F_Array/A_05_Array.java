package day_03_F_Array;

import java.util.Arrays;

//Write a Java program to remove a specific element from an array.
public class A_05_Array {

	public static void main(String[] args) {
		
		int arr [] = {25, 14, 56, 15, 36, 56, 77, 18, 29, 49};
		
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]+" ");
		}
		
		int removeIndex =1;
		
		//remove index value
		for(int i=removeIndex ; i<arr.length-1 ; i++)
		{
			arr[i]= arr[i+1];
		}
		
		//System.out.println(Arrays.toString(arr));
		//or
		for(int i=0;i<arr.length;i++)
		{
			System.out.print("\n"+arr[i]+" ");
		}
	}
}
