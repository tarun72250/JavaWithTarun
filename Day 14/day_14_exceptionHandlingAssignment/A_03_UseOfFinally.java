package day_14_exceptionHandlingAssignment;

public class A_03_UseOfFinally 
{
	public static void main(String[] args) 
	{
		try 
		{
			//open the file
			//read the content from file
			//close the file
			//System.out.println("In Try block...!");
			
			int n1 = Integer.parseInt("Hello");
			//System.out.println("Last statement in try block....!");
			//control will immediately transfer from try to catch block
			//catch block se try block me return nhi hoga , so some remaining stmt remain unexecuted
			//But I want to close the file
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		//we written that in finally block seen in next demo
	}

}
