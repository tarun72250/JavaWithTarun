package day_03_F_Array;

// Write a Java program to test if an array contains a specific value.
public class A_04_Array {

	public static boolean containsArray(int []arr ,int n )
	{
		
		for(int i =0 ; i<arr.length;i++)
		{
			if(arr[i]== n)
			{
				return true;
			}
		}
		
		//value is not found
		return false;
	}
	
	
	
	
	
	public static void main(String[] args) 
	{
		int arr[] = {123,567,456,345,124,678,777};
		
		System.out.println(containsArray(arr,678));//true
		
		System.out.println(containsArray(arr,945));	//false
	}
	
	
	
}
