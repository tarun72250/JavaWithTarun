package day_02_debugShalaJava;

public class usingArrays {

	public static void main(String[] args) {
		
		//One way to decalare array and initialized
		int [] age= {10,12,14,16,18,20};		
		
		//Second way to declare array and initialized
		int [] age1 = new int[5];
		age1[0]=12;
		age1[1]=14;
		age1[2]=16;
		age1[3]=18;
		age1[4]=20;
		
		//Using for loop
		for(int i=0 ; i<age.length ;i++)
		{
			System.out.println(age[i]);
		}
		
		
		System.out.println("\n using for-each loop");
		//using for-each loop
		for(int a:age1)
		{
			System.out.println(a);
		}
	}

}
