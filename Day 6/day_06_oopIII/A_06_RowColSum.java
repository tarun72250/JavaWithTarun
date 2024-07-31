package day_06_oopIII;

public class A_06_RowColSum {

	public static void main(String[] args) {
		
		int[][] array_2d = {
	            {1, 2, 3},
	            {4, 5, 6},
	            {7, 8, 9}
	        };

	        // Create single dimensional arrays to maintain row-wise sum and column-wise sum
	        int[] row_sum = new int[array_2d.length];
	        int[] col_sum = new int[array_2d.length];

	        // Calculate row-wise sum
	        for (int i = 0; i < array_2d.length; i++) //
	        {
	            for (int j = 0; j < array_2d[i].length; j++)//
	            {
	                row_sum[i] += array_2d[i][j];
	            }
	        }

	        // Calculate column-wise sum
	        for (int j = 0; j < array_2d[0].length; j++) {
	            for (int i = 0; i < array_2d.length; i++) {
	                col_sum[j] += array_2d[i][j];
	            }
	        }

	        // Print the 2D array
	        System.out.println("2D Array:");
	        for (int[] row : array_2d) {
	            for (int value : row) {
	                System.out.print(value + " ");
	            }
	            System.out.println();
	        }

	        // Print row-wise sum
	        System.out.println("\nRow-wise sum:");
	        for (int value : row_sum) {
	            System.out.print(value + " ");
	        }
	        System.out.println();

	        // Print column-wise sum
	        System.out.println("\nColumn-wise sum:");
	        for (int value : col_sum) {
	            System.out.print(value + " ");
	        }
	        System.out.println();
	}

}
