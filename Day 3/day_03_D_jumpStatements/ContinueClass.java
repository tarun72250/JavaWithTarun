package day_03_D_jumpStatements;

public class ContinueClass {

	public static void main(String[] args) 
	{
		
		for(int i=0 ; i<=10 ; i++)
		{
			if(i %2 != 0)
				continue;
			
			System.out.print(i+" ");
		}

	}

}











































/*
 for (int i = 0; i < 10; i++)
		 {
	            // If the number is even
	            // skip and continue
	            if (i % 2 != 0)
	            continue;
	 
	            // If number is even, print it
	            System.out.print(i + " ");
	        }

*/