package day_14_exceptionHandlingAssignment;

public class A_08_Point {

	  private int x;
	  private int y;
	  
	  public A_08_Point() {
		  x=0;
		  y=0;
	  }
	public A_08_Point(int a,int b)
	{
	  x=a;
	  y=b;
	}
	
	public void Displayno()
	{
	  System.out.print(x+" "+y);
	}
	
	public String toString() {
		return "X = "+x+"\nY= "+y;
	}
}
