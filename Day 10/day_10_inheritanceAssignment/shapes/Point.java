package day_10_inheritanceAssignment.shapes;

public class Point {

	int x , y;

	public Point() {
		
	}

	public Point(int x, int y) {
		super();
		this.x = x;
		this.y = y;
	}
	
	public void display()
	{
		System.out.println("x - "+x+" ,"+"y - "+y);
	}

	@Override
	public String toString() {
		return "Point [x=" + x + ", y=" + y + "]";
	}
}
