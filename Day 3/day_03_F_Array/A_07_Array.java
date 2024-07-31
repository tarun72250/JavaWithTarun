package day_03_F_Array;

//Find the first repeating element in an array of integers
public class A_07_Array
{

	public static void main(String[]arsg) 
	{
		int [] arr = {1,15,38,16,1,43,38,15,73};
		
		outer://this is label :- nested loop 
		for(int  i =0 ; i<arr.length ; i++)
		{
			for(int j=i+1 ; j <arr.length ; j++) 
			{
				if(arr[i] == arr[j])
				{
					System.out.print(arr[i]+" ");
					break outer;//print each duplicate element in once
					
				}
			}
			
		}
	}
}
