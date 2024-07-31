package day_06_oopIII;

public class Array2DClass7 {

	public static void main(String[] args) {
		
		//int [][] arr = new int[3][3];
		 int[][] matrix = {{1, 2, 3},{4, 5, 6},{7, 8, 9}};
		 
	      // Accessing elements in the 2D array
	        System.out.println(matrix[0][0]); // Output: 1
	        System.out.println(matrix[1][2]); // Output: 6
	        System.out.println(matrix[2][1]); // Output: 8

	        // Iterating over the 2D array
	        for (int i = 0; i < matrix.length; i++)
	        {
	            for (int j = 0; j < matrix[i].length; j++) 
	            {
	                System.out.print(matrix[i][j] + " ");
	            }
	            System.out.println();
	        }

		
	}

}
