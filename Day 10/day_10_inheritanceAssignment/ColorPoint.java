package day_10_inheritanceAssignment;

public class ColorPoint extends Point{

	private String color;
	
	private static String [] colors;
	
	static 
	{	
		colors = new String[4];
		colors[0] = "yellow";
		colors[1] = "red";
		colors[2] = "blue";
		colors[3] = "orange";
	}
	
	public ColorPoint()
	{
		
	}
	
	//para cons
	public ColorPoint(int x , int y , String color)
	{
		super(x,y);
		boolean flag = false;
		
		for(int i =0 ; i<colors.length;i++)
		{
			if(colors[i].equals(color))
			{
				this.color=color;
				flag=true;
				break;
			}
		}
		
		if(flag==false)
		{
			this.color="white";
		}
	}
	
	public void display()
	{
		super.display();
		System.out.println("color :"+color);
	}
	
	
}
