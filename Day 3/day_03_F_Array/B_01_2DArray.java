package day_03_F_Array;

public class B_01_2DArray {

	public static void main(String[] args) {
		//1.way
		int [] [] arr;//declared 2d array 
		arr  = new int [3][3];//initilization of 2-d array
		
		arr[0][0]= 2;//instation of 2-d array
		arr[0][1]= 3;
		arr[0][2]= 4;
		arr[1][0]= 5;
		arr[1][1]= 6;
		arr[1][2]= 7;
		arr[2][0]= 8;
		arr[2][1]= 9;
		arr[2][2]= 1;
		
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
		
		
		
		
	}
}
