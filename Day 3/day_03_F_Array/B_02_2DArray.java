package day_03_F_Array;

public class B_02_2DArray {

	public static void main(String[] args) {
		
		
		//2 way of array declaration
		int arr[][] = {{1,2,3},{3,4,5},{5,6,7}};
		
		for(int i =0 ; i<arr.length ; i++)
		{
			for(int j =0 ; j<arr[i].length ; j++)
			{
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
		
		
	}
}
