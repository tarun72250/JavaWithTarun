package day_04_objectAndClasses;

public class A_02_BoxDemo {

	public static void main(String[] args) {

		A_02_Box b ;//refrence variable 
		b = new A_02_Box();//allocating memory on heap
		b.calVolume();//calling appropriate method
		
		
		A_02_Box b1 ;//refrence variable 
		b1 = new A_02_Box(2,3,4);//allocating memory on heap
		b1.calVolume();//calling appropriate method
		
		A_02_Box b2 ;//refrence variable 
		b2 = b1;//allocating memory on heap
		b2.calVolume();
		
		A_02_Box b3;//refrence variable 
		b3 = new A_02_Box(b1);//allocating memory on heap
		b3.calVolume();
		
		
	}

}
