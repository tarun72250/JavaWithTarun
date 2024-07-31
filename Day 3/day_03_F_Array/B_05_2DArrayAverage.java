package day_03_F_Array;

public class B_05_2DArrayAverage 
{
	public static double calculateAverage(int [][] sumit)
	{
		int totalElements = 0, sum=0;
		//rows
		for(int i=0 ; i<sumit.length ; i++) {
			
			for(int j=0 ;j<sumit[i].length;j++)
			{
				sum += sumit[i][j];
				totalElements++;
			}
		}
		
		double result = sum / totalElements;
		
		
		return result;
	}
	
	public static void main(String[] args) 
	{
		int [] [] array = {
				{1,2,3},
				{4,5,6},
				{7,8,9}
		};
		
		double average =calculateAverage(array);
		System.out.println("The avearge is :"+ average);
	}
	
	
}
