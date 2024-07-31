package day_14_exceptionHandlingAssignment;

public class A_01_TryCatchDemo {

	public static void main(String[] args) 
	{
				
		try //in try block we can write that code which may get thrown error
		
		{//Attempting to parse integers from command line arguments
			 int n = Integer.parseInt(args[0]);// 10 "abdf"   //10 
			 int m = Integer.parseInt(args[1]);

			 System.out.println("Division :"+(n/m));
		}
		catch(NumberFormatException e)
		{
			System.out.println(e.getMessage());//For input string: "abdf"
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("Give atleast 2 input integer value");
		}
		catch(ArithmeticException e)
		{
			System.out.println("Value divide by zero");
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}
/*
 
 		try {
	            //Attempting to parse integers from command line arguments
	            int n1 = Integer.parseInt(args[0]);
	            int n2 = Integer.parseInt(args[1]);

	            // Attempting division
	            System.out.println("Division: " + (n1 / n2));
	            
	            // Attempting to access an array out of bounds
	            int[] arr = new int[5];
	            System.out.println("Value at index 5: " + arr[5]);
	        } 
		 	 catch (NumberFormatException e) 
		 	{
	            //Handling both NumberFormatException and ArrayIndexOutOfBoundsException
	            System.out.println("An error occurred: " + e.getMessage());
	        }
 
 
//try block should be followed by catch block or finally.
		//handle multiple exception
		//catch block gets executed when there is exception
		try 
		{
			int n1= Integer.parseInt((args[0]));
			int n2= Integer.parseInt((args[1]));
			System.out.println("Division :"+(n1/n2));
		}
		//Genralized catch block which can handle all type of exception 
		catch(NumberFormatException e)
		{
		//	e.printStackTrace();//info print related that exception
		//	System.out.println(e.getMessage());//msg associated in exception class 
		//	System.out.println(e);
		//this is customized msg
		System.out.println("U Divide a string with integer value ");
		}
		catch(NullPointerException e1)
		{
			System.out.println("provide 2 int value");
		}
		catch(ArithmeticException e2)
		{
			System.out.println("Divide by 0");
		}
		catch(ArrayIndexOutOfBoundsException e3)
		{
			System.out.println("Acess that value which is not given");
		}
		catch(Exception e)
		{
			e.printStackTrace();
			//System.out.println("Exception check again");
		}

*/