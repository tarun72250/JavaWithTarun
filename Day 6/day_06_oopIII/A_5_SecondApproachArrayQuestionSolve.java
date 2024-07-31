package day_06_oopIII;

public class A_5_SecondApproachArrayQuestionSolve {

	public static void main(String[] args) {
		int[] Array={5,3,6,7,8};      
		int max=Array[0];  //int max=5;
		int min=Array[0];  //int min=5;
		
		
		for (int i=0;i<5;i++)
			{
			if(Array[i]>max)
			max=Array[i];  //after 3 loop max=6,7,8
		
			}
			System.out.println("max no of an array is:"+max);
		
		for (int i=0;i<5;i++)
			{
			if (Array[i]<min)
			min=Array[i];  //
			}
			System.out.println("min no of an array is:"+min);
		
			int avg=0;
			int sum=0;
		for (int i=0;i<5;i++)
			{
			sum=Array[i]+sum;
			
		
			}
			avg=sum/5;
			
			System.out.println("average no of an array is :" +avg);

	}

}
