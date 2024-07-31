package day_03_D_jumpStatements;

public class Solution {

	public static void main(String[] args) {
		
		int x=2;
		int y=0;
		
		for(; y<10 ; ++y)
		{
			if(y%x == 0 )
			{
				continue;
			}
			else if(y==8)
			{
				return;
			}
			else
			{
				System.out.println(y+" ");
			}
		}


	}

}
