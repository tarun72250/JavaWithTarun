package day_14_exceptionHandlingAssignment;

import day_14_exceptionHandling_customException.A_08_InvalidColorException;

//If i will throw keyword in any method 
//so compulsory create object class will throws ExceptionClassName u declare it 
public class A_08_ColorMain {

	public static void main(String[] args) 
	{
		try
		{
			A_08_Colorpoint c = new A_08_Colorpoint("Indigo",2,3);
			System.out.println( c.toString()); 
			
	        //A_08_Colorpoint c = new A_08_Colorpoint("Red",2,3);
			//System.out.println( c.tostring()); 
		}
		catch(A_08_InvalidColorException e)
		{
			System.out.println(e.getMessage());
		}
	}
}
