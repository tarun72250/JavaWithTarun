package day_03_F_Array;

//Program to print duplicate elements of the given int array
public class A_06_Array 
{

	public static void main(String[] args)
	{

		int [] arr = {1,15,38,16,1,43,38,15,73};
		
		
		for(int  i =0 ; i<arr.length ; i++)
		{
			for(int j=i+1 ; j <arr.length ; j++) 
			{
				if(arr[i] == arr[j])
				{
					System.out.print(arr[i]+" ");
					break ;//print each duplicate element in once
					
				}
			}
			
		}

		
	}

}
