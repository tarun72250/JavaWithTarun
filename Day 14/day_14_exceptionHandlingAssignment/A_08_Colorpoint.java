package day_14_exceptionHandlingAssignment;

import day_14_exceptionHandling_customException.A_08_InvalidColorException;
import day_14_exceptionHandlingAssignment.A_08_Point;

public class A_08_Colorpoint extends A_08_Point {

	private String color;
	private static String [] colors;
	
	//Static block
	static
	{
		colors = new String[5];
		colors [0]="Red";
		colors [1]="Orange";
		colors [2]="Voilet";
		colors [3]="Blue";
		colors [4]="Yellow";
	}

	//Default Constructor
	public A_08_Colorpoint()
	{
		super();
		color=null;
		colors=null;
	}
	
	//Parametrized constructors
	//With method defination throws declared 
	public A_08_Colorpoint(String color, int x , int y) throws A_08_InvalidColorException
	{
		super(x,y);
		boolean flag= false;
		
		for(int i=0 ;i<colors.length;i++)
		{
			if(colors[i].equalsIgnoreCase(color))
			{
					this.color=color;
					flag=true;
					break;
			}
		}
		if (!flag)
		{
	        throw new A_08_InvalidColorException();
	    }
	}
	
	public String toString() 
	{
   	 return super.toString()+" Color "+color;
    }
}
