package day_14_exceptionHandlingAssignment;

public class A_04_UseOfFinally1 {

	public static void main(String[] args) {
		try 
		{
			//open the file
			//read the content from file
			//close the file
			System.out.println("In Try block...!");
			int n1 = Integer.parseInt("Hello");
			//only one condition there were finally not gets executed
			//System.out.println("Last statement in try block....!");
		    return;//if u have return stmt elseever finaly gets executed.

		}
		catch(Exception e)//catch block is executed if there is execption but finally block get executed even if there is execption or not
		{
			//e.printStackTrace();
			System.out.println("in catch block");
			System.exit(0);//program has been terminated forcefully , only scenario the finally block get not executed

		}
		//we written that in finally block seen in next demo
		finally //finally block will always get executed even if there is execption or not
		{
			//purpose finaly block get close the resources which are opened in try block
			System.out.println("In Finally block");
		}
		//we dont write catch block directly finaly after try block get correct.
	}

	/*public static void main(String[] args) {
		
		try {
			int n =Integer.parseInt(args[0]);
			if(n!=0)
			{
				System.out.println(10/n);
			}
			else
			{
				System.exit(0);
			}
		}catch(ArithmeticException e)
		{
			System.out.println("Divide by Zero...");
		}
		finally
		{
			System.out.println();
		}
	}*/
}
