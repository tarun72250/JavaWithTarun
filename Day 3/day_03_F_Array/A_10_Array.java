package day_03_F_Array;

//10.Write a program to reverse the array and find average.
public class A_10_Array
{
	public static void reverseFun(int [] a)
	{
		for(int i=a.length-1 ; i >=0 ; i--) 
		{
			System.out.print(a[i]+" ");
		}
	}
	
	public static int averageFun(int [] sourabh)
	{
		int sum = 0;
		int avg = 0;
		for(int i=sourabh.length-1 ; i >=0 ; i--) 
		{
			sum = sum+ sourabh[i];
			avg = sum / sourabh.length;
		}
		
		return avg;
	}
	
	
	 public static void main(String[] args)
	 {
		 int arr[] = {4,2,8,9,1,6,7};
		 
		 reverseFun(arr);
		 int avg =averageFun(arr);
		 System.out.println("\nAverage of array is :- "+avg);
	 }

}
