package day_04_objectAndClasses;

public class BoxDemo {

	public static void main(String[] args) {
		
		Box b = new Box();//default cons called
		b.calVolume();
		
		Box b1 = new Box(2,3,4);//para cons called
		b1.calVolume();
		
		Box b2 = new Box(b1);//copy cons called
		b1.calVolume();
		
		Box b3 = b2;
		b2.calVolume();
		
		
		
		if(b == b1)
			System.out.println("same");
		else
			System.out.println("diff");
		
		if(b1 == b2)
			System.out.println("same");
		else
			System.out.println("diff");
		
		if(b2 == b3)
			System.out.println("same");
		else
			System.out.println("diff");
		
	}

}
