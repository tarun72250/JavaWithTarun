package day_03_F_Array;

public class B_06_2DArrayRotateMatrix {

	public static void rotateMatrix(int [][] sourabh)
	{
		//transpose the matrix
		for(int i=0; i<sourabh.length ;i++)
		{
			for(int j=i ;j<sourabh.length;j++)
			{
				int temp = sourabh[i][j];
				sourabh[i][j] = sourabh[j][i];
				sourabh[j][i]=temp;
			}
		}
		
		//reverse ecah row\
		for(int i=0; i<sourabh.length ;i++)
		{
			for(int j=0 ;j<sourabh.length/2;j++)
			{
				int temp = sourabh[i][j];
				sourabh[i][j] =sourabh[i][sourabh.length-1-j];
				sourabh[i][sourabh.length-1-j]=temp;
			}
		}
	}
	
	public static void printMatrix(int [][] sourabh)
	{
		for(int [] row:sourabh)
		{
			for(int value :row)
			{
				System.out.print(value+" ");
			}
			System.out.println();
		}
	}
	
	
	public static void main(String[] args) 
	{
		
		int [] [] array = {
				{1,2,3},
				{4,5,6},
				{7,8,9}
		};
		
		rotateMatrix(array);
		printMatrix(array);
	}
}
