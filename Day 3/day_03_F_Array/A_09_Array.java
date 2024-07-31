package day_03_F_Array;
//Find maxElement in array and after that find that maxElement factorial no 
public class A_09_Array
{

	public static int maxElement(int [] arr)
	{
		int max = arr[0];  // Assume first element is the maximum
        for (int i = 1; i < arr.length; i++) 
        {
            if (arr[i] > max) 
            {
                max = arr[i];
            }
        }
        return max;
	}
	
	public static void findFactorial(int max)
	{
		int fact = 1;//120
		for(int i=1 ; i<=max ; i++)//5<=5
		{
			fact = fact * i;//24*5=120
		}
		System.out.println("Factorial of given "+max+" is "+fact);
	}
	
	public static void printPattern(int n)
	{
		
	}
	
	public static boolean primeNo(int n)
	{
		return true;
	}
	
	public static void main(String[] args) 
	{

		int arr [] = {1,4,11,2,5};
		int max = maxElement(arr);
		findFactorial(max);
		printPattern(max);
		boolean result = primeNo(max);
	}

}
