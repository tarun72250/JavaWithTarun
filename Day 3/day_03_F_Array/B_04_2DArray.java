package day_03_F_Array;

public class B_04_2DArray 
{
	public static void transposingMatrix(int [][] matrix)
	{
		
	}
	
	public int minOfArray(int [][] matrix)
	{
		int min = matrix[0][0];
		
		return min;
	}
	
	public static void sumOfArray(int [][] matrix)
	{
		int sum = 0;
		for(int i =0;i<matrix.length ; i++)//rows 0 1 2
		{
			for(int j=0 ; j<matrix[i].length;j++)//columns //0 1 2
			{
				sum = sum + matrix[i][j];//45
			}
		}
		System.out.println("Sum of Array :-"+sum);
	}
	
	public static int maxOfArray(int [] [] matrix)
	{
		int max = matrix[0][0];
		for(int i =0;i<matrix.length ; i++)//rows //0 1 2
		{
			for(int j=0 ; j<matrix[i].length;j++)//columns //0 1 2
			{
				if(matrix[i][j] > max )//6>5
				{
					max = matrix[i][j];//9
				}
			}
		}
		
		return max;
	}
	
	public static void main(String[] args) 
	{
		//sum of 2D Array
		int [][] matrix = {
				{1,2,3},
				{4,5,6},
				{7,8,9}
		};
		//static method call
		sumOfArray(matrix);
		int maxElement = maxOfArray(matrix);
		System.out.println("Max Element :- "+maxElement);
		
		//non-static method call
		//1.way
		B_04_2DArray b ;//refrence variable
		b = new B_04_2DArray();//allocate memory on heap , or create object 
		b.minOfArray(matrix);//calling with object name
		
		//2.way
		B_04_2DArray c = new B_04_2DArray();
		c.minOfArray(matrix);
		
		//static method call
		transposingMatrix(matrix);
		
	}

}
