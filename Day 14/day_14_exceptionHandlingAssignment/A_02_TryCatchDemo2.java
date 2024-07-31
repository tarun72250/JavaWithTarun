package day_14_exceptionHandlingAssignment;

public class A_02_TryCatchDemo2 {

	public static void main(String[] args) {
		try
		{
			int n1 = Integer.parseInt(args[0]);
	
			int n2 = Integer.parseInt(args[1]);
			
			System.out.println("Division : "+(n1/n2));
		
		}
		catch(NumberFormatException e)//Specific catch block 
		{
			System.out.println("Please provide some number");
		}
		catch(ArithmeticException e)//Specific catch block 
		{
			System.out.println("Divide a no by zero which is not true");
		}
		catch(Exception e)//Genralized catch block which can handle all type of exception
		//we cannot change the sequence of these catch block 
		//order should be always from specific to generalized
		{
			//System.out.println("Some error");//this is customized msg
			//System.out.println(e.getMessage());//msg associated in exception class 
			e.printStackTrace();//info print 
			//java.lang.ArrayIndexOutOfBoundsException: Index 1 out of bounds for length 1
			//at day_14_exceptionHandlingAssignment.A_02_TryCatchDemo2.main(A_02_TryCatchDemo2.java:10)
			System.out.println(e.getMessage());
			System.out.println(e);
		}
	}

}
