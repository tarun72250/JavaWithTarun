package day_03_D_jumpStatements;

public class ReturnClass {
	
	public static void main(String[] args) {
		
		ReturnClass r ;
		r = new ReturnClass();
		//non-static method call
		System.out.println("Addition :"+r.add(3, 6));	
		
		//static method call
		ReturnClass.sub(5, 3);
		
		ReturnClass a ;//refrence variable
		a = new ReturnClass();
		System.out.println(a.printName("Sumit"));
		
		ReturnClass.printNumbers(10);
		System.out.println("\n"+ReturnClass.multiplication(4, 5));
		
		ReturnClass e ;
		e = new ReturnClass();
		
		if(e.checkPalindrome(121)==121)
			System.out.println("no is palindrom");
		else 
			System.out.println("no is not palindrome");
		
		ReturnClass.multiplicationTablePrint(2);
		
		ReturnClass o ;
		o = new ReturnClass();
		o.swapNumber(2, 3);
		
	}
	
	
	//non-static method
	public int add(int a , int b)
	{
		int result = a + b;
		return result;
	}
	
	//static method
	public static void sub(int a , int b)
	{
		System.out.println("Subtraction :"+(a-b));
	}

	//non-static method
	public String printName(String str)
	{
		return "Hello "+str;
	}
	
	//static method
	public static void printNumbers(int n)
	{
		for(int i =1 ; i <=n ; i++)
		{
			System.out.print(i+" ");
		}
	}
	
	//static method
	public static int multiplication(int x , int y)
	{
		return x * y;
	}
	
	//non static method
	public int checkPalindrome(int n)
	{
		int t=n;
		int res=0;
		while(n>0)
		{
			res = res* 10 +(n%10);
			n = n/10;
		}
		
		if(t==res)
			return res;
		else
			return 0;
	}
	
	//non static method
	public void checkPrimeNo(int n)
	{
		
	}
	
	//static method
	public static void multiplicationTablePrint(int n)
	{
		for(int i=1 ;i <=10 ;i++)
		{
			System.out.println(n +" * "+i+" = "+(n*i));
		}
	}
	
	//non-static 
	public void swapNumber(int n, int m)//2 3
	{
//		n = n+m;//5
//		m= n-m;//5-3=2
//		n= n-m;
		int temp;
		temp =n;
		n=m;
		m=temp;
		System.out.println(n+" "+m);
		
	}
}




/*
 
  //static method 
	public static int findSum(int a , int b)
	{
		return a+b;
	}
	
	//static method
	public static String namePrinting(String name)
	{
		
		return "Welcome " +name;
	}
	
	//non static method
	public void floatSum(float x , float y)
	{
		System.out.println("Floating value sum :"+(x+y));
	}
	
	public static void main(String[] args) {
		
		ReturnClass r = new ReturnClass();
		r.floatSum(23.0f, 23.0f);
		
		System.out.println(ReturnClass.namePrinting("Sumit"));
		System.out.println("\nFinal Result "+ReturnClass.findSum(2, 3));
	}
  */
 






































/*

public static int findSum(int n , int m)
	{
	
		int sum = n+m;
		return sum;
	}
	
	public static String namePrinting(String name)
	{
		return " Hello "+name; 
	}
	
	public static float floatingNumber(float a , float b)
	{
		return a+b;
	}
	public static void main(String[] args) {
		
//		    boolean t = false;
//	        System.out.println("Before the return.");
//	 
//	        if (t==true)//if(t)
//	        {
//	        	System.out.println("inner scope ");
//	            return;
//	        }   
//	        System.out.println("outer scope");
		
		ReturnClass obj = new ReturnClass();
		System.out.println(obj.findSum(2, 3));
		System.out.println(obj.namePrinting("Sumit"));
		System.out.println(obj.floatingNumber(1.2f, 2.3f));

	}

*/