package day_10_inheritanceAssignment.shapes;

public class ColorPoint extends Point {

	private String color;
	private static String [] colors;
	
	static {
		colors = new String[5];
		colors[0]="red";
		colors[1]="white";
		colors[2]="black";
		colors[3]="orange";
		colors[4]="green";
	}
	 
	public ColorPoint() {
		super();
	}

	public ColorPoint(int x, int y, String color) {
		super(x, y);
		//this.color = color;
		boolean flag = false;
		for(int i=0; i<colors.length;i++)
		{
			//if(color == colors[i])
			//equals() checks the actual state of colors of i
			//equals() checks the content of String
			
			if(colors[i].equals(color))
			{
				
				this.color=color;
				flag=true;
				break;
			}
		}
		if(flag == false)
			this.color="white";//no match found
	}
	
	public void display()
	{
		System.out.println("x - "+x+" ,"+"y - "+y+"color - "+color);
	}

	@Override
	public String toString() {
		return "ColorPoint [color=" + color + ", x=" + x + ", y=" + y + "]";
	}
	
}
