package day_03_B_operators;

public class A_01_UnaryOperator {

	public static void main(String[]args)
	{
		//unary operator
//		int n = 10;
//		System.out.println(n);//10
//		System.out.println(n++);//10  post increment
//		System.out.println(n);//11
//		System.out.println(n--);//11 post decrement
//		System.out.println(n);//10
//		
//		System.out.println(n);//10
//		System.out.println(++n);//11  pre increment
//		System.out.println(n);//11
//		System.out.println(--n);//10 post decrement
//		System.out.println(n);//10
		
		
		
		
		int gautam = 20;
		
		System.out.println(gautam++);//20
		System.out.println(gautam);//21
		System.out.println(--gautam);//20
		System.out.println(++gautam);//21
		System.out.println(gautam++);//21
		System.out.println(gautam);
		System.out.println(gautam--);//21
		System.out.println(gautam);
	}
}

/*
		int n =10;
		System.out.println(n);
		//post increement
		System.out.println(n++);//10
		System.out.println(n);//11
		System.out.println(n--);//11
		System.out.println(n);//10
		//pre increment
		System.out.println(++n);//11
		System.out.println(n);//11
		System.out.println(--n);//10
		System.out.println(n);//10
		
		//Multiplication
		int m=12;
		System.out.println(n*m);//120
		System.out.println(n*2);//20
		System.out.println("n*"+3);//3
		System.out.println('n'+m);//122
		//char internally stored as asciee value
		
		//Addition
		
		
		//Logical Operator
		System.out.println(n>m && m>n);//false
		System.out.println(n<m && m>n);//true
		System.out.println(n>m || m>n);//true
		System.out.println(n>m || m<n);//true
		
		
		//Bitwise Operators
		System.out.println("\nBitwise Operators");
		int h , i , j ;
		h = 10 ; i = 5 ; j = 20;
		System.out.println(h>i & j>i); //Bitwise and :- return true (Both condition are true)
		System.out.println(h>i | j<i); //Bitwise or :- return true (One condition true return true)
		System.out.println(h<j ^ j<i);  //Bitwise xor :- return true 
		
		//Java Arithematic operator
		System.out.println("\nShift Operator");
		System.out.println("2"+2);  //22
		System.out.println(2+2);    //4
		System.out.println(4-2);	//2
		System.out.println(2*2);	//4
		System.out.println(4/2);	//2
		System.out.println(5%2); // remainder 
				
		//Java Shift Operator
		System.out.println("\nShift Operator");
		System.out.println(10<<2); //10*2^2 =10*4=40 left shift
		System.out.println(10>>2); //10/2^2 =10/4=2 right shift 
//		System.out.println(10<<<2);//error not exist
		System.out.println(10>>>2);//10/2^2 =10/4=2 right shift 

		
		int var1 =10;
		int var2 =20;
		
	    String result =	var1 > var2 ?"True":"false";
		System.out.println(result);
*/